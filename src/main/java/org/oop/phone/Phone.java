package org.oop.phone;

import org.oop.sim.SIM;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public abstract class Phone {
    private final String name;
    private final SIM[] sims = new SIM[2];

    public Phone(String name, SIM[] sims) {
        this.name = name;
        this.sims[0] = sims[0];
        this.sims[1] = sims[1];
    }

    public String getName() {
        return name;
    }

    public SIM[] getSims() {
        return sims;
    }

    public String getSim(int num) {
        return sims[num].getNumber();
    }

    public void call(String toNumber, int fromNumber) {
        System.out.printf("Calling from %s to %s number from %s Phone.%n", getSim(fromNumber), toNumber, getName());

        Random random = new Random();
        int index = random.nextInt(2);

        // 0 Means the person your calling is canceling the call.
        // 1 Means the person picks up the call.
        switch (index) {
            case 0 -> {
                System.out.println("The number you are calling is busy now. Please try again.");
            }
            case 1 -> {
                boolean keepTalking = true;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press 1 to exit the call.");

                LocalTime startTime = LocalTime.now();

                while (keepTalking) {

                    int input = scanner.nextInt();
                    if (input == 1) {
                        keepTalking = false;
                    }
                }

                LocalTime endTime = LocalTime.now();

                long minutes = startTime.until(endTime, ChronoUnit.MINUTES);
                long seconds = startTime.until(endTime, ChronoUnit.SECONDS);

                seconds = seconds > 60 ? (seconds - (minutes * 60)) : seconds;

                System.out.printf("Call ended. You talked total %s minutes and %s seconds", minutes, seconds);
            }
            default -> {
                System.out.println("The number you are calling is unreachable now. Please try again.");
            }
        }
    }
}
