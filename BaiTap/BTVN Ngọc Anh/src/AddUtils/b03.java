package AddUtils;

import java.util.Scanner;

public class b03 {

	public static void main(String[] args) {
		int a, b;
		float x;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		x = input.nextFloat();
		System.out.println( + ((double)a/10 + Math.pow(a, b) - (Math.sin(Math.PI*(double)x/3))/Math.sqrt(Math.pow(a+b, 2)+5) + Math.log(Math.pow(a, 2)+1) - (double)(Math.log(Math.pow(4*x, 2*a)+3)/Math.log(3))/2.55));
	}

}
