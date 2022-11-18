package buoi5;

import java.util.Scanner;

import buoi2.Date;

public class HoaDon {

	private String mso, tde, nvien;
	private Date d;
	private ChiTiet ct[];
	private KhachHang k;
	private int soluong;
	
	public HoaDon()
	{
		this.mso = new String();
		this.tde = new String();
		this.nvien = new String();
		d = new Date();
		ct = new ChiTiet[20];
		k = new KhachHang();
		soluong = 0;
	}
	
	public HoaDon(HoaDon h)
	{
		this.mso = new String(h.mso);
		this.tde = new String(h.tde);
		this.nvien = new String(h.nvien);
		this.k = new KhachHang(h.k);
		this.d = new Date(h.d);
		this.ct = new ChiTiet[h.ct.length];
		this.soluong = h.soluong;
		
		for (int i = 0; i < this.soluong; i ++)
			this.ct[i] = new ChiTiet(h.ct[i]);
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ma so hoa don");
		this.mso = sc.nextLine();
		
		System.out.println("Nhap tieu de hoa don");
		this.tde = sc.nextLine();
		
		System.out.println("Nhap ten nhan vien thanh toan");
		this.nvien = sc.nextLine();
		
		System.out.println("Nhap thong tin khach hang");
		k.nhap();
		
		System.out.println("Nhap thoi gian thanh toan");
		this.d.nhap();
		
		System.out.println("Nhap so luong hang hoa");
		this.soluong = sc.nextInt();
		
		System.out.println("Nhap thong tin chi tiet cua hoa don");
		for (int i = 0; i < this.soluong; i++)
		{
			System.out.println("Nhap thong tin chi tiet hang hoa thu " + (i+1));
			ct[i] = new ChiTiet();
			ct[i].nhap();
		}
	}
	
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ma so hoa don: " + this.mso);
		
		System.out.println("Tieu de hoa don: " + this.tde);
		
		System.out.println("Ten nhan vien thanh toan: " + this.nvien);
		
		System.out.println("Thong tin khach hang:");
		k.in();
		
		System.out.println("Thoi gian thanh toan: " + this.d);
		
		System.out.println("So luong mat hang: " + this.soluong);
		
		System.out.println("Thong tin chi tiet cua hoa don:");
		for (int i = 0; i < this.soluong; i++)
		{
			System.out.println("Thong tin chi tiet hang hoa thu " + (i+1));
			ct[i].in();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Hay nhap so luong khach hang");
//		int n  = sc.nextInt();
//		HoaDon h[] = new HoaDon[n];
//		
//		for (int i = 0; i < n; i++)
//		{
//			
//		}
		HoaDon h = new HoaDon();
		h.nhap();
		h.in();
	}
}
