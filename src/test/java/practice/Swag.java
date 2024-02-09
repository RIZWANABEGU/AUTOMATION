package practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {
public static void main(String[] args)throws Throwable {
	FileInputStream fi=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\javaprograms\\swag.properties");
	Properties p=new Properties();
	p.load(fi);
	String UN=p.getProperty("un");
	System.out.println(UN);
	String pwd=p.getProperty("pwd");
	System.out.println(pwd);
	String URL=p.getProperty("url");
	System.out.println(URL);
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	driver.findElement(By.xpath("//input [@placeholder='Username']")).sendKeys(UN);
	driver.findElement(By.xpath("//input [@placeholder='Password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input [@type='submit']")).click();

}
}
