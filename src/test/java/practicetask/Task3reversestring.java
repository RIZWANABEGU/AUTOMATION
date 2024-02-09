package practicetask;

import java.util.Scanner;

public class Task3reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter");
str=sc.nextLine();
System.out.println("after reverse:");
for(int i=str.length();i>0;--i) {
	System.out.print(str.charAt(i-1));
}
	}
}
