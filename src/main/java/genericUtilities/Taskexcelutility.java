package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

 public class Taskexcelutility {
public 	XSSFWorkbook wb;
public	XSSFSheet sheet;
public	XSSFRow row;
public	XSSFCell cell;
public FileInputStream fis;
String path;
public Taskexcelutility (String path) {
	this.path=path;
}
	public int rowsCount(String sheetname) throws IOException {
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
	 sheet=wb.getSheet(sheetname);
	int rows=sheet.getLastRowNum();
	wb.close();
	fis.close();
	return rows;
	}
 

	}

 
 
