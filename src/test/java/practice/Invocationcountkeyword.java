package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcountkeyword {
@Test(invocationCount=4)
public void TC1() {
	Reporter.log("running TC1", true);
}
public void TC2() {
	Reporter.log("running TC2", true);
}public void TC3() {
	Reporter.log("running TC3", true);
}








}
