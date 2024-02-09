package riz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html\"");
//switch to first frame
	 driver.switchTo().frame("");
	 //take any element on 1st frame
	String text = driver.findElement(By.xpath("//a [text()='org.openqa.selenium']")).getText();
	 System.out.println(text);
	 //switch to second frame
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("");
	 //take any element
	 String text1 = driver.findElement(By.xpath("")).getText();
	 System.out.println(text1);
}
}
