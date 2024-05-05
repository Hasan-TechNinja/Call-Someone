package org.oop;


import org.oop.phone.IPhone;
import org.oop.phone.Samsung;
import org.oop.sim.Grameenphone;
import org.oop.sim.SIM;
import org.oop.sim.Telitalk;

public class Main {
    public static void main(String[] args) {

        var g1 = new Grameenphone("01739989028");
        var g2 = new Telitalk("01580625257");

        var phone = new Samsung("Galaxy M51", new SIM[]{g1, g2});
        var hasan = new User("Hasan", phone);
        var g3 = new Grameenphone("01304802986");
        var g4 = new Telitalk("01569100294");

        var phone1 = new IPhone("Iphone 42", new SIM[]{g3, g4});
        var hakim = new User("Hakim", phone1);

//        hasan.getPhone().call(hakim.getPhone().getSim(1), 0);
//
        hakim.getPhone().call(hasan.getPhone().getSim(1), 0);

    }
}