package day4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class whatsupcontroller {
	static BufferedReader br;
	whatsupcontroller(){
		br= new BufferedReader(new InputStreamReader(System.in));
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void login()throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter your user name");
		String username= br.readLine();
		System.out.println(username);
		System.out.println("enter your password");
		String password=br.readLine();
		System.out.println(password);
		viewprofile();
		
	}

	public void forgetpassword() {
		// TODO Auto-generated method stub
		System.out.println("I 2 dont know");
		
	}

	public void viewprofile() {
		// TODO Auto-generated method stub
		System.out.println("profile not existed");
		//System.out.println(register();)
		//register.name();
		
		
	}

	public void register()throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter your name");
		String name= br.readLine();
		System.out.println("Enter your desired password");
		String password=br.readLine();
		System.out.println(name);
		System.out.println(password);
		
		
	}

}
