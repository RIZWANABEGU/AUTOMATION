package riz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollhandling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	//click on cancel button hidden divison popup
	driver.findElement(By.xpath("//span [text()='✕']")).click();
	//inspect on mobiles
	driver.findElement(By.xpath("//img [@class='_2puWtW _3a3qyb']")).click();
	//typecasting
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	Thread.sleep(3000);
	//clear console and write window enter then window.scrollby
	jse.executeScript("window.scrollBy(0,2000);");
}
}
