package practice;

import genericUtilities.Propertyfileutility;

public class Notepad {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		 Propertyfileutility putil= new Propertyfileutility();
String un=putil.readdatafrompropertyfile("UN");
System.out.println(un);
	}

}
