package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Writedatafromexcel {
public static void main(String[] args) throws Throwable{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Organisation1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
wb.getSheet("sheet1").createRow(6).createCell(7).setCellValue("riz");
FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Organisation1.xlsx");
	wb.write(fos);
	System.out.println("datawritten");
	wb.close();
}
}
