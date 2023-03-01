package register_login;

import java.util.Scanner;
import cakeshop.Varieties;

public class Edit extends Register {
	String name;
	long num;
	int pass;

	public void edit(int c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to Edit or Continue");
		System.out.println("Press 1 to Edit");
		System.out.println("Press 2 to Continue");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			register(null, 0, 0);
			edit(c);
			break;
		}
		case 2: {
			System.out.println("PLEASE LOGIN TO ORDER!!!!!");

			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
