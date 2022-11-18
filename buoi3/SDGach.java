package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so loai gach lat nen");
		int n = sc.nextInt();
		Gach g[] = new Gach[n];
		for (int i = 0; i < n; i++)
		{
			g[i] = new Gach();
			System.out.println("Nhap thong tin loai gach thu " + (i+1));
			g[i].nhap();
		}
		int i = 1;
		for (Gach it : g)
		{
			System.out.println("Thong tin loai gach thu " + (i++));
			it.hienthi();
			System.out.println();
		}
		
		
		float giagach = 0;
		Gach gmin = g[0];
		float mincp = g[0].getGiaBan() / g[0].DienTichNenMax();
		for (i = 1; i < n; i++)
		{
			giagach = g[i].getGiaBan() / g[i].DienTichNenMax();
			if (mincp > giagach) 
			{
				mincp = giagach;
				gmin = g[i];
			}
		}
		System.out.println("Loai gach co chi phi thap nhat la");
		gmin.hienthi();
		
		
		System.out.println("Chi phi mua cua tung loai gach khi loat nen co chieu ngang 5m va chieu dai 20m:");
		for (i = 0; i < n; i++)
		{
			System.out.println("Loai gach thu " + (i+1) + " " + (g[i].getGiaBan() * g[i].soluonghop(20, 5)) ); 
		}	
	
	}

}
