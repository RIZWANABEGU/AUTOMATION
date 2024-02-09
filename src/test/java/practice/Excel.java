package practice;

import genericUtilities.Excelutility;

public class Excel {
public static void main(String[] args)throws Throwable {
	Excelutility eutill=new Excelutility();
	String value=eutill.readdatafromExcelUtility("sheet1",0,0);
	System.out.println(value);
	
}
}
