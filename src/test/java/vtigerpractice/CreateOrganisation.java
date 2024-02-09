package vtigerpractice;


import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtilities.Baseclass;
import genericUtilities.Excelutility;
import genericUtilities.Javautility;
import genericUtilities.Propertyfileutility;
import objectRepositories.Createneworgpage;
import objectRepositories.Createorgpage;
import objectRepositories.Homepage;
import objectRepositories.Loginpage;
import objectRepositories.Organisationinformationpage;


public class CreateOrganisation extends Baseclass{
	//using test ng progam run
	//if run normally take main method and extends with webdriverutility
//public static void main(String[] args) throws Throwable {
	//by using test annotation and followed by non static method 
	@Test
	public void createorgP() throws Throwable{
	//create object for all utilities
Javautility jutill=new Javautility();
Propertyfileutility putill=new Propertyfileutility();
Excelutility eutill=new Excelutility();
//fetch the data from propertyfile
String UN=putill.readdatafrompropertyfile("un");
String PWD=putill.readdatafrompropertyfile("pwd");
String URL=putill.readdatafrompropertyfile("url");
//launch the browser
WebDriver driver=new ChromeDriver();
driver.get(URL);
Thread.sleep(2000);
//login page
 Loginpage l=new Loginpage(driver);
 l.loginToApp(UN, PWD);
 //home page
 Homepage h=new Homepage(driver);
 h.clickonorganisationlink();
 Thread.sleep(2000);
 //Organisation page
 Createorgpage o=new Createorgpage(driver);
 o.clickonCreateorgLookupimage();
 //organisation name
 //fetch data from excel
 String ORG=eutill.readdatafromExcelUtility("Sheet1", 0, 0);
 Thread.sleep(3000);
 //take objectrepository same class name should taken
 Createneworgpage p=new Createneworgpage(driver);
 Thread.sleep(3000);
 //random class
 
 p.crearteneworganisationpage(ORG+jutill.getrandomnumber());
 Thread.sleep(3000);
 //organisationinformationpage
 Organisationinformationpage op=new Organisationinformationpage(driver);
 Thread.sleep(3000);
 op.getOrgHeaderText();
 //Logout frm App
 h.LogoutApp();
}
}