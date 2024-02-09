package riz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
public static void main(String[] args) throws InterruptedException {
	//create object of chromeoptions class
	ChromeOptions add=new ChromeOptions();
	add.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(add);
	Thread.sleep(2000);
	driver.get("https://www.hdfc.com");
	
}
}
