package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createneworgpage {
	//declaration
		@FindBy(xpath = "//input [@name='accountname']")private WebElement Organisationtextfield;
		@FindBy(xpath = "//input [@title='Save [Alt+S]']")private WebElement Savebutton;
		//initialisation
		public Createneworgpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public WebElement getOrganisationtextfield() {
			return Organisationtextfield;
		}
		public WebElement getSavebutton() {
			return Savebutton;
		}
		//businesslibrary
		public void crearteneworganisationpage(String ORGNAME) {
		Organisationtextfield.sendKeys(ORGNAME);
		Savebutton.click();
		}
	}


