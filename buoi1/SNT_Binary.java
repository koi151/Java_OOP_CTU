package buoi1;

import java.util.Scanner;

public class SNT_Binary {
	
	public static boolean checkPrime(int n)
	{
		for (int i = 2; i < n; i++)
			if (n % i == 0) return false;
		return n > 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = sc.nextInt();
		if (checkPrime(n)) 
			System.out.println(n + " is a prime number");
		else System.out.println(n + " is a composite number");
		System.out.println("Convert " + n + " to binary: " + Integer.toBinaryString(n));
	}
}
