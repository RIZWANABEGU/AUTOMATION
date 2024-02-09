package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class Loginpage {
	//declaration
	@FindBy(xpath ="//input [@name='user_name']" )private WebElement UNtext;
	@FindBy(xpath = "//input [@name='user_password']")private WebElement pwd;
	@FindBy(xpath = "//input [@id='submitButton']")private WebElement loginbutton;
	//initialisation
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilisation
		public WebElement getUNtext() {
			return UNtext;
		}
		public WebElement getPwd() {
			return pwd;
		}
		public WebElement getLoginbutton() {
			return loginbutton;
		}
			//businesslibrary take nonstatic method
		
			public void loginToApp(String USERNAME,String PASSWORD) {
				UNtext.sendKeys(USERNAME);
				pwd.sendKeys(PASSWORD);
				loginbutton.click();
			}

		
			
			
}


