package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo ps1 = new PhanSo(3,7);
		PhanSo ps2 = new PhanSo(4,9);
		ps1.hienthi();
		ps2.hienthi();
		
		PhanSo ps3 = new PhanSo(), ps4 = new PhanSo();
		System.out.println("Hay nhap 2 phan so x va y");
		ps3.nhap();
		ps4.nhap();
		System.out.print("Phan so x vua nhap la ");
		ps3.hienthi();
		System.out.print("Phan so y vua nhap la ");
		ps4.hienthi();
		
		System.out.print("Phan so nghich dao cua x la ");
		ps3.nghichDao().hienthi();
		
		System.out.print("Tong cua phan so x va phan so y la ");
		ps3.congPhanSo(ps4).hienthi();
		
		System.out.println("Nhap so luong phan so");
		int n = sc.nextInt();
		PhanSo a[] = new PhanSo [n] ;
		PhanSo sum = new PhanSo();
		PhanSo max = new PhanSo(Integer.MIN_VALUE, Integer.MAX_VALUE);
		for (int i = 0; i < n; i++)
		{
			System.out.println("Nhap phan so thu " + (i+1));
			a[i] = new PhanSo();
			a[i].nhap();
			sum = sum.congPhanSo(a[i]);
			if (a[i].lonHon(max)) max = a[i];
		}
		
		System.out.print("Tong cac phan so la ");
		sum.hienthi();
		System.out.print("Phan so lon nhat: ");
		max.hienthi();
		
		PhanSo temp = new PhanSo();
		for (int i = 0; i < n-1; i++)
			for (int j = i+1; j < n; j++)
				if (a[i].giaTriThuc() > a[j].giaTriThuc())
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		System.out.println("Danh sach phan so theo thu tu tang dan:");
		for (PhanSo it : a)
			it.hienthi();
		
	}

}
