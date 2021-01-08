package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.snapdeal.com/");
		  driver.manage().window().maximize();
		  WebElement enterProduct = driver.findElement(By.id("inputValEnter"));
		  enterProduct.sendKeys("iphone x");
		  WebElement search = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		  search.click();
		  Thread.sleep(5000);
			
			/*
			 * WebElement product = driver.findElement(By.
			 * xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[1]//parent::div[1]/a/picture"
			 * )); product.click();
			 */
			 
			
				
				  WebElement actProduct = driver.findElement(By.
				  xpath("//img[@title='Apple iPhone X Plain Cases feelDEtech - Transparent Compatible with IPhone X(10)']"
				  )); actProduct.click();
				 
			 
	}

}
