package AddUtils;

import java.util.Scanner;

public class b04 {

	public static void main(String[] args) {
		float a, b, c;
		Scanner input = new Scanner(System.in);
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		if((a+b>c && a+c>b && b+c>a))
		{
		float p = (a+b+c)/2;
		System.out.println("Chu vi tam giac la "+p*2);
		
		float S = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Dien tich tam giac la "+S);
		}
		else 
			System.out.println();
		
	}

}
