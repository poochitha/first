package org.adactin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Executable extends Base {
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		getUrl("https://www.redbus.in/");
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		
		List<WebElement> link = driver.findElements(By.tagName("Button"));
		System.out.println("count of link :  "+link.size());
		
		int size = link.size();
		for (WebElement webElement : link) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		/*
		 * for(int i=0; i< size; i++) { String text = link.get(i).getText();
		 * System.out.println(text); }
		 */
		
		WebElement element1  =driver.findElement(By.xpath("//div[@class='icon-down icon ich dib icon-down_WO_BAL']"));
		click_Meth(element1);
		
		Thread.sleep(2000);
		
		//driver.switchTo().alert().dismiss();
		
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='hid-config-sign hide']"));
		click_Meth(ele2);
		
		WebElement fr1 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(fr1);
		
		WebElement inp = driver.findElement(By.id("mobileNoInp"));
		inp.sendKeys("9444686606");
		
	
		
		
		
}
}
