package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class DoanThang {

	public static Scanner sc = new Scanner(System.in);
	
	private Diem d1, d2;
	
	public DoanThang()
	{
		d1 = new Diem();
		d2 = new Diem();
	}

	public DoanThang(Diem d1, Diem d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public DoanThang(int ax, int ay, int bx, int by)
	{
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	public void nhapToaDo()
	{
		System.out.println("Nhap toa do diem d1");
		d1.nhap();
		System.out.println("Nhap toa do diem d2");
		d2.nhap();
	}
	
	public void hienthi()
	{
		System.out.println("Toa do diem d1: ");
		d1.hienthi();
		System.out.println("Toa do diem d2");
		d2.hienthi();
	}
	
	public String toString()
	{
		return "[" + d1 + ", " + d2 + "]";
	}
	
	public void tinhtien(int dx, int dy)
	{
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	
	public Diem trungDiem()
	{
		Diem A = new Diem(d1);
		Diem B = new Diem(d2);
		return new Diem((d1.hoanhDo()+ d2.hoanhDo())/2, (d1.tungDo() + d2.tungDo())/2 );
	}
	
	
	public double dodai()
	{
		return Math.pow(d1.hoanhDo() - d2.hoanhDo(), 2) + Math.pow(d1.tungDo() - d2.tungDo(), 2);
	}
	
	public double goc()
	{
		return Math.acos(Math.abs(d1.hoanhDo() - d2.hoanhDo()) / this.dodai());
	}
	
		
}
