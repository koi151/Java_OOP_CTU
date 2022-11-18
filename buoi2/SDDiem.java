package buoi2; 

public class SDDiem {

	public static void main(String[] args) {
		Diem a = new Diem(3,4);
		System.out.println("Toa do diem a");
		a.hienthi();
		
		Diem b = new Diem();
		System.out.println("Nhap toa do diem b");
		b.nhap();
		System.out.println("Toa do diem b:");
		b.hienthi();
		
		Diem c = new Diem(-b.hoanhDo(), -b.tungDo());
		System.out.println("Toa do diem c:");
		c.hienthi();
		
		System.out.print("Khoang cach tu b den O la ");
		System.out.println(b.khoangCach());
		System.out.print("Khoang cach tu a den b la");
		System.out.println(b.khoangCach(a));
	}

}
