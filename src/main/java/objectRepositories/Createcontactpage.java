package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcontactpage {
	//declaration
		@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement Createcontactlookupimage;
		//@FindBy(xpath="(//img[@title='Select'])[1]")private WebElement clickonlookupimg;

		//initialisation
				public Createcontactpage(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
				//utilisation
public WebElement getCreatecontactlookupimage() {
					return Createcontactlookupimage;
				}

				//public WebElement getClickonlookupimg() {
					//return clickonlookupimg;
				//}
				//business library
				public void Createcontactpage(){
					Createcontactlookupimage.click();	
				}
				//public void clickonlookeupimage() {
					//clickonlookupimg.click();
				//}


}
				
	

