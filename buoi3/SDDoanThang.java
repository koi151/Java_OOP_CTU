package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Diem A = new Diem(2,5);
		Diem B = new Diem(20, 35);
		DoanThang AB = new DoanThang(A,B);
		AB.hienthi();
		System.out.println("Trung diem O cua AB: ");
		Diem O = AB.trungDiem();
		O.hienthi();
		System.out.println("Doan thang AB sau khi tinh tien (5,3): ") ;
		AB.tinhtien(5, 3);
		AB.hienthi();
		
		DoanThang CD = new DoanThang();
		CD.nhapToaDo();
		CD.hienthi();
		System.out.println("Do dai doan thang CD: " + CD.dodai());
		System.out.format("Goc giua CD va truc hoanh: %.2f", CD.goc());
	}

}
