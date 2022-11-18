package buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class Max_And_Sum_Elements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int sum = 0, n = sc.nextInt();
		int a[]  = new int[n] ;
		for ( int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int Max = Arrays.stream(a).max().getAsInt();
		System.out.println("Biggest integer is " + Max);
		System.out.println("Sum of all integers is " + sum);;
	}
}
