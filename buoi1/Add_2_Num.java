package buoi1;

import java.util.Scanner;

public class Add_2_Num {	
		
		public int input()
		{
			Scanner sc = new Scanner (System.in);
			String s;
			int n;
			do 
			{
				try 
				{
					System.out.println("Enter an integer");
					s = sc.nextLine();
					n = Integer.parseInt(s);
				} catch (java.lang.NumberFormatException e)
				{
					n = Integer.MAX_VALUE;
					System.out.println("Wrong input, please try again");
				}
			}while (n == Integer.MAX_VALUE);
			return n;
		}
		
		public static void main(String[] args) {
			Add_2_Num t = new Add_2_Num();
			int a = t.input();
			int b = t.input();
			System.out.println("Sum of 2 numbers = " + (a+b));
		}

}
