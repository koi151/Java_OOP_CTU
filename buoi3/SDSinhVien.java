package buoi3;

import java.net.Socket;
import java.util.Scanner;

public class SDSinhVien {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SinhVien a = new SinhVien();
		a.nhap();
		a.dangKi();
		System.out.println("\nThong tin sinh vien: " + a);
		
		System.out.print("Diem trung binh cua " + a.layhoten() + " theo thang diem 4: ");
		System.out.format("%.2f\n", a.diemTB());
		
		a.them("LTHDT", "B");
		a.hienthi();
		System.out.print("Diem trung binh cua " + a.layhoten() + " theo thang diem 4 sau khi them: ");
		System.out.format("%.2f\n", a.diemTB());
		
		System.out.println("Nhap so luong sinh vien");
		int n = sc.nextInt();
		SinhVien sv[] = new SinhVien[n];
		SinhVien max = new SinhVien(), temp = new SinhVien();
		max = sv[0];
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Nhap thong tin sinh vien thu " + (i+1));
			sv[i].nhap();
			sv[i].dangKi();
			if (max.diemTB() < sv[i].diemTB()) max = sv[i];
		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Danh sach sinh vien bi canh cao hoc vu:");
			if (sv[i].canhcaohocvu()) 
				System.out.println("\nThong tin sinh vien: " + sv[i]);
		}
		
		//sorting in ascending order of last name
		
		for (int i = 0; i < n-1; i ++)
			for (int j = i+1; j < n; j ++)
			{
				if (sv[i].tachTen().compareTo(sv[j].tachTen()) > 0)
				{
					temp = sv[i];
					sv[i] = sv[j];
					sv[j] = temp;
				}
			}
		
	}
	
	
	
	
}
