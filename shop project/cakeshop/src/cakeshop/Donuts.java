package cakeshop;

import java.util.Scanner;

public class Donuts {
	static String donut;

	public void donutVariety(String d) {
		System.out.println("====================");
		System.out.println("Jelly");
		System.out.println("Chocolate");
		System.out.println("Yeast");
		System.out.println("Cider");
		System.out.println("Glazed");
		Scanner sc = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("enter the donut type");
		donut = sc.nextLine();
		donut.compareToIgnoreCase(donut);
		System.out.println("**Any at just Rs 90");
		switch (donut) {
		case "jelly": {
			System.out.println("you selected " + donut.toUpperCase() + " !!!!!");
			break;
		}
		case "chocolate": {
			System.out.println("you selected " + donut.toUpperCase() + " !!!!!");
			break;
		}
		case "yeast": {
			System.out.println("you selected " + donut.toUpperCase() + " !!!!!");
			break;
		}
		case "yider": {
			System.out.println("you selected " + donut.toUpperCase() + " !!!!!");
			break;
		}
		case "glazed": {
			System.out.println("you selected " + donut.toUpperCase() + " !!!!!");
			break;
		}
		default:
			throw new IllegalArgumentException("Invalid Input: " + donut);
		}
		System.out.println("====================");
	}
}
