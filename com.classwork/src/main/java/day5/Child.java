package day5;

public class Child extends Parent {
	void sub() {
		add(2,2);
	}
	void sub1() {
		super.mul(2,1);
	}
	void mul(int i , int j) {
			System.out.println("child");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s= new Child();
		s.sub();
		s.sub1();
		s.mul(2,3);
		

	}

}
