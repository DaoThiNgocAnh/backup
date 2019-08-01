package AddUtils;

import java.util.Scanner;

public class b06 {

	public static void main(String[] args) {
		String Name , DoB, GT , DD; // ten, ngay sinh, gioi tinh , dao duc
		float DTB; //diem trung binh
		Scanner input = new Scanner(System.in);
		
		Name = input.nextLine();
		DoB = input.nextLine();
		GT = input.nextLine();
		DTB = input.nextFloat();
		DD = input.nextLine();
		
		
		
		System.out.println("Ho va Ten : " +Name);
		System.out.println("Ngay sinh : " +DoB);
		System.out.println("Gioi tinh : " + GT);
		System.out.println("Diem trung binh : " +DTB);
		System.out.println("Xep loai dao duc : " +DD);

	}

}
