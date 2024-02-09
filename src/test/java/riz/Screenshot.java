package riz;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
public static void main(String[] args)  throws Throwable{
WebDriver driver=new ChromeDriver();
//screen shot of google
driver.get("https://www.google.com");
// upcasting
TakesScreenshot ts=(TakesScreenshot)driver;
//give source file
File src=ts.getScreenshotAs(OutputType.FILE);
// copy path of given folder and we can write aa or bb.png
File dest=new File("C:\\Users\\ADMIN\\Desktop\\Screeshot\\aa.png");
//copy file
Files.copy(src, dest);
}
}
