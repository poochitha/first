package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCBank {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/");
	WebElement login = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	login.sendKeys("12345");
	WebElement btn = driver.findElement(By.xpath("//img[@alt='continue'][1]"));
	btn.click();
}
}