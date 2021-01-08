package org.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.myntra.com/");
		  driver.manage().window().maximize();
		  WebElement input = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		  input.sendKeys("cardigan");
		  WebElement search = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
		  search.click();
		  
		  //Absolute Xpath
			
			/*
			 * WebElement product = driver.findElement(By.xpath(
			 * "//li[@class='product-base'][1]/a/div/div/div/div/picture"));
			 * product.click();
			 */
			 
		  //Dynamic Xpath
		  WebElement product1 = driver.findElement(By.xpath("(//li[@class='product-base'])[2]//following::img[2]"));
		  product1.click();
		  Thread.sleep(5000);
		  
		  List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		  for (WebElement price : priceList) {
			  String priceText = price.getText();
			  System.out.println(priceText);
		}
	}

	}

