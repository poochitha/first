package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
		  public static WebDriver driver; 
	public static  void browserLaunch(String browser ) {
		if(browser.equalsIgnoreCase("chrome"))
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static  void getUrl(String url) {
		driver.get(url);

	}
	public static  void click_Meth(WebElement element) {
		
		element.click();
		
		
	}
	
}
