package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabledkeyword {
//disable tc by using enabled keyword
	/*@Test
	public void TC2() {
		Reporter.log("running TC2", true);
		}
	@Test
	public void TC3() {
		Reporter.log("running TC3", true);
		}
	@Test(enabled=false)
	public void TC1() {
		Reporter.log("running TC1", true);
		}*/
	//disable tc by using test suit
	@Test
	public void TC1() {
		Reporter.log("running TC1", true);
		}
	@Test
	public void TC2() {
		Reporter.log("running TC2", true);
	}
		@Test
		public void TC3() {
			Reporter.log("running TC3", true);
			}
}
