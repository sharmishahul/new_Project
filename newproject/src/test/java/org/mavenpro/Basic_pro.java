package org.mavenpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_pro {
	@Test
	

private void Basic_pro() {
	
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.makemytrip.com/");
	}

}
