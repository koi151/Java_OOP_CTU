package buoi1;

import java.util.Scanner;
import	java.lang.Math;

public class Giai_PT_bac_1_2 {
	
	public static void PTbac1 (double a, double b)
	{
		if (a == 0)
		{
			if (b == 0)
				System.out.println("Equation has infinitely roots");
			else System.out.println("Equation has no root");
		}
		else System.out.println("Root of equation is x = " + (-b/a));
	}
	
	public static void PTbac2 (double a, double b, double c)
	{
		if (a == 0) PTbac1(a, b);
		else
		{
			double delta = b*b - 4*a*c;
			if (delta < 0)
				System.out.println("Equation has no root");
			else if (delta == 0)
				System.out.println("Equation has double roots x = " + (-b/(2*a)) );
			else 
			{
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.println("Equation has two roots");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first coefficient of equation");
		double a = sc.nextDouble();
		System.out.println("Enter second coefficient of equation");
		double b = sc.nextDouble();
		System.out.println("Enter third coefficient of equation");
		double c = sc.nextDouble();
		Giai_PT_bac_1_2.PTbac2(a, b, c);
		
	}
}
