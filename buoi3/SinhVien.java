package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	
	public Scanner sc = new Scanner(System.in);
	
	//attributes
	private String mssv, hoten;
	private Date ngaysinh;
	
	private int soluonghp, max;
	private String tenhp[], diemhp[];
	
	//constructor
	public SinhVien()
	{
		mssv = "";
		hoten = "";
		ngaysinh = new Date();
		soluonghp = 0;
		max = 60;
		tenhp = new String[max];
		diemhp = new String[max];
	}
	
	public SinhVien(int max)
	{
		mssv = "";
		hoten = "";
		ngaysinh = new Date();
		soluonghp = 0;
		this.max = max;
		tenhp = new String[this.max];
		diemhp = new String[this.max];
	}
	
	public SinhVien(String mssv, String hoten, Date ngaysinh)
	{
		this.mssv = mssv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh ;
		soluonghp = 0;
		tenhp = new String[this.max];
		diemhp = new String[this.max];
	}
	
	public SinhVien(String mssv, String hoten, Date ngaysinh, int soluonghp)
	{
		this.mssv = new String(mssv);
		this.hoten = new String(hoten);
		this.ngaysinh = new Date(ngaysinh);
		this.soluonghp = soluonghp;
		this.tenhp = new String[max];
		this.diemhp = new String[max];
	}
	
	public SinhVien(SinhVien s)
	{
		mssv = new String(s.mssv);
		hoten = new String(s.hoten);
		ngaysinh = s.ngaysinh;
		soluonghp = s.soluonghp;
		this.max = s.max;
		tenhp = new String[max];
		diemhp = new String[max];
		
		for (int i = 0; i < soluonghp; i ++)
		{
			tenhp[i] = new String(s.tenhp[i]);
			diemhp[i] = new String(s.diemhp[i]);
		}
	}
	
	public void nhap()
	{
		System.out.println("Hay nhap ma so sinh vien");
		mssv = sc.nextLine();
		
		System.out.println("Hay nhap ho ten sinh vien");
		hoten = sc.nextLine();
		
		System.out.println("Hay nhap thong tin ngay sinh cua sinh vien");;
		ngaysinh.nhap();
	
		System.out.println();
	}
	
	public void hienthi()
	{
			System.out.println("[" + mssv + " ," + hoten + " ," + ngaysinh + "]");
			System.out.println("So luong hoc phan dang ky: " + soluonghp);
			System.out.println("Ten cac hoc phan dang ky: ");
			for (int i = 0; i < soluonghp; i ++)
				System.out.println(tenhp[i] + " : " + diemhp[i]);
			System.out.println();
	}
	
	public String toString() {
		String s = "["+ mssv + " - " + hoten + " - "+ ngaysinh ;
		for(int i = 0; i < soluonghp; i++) 
		{
			s += " - "+ tenhp[i] + " : " + diemhp[i];
		}
		s += "]";
		return s;
	}
	
	public void them(String ten, String diem)
	{
		if (soluonghp < max -1)
		{
			tenhp[soluonghp] = new String(ten);
			diemhp[soluonghp] = new String(diem);
			soluonghp ++;
		}
		else System.out.println("So hoc phan da dat so luong toi da, khong the them");
	}
	
	public void xoa(String tenhpxoa)
	{
		int i;
		for(i = 0; i < soluonghp; i++)
			if (tenhp[i].equals(tenhpxoa)) break;
		
		if (i < soluonghp)
		{
			for (int j = i; j < soluonghp - 1; j++)
			{
				tenhp[j] = tenhp[j+1];
				diemhp[j] = diemhp[j+1];
			}
		--soluonghp;
		}
		else System.out.println("Khong tim thay hoc phan de xoa");		
	}
	
//	public void dangKi()
//	{
//		String ten = "";
//		do
//		{
//			System.out.println("Nhap ten hoc phan, nhap stop de dung nhap du lieu");
//			ten = sc.nextLine();
//			if (ten.equals("stop")) break;
//			System.out.println("Nhap diem hoc phan");
//			them(ten,"");
//		}while(true);
//	}
	
	public void dangKi() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong mon hoc phan : ");
		soluonghp = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < soluonghp; i++)
		{
			System.out.println("Nhap ten mon "+ (i+1) + ": ");
			tenhp[i] = sc.nextLine();
			System.out.println("Nhap diem cua mon "+ (i+1) + ": ");
			diemhp[i] = sc.nextLine();
		}
	}
	
	public void nhapDiem()
	{
		for(int i = 0; i < soluonghp; i++)
		{
			System.out.println("Nhap diem cho hoc phan " + tenhp[i]);
			diemhp[i] = sc.nextLine();
		}
	}
	
	
	public double diemTB()
	{
		float tb = 0.0f;
		for (int i = 0; i < soluonghp; i++)
		{
			if (diemhp[i].equals("A")) tb += 4.0f;
			else if (diemhp[i].equals("B+")) tb += 3.5f;
			else if (diemhp[i].equals("B")) tb += 3.0f;
			else if (diemhp[i].equals("C+")) tb += 2.5f;
			else if (diemhp[i].equals("C")) tb += 2.0f;
			else if (diemhp[i].equals("D+")) tb += 1.5f;
			else if (diemhp[i].equals("D")) tb += 1.0f;
		}
		return (float)(tb/soluonghp);
	}
	
	public String layhoten()
	{
		return hoten;
	}

	public boolean canhcaohocvu()
	{
		return diemTB() < 0.8;
	}
	
	public String tachTen()
	{
		return hoten.substring(hoten.trim().lastIndexOf("") + 1);
	}
	
}
