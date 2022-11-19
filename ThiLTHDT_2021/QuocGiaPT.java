package ThiLTHDT_2021;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia{

	private float ttho, dtich;
	private char chluc;
	
	public QuocGiaPT()
	{
		super();
		ttho = 0.0f;
		dtich = 0.0f;
		chluc = '\0';
	}
	
	public QuocGiaPT(QuocGiaPT pt)
	{
		super(pt);
		this.ttho = pt.ttho;
		this.dtich = pt.dtich;
		this.chluc = pt.chluc;
	}
	
	public void nhap()
	{
		Scanner sc  = new Scanner(System.in);
		super.nhap();
		
		System.out.println("Nhap tuoi tho");
		this.ttho = sc.nextFloat();
		
		System.out.println("Nhap dien tich");
		this.dtich = sc.nextFloat();
		
		System.out.println("Nhap ten chau luc");// A:A - W:Au - M:Mi - U:Uc - P:Phi
		this.chluc = sc.next().charAt(0);
	}
	
	public void in()
	{
		super.in();
		System.out.println("Tuoi tho: " + this.ttho);
		System.out.println("Dien tich: " + this.dtich);
		System.out.println("Ten chau luc: " + this.chluc);// A:A - W:Au - M:Mi - U:Uc - P:Phi
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap so quoc gia");
		int n = sc.nextInt();
		QuocGiaPT qg[] = new QuocGiaPT[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Nhap thong tin quoc gia thu " + (i+1));
			qg[i] = new QuocGiaPT();
			qg[i].nhap();
		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Thong tin quoc gia thu " + (i+1));
			qg[i].in();
		}
		
		System.out.println("Thong tin cac quoc gia Chau Phi da nhap co GDP >= 500:");
		for (int i = 0; i < n; i++)
		{
			System.out.println("Quoc gia thu " + (i+1) + ":");
			if (qg[i].layGDP() >= 500 && qg[i].chluc == 'P')
				qg[i].in();
		}
		
	}
	
}
