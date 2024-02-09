package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
//to change the execution order of TC
public class Prioritytest {
@Test(priority=3)
public void TC1() {
Reporter.log("running TC1", true);
}
@Test(priority=2)
public void TC2() {
Reporter.log("running TC2", true);
}
@Test(priority=1)
public void TC3() {
Reporter.log("running TC3", true);
}
}
