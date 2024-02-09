package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.Webdriverutilities;

 public class Homepage extends Webdriverutilities {
	//declaration
		@FindBy(xpath ="//a [text()='Organizations']" )private WebElement OrganisationLink;
		@FindBy(xpath = "//a[text()='Contacts']")private WebElement ContactsLink;
		@FindBy(xpath = "//a[text()='Opportunities']")private WebElement Opportunitieslink;
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement AdministrationImg;
		@FindBy(xpath = "//a [text()='Sign Out']")private WebElement Signoutlink;
//initialisation
				public Homepage(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
				//Utilisation
				public WebElement getOrganisationLink() {
					return OrganisationLink;
				}
				public WebElement getContactsLink() {
					return ContactsLink;
				}
				public WebElement getOpportunitieslink() {
					return Opportunitieslink;
				}
				public WebElement getAdministrationImg() {
					return AdministrationImg;
				}
				public WebElement getSignoutlink() {
					return Signoutlink;
				}
			// Bussiness library it is used to connect code related functinality
				//public void 
				public void clickonorganisationlink(){
					OrganisationLink.click();
				}
				public void clickContactsLink() {
					ContactsLink.click();
				}
				public void clickOpportunitieslink() {
					Opportunitieslink.click();
				}
				public void administrator() {
					AdministrationImg.click();
				}
				public void LogoutApp() {
					Signoutlink.click();
				}
				}
				
			
		


