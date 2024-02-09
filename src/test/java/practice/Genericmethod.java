package practice;

import java.util.Date;

public class Genericmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d=getsystemdate();
		System.out.println(d);
	}
	public  static String getsystemdate() {
		Date d=new Date();
		return d.toString();
	}
	
/*public static void main(String[] args) {
	 int c=add(20,40);
	 System.out.println(c);
}
public static int add(int a,int b) {
	int c=a+b;
	return c;
	
}*/
	}


