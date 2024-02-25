package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateComplaintsPage {
	
	WebDriver driver;
	public CreateComplaintsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@id='Complaint Type']")
	private WebElement complainttypedropdown;
	public WebElement getComplainttypedropdown() {
		return complainttypedropdown;
	}
	
	
	@FindBy (xpath = "//p[@aria-label='BOOKING']")
	private WebElement Bookingoption;
	public WebElement getBookingoption() {
		return Bookingoption;
	}
	
	
	@FindBy (xpath = "//p[@aria-label='OFFER']")
	private WebElement Offersoption;
	public WebElement getOffersoption() {
		return Offersoption;
	}
	
	
	@FindBy (xpath = "//p[@aria-label='PAYMENT']")
	private WebElement Paymentoption;
	public WebElement getPaymentoption() {
		return Paymentoption;
	}
	
	
	@FindBy (xpath = "//p[@aria-label='SLOTS']")
	private WebElement Slotsoption;
	public WebElement getSlotsoption() {
		return Slotsoption;
	}
	
	
	@FindBy (xpath = "//textarea[@placeholder='  Type here']")
	private WebElement Commentbox;
	public WebElement getCommentbox() {
		return Commentbox;
	}
		
	@FindBy (xpath = "//p[contains(text(),'Submit Complaints')]")
	private WebElement Submitbutton;
	public WebElement getSubmitbutton() {
		return Submitbutton;
	}
	

}
