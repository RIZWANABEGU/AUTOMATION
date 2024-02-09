package practicetask;

import java.util.Scanner;

public class Dtavalidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String user="rizwana";
		String  pass="12345";
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=5;i++) {
		System.out.println("enter username");
		String username=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		Thread.sleep(5000);
		//if right name given it will be break
		if(user.equals(username)&&pass.equals(password)){
			System.out.println("loginsucesfull");
			break;
		}
		//for 4th time it can be wait
			else if(i==4) {
				Thread.sleep(5000);
			}
		//for 6 chances get blocked
			else if(i==6) {
				System.out.println("chances are complete then blocked");
			break;
			}
		else {
			System.out.println("try again");
		}
	}
	
	

	}

}
