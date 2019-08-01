package AddUtils;

import java.util.Scanner;

public class b07 {

	public static void main(String[] args) {
		String Ma,Ten, DoB;
		int Luong, a, b;
		Scanner input = new Scanner(System.in);
		Ma = input.nextLine();
		Ten = input.nextLine();
		DoB = input.nextLine();
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("Ma can bo : " +Ma);
		System.out.println("Ho va Ten : "+Ten);
		System.out.println("Ngay sinh : "+DoB);
		System.out.println("Luong : "+ (a*350+b*45));
		

	}

}
