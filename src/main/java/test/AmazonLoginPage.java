package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonLoginPage {
	@BeforeMethod
	public void befremethodantn() {
		System.out.println("I will exec before method ");
	}
	@AfterMethod
	public void Aftermethodantn() {
		System.out.println("I will exec after method ");
	}
	@Test
	public void loginpage() {
		System.out.println("1st loginpage data");
	}
	@Test(groups= {"clientreq"})
	public void loginpage2() {
		System.out.println("2nd loginpage data");
	}
	@Test(groups= {"clientreq"})
	public void loginpage3() {
		System.out.println("3rd loginpage data");
	}


}
