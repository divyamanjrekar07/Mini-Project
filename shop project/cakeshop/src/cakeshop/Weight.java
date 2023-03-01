package cakeshop;

import java.util.Scanner;

public class Weight {
	Scanner sc = new Scanner(System.in);
	public static String quantity;

	public void weight(String Q) {
		System.out.println("====================");
		System.out.println("select quantity ");
		System.out.println("pastry or per kg");
		System.out.println("====================");
		quantity = sc.nextLine();
		quantity.compareToIgnoreCase(Q);
		switch (quantity) {
		case "pastry": {
			System.out.println(quantity + " for Rs 50****");
			Price.price = 50;
			Price p = new Price();
			p.Calculation(0, Price.price);
			break;
		}
		case "per kg": {
			System.out.println(quantity + " for Rs 350!!!!");
			Price.price = 350;
			Price p = new Price();
			p.Calculation(0, Price.price);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + quantity);
		}

	}
}
