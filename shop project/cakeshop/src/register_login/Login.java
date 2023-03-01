package register_login;

import java.util.Scanner;
import cakeshop.Bill;
import cakeshop.Varieties;

public class Login {
	public static String name1;
	public static long num1;
	public static int pass1;
	static String type;

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Username ");
		String username = sc.nextLine();
		System.out.println("enter your 4 digit pin");
		int pin = sc.nextInt();
		username.compareToIgnoreCase(username);
		while ((username != Register.name1) && (pin != Register.password1)) {
			System.out.println("PLEASE ENTER VALID USERNAME AND PIN");
			login();
		}
		System.out.println("LOGIN SUCCESSFULLY!!!!!");
		System.out.println("=============================");
		System.out.println("ENTER YOUR CHOICE");
		Varieties v = new Varieties();
		v.type("");
		Login.type = v.type;

	}
}
