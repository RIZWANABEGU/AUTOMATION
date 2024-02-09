package practicetask;

import java.util.Scanner;

public class Datavalidation {
public static void main(String[] args) throws InterruptedException {
	String user="rizwana";
	String  pass="12345";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username");
	String username=sc.nextLine();
	System.out.println("enter password");
	String password=sc.nextLine();
	Thread.sleep(5000);
	for(int i=0;i<=5;i++) {
	if(user.equals(username)&&pass.equals(password)){
		System.out.println("loginsucesfull");
		break;
	}
	else {
		System.out.println("try again");
	}
}
}
}
