package facebook;  
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class view {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("#####################_______Main Menu_______########################");
		System.out.println("chose the required one"+"\n"+"1)login"+"\n"+"2)register"+"\n"+"3)forgetpassword");
		System.out.println("enter your option=");
		String b=br.readLine();
		int option=Integer.parseInt(b);
		controll x=new controll();
		String ss="y";
		while (ss.equals("y")){
			switch (option) {
			case 1: x.login();
			case 2: x.register();
			case 3: x.forgetpassword();
			System.out.println("enter Y to continue or press any key");
			ss=br.readLine();
			}
			
			
		}
		
		

	}
}
