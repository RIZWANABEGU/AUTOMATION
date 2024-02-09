package practicetask;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exceldata {

@Test
public void excelread() throws Throwable {
	String path="C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\src\\test\\resources\\exceltest.xlsx";
	FileInputStream fis= new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(1);
	XSSFCell cell=row.getCell(0);
String data=cell.getStringCellValue();
int rowsCount=sheet.getLastRowNum();
int cellcount=row.getLastCellNum();
for(int i=0;i<=rowsCount;i++) {
	for(int j=0;j<cellcount;j++) {
System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+"/");
	}
	System.out.println();
	}
}
}


