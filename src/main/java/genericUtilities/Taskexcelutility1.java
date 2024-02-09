package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Taskexcelutility1 {
	public 	XSSFWorkbook wb;
	public	XSSFSheet sheet;
	public	XSSFRow row;
	public	XSSFCell cell;
	public FileInputStream fis;
	String path;
	public Taskexcelutility1 (String path) {
		this.path=path;
	}
		public int cellCount(String sheetname,int rows) throws IOException {
			fis=new FileInputStream(path);
			wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheet(sheetname );
		 //apna uppar kya mention karte ki voich likhna yaha
		 row=sheet.getRow(rows);
	int cell=row.getLastCellNum();
		 wb.close();
			fis.close();
			return cell;
}
}
