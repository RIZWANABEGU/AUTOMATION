package practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Subscreenshot {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				  WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	//from io package and take getscreenshotas method 
				  File src=logo.getScreenshotAs(OutputType.FILE);
				  File dest=new File("C:\\Users\\ADMIN\\Desktop\\Screenshot3\\cc.png");
				  Files.copy(src, dest);
	}

}
