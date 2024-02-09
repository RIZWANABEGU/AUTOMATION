package practice;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ddf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we have to write  key of edge driver
		String k="WebDriver.edge.driver";
		//we have to write value of excel sheet
		String v=".\\Drivers\\organisation1.xlsx";	
		System.setProperty(k, v);
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/");
	}
	}


	

	


