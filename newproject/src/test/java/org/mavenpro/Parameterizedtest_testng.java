package org.mavenpro;

import org.openqa.selenium.By;
import org.project.Sharmi.project.Baseclass_demo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizedtest_testng extends Baseclass_demo {
	@Test
	@Parameters({"user","pass"})
public void adactin(String user,String pass) {
	browser("chrome");
	url("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);

	
}
}
