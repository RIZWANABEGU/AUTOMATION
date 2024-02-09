package riz;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
FileInputStream fi=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\src\\test\\resources\\Iconstantutility.xlsx");
//use creare method from workbookfactory;
Workbook wb=WorkbookFactory.create(fi);
//get sheet
   double data = wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
System.out.println(data);
String dat=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(dat);
String data1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
System.out.println(data1);
	}

}
