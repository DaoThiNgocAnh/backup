package AddUtils;

import java.util.Scanner;

public class b08 {

	public static void main(String[] args) {
		String MaSV , HoTen, DoB, MH1, MH2, MH3, MH4, MH5;
		float a, b, c, d, e; // lan luot la so tin chi mon 1, 2, 3, 4, 5
		float d1, d2, d3, d4 ,d5; // diem các mon hoc
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap Ma sinh vien : ");
		MaSV = input.nextLine();
		
		System.out.println("Nhap Ho va Ten : ");
		HoTen = input.nextLine();
		
		System.out.println("Nhap ngay sinh : ");
		DoB = input.nextLine();
		
		System.out.println("Nhap ma mon hoc 1 , 2 , 4, 5 lan luot la : ");
		MH1 = input.nextLine();
		MH2 = input.nextLine();
		MH3 = input.nextLine();
		MH4 = input.nextLine();
		MH5 = input.nextLine();
		
		System.out.println("Nhap so tin chi cac mon hoc 1, 2, 3, 4, 5 lan luot la : ");
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		d = input.nextFloat();
		e = input.nextFloat();
		
		System.out.println("Nhap diem cac mon hoc 1 , 2 , 4, 5 lan luot la : ");
		d1 = input.nextFloat();
		d2 = input.nextFloat();  
		d3 = input.nextFloat();
		d4 = input.nextFloat();
		d5 = input.nextFloat();
		
		System.out.println("Ma sinh vien : " +MaSV);
		
		System.out.println("Ho va Ten : " +HoTen);
		
		System.out.println("Ngay sinh : " +DoB);
		
		System.out.print("Mon hoc 1 : " +MH1);
		System.out.println(" So tin chi :" +a);
		
		System.out.print("Mon hoc 2 : " + MH2);
		System.out.println(" So tin chi :" +b);
		
		System.out.print("Mon hoc 3 : " + MH3);
		System.out.println(" So tin chi :" +c);
		
		System.out.print("Mon hoc 4 : " + MH4);
		System.out.println(" So tin chi :" +d);
		
		System.out.print("Mon hoc 5 : " + MH5);
		System.out.println(" So tin chi :" +e);
		
		System.out.println("Diem trung binh cac mon hoc : " +((d1*a+d2*b+d3*c+d4*d+d5*e)/(a+b+c+d+e)));
		

	}

}
