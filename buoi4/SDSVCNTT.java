package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSVCNTT {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong sinh vien trong danh sach");
		int n = sc.nextInt();
		int i;
		SinhVienCNTT s[] = new SinhVienCNTT[n];
		
		for (i = 0; i < n; i++)
		{
			System.out.println("Nhap thong tin sinh vien thu " + (i+1));
			s[i] = new SinhVienCNTT();
			s[i].nhap();
		}
		
		String str = "";
		System.out.println("Nhap dia chi email cua sinh vien can tim");
		sc.nextLine();
		str = sc.nextLine();
		for (i = 0; i < n; i++)
			if (s[i].getEmail().equals(str))
				break;
		if (i == n) System.out.println("Khong tim thay sinh vien tren");
		else s[i].hienthi();
	}
}
