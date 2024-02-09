package vtigerpractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtilities.Baseclass;
import genericUtilities.Excelcontactutility;
import genericUtilities.Excelutility;
import genericUtilities.Javautility;
import genericUtilities.Propertyfileutility;
import objectRepositories.Contactinformationpage;
import objectRepositories.Createcontactpage;
import objectRepositories.Createnewcontactpage;
import objectRepositories.Homepage;
import objectRepositories.Loginpage;

public class Contacts{
public static void main(String[] args) throws Throwable {
	Javautility jutill=new Javautility();
	Propertyfileutility putill=new Propertyfileutility();
	Excelcontactutility eutil=new Excelcontactutility();
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
	 //contact page
	 Createcontactpage ab=new Createcontactpage(driver);
      ab.Createcontactpage();
      //create new contact page
      Createnewcontactpage p=new Createnewcontactpage(driver);
      String con=eutil.readdatafromExcelcontactutility("Sheet1", 0, 0);
      p.contactnametextfield(con+jutill.getrandomnumber());
      //login to contact informationpage
      Contactinformationpage a=new Contactinformationpage(driver);
      a.getContactHeadertext();
}



}
