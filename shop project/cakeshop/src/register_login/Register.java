package register_login;

import java.util.Scanner;

public class Register extends Register_Var{
    public static  String name1;
	public static long number1;
	public static int password1;
	public void register(String n,long no,int pass) {
		Register_Var v=new Register_Var();
		Scanner sc=new Scanner(System.in);
		String name;
		long number;
		int password;
		System.out.println("Enter Your Name Here: ");
		name=sc.nextLine();
		name.compareToIgnoreCase(name);
		v.setName(name);
		System.out.println("Enter Your 10 Digit Mobile Number Here: ");
	    number=sc.nextLong();
	    while(!((number>999999999)&&(number<9999999999L))){
	    	System.out.println("*****Invalid Number*****");
			System.out.println("Please Enter Valid 10 Digit Mobile Number Here: ");
			number=sc.nextLong();
		}
	    v.setNumber(number);
		System.out.println("Set 4 Digit Pin: ");
		password=sc.nextInt();
		while(!(password>999&&password<10000)){
			System.out.println("*****Pin Should 4 Digit*****");
			password=sc.nextInt();
		}
		v.setPassword(password);
		registered(v.getName(), v.getNumber(), v.getPassword());
	}
	public void registered(String n,long no,int pass) {
		Register.name1=n;
		Register.number1=no;
		Register.password1=pass;
		System.out.println("====================");
		System.out.println("UserName: "+n.toUpperCase());
		System.out.println("Your registered Mobile Number: "+no);
		System.out.println();
		System.out.println();
		System.out.println("YAY!!! YOU ARE REGISTERED SUCCESSFULLY");
		System.out.println("====================");
	}
}
