package AddUtils;

import java.util.Scanner;

public class b05 {

	public static void main(String[] args) {
		float a, b, h;
		Scanner input = new Scanner(System.in);
		a = input.nextFloat();
		b = input.nextFloat();
		h = input.nextFloat();
		System.out.println("Dien tich xung quanh la " + 2*h*(a+b));
		System.out.println("Dien tich toan phan la " + (2*h*(a+b)+2*a*b));
		System.out.println("The tich la " + (a*b*h));
		
		

	}

}
