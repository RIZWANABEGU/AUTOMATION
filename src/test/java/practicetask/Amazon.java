package practicetask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("rizwana");
//dynamic names vachaka sleep ivvali
Thread.sleep(3000); 
List<WebElement> allnames =driver.findElements(By.xpath("//div[@class='pcTkSc']"));
Thread.sleep(3000);
//all names count
System.out.println(allnames.size());
for(int j=0;j<allnames.size();j++) {
String names=allnames.get(j).getText();
System.out.println(names);
	driver.findElement(By.xpath("(//div[@class='wM6W7d'])[4]")).click();
}
	}
}
