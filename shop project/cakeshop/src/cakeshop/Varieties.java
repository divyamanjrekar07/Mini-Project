package cakeshop;

import java.util.Scanner;

public class Varieties extends Price {
	Scanner sc = new Scanner(System.in);
	public static String type;
	public static String flavour;

	public String type(String t) {
		System.out.println("====================");
		System.out.println("Cake");
		System.out.println("Donut");
		System.out.println("====================");
		System.out.println("enter type");
		type = sc.nextLine();
		type.compareToIgnoreCase(type);
		switch (type) {
		case "cake": {
			Cake c = new Cake();
			c.cakeVariety(type);
			Varieties.flavour = Cake.cake;
			Weight w = new Weight();
			w.weight("");
			break;
		}
		case "donut": {
			Donuts d = new Donuts();
			d.donutVariety(type);
			Varieties.flavour = Donuts.donut;
			Price.price = 90;
			Price p = new Price();
			p.Calculation(0, Price.price);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return type;
	}
}
