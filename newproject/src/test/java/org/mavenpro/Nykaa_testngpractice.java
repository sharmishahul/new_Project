package org.mavenpro;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.project.Sharmi.project.Baseclass_demo;
import org.testng.annotations.Test;



public class Nykaa_testngpractice extends Baseclass_demo {
@Test	(priority = 0)
public void browser() {
	browser("chrome");
}
@Test(priority = 1)
public void url() {	
	url("https://www.nykaafashion.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=PMax&utm_campaign=BrandFunded_SouledStore");
}
@Test(priority = 2)
public void women() {
	driver.findElement(By.xpath("//span[text()='Women']")).click();
}
@Test(priority = 3)
public void allwindow() {
	String windowHandlebefore = driver.getWindowHandle();
	for(String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
	}
	driver.close();
	driver.switchTo().window(windowHandlebefore);
}

@Test(priority = 4)
public void dress() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kurta",Keys.ENTER);
}
@Test(priority = 5)
public void select() {
	driver.findElement(By.xpath("//img[@alt='Indi Inside - Block Printed Anarkali Pink Kurta']")).click();
}

	











}