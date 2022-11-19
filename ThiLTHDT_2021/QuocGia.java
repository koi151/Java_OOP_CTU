package ThiLTHDT_2021;

import java.util.Scanner;

public class QuocGia {

	private String msqg, tenqg, tenthudo;
	private float GDP;
	
	public QuocGia()
	{
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 0.0f;
	}
	
	public QuocGia(QuocGia q)
	{
		this.msqg = new String(q.msqg);
		this.tenqg = new String(q.tenqg);
		this.tenthudo = new String(q.tenthudo);
		this.GDP = q.GDP;
	}
	
	public String layChauLuc()
	{
		return "";
	}
	
	public float layGDP()
	{
		return this.GDP;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ma so quoc gia");
		this.msqg = sc.nextLine();
		
		System.out.println("Nhap ten quoc gia");
		this.tenqg = sc.nextLine();
		
		System.out.println("Nhap ten thu do");
		this.tenthudo = sc.nextLine();
		
		System.out.println("Nhap GDP");
		this.GDP = sc.nextFloat();
	}
	
	public void in()
	{
		System.out.println("Ma so quoc gia: " + this.tenqg + " - Ten quoc gia: " + this.tenqg + " - Ten thu do: " + this.tenthudo + " - GDP: " + this.GDP);
	}
	
	public String toString()
	{
		return ("Ma so quoc gia: " + this.tenqg + " - Ten quoc gia: " + this.tenqg + " - Ten thu do: " + this.tenthudo + " - GDP: " + this.GDP);		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		qg1.in();
		QuocGia qg2 = new QuocGia(qg1);
		qg2.in();
	
	}

}

