package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class AmazonCartPage {
	

	
	@Parameters({"URL","APIkey"})
	@Test
	public void Wartpage(String url, int apikey){
		System.out.println(url);
		System.out.println(apikey);
		System.out.println("1st Cartpage data");
	}
	
	
	@Test
	public void Artpage2() {
		int a=6;
		int b=9;
		Assert.assertTrue(a==b);
		System.out.println("2nd Cartpage data");
	}
	
	
	
	@Test(dataProvider="getdata")
	public void Gartpage3(String username, String Password) {
		System.out.println("3rd Cartpage data");
		System.out.println(username);
		System.out.println(Password);
		
	}
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		data[0][0]= "username1";
		data[0][1]= "passw0rd1";
		
		data[1][0]= "username2";
		data[1][1]= "passw0rd2";
		
		data[2][0]= "username3";
		data[2][1]= "passw0rd3";
		return data;
		
		
	
	
		
		
		
		
	}
	
	
}
