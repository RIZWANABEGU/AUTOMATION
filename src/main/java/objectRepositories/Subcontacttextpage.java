package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subcontacttextpage {
	@FindBy(xpath="//input[@name='search_text']")private WebElement contacttext;
//intitialisation
public  Subcontacttextpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//utilisation
public WebElement getContacttext() {
	return contacttext;
}
//busenesslibrary
public void contactinfopage(String CINP) {
	contacttext.sendKeys(CINP);
}

}