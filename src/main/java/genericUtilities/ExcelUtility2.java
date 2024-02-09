package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 class ExcelUtility2 {
	public String readdatafromexcel(String sheetname,int rowno,int cellno) throws Throwable {
	FileInputStream fi=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\src\\test\\resources\\Iconstantutility.xlsx");
	//use creare method from workbookfactory;
	Workbook wb=WorkbookFactory.create(fi);
	String dat=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	return dat;

	}
 }

