package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Oppertuni {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.findElement(By.xpath("//input [@name='user_name']")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
driver.findElement(By.xpath("//a [text()='Opportunities']")).click();
driver.findElement(By.xpath("//img [@title='Create Opportunity...']")).click();
driver.findElement(By.xpath("//input [@name='potentialname']")).sendKeys("shanker");
Thread.sleep(3000);
driver.findElement(By.xpath("//input [@title='Save [Alt+S]']")).click();
Thread.sleep(3000);
WebElement day =driver.findElement(By.xpath("//select [@id='related_to_type']"));
Select s=new Select(day);
s.selectByVisibleText("Organizations");
}
}
