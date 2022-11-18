package buoi2;

import java.util.Scanner;

public class Diem {
	
	private int x,y;
	
	public static Scanner sc = new Scanner(System.in);
	
	public Diem() 
	{
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	
	// Copy instructor
	public Diem(Diem d)
	{
		x = d.x;
		y = d.y;
	}
	
	public void nhap()
	{
		System.out.println("Nhap x");
		x = sc.nextInt();
		System.out.println("Nhap y");
		y = sc.nextInt();
	}
	
	public void hienthi()
	{
		System.out.println("(" + x + " " + ", " + y + ")");
	}
	
	public String toString()
	{
		return ("(" + x + " " + ", " + y + ")");
	}
	
	public void doiDiem (int dx, int dy)
	{
		x += dx;
		y += dy;
	}
	
	public int hoanhDo()
	{
		return x;
	}
	
	public int tungDo()
	{
		return y;
	}
	
	public float khoangCach()
	{
		return (float)Math.sqrt(x*x + y*y);
	}
	
	public float khoangCach(Diem d)
	{
		return (float)Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
	}
	
	
	
}
