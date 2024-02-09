package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
Thread.sleep(3000);
WebElement day	=driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select s=new Select(day);
	s.selectByVisibleText("1");
	WebElement month	=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Thread.sleep(3000);
	Select s1=new Select(month);
	s1.selectByVisibleText("Apr");
	WebElement year	=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Thread.sleep(3000);
	Select s2=new Select(year);
	s2.selectByVisibleText("1995");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\ADMIN\\Desktop\\Screenshot2\\bb.png");
	Files.copy(src, dest);
	File dest1=new File("C:\\Users\\ADMIN\\Desktop\\Screenshot2\\bb1.png");
	Files.copy(src, dest1);
	
	//
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		//WebElement.findElement(By.xpath("driver.findElement(By.xpath(\"//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']\")).click();"));	
		
	}

}
