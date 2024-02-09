package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clickoncontactlookupimgpage {
	@FindBy(xpath="//img[@title='Select']")private WebElement clickonlookupimg;
	//@FindBy(xpath="//input [@id='search_txt']")private WebElement contacttext;

//initialisation
public Clickoncontactlookupimgpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//utilisation


public WebElement getClickonlookupimg() {
	return clickonlookupimg;
}

//public WebElement getContacttext() {
//	return contacttext;
//}
//busenesslibrary

//public void contactinfopage(String CINP) {
	//contacttext.sendKeys(CINP);	
//}
public void clickonlookupimage() {
	clickonlookupimg.click();
}
}

