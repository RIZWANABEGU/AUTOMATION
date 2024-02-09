package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {
@Test
public void TC1() {
Reporter.log("running TC1", true);
}
@Test(dependsOnGroups= {"login"})
public void TC2() {
	Reporter.log("running TC2", true);
	}
}
