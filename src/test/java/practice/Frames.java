package practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
public static void main(String[] args)throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\javaprograms\\credentials.properties");
	Properties p=new Properties();
	p.load(fis);
	String UN=p.getProperty("UN");
	String pwd=p.getProperty("pwd");
	String URL=p.getProperty("url");
	String browser=p.getProperty("browser");
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	//login to app
	driver.findElement(By.xpath("//input [@name='user_name']")).sendKeys(UN);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input [@id='submitButton']")).click();
	//data fetch from excel
	FileInputStream fi=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\advselenium\\Drivers\\organisation1.xlsx");
	//create workbookfactory class 
	Workbook wb=WorkbookFactory.create(fi);
	//use get sheet method,and call get string values by using getstringcell value(depends on data type)
	 String org = wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	 System.out.println(org);
	//inspect organisation and click on organisation
	driver.findElement(By.xpath("//a [text()='Organizations']")).click();
	Thread.sleep(3000);
	//click on plus button
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	Thread.sleep(3000);
	String data1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(data1);
	//give the random nmbs for 100 times
	Random ran=new Random();
	int r=ran.nextInt(100);
	//driver.findElement(By.xpath("//input [@title='Save [Alt+S]']")).click();
	//get data from excel inspect organisation name
	driver.findElement(By.xpath("//input [@name='accountname']")).sendKeys(data1+r);
	Thread.sleep(3000);
	//click on save button
	driver.findElement(By.xpath("//input [@title='Save [Alt+S]']")).click();
	Thread.sleep(3000);
	//inspect testcase text and write return type datatype that is string
	String ar = driver.findElement(By.xpath("//span [@class='dvHeaderText']")).getText();
	Thread.sleep(3000);
	//if condition true pass then print pass // and validate the test
	if(ar.contains("tcs")){
		System.out.println("Tc is pass");
	}
	else {
		System.out.println("TC is fail");
	//inspect img on administrator button and return type is webelement
	WebElement ab = driver.findElement(By.xpath("//img [@src='themes/softed/images/user.PNG']"));
	//create actions class for move to element method&driver taken mandatory
	Thread.sleep(3000);
	 Actions act = new Actions(driver);
	//by using perform method we can move
	act.moveToElement(ab).perform();
	//click on signout button
	driver.findElement(By.xpath("//a [text()='Sign Out']")).click();
}
}
}
