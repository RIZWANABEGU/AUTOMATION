package riz;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//click on continue with google
	driver.get("https://www.Linkedin.com/");
	driver.findElement(By.xpath("//span [text()='Continue with Google']")).click();
	//get window handle
	//Thread.sleep(2000);
	Set<String> ids = driver.getWindowHandles();
	//create object of Arraylist store childwindow id
	Thread.sleep(2000);
	ArrayList<String> al=new ArrayList<String>(ids);
	//get the window id
	Thread.sleep(3000);
	//that id given to by using get method of childbrowser
	String cwid=al.get(1);
	// child browser window can be print
	System.out.println(cwid);
	//switch to child browser
	driver.switchTo().window(cwid);
	//inspect child window mail
	driver.findElement(By.xpath("//input [@type='email']")).sendKeys("skrizwana2644@gmail.com");
}
}
