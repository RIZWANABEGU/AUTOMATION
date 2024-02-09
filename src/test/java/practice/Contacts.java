package practice;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Contacts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input [@name='user_name']")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
driver.findElement(By.xpath("//a [text()='Contacts']")).click();
driver.findElement(By.xpath("//img [@alt='Create Contact...']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input [@name='lastname']")).sendKeys("rizwana");
driver.findElement(By.xpath("//input [@title='Save [Alt+S]']")).click();
Thread.sleep(3000);
String act=driver.findElement(By.xpath("//span [@class='dvHeaderText']")).getText();
Thread.sleep(3000);
if(act.contains("rizwana")) {
	System.out.println("Tc pass");
}
else {
	System.out.println("TC fail");
}
}
}
