package cakeshop;

import java.time.LocalDateTime;
import java.util.Random;
import register_login.Login;
import register_login.Register;

public class Bill {
	public Bill() throws InterruptedException {
		Thread.sleep(400);
		System.out.println();
		System.out.println("*************************************");
		System.out.println("THANK YOU FOR YOUR ORDER........");
		Random random = new Random();
		System.out.println("ORDER NO: " + random.nextInt(100));
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("==============================");
		System.out.println("current date and time " + ldt);
		System.out.println("Username " + Register.name1);
		System.out.println("Mob-no " + Register.number1);
		System.out.println("YOU OREDERED " + Varieties.flavour + " " + Varieties.type);
		System.out.println(Weight.quantity + " worth Rs " + Price.price);
		System.out.println("total units: " + Price.unit);
		System.out.println("YOUR TAKE AWAY TOTAL WILL BE: " + Price.cal);
		System.out.println("*************************************");

	}

}
