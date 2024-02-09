package practicetask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprotest {
	@Test(dataProvider="data")
	public void tc1(String user,String pwd) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	System.out.println(user);
	}
@DataProvider(name="data")
public String[][] getdata(){
	String values[][]= {{"valid","valid"},
			{"valid","invalid"},{"invalid","valid"},
			{"invalid","invalid"}};
return values;
}

	
}

