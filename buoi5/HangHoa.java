package buoi5;

import java.util.Scanner;

public class HangHoa {

	private String maso, ten, nsxuat;	
	
	public HangHoa()
	{
		this.maso = new String();
		this.ten = new String();
		this.nsxuat = new String();
	}
	
	public HangHoa(String maso, String ten, String nsxuat)
	{
		this.maso = new String(maso);
		this.ten = new String(ten);
		this.nsxuat = new String(nsxuat);
	}
	
	public HangHoa(HangHoa h)
	{
		this.maso = new String(h.maso);
		this.ten = new String(h.ten);
		this.nsxuat = new String(h.nsxuat);
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ma so hang hoa");
		this.maso = sc.nextLine();
		System.out.println("Nhap ten hang hoa");
		this.ten = sc.nextLine();
		System.out.println("Nhap ngay san xuat hang hoa");
		this.nsxuat = sc.nextLine();
	}
	
	public void in()
	{
		System.out.println("Ma so: " + this.maso + "- Ten: " + this.ten + "- NSX: " + this.nsxuat);
	}
	
	public String toString()
	{
		return ("Ma so: " + this.maso + "- Ten: " + this.ten + "- NSX: " + this.nsxuat);
	}
}
