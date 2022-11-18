package buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date date = new Date(29,9,2022);
		System.out.print("Ngay: ");
		date.hienthi();
		System.out.print("Ngay hom sau la: ");
		date = date.ngayHomSau();
		date.hienthi();
		System.out.println("Nhap so ngay ban muon cong them");
		int n = sc.nextInt();
		date = date.congNgay(n);
		System.out.print("Ngay sau khi cong: ");
		date.hienthi();
		
	}

}
