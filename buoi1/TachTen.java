package buoi1;

import java.util.Scanner;

public class TachTen {
	
	public static String lastName(String s)
	{
		s = s.trim();
		int p = s.lastIndexOf(" ");
		s = s.substring(p+1);
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name");
		String s = sc.nextLine();
		System.out.println("Your last name is " + lastName(s));
	}
}
