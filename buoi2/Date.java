package buoi2;

import java.util.Scanner;

public class Date {
	
	private int ngay, thang, nam;
	
	public static Scanner sc = new Scanner(System.in);
	
	public Date()
	{
		ngay = thang = nam = 0;
	}
	
	public Date(int ngay1, int thang1, int nam1)
	{
		ngay = ngay1;
		thang = thang1;
		nam = nam1;
	}
	
	// Copy instructor
	public Date(Date d)
	{
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public void hienthi()
	{
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	
	public String toString()
	{
		return (ngay + "/" + thang + "/" + nam);		
	}
	
	public boolean hople()
	{
		int ngaytrongthang[] = {0, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (thang == 2)
		{
			if ( (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) 
				ngaytrongthang[2] = 29;
			else ngaytrongthang[2] = 28;
		}
		if (ngay > 0 && ngay <= ngaytrongthang[thang] && thang > 0 && thang < 13)
			return true;
		return false;
	}
	
	public void nhap()
	{
		do {
			System.out.println("Nhap ngay");
			ngay = sc.nextInt();
			System.out.println("Nhap thang");
			thang = sc.nextInt();
			System.out.println("Nhap nam");
			nam = sc.nextInt();
			if (!hople()) System.out.println("Nhap lieu sai, hay nhap lai");
		} while (!hople());
	}
	
	public Date ngayHomSau()
	{
		Date res = new Date(ngay, thang, nam);
		res.ngay ++;
		if (!res.hople())
		{
			res.ngay = 1;
			res.thang ++;
			if (!res.hople())
			{
				res.thang = 1;
				res.nam ++;
			}
		}
		return res;	
	}
	
	public Date congNgay(int n)
	{
		Date res = new Date(ngay, thang, nam);
		while (n != 0)
		{
			res = res.ngayHomSau();
			n--;
		}
		return res;
	}
}