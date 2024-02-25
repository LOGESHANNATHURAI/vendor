package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewComplaintsPage {
	
	WebDriver driver;
	public ViewComplaintsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[normalize-space()='No Complaints Found!']")
	private WebElement nofoundtext;
	public WebElement getNofoundtext() {
		return nofoundtext;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Complaints')]")
	private WebElement complaintsclick;
	public WebElement getComplaintsclick() {
		return complaintsclick;
	}

}
