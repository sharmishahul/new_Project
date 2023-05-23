package org.mavenpro;

import org.openqa.selenium.By;
import org.project.Sharmi.project.Baseclass_demo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookMyShow extends Baseclass_demo {
@Test(priority=0)
	public void browser() {
		browser("chrome");
	}
@Test(priority=1)
	public void url() {
	
		url("https://in.bookmyshow.com/explore/home/chennai");
	}
@Test(priority=2)
public void implicitlywait() {
	 implicitly_wait(10);
}
@Test(priority=3)
	public void select_movie() {
		driver.findElement(By.xpath("//img[@alt='Pathu Thala']")).click();
	}
@Test(enabled=false)
public void date() {
	driver.findElement(By.xpath("//li[@data-slick-index=\"0\"]")).click();
}
@Test(priority=5)
	public void book_tickets() {
	
	driver.findElement(By.xpath("//span[text()='Book tickets'][1]")).click();
	}
@Test(priority=6)
	public void personalized() {
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
	}
@Test(priority=7)
	public void select_theatre() {
		driver.findElement(By.xpath("//a[text()='Rohini Silver Screens: Koyambedu']//following::a[@data-date-time=\"11:45 PM\"][1]")).click();
	}
@Test(priority=8)
	public void termsandc0nditions() {
		driver.findElement(By.id("btnPopupAccept")).click();
	}
@Test(priority=9)
	public void selectnoofseats() {
		driver.findElement(By.xpath("//div[@class=\'__list\']/ul/li[@id=\'pop_2\']")).click();
	}
@Test(priority=10)
public void selectbutton() {
	driver.findElement(By.id("proceed-Qty")).click();
}
@Test(priority=11)
	public void seat_selection() {
		driver.findElement(By.id("A_9_015")).click();
	}
@Test(priority=12)
public void pay() {
	driver.findElement(By.id("btmcntbook")).click();
}
@Test(priority=13)
public void prepay() {
	driver.findElement(By.id("prePay")).click();
}
}
