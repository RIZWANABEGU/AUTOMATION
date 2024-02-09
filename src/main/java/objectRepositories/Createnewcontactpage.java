package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewcontactpage {
	//declaration
	@FindBy(xpath = "//input[@name='lastname']")private WebElement Contactnametextfield;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement Savebutton;
	//initialisation
			public Createnewcontactpage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			//utilisation
			public WebElement getContactnametextfield() {
				return Contactnametextfield;
			}
			public WebElement getSavebutton() {
				return Savebutton;
			}
		//business library
			public void contactnametextfield(String CONTACTNAME) {
				Contactnametextfield.sendKeys(CONTACTNAME);
			Savebutton.click();
			}
		
}
