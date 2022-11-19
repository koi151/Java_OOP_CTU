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
	
	public String layChauLuc()
	{
		if (this.chluc == 'A') return "Chau A";
		else if (this.chluc == 'W') return "Chau Au";
		else if (this.chluc == 'M') return "Chau Mi";
		else if (this.chluc == 'U') return "Chau Uc";
		else if (this.chluc == 'P') return "Chau Phi";
		return null;
	}
	
	public void in()
	{
		super.in();
		System.out.println("Tuoi tho: " + this.ttho);
		System.out.println("Dien tich: " + this.dtich);
		System.out.print("Ten chau luc: " + layChauLuc());
	}
	
	public String toString()
	{
		return super.toString() + "\n" + "Tuoi tho: " + this.ttho + " - Dien tich: " + this.dtich + " - Ten chau luc: " + layChauLuc();
	}
	
//================================================
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		QuocGia qg[];
		System.out.println("Nhap so quoc gia");
		int n = sc.nextInt();
		qg = new QuocGia[n];
		
		float cnt[] = new float[5]; 
		float sum[] = new float[5];
		for (float it : sum) it = 0;
		for (float it : cnt) it = 0;
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Nhap thong tin quoc gia thu " + (i+1));
			System.out.println("Nhap (1): Quoc gia - (2): Quoc gia phat trien");
			int op = sc.nextInt();
			if (op == 1)
			{
				qg[i] = new QuocGia();
				qg[i].nhap();
			}
			else if (op == 2) 
			{
				qg[i] = new QuocGiaPT();
				qg[i].nhap();
				if (qg[i].layChauLuc() == "Chau A")
				{
					cnt[0]++;
					sum[0] += qg[i].layGDP();
				}
				else if (qg[i].layChauLuc() == "Chau Au")
				{
					cnt[1]++;
					sum[1] += qg[i].layGDP();
				}
				else if (qg[i].layChauLuc() == "Chau Mi")
				{
					cnt[2]++;
					sum[2] += qg[i].layGDP();
				}
				else if (qg[i].layChauLuc() == "Chau Uc")
				{
					cnt[3]++;
					sum[3] += qg[i].layGDP();
				}
				else if (qg[i].layChauLuc() == "Chau Phi")
				{
					cnt[4]++;
					sum[4] += qg[i].layGDP();
				}
			}
		}
		
		for (QuocGia it : qg)
			System.out.println(it);
		
		System.out.println();
		System.out.println("Thong tin cac quoc gia Chau Phi co GDP > 500:");
		for (int i = 0; i < n; i++)
		{
			if (qg[i].layGDP() > 500 && qg[i].layChauLuc().equals("Chau Phi"))
				System.out.println(qg[i]);
		}
		System.out.println();
		
		
		System.out.println("GDP trung binh cua cac nuoc phat trien trong Chau A: " + (sum[0] / cnt[0]) );
		System.out.println("GDP trung binh cua cac nuoc phat trien trong Chau Au: " + (sum[1] / cnt[1]) );
		System.out.println("GDP trung binh cua cac nuoc phat trien trong Chau Mi: " + (sum[2] / cnt[2]) );		
		System.out.println("GDP trung binh cua cac nuoc phat trien trong Chau Uc: " + (sum[3] / cnt[3]) );
		System.out.println("GDP trung binh cua cac nuoc phat trien trong Chau Phi: " + (sum[4] / cnt[4]) );
	}
}
