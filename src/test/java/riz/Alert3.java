package riz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	 driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	 //click on ok button use accept method
	// driver.switchTo().alert().accept();
	 //click on dismiss method
	 //driver.switchTo().alert().dismiss();
	 //get text on alert popup
	 String text = driver.switchTo().alert().getText();
	 System.out.println(text);
}
}
