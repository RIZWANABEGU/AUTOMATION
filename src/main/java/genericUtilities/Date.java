package genericUtilities;

import java.util.Date;
class hi{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String e=getsystemdateinfomat();
		System.out.println(e);   

	}
	public static  String getsystemdateinfomat() {
		Date e=new Date();
		String[] darr=e.toString().split("");
		String date=darr[2];
		String month=darr[1];
		String year=darr[5];
		String time=darr[3].replace(":", "-");
		return date+month+year+time;
	}

}

