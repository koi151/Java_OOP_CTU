package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class KhachHangVIP extends KhachHang {
	
	private float tLeGiam;
	private Date d;
	
	public KhachHangVIP()
	{
		super();
		tLeGiam = 0.0f;
		d = new Date();
	}
	
	public KhachHangVIP(KhachHang k, float tLeGiam, Date d)
	{
		super(k);
		tLeGiam = 0.0f;
		this.d = new Date(d);
	}
	
	public KhachHangVIP(KhachHangVIP v)
	{
		super((KhachHang)v);
		tLeGiam = 0.0f;
		d = new Date(v.d);
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in); 
		super.nhap();
		System.out.println("Nhap ty le giam");
		tLeGiam = sc.nextFloat();
		System.out.println("Nhap ngay tro thanh khach hang VIP");
		d.nhap();
	}
	
	public void in()
	{
		super.in();
		System.out.println("Ty le giam: " + this.tLeGiam);
	}
	
	public String toString()
	{
		return super.toString() + "Ty le giam: " + this.tLeGiam;
	}
	
}
