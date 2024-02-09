
package genericUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepositories.Loginpage;

public class Baseclass {

@BeforeSuite
public void bs() {
	Reporter.log("DB connection");
}
	@BeforeClass
	public void bc() {
		//webdrivermanager.firedoxdriver().setup()
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.localhost:8888/");
	Reporter.log("launch the application");
	}
	@BeforeMethod
	public void bm() throws Throwable  {
//when hard cord use this one
		Propertyfileutility putill=new Propertyfileutility();
		String UN=putill.readdatafrompropertyfile("un");
		String PWD=putill.readdatafrompropertyfile("pwd");
		String URL=putill.readdatafrompropertyfile("url");
//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//driver.findElement(By.xpath("//input [@name='user_password']")).sendKeys("admin");
//driver.findElement(By.xpath("//input [@id='submitButton']")).click();
		//Loginpage l=new Loginpage(driver);
        // l.loginToApp(UN,PWD);
        
	}
	@AfterMethod
	public void am(WebDriver driver) {
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a [text()='Sign Out']")).click();
	}
@AfterClass
public void ac() {
	Reporter.log("close window");
}
	@AfterSuite
	public void as() {
		Reporter.log("DB disconnection");
	}
}

 