package fib_java;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int x=0;
		do {
			int r=n%10;
			x=x+r;
			x=x*10;
			n=n/10;
		}
		while(n>0);
		System.out.println(x/10);
		

	}

}
