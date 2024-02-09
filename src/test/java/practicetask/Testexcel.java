package practicetask;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtilities.Excelutility;
import genericUtilities.Taskexcelutility;

public class Testexcel {
@Test
public void read() throws IOException {
//give same class and object create and give that class to public
	Taskexcelutility teu = new Taskexcelutility("C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\src\\test\\resources\\exceltest.xlsx");
	int rows=teu.rowsCount("sheet1");
	System.out.println(rows);
}
}
