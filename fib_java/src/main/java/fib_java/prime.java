package fib_java;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int c=0;
		for(int i=2;i<num/2;i++) {
			if (num%i==0) {
				System.out.println(num+"is no prime");
				c++;
				break;
			}
		}
		if (c==0) {
			System.out.println(num+"is  prime");
		}
		
		
	}

}
