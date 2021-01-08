package org.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	}

}
