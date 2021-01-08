
package org.pracjunit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pom.Base;


public class SelAdactin extends Base {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		driver = browserLaunch("Chrome");
		loadUrl("http://adactinhotelapp.com/index.php");
		Elements e = new Elements(driver);
		
		writeInput(e.getLogin(), "FlynnRyder");
		
		writeInput(e.getPwd(), "poojitha8219");
		
	    buttonClick(e.getBtn());
		
		dropDownText(e.getLocation(), "Los Angeles");
		
		dropDownValue(e.getHotel(), "Hotel Sunshine");
		
		dropDownIndex(e.getRoom(), 3);
		
	   buttonClick(e.getDate());
		
		System.out.println("okay");
	
		
		
		Robot r = new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		//date.sendKeys("15/11/2020");
		
		writeInput(e.getDate(), "15/11/2020");
		
		buttonClick(e.getCheckout());
		
		/*
		 * WebElement checkout = driver.findElement(By.id("datepick_out"));
		 * checkout.click();
		 */
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		//checkout.sendKeys("25/11/2020");
		
		writeInput(e.getCheckout(), "25/11/2020");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
        Select s4 = new Select(adult);
		s4.selectByValue("2");
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(2);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
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
			r.keyPress(KeyEvent.VK_DOWN)
			;
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("783");
	
		
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		Thread.sleep(5000);
		
		
		/*
		 * WebElement login = driver.findElement(By.id("username")); writeInput(login,
		 * "FlynnRyder");
		 * 
		 * WebElement pwd = driver.findElement(By.id("password")); writeInput(pwd,
		 * "poojitha8219");
		 * 
		 * WebElement btn = driver.findElement(By.id("login")); buttonClick(btn);
		 */
        
		/*
		 * WebElement location = driver.findElement(By.id("location"));
		 * dropDownText(location, "Los Angeles");
		 * 
		 * Robot r = new Robot(); WebElement hotel =
		 * driver.findElement(By.id("hotels")); dropDownValue(hotel, "Hotel Sunshine");
		 * 
		 * WebElement room = driver.findElement(By.id("room_type")); dropDownIndex(room,
		 * 3);
		 * 
		 * WebElement rnumber = driver.findElement(By.id("room_nos"));
		 * dropDownIndex(rnumber, 3);
		 * 
		 * WebElement date = driver.findElement(By.id("datepick_in"));
		 * buttonClick(date);
		 */
	
		
	}

}
