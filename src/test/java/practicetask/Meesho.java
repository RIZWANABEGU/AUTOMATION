package practicetask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Meesho {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com");
		WebElement men=driver.findElement(By.xpath("//span[text()='Men']"));
	//click on mensoption
	Actions s=new Actions(driver);
	s.moveToElement(men).perform();
	Thread.sleep(3000);
	//if dropdown is not visible then doing debugging
	//click on resourses
	//press ctrl+\ then inspect
	driver.findElement(By.xpath("(//*[contains(text(),'Jeans')])[2]")).click();
	//driver.switchTo().frame(1);
	//WebElement jeans=driver.findElement(By.xpath("(//p [text()='Jeans'])[1]"));
	//Thread.sleep(3000);
	}

}
