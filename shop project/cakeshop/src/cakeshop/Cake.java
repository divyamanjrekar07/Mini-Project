package cakeshop;

import java.util.Scanner;

public class Cake {
	Scanner sc = new Scanner(System.in);
	public static String cake;

	public void cakeVariety(String c) {
		System.out.println("====================");
		System.out.println("Red Velvet");
		System.out.println("Chocolate");
		System.out.println("Cheese");
		System.out.println("Black Forest");
		System.out.println("Fruit");
		System.out.println("====================");
		System.out.println("enter the cake type");
		cake = sc.nextLine();
		cake.compareToIgnoreCase(cake);
		switch (cake) {
		case "red velvet": {
			System.out.println("you selected " + cake.toUpperCase() + "!!!!");
			break;
		}
		case "chocolate": {
			System.out.println("you selected " + cake.toUpperCase() + "!!!!");
			break;
		}
		case "cheese": {
			System.out.println("you selected " + cake.toUpperCase() + "!!!!");
			break;
		}
		case "black forest": {
			System.out.println("you selected " + cake.toUpperCase() + "!!!!");
			break;
		}
		case "fruit": {
			System.out.println("you selected " + cake.toUpperCase() + "!!!!");
			break;
		}
		default:
			throw new IllegalArgumentException("Invalid Input: " + cake);
		}
	}
}
