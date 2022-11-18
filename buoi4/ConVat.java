package buoi4;

import java.util.Scanner;

public abstract class ConVat
{
	
//	public static Scanner  sc = new Scanner(System.in);
	
	private String giong, maulong;
	private float cannang;
	
	public ConVat()
	{
		giong = new String();
		maulong = new String();
		cannang = 0.0f;
	}
	
	public ConVat(String giong, String maulong, float cannang)
	{
		this.giong = new String();
		this.maulong = new String();
		this.cannang = 0.0f;
	}
	
	public ConVat(ConVat c)
	{
		giong = new String(c.giong);
		maulong = new String(c.maulong);
		cannang = c.cannang;
	}
	
	public void nhap()
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("Nhap ten giong");
		this.giong = sc.nextLine();
		System.out.println("Nhap mau long");
		this.maulong = sc.nextLine();
		System.out.println("Nhap can nang");
		this.cannang = sc.nextFloat();
	}
	
	public void in()
	{
		System.out.println("Ten giong: " + this.giong + ", Mau long: " + this.maulong + ", Can nang: " + this.cannang);
	}
	
	public String toString()
	{
		return ("Ten giong: " + this.giong + ", Mau long: " + this.maulong + ", Can nang: " + this.cannang);
	}
	
	public abstract void keu();
	
	
	
}