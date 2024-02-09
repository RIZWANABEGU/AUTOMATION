package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg2 {
	@Test
	public void TC1() {
		Reporter.log("rizwana",true);
	}
@Test
public void TC2() {
Reporter.log("Ashwini");
}
@Test 
public void TC4() {
	Reporter.log("Ashmita");
	Assert.fail();//test case fail
}

}

