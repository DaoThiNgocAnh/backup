package AddUtils;

import java.util.Scanner;

public class Thongtin {

	public static void main(String[] args) {
		String Ten, Diachi;
		int Tuoi, Sodt, Luong, a, b;
		Scanner input = new Scanner(System.in);
		Ten = input.nextLine();
		Tuoi = Integer.parseInt(input.nextLine());
		Diachi = input.nextLine();
		Sodt = input.nextInt();
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("Ten "+Ten);
		System.out.println("Tuoi "+Tuoi);
		System.out.println("Diachi "+Diachi);
		System.out.println("Sodt "+Sodt);
		System.out.println("Luong "+ (a*350+b*45));
		
		
		}

}
