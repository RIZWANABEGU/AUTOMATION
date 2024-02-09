package genericUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	
		public String readdatafromExcelUtility(String Sheetname,int rownum,int cellnum) throws Throwable {
			FileInputStream fise=new FileInputStream(Iconstantutility.excelpath);
		Workbook wb=WorkbookFactory.create(fise);
		return wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		}
	
	
}
	
		
	

