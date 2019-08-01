package AddUtils;

import java.util.Scanner;

public class b01 {

	public static void main(String[] args) {
		float a, b, h;
		Scanner input = new Scanner(System.in);
		a = input.nextFloat();
		b = input.nextFloat();
		h = input.nextFloat();
		float S = (a+b)*h/2;
		System.out.println("Dien tich la " +S);

	}

}
