package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	//find multipe elements by using list method
		//find links by using tagname
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	//counting alllinks on webpage
		System.out.println(allLinks.size());
	int Count = 0;
	//to display the elements on the page
	for(int i=0;i<allLinks.size();i++) {
		if(allLinks.get(i).isDisplayed()) {
			Count++;
		}
	}
	//total links count
	System.out.println(Count);
	System.out.println(allLinks.size()-Count);
	for(int j=0;j<allLinks.size();j++) {
		String names=allLinks.get(j).getText();
System.out.println(names);
	}
}
}
