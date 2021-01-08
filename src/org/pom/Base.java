package org.pom;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static WebDriver  browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			return driver;
		
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void writeInput(WebElement el, String input) {
		el.sendKeys(input);
		
	}
	public static void buttonClick(WebElement el1) {
		el1.click();
	}
	public static void dropDownValue(WebElement el, String text) {
		Select s = new Select(el);
		s.selectByValue(text);
	}
	public static void dropDownText(WebElement el, String text) {
		Select s = new Select(el);
		s.selectByVisibleText(text);
	}
	 public static void dropDownIndex(WebElement el, int index) {
		 Select s = new Select(el);
		 s.selectByIndex(index);
	}
	public static void rightClick(Actions a, WebElement e2) {
		a.contextClick(e2).perform();
	}
	public static void doubleClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public static void mouse(Actions a, WebElement el) {
		a.moveToElement(el).perform();
	}
	public static void keyPress(Robot r, int key) {
		r.keyPress(key);
	}
	public static void keyRelease(Robot r, int key) {
		r.keyRelease(key);
	}
	public static void screenShotPage(String screen) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Photos\\"+ screen);
		FileUtils.copyFile(src, des);
	}
	

}
