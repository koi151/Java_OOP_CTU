package buoi4;

import java.util.Scanner;

public class SDDiemMau {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DiemMau A = new DiemMau(5,10,"trang");
		A.hienthi();
		
		DiemMau B = new DiemMau();
		B.nhap();
		B.doiDiem(10, 8);
		B.hienthi();
		B.GanMau("vang");
		B.hienthi();
	}

}
