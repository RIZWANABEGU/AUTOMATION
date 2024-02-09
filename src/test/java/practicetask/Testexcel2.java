package practicetask;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtilities.Taskexcelutility;
import genericUtilities.Taskexcelutility1;

public class Testexcel2 {
@Test
public void read() throws IOException {
	//give same class and object create and give that class to public
		Taskexcelutility1 teu = new Taskexcelutility1("C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\src\\test\\resources\\exceltest.xlsx");
		//same class name ku object create karna
		int cell=teu.cellCount("sheet1", 1);
		System.out.println(cell);
	}
}
