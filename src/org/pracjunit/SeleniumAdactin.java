package org.pracjunit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAdactin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys("FlynnRyder");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("poojitha8219");
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Photos\\LoginPage.png");
		FileUtils.copyFile(src, des);
		
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText("Los Angeles");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel); 
		s1.selectByValue("Hotel Sunshine");
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room); 
		s2.selectByIndex(3);
		WebElement rnumber = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rnumber); 
		s3.selectByValue("3");
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		date.sendKeys("15/11/2020");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		checkout.sendKeys("25/11/2020");
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("2");
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(2);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src1 = ss.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Photos\\HotelBooking.png");
		FileUtils.copyFile(src1, des1);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		TakesScreenshot ss1 = (TakesScreenshot)driver;
		File src2 = ss1.getScreenshotAs(OutputType.FILE);
		File des2 = new File("C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Photos\\BookingConfirmation.png");
		FileUtils.copyFile(src2, des2);
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys("Chandler");
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys("Bing");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("15 ");
		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("1234567890123456");
		WebElement credittype = driver.findElement(By.id("cc_type"));
		credittype.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		month.click();
		for (int i = 1; i <= 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		year.click();
		for (int i = 1; i <= 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("783");
		TakesScreenshot ss2 = (TakesScreenshot)driver;
		File src3 = ss2.getScreenshotAs(OutputType.FILE);
		File des3 = new File("C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Photos\\FinalAddress.png");
		FileUtils.copyFile(src3, des3);
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(5000);
	}

}
