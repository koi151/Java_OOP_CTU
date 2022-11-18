package buoi4;

import java.util.Scanner;

public class SDConVat{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ConVat cv[];
		System.out.println("Hay nhap so luong con vat");
		int n = sc.nextInt();
		int ch = 0;
		
		cv = new ConVat[n];

		for (int i = 0; i < n; i++)
		{
			System.out.println("\nNhap thong tin con vat thu " + (i+1));
			System.out.println("Nhap (1): bo, (2): heo, (3): de");
			ch = sc.nextInt();
			if (ch == 1)
				cv[i] = new Bo();
			else if (ch == 2)
				cv[i] = new Heo();
			else if (ch == 3)
				cv[i] = new De();
			cv[i].nhap();
		}
		
		for (int i =0; i < n; i++)
		{
			System.out.println("Thong tin con vat thu " + (i+1));
			cv[i].in();
		}
	
		for (int i = 0; i < n; i++)
		{
			System.out.print("Con vat thu nhat: ");
			cv[i].keu();
		}
		
		
		
	}
	
	
}