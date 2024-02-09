package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle  {


public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.findElement(By.xpath("//input [@name='user_name']")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
	driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	driver.findElement(By.xpath("//img[@title='Select']")).click();
//	driver.findElement(By.xpath("//input [@id='search_txt']")).sendKeys("rizzu");
	Thread.sleep(3000);
	Set<String> ids = driver.getWindowHandles();
	Thread.sleep(3000);
	ArrayList<String> al=new ArrayList<String>(ids);
	String cwid=al.get(1);
	driver.switchTo().window(cwid);
	System.out.println();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input [@id='search_txt']")).sendKeys("wipro");
	
}
}
