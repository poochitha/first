package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://traininginporur.net/selenium-training-in-porur.php");
		WebElement ques = driver.findElement(By.xpath("(//a[@class='accordion-toggle collapsed'])[1]"));
		ques.click();
	}

}
