package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePage {
	@BeforeClass
	public void clsdatabefre() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void Afterclsdata() {
		System.out.println("After class");
	}
	@BeforeSuite
	public void suitdatabefre() {
		System.out.println("before suit");
	}
	
	@AfterSuite
	public void Aftersuitdata() {
		System.out.println("After suit");
	}

	@AfterTest
	public void aftertestanntn() {
		System.out.println("i will exec last");
	}
	@BeforeTest
	public void prerequisite() {
		System.out.println("i will exec 1st");
	}
	
	@Test(groups= {"clientreq"})
	public void homepage(){
		System.out.println("1st homepage data");
	}
	@Test
	public void homepage2() {
		
		System.out.println("2nd homepage data");
	}
	@Test
	public void homepage3() {
		System.out.println("3rd homepage data");
	}

}
