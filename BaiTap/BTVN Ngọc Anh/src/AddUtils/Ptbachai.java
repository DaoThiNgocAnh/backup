package AddUtils;


import java.util.Scanner;

public class Ptbachai {

	public static void main(String[] args) {
		int a, b, c;
		float x;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a==0) {
			if(b==0&&c==0)	System.out.println("Vo so nghiem");
			
			if(b==0&&c!=0)	System.out.println("Vo nghiem");
			
			if(b!=0&&c!=0){
				System.out.println("Mot nghiem");
				System.out.println((float)-c/b);
			}
		}
		else {
			if((b*b-4*a*c)>0) {
				System.out.println("Phuong trinh co hai nghiem pb");
				System.out.println((-b-Math.sqrt(b*b-4*a*c))/(2*a));
				System.out.println((-b+Math.sqrt(b*b-4*a*c))/(2*a));
			}
			if((b*b-4*a*c)<0)
				System.out.println("Vo nghiem");
			if((b*b-4*a*c)==0) {
				System.out.println("Mot nghiem");
				System.out.println((float)-b/(2*a));
			}
			
		}
			
	} 

}
