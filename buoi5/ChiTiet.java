package buoi5;

import java.util.Scanner;

public class ChiTiet {

	private int sluong;
	private float dgia;
	private HangHoa h;
	
	public ChiTiet()
	{
		sluong = 0;
		dgia = 0.0f;
		h = new HangHoa();
	}
	
	public ChiTiet(int sluong, float dgia, HangHoa h)
	{
		this.sluong = sluong;
		this.dgia = dgia;
		this.h = new HangHoa(h);
	}
	
	public ChiTiet(ChiTiet c)
	{
		this.sluong = c.sluong;
		this.dgia = c.dgia;
		this.h = new HangHoa(c.h);
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong hang hoa");
		this.sluong = sc.nextInt();
		
		System.out.println("Nhap don gia hang hoa");
		this.dgia = sc.nextFloat();
		h.nhap();
	}
	
	public void in()
	{
		System.out.println("So luong hang: " + this.sluong);
		System.out.println("Don gia: " + this.dgia);
		System.out.println("Gia tien: " + (this.sluong * this.dgia));
		h.in();
	}
	
	public String toString()
	{
		return "So luong hang: " + this.sluong + "\nDon gia: " + this.dgia + h;
	}
	
	
}
