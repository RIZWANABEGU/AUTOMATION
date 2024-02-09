package genericUtilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//read and write operation in sameclass
class Excelutility1 {
public void excelwriteoperation(String sheetname,int row,int cellno,String value)throws Throwable {
	FileInputStream fise=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\src\\test\\resources\\Iconstantutility.xlsx");
	Workbook wb=WorkbookFactory .create(fise);
wb.createSheet("sheet1").createRow(0).createCell(1).setCellValue("one");
	 FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\\\src\\test\\resources\\Iconstantutility.xlsx");
	wb.write(fos);
	System.out.println(wb);
	wb.close();
}
}