package buoi4;

import java.util.Scanner;

import buoi2.Date;
import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {

	public static Scanner sc = new Scanner(System.in);

	//attributes
	private String 
		taikhoan = "",
		matkhau = "",
		email   = "";
	
	public SinhVienCNTT()
	{
		super();
		this.taikhoan = "";
		this.matkhau = "";
		this.email = "";
	}
	
	public SinhVienCNTT(String mssv, String hoten, Date ngaysinh, String taikhoan, String matkhau, String email)
	{
		super(mssv, hoten, ngaysinh);
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
		this.email = email;
	}
	
	public SinhVienCNTT(SinhVienCNTT s)
	{
		super(s);
		this.taikhoan = s.taikhoan;
		this.matkhau = s.matkhau;
		this.email = s.email;
	}
	
	public void nhap()
	{
		super.nhap();
		System.out.println("Hay nhap ten tai khoan");
		this.taikhoan = sc.nextLine();
		System.out.println("Hay nhap mat khau");
		this.matkhau = sc.nextLine();
		System.out.println("Hay nhap email");
		this.email = sc.nextLine();
	}
	
	public void hienthi()
	{
		super.hienthi();
		System.out.println("Ten tai khoan: " + this.taikhoan);
		System.out.println("Ten email: " + this.email);
	}
	
	public String toString()
	{
		return (super.toString() + " ," + this.taikhoan + ", " + this.email);
	}
	
	public void doiMatKhau(String newpass)
	{
		System.out.println("Hay nhap mat khau moi");
		this.matkhau = newpass;
	}
	
	public String getEmail()
	{
		return this.email;
	}
}
