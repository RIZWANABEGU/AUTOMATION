package practicetask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("affu@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("test@123");
	driver.findElement(By.xpath("(//input[@name='RememberMe'])[1]")).click();
	driver.findElement(By.xpath("(//input[@class='button-1 login-button'])[1]")).click();
	}

}
