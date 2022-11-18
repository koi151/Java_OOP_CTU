package buoi5;

import java.util.Scanner;

public class KhachHang {
	
	private String cccd, hten, dchi;
	
	public KhachHang()
	{
		cccd = new String();
		hten = new String();
		dchi = new String();
	}
	
	public KhachHang(String cccd, String hten, String dchi)
	{
		this.cccd = new String(cccd);
		this.hten = new String(hten);
		this.dchi = new String(dchi);
	}
	
	public KhachHang(KhachHang k)
	{
		this.cccd = new String(k.cccd);
		this.hten = new String(k.hten);
		this.dchi = new String(k.dchi);
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can cuoc cong dan");
		this.cccd = sc.nextLine();
		System.out.println("Nhap ho va ten");
		this.hten = sc.nextLine();
		System.out.println("Nhap dia chi");
		this.dchi = sc.nextLine();
	}
	
	public void in()
	{
		System.out.println(this.cccd + " - " + this.hten + " - " + this.dchi);
	}
	
	public String toString()
	{
		return (this.cccd + " - " + this.hten + " - " + this.dchi);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
	}

}
