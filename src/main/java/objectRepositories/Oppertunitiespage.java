package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oppertunitiespage {
	//declaration
		@FindBy(xpath = "//img [@title='Create Opportunity...'")private WebElement Oppertunitieslookupimage;
		//initialisation
		public Oppertunitiespage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilisation
		public WebElement getOppertunitieslookupimage() {
			return Oppertunitieslookupimage;
		}
		//business library
		public void oppertunitiespage() {
			Oppertunitieslookupimage.click();
		}
		
}
