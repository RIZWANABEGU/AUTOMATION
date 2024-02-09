package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createorgpage {
	//declaration
		@FindBy(xpath = "//img [@title='Create Organization...']")private WebElement CreateorgLookupimage;
		//initialisation
		public Createorgpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilisation
		public WebElement getCreateorgLookupimage() {
			return CreateorgLookupimage;
		}
		//Businesslibrary
		public void clickonCreateorgLookupimage() {
			CreateorgLookupimage.click();
		}
		}



