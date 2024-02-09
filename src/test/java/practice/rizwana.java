package practice;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rizwana {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
driver.findElement(By.xpath("//input [@name='user_name']")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
driver.findElement(By.xpath("//a [text()='Organizations']")).click();
driver.findElement(By.xpath("//img [@title='Create Organization...']")).click();
Thread.sleep(3000);
Random ran=new Random();
int r=ran.nextInt(100);
driver.findElement(By.xpath("//input [@name='accountname']")).sendKeys("tcs"+r);
Thread.sleep(3000);
driver.findElement(By.xpath("//input [@title='Save [Alt+S]']")).click();
Thread.sleep(3000);
String act =driver.findElement(By.xpath("//span [@class='dvHeaderText']")).getText();
	Thread.sleep(3000);
if(act.contains("tcs")){
		System.out.println("Tc is pass");
	}
	else {
		System.out.println("TC is fail");
		
	}
	}

}

