package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	//click on gmail button
 driver.findElement(By.xpath("//a [text()='Gmail']")).click();//find element is not update the seccion id
	 //refresh the page
	 driver.navigate().refresh();
}
}