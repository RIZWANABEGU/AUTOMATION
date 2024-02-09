package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.OfSerializedConstant;

public class Webdriverutilities {	
public void  maximizewindow(WebDriver driver){   
driver.manage().window().maximize();	
}
public void minimizewindow(WebDriver driver) {
	driver.manage().window().minimize();
}
public void waitforpageload(WebDriver driver) throws Throwable {
	driver.manage().window().wait(20);

}
public void waitforelementtobevisible(WebDriver driver,WebElement element) {
WebDriver wait=(WebDriver) new WebDriverWait(driver,Durationofsecond(20)) ;
((FluentWait<WebDriver>) wait).until(ExpectedConditions.visibilityOf(element));
}
private Duration Durationofsecond(int i) {
	// TODO Auto-generated method stub
	return null;
}
public void handledropdown(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}
public void handledropdown1(WebElement element,String value) {
	Select s=new Select(element);
	s.selectByValue(value);
}
public void handledropdown(WebElement element1,String visibletext) {
		Select s1=new Select(element1);
		s1.selectByVisibleText(visibletext);
}
public void mouseoneraction(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
public void rightclickaction(WebDriver driver) {
	Actions act=new Actions(driver);
	act.contextClick().perform();
}
public void rightclickaction(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}
public void doubleclickaction(WebDriver driver) {
	Actions act=new Actions(driver);
	act.doubleClick().perform();
}
public void doubleclickaction(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
}
public void draganddropaction(WebDriver driver,WebElement srcelement,WebElement targetelement) {
	Actions act=new Actions(driver);
	act.dragAndDrop(srcelement, targetelement).perform();
}
public void draganddropaction(WebDriver driver,WebElement src,int x,int y) {
	Actions act=new Actions(driver);
	act.dragAndDropBy(src, x, y).perform();
}
public void switchtoframe(WebDriver driver,int index) {
driver.switchTo().frame(index);
}
public void switchtoframe(WebDriver driver,String name) {
driver.switchTo().frame(name);
}
public void switchtoframe(WebDriver driver,WebElement element) {
driver.switchTo().frame(element);
}
public void switchtoframe1(WebDriver driver) {
driver.switchTo().parentFrame();
}
public void switchtodefaultframe(WebDriver driver) {
driver.switchTo().defaultContent();
}
public void acceptalert(WebDriver driver) {
driver.switchTo().alert().accept();
}
public void dismissalert(WebDriver driver) {
driver.switchTo().alert().dismiss();
}
public String getalerttext(WebDriver driver) {
return driver.switchTo().alert().getText();
}
public String takesscreenshot(WebDriver driver,String screenshotname) throws Throwable {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("null");
	Files.copy(src, dest);
	return dest.getAbsolutePath();
}
public void scrolldown(WebDriver driver,String argument) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript(argument);
}
public void getwindowhandles(WebDriver driver)
{
	driver.switchTo().newWindow(WindowType.TAB);
	Set<String> s = driver.getWindowHandles();
	List<String>a=new ArrayList<String>(s);
	driver.switchTo().window(a.get(1));
}
}