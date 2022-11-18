package buoi1;

import java.util.Scanner;
import java.util.Arrays;

public class DanhSach {
	
	int a[];
	static Scanner sc =  new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter the number of integers in array");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	}
	
	
	public void print()
	{
		for (int it : a)
			System.out.print(it + " ");
		System.out.println();
	}
	
	public int searching(int x)
	{
		int cnt = 0;
		for (int it : a)
			if (it == x) ++cnt;
		return cnt;
	}
	
	public void sort()
	{
		for (int i = 0; i < a.length-1; i ++)
		{
			if (a[i] > a[i+1])
			{
				a[i] ^= a[i+1];
				a[i+1] ^= a[i];
				a[i] ^= a[i+1];
			}
		}
			
	}
	
	public static void main(String[] args) {
		DanhSach d = new DanhSach();
		d.input();
		d.print();
		System.out.println("Enter the searching number");
		int x = sc.nextInt();
		System.out.println(x + " appeared " + d.searching(x) + " times in array");
		System.out.println("Array after sorting in ascending order:");
		d.sort();
		d.print();
	}
		
	
}
