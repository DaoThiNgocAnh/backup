package lession_2;



public class Ham_main {
	
	public static int snt(int a) {
		if(a==1) return 0;
		for(int i=2; i<=Math.sqrt(a); i++) {
			if(a%i==0) return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		int n = 20;
		for(int i=1; i<=n; i++) {
			if(snt(i) != 0)
				System.out.println(i);
		}
		

	}

}
