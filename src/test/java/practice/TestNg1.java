package practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 {
@BeforeSuite
public void affu() {
	Reporter.log("before suit", true);
}
@BeforeTest
public void affu1() {
	Reporter.log("before test", true);
}
@BeforeClass
public void affu2() {
	Reporter.log("before class", true);
}
@BeforeMethod
public void affu3() {
	Reporter.log("before method", true);
}
@Test
public void userid(){

	Reporter.log("runningverify", true);
}
@AfterSuite
public void as() {
	Reporter.log("Aftersuit", true);
}
@AfterMethod
public void AV() {
	Reporter.log("After method", true);
	}
@AfterClass
public void Ac() {
	Reporter.log("Afterclass", true);
}
@AfterTest
public void At() {
	Reporter.log("After test", true);
}
@AfterSuite
public void As1() {
	Reporter.log("AfterSuit", true);
}
}