package vtigerpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.Excelcontactutility;
import genericUtilities.Excelsubcontactutility;
import genericUtilities.Javautility;
import genericUtilities.Propertyfileutility;
import objectRepositories.Clickoncontactlookupimgpage;
import objectRepositories.Createcontactpage;
import objectRepositories.Createnewcontactpage;
import objectRepositories.Homepage;
import objectRepositories.Loginpage;
import objectRepositories.Subcontacttextpage;

public class Clickoncontact {
	public static void main(String[] args) throws Throwable {
		Javautility jutill=new Javautility();
		Propertyfileutility putill=new Propertyfileutility();
		Excelsubcontactutility eutil=new Excelsubcontactutility();
		//fetch the data from propertyfile
		String UN=putill.readdatafrompropertyfile("un");
		String PWD=putill.readdatafrompropertyfile("pwd");
		String URL=putill.readdatafrompropertyfile("url");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		//login page
		 Loginpage l=new Loginpage(driver);
		 l.loginToApp(UN, PWD);
		 //home page
		Homepage h=new Homepage(driver);
		 h.clickContactsLink();
		//contactpage
		 Createcontactpage a=new Createcontactpage(driver);
		 a.Createcontactpage();
		 Thread.sleep(3000);
		 Clickoncontactlookupimgpage c=new Clickoncontactlookupimgpage(driver);
		 c.clickonlookupimage();
		 //fetch data from excel sheet
		 Thread.sleep(3000);
		 String contact=eutil.readdatafromExcelsubcontactutility("Sheet1", 0, 0);
		 Thread.sleep(3000);
		 Subcontacttextpage d=new Subcontacttextpage(driver);
		 d.contactinfopage(contact+jutill.getrandomnumber());
	
		     
}
}
