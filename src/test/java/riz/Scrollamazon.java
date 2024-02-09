package riz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollamazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	//typecasting
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	Thread.sleep(3000);
	jse.executeScript("window.scrollBy(0,2000);");
}
}
