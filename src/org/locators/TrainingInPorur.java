package org.locators;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrainingInPorur {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://traininginporur.net/selenium-training-in-porur.php");
		 
		//To maximize the browser
		
		
		//Locators using Xpath
		WebElement exit = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		exit.click();
		WebElement courses = driver.findElement(By.xpath("(//a[@href='#'])[1]"));
		
		//Action class for mouse over action
		Actions acc = new Actions(driver);
		acc.moveToElement(courses).perform();
		WebElement sftwr = driver.findElement(By.xpath("(//a[@href='software-testing-training.php'])[1]"));
		acc.moveToElement(sftwr).perform();
		WebElement sel = driver.findElement(By.xpath("//a[@href='selenium-training.php']"));
		sel.click();
		WebElement exit1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		exit1.click();
		WebElement intques = driver.findElement(By.xpath("(//a[@class='accordion-toggle collapsed'])[7]"));
		intques.click();
		
		//Scroll down using JavascriptExecutor
		WebElement task = driver.findElement(By.xpath("(//a[@target='_blank'])[26]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", task);
		
		//Action class for right click action
		WebElement task1 = driver.findElement(By.xpath("//a[text()='Day 7 Screenshot']"));
		Thread.sleep(5000);
		acc.contextClick(task1).perform();
		
		//Robot class for keyboard operation
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//Taking Screenshot
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Photos\\screenshot.png");
		FileUtils.copyFile(src, des);
		
		
		
		
		
	}
}
