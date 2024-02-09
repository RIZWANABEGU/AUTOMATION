package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactinformationpage {
//declaration
	@FindBy(xpath = "//span [@class='dvHeaderText']")private WebElement ContactHeadertext;
	//intialisation
	public Contactinformationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilisation
	public WebElement getContactHeadertext() {
		return ContactHeadertext;
	}
	
			//business library
			public String getheadertext() {
				return ContactHeadertext.getText();
			}
}
