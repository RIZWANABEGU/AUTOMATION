package practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
@AfterSuite
public void a() {
	Reporter.log("disconnection to DB", true);
}
@BeforeSuite
public void B() {
	Reporter.log("connection DB", true);
}
@AfterClass
public void c() {
	Reporter.log("Launch the browser", true);
}
@BeforeClass
public void d() {
	Reporter.log("close the browser", true);
}
@AfterMethod
public void e() {
	Reporter.log("Logout from app", true);
}
@BeforeMethod
public void f() {
	Reporter.log("Login to app", true);//true is akeyword and get the output in emailable report and console
}
@Test
public void TC() {
}
}
//annotations can flow same format
