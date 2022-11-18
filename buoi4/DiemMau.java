package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem{

	public static Scanner sc = new Scanner(System.in);
	
	private String mau;
	
	public DiemMau()
	{
		super();
		String mau = "";
	}
	
	public DiemMau(int x, int y, String mau)
	{
		super(x,y);
		this.mau = new String(mau);
	}
	
	public DiemMau(DiemMau d)
	{
		super(d);
		this.mau = new String(d.mau);//////
	}
	
	public void GanMau(String mau)
	{
		this.mau = new String(mau);
	}
	
	public void nhap()
	{
		super.nhap();
		System.out.println("Hay nhap mau");
		this.mau = sc.nextLine();
	}
	
	public void hienthi()
	{
		super.hienthi();
		System.out.println("Diem co mau " + this.mau);
	}

	public String toString()
	{
		return (super.toString() + ", mau " + this.mau);
	}
}
