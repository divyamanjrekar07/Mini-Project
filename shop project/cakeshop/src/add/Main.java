package add;

import java.util.Scanner;
import cakeshop.Bill;
import cakeshop.Price;
import cakeshop.Varieties;
import cakeshop.Weight;
import register_login.Edit;
import register_login.Login;
import register_login.Register;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("*******************************************");
		System.out.println("*****************CAKE SHOP*****************");
		System.out.println("*******************************************");
		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("*******************************************");
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1.Register");
			System.out.println("2.Edit");
			System.out.println("3.Login");
			System.out.println("4.Generate Bill");
			System.out.println("5.Exit");
			System.out.println("*******************************************");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Register r = new Register();
				r.register(null, 0, 0);
				break;
			case 2:
				Edit e = new Edit();
				e.edit(0);
				break;
			case 3:
				Login l = new Login();
				l.login();
				break;
			case 4:
				Bill b = new Bill();
				System.exit(0);
				break;
			case 5:
				System.exit(0);
				break;
			}
		}

	}

}
