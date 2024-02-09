package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewoppertunitiespage {
	//declaration
		@FindBy(xpath = "//input[@name='potentialname']")private WebElement Oppertunitytextfield;
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement Savebutton;
		//initialisation
		public Createnewoppertunitiespage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilisation
		public WebElement getOppertunitytextfield() {
			return Oppertunitytextfield;
		}
		public WebElement getSavebutton() {
			return Savebutton;
		}
		//business library
		public void oppertunitiestextfield() {
			 Oppertunitytextfield.sendKeys("rizwana");
		}
		public  void savebutton() {
			Savebutton.click();
		}
}
