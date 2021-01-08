package org.pracjunit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom.Base;

public class Elements {
	//public static WebDriver driver;
	/*
	 * public Elements(WebDriver driver) {
	 * 
	 * //this.driver=driver; PageFactory.initElements(driver,this);
	 * 
	 * }
	 */
	 

	public Elements(WebDriver driver) {
		PageFactory.initElements(driver,this); 	}


	@FindBy(id="username")
	private WebElement login;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement btn;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement rnumber;
	
	@FindBy(id="datepick_in")
	private WebElement date;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRnumber() {
		return rnumber;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getBtn() {
		return btn;
	}

	
	

}
