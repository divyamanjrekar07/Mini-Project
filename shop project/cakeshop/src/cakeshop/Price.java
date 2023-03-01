package cakeshop;

import java.util.Scanner;

public class Price extends Weight {
	public static int price;
	public static int unit;
	public static int cal;

	public void Calculation(int u, int price) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====================");
		System.out.println("enter units");
		unit = sc.nextInt();
		cal = unit * price;
		System.out.println("total calculation is " + cal);
		System.out.println("====================");
		System.out.println();
		System.out.println();
		System.out.println("YAY!!!! YOUR ONE STEP AWAY TO ORDER......");
		System.out.println("GENERATE BILL TO PROCEED!!!!");
	}
}
