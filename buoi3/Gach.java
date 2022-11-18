package buoi3;

import java.util.Scanner;

public class Gach {
	
	public static Scanner sc = new Scanner(System.in);
	
	private String maso, mau;
	private int soluongvien, chieudai, chieungang;
	private long gia;
	
	public Gach()
	{
		maso = "";
		mau = " ";
		soluongvien = 0; 
		chieudai = 0;
		chieungang = 0;
		gia = 0;
	}
	
	public Gach(String maso, String mau, int soluongvien, int chieudai, int chieungang, long gia)
	{
		this.maso = maso;
		this.mau = mau;
		this.soluongvien = soluongvien; 
		this.chieudai = chieudai;
		this.chieungang = chieungang;
		this.gia = gia;
	}
	
	public Gach(Gach a)
	{
		maso = a.maso;
		mau = a.mau;
		soluongvien = a.soluongvien; 
		chieudai = a.chieudai;
		chieungang = a.chieungang;
		gia = a.gia;
	}
	
	public void nhap()
	{
		System.out.println("Nhap ma so gach");
		maso = sc.nextLine();
		System.out.println("Nhap mau gach");
		mau = sc.nextLine();
		System.out.println("Nhap so luong vien gach trong 1 hop");
		soluongvien = sc.nextInt();
		System.out.println("Nhap chieu dai gach");
		chieudai = sc.nextInt();
		System.out.println("Nhap chieu ngang gach");
		chieungang = sc.nextInt();
		System.out.println("Nhap gia ban mot hop");
		gia = sc.nextLong();
	}
	
	public void hienthi()
	{
		System.out.println("Ma so gach la " + maso);
		System.out.println("Mau gach la " + mau);
		System.out.println("So luong vien gach trong mot hop la " + soluongvien);
		System.out.println("Chieu dai gach la " + chieudai);
		System.out.println("Chieu ngang gach la " + chieungang);
		System.out.println("Gia ban 1 hop la " + gia);
	}
	
//	public String toString()
//	{
//		return ("Ma so gach la " + maso);
//		return ("Mau gach la " + mau);
//		System.out.println("So luong vien gach trong mot hop la " + soluongvien);
//		System.out.println("Chieu dai gach la " + chieudai);
//		System.out.println("Chieu ngang gach la " + chieungang);
//		System.out.println("Gia ban 1 hop la " + gia);
//	}
	
	public float giaBanLe()
	{
		return (float)(gia * 1.2);
	}
	
	public float DienTichNenMax()
	{
		return soluongvien * chieudai * chieungang;
	}
	
	public int soluonghop(int d, int n)
	{
		return (int)Math.ceil(d * n / (chieudai * chieungang)); 
	}
	
	public long getGiaBan()
	{
		return gia;
	}
	
}
