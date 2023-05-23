package org.mavenpro;

import org.openqa.selenium.By;
import org.project.Sharmi.project.Baseclass_demo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider_testng extends Baseclass_demo {
	@DataProvider(name="adactin")
	public Object data(){
		Object[][] s = new Object[2][2];
				s[0][0]="shahul123@gmail.com";
		s[0][1]="shahul";
		s[1][0]="sha@gmail.com";
		s[1][1]="sha";
		return s;
	}
	@Test(dataProvider="adactin")
	
public void adactin(String user,String pass) {
	browser("chrome");
	url("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);

	
}
}