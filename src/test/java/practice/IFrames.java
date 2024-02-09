package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IFrames {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
//driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
//i want to know how many frames are in page that is //iframe  
//move to control selenium from mainpage to frame
driver.switchTo().frame("iframeResult");//only id and name will accept from frames
//take any element on the frame and perform the action
//and take only attribute value
//clear the name
driver.findElement(By.xpath("//input [@name='fname']")).clear();
//send the firstname
driver.findElement(By.xpath("//input [@name='fname']")).sendKeys("rizwana");
//switch the control of selenium from 2nd frame to main page
driver.switchTo().defaultContent();
//again move control from mainpage to 2nd frame
driver.switchTo().frame("iframeResult");
//enter lastname
driver.findElement(By.xpath("//input [@name='lname']")).clear();
driver.findElement(By.xpath("//input [@name='lname']")).sendKeys("affu");
//get the text and print
Thread.sleep(3000);
String ab=driver.findElement(By.xpath("//label [text()='Last name:']")).getText();
System.out.println(ab);
	}

}
