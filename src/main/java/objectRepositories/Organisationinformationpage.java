package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationinformationpage {
	//declaration
	@FindBy(xpath ="//span [@class='dvHeaderText']" )private WebElement OrgHeaderText;
	//initialisation
	public Organisationinformationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilisation
	public WebElement getOrgHeaderText() {
		return OrgHeaderText;
	}
	//business library
	public String getHeader() {
		return OrgHeaderText.getText();   
	}
}
	
	