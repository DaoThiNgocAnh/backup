package AddUtils;

import java.util.Scanner;

public class b09 {

	public static void main(String[] args) {
		int X;
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		int a = X/1000;
		int b = (X-a*1000)/100;
		int c = (X-a*1000-b*100)/10;
		int d = (X-a*1000-b*100-c*10);
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(+c);
		System.out.println(+d);
		System.out.println(a+b+c+d);

	}

}
