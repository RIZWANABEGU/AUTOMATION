package practicetask;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrationtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
driver.findElement(By.xpath("//label[text()='Female']")).click();
	
driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("rizwana",Keys.TAB,"begum",Keys.TAB,"rizzu@gmail.com",Keys.TAB,"test@123",Keys.TAB,"test@123",Keys.ENTER );
	driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
	//public int getrandomnumber() {
		// Random r=new Random();
	//	return r.nextInt(1000);
	
	}
	}

