package day4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Whatsupview {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String ss="y";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (ss.equals("y")) {
			System.out.println(">_______________Main menu_________<");
			System.out.println("enter the choise:");
			System.out.println("1)login"+"\n"+"2)register"+"\n"+"3)forget password"+"\n"+"4)view profile");
			String a=br.readLine();
			Integer op=Integer.parseInt(a);
			whatsupcontroller x=new whatsupcontroller();
			switch (op) {
			case 1 : x.login();
			break;
			case 2:  x.register();
			break;
			case 3:  x.forgetpassword();
			break;
			case 4:  x.viewprofile();
			break;
			
			default:System.out.println("rong choice");
				
			}
            System.out.println("do u want to continue press \"Y\"  "+"\n"+"for exit press any key");
			
			ss=br.readLine();
		}
	}

}
