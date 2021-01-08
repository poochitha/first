package org.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavithra\\eclipse-workspace\\SelGreenTech\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504238004%7Ce%7Cfacebook%20login%7C&placement=&creative=318504238004&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066388443%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAtej9BRAvEiwA0UAWXi476zqWVEy1iYVJPFKBh6CEO1EPziqhjH1b9jlyhzm8A2cDqYdD9BoCGk8QAvD_BwE");
		
		
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("Rajendran");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("12345");
		
		WebElement btn = driver.findElement(By.name("loginbutton"));
		btn.click();
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@title='Month']"));
		for (WebElement list : dropdown) {
			String month = list.getText();
			System.out.println(month);
		}
		
	}

}
