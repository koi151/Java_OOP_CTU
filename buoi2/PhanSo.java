package buoi2;

import java.util.Scanner;

public class PhanSo {
	
	public static Scanner sc = new Scanner(System.in);
	
	private int tu,mau;
	
	public PhanSo()
	{
		tu = 0; 
		mau = 1; 
	}
	
	public PhanSo(int tu, int mau)
	{
		this.tu = tu;
		this.mau = mau;
	}
	
	public void nhap()
	{
		do{
			System.out.println("Nhap tu so");
			tu = sc.nextInt();
			System.out.println("Nhap mau so");
			mau = sc.nextInt();
			if (!hople()) 
				System.out.println("Du lieu khong hop le, hay nhap lai");
		}while(!hople());
	}
	
	public void hienthi()
	{
		if (tu == 0) System.out.println(0);
		else if (mau == 1) System.out.println(tu);
		else 
		{
			if (tu < 0 && mau < 0)
			{
				tu = Math.abs(tu);
				mau = Math.abs(mau);
			}
			if (tu > 0 && mau > 0)
				System.out.println(tu + "/" + mau);
			else System.out.println( -Math.abs(tu) + "/" + Math.abs(mau));
		}
	}
	
	public boolean hople()
	{
		return mau != 0;
	}
	
	public PhanSo nghichDao()
	{
		PhanSo psn = new PhanSo(mau,tu);
		return psn;
	}
	
	public double giaTriThuc()
	{
		return (double)(tu/mau);
	}
	
	public boolean lonHon(PhanSo a)
	{
		return giaTriThuc() > a.giaTriThuc();
	}
	
	public int GCD(int a, int b)
	{
		if (b==0) return a;
		return GCD(b, a%b);
	}
	
	public void rutGon()
	{
		int gcd = GCD(tu,mau);
		tu /= gcd;
		mau /= gcd;
	}
	
	public PhanSo congPhanSo(PhanSo a)
	{
		PhanSo res = new PhanSo();
		res.tu = tu * a.mau + a.tu * mau;
		res.mau = mau * a.mau;
		res.rutGon();
		return res;
	}
	
	public PhanSo truPhanSo(PhanSo a)
	{
		PhanSo res = new PhanSo();
		res.tu = tu * a.mau - a.tu * mau;
		res.mau = mau * a.mau;
		res.rutGon();
		return res;
	}
	
	public PhanSo nhanPhanSo(PhanSo a)
	{
		PhanSo res = new PhanSo();
		res.tu = tu * a.tu;
		res.mau = mau * a.mau;
		res.rutGon();
		return res;
	}
	
	public PhanSo chia(PhanSo a)
	{
		return nhanPhanSo(a.nghichDao());
	}
}
