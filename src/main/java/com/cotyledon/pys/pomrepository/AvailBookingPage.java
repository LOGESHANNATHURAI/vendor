package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvailBookingPage {
	
	WebDriver driver;
	public AvailBookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement bookingDateButton;
	public WebElement getBookingDateButton() {
		return bookingDateButton;
	}
	@FindBy(xpath = "//button[contains(text(),'10')]")
	private WebElement selectDateAs10;
	public WebElement getSelectDateAs10() {
		return selectDateAs10;
	}

	@FindBy(xpath = "//h5[normalize-space()='No Bookings Found!']")
	private WebElement nobookingfoundtext;
	public WebElement getNobookingfoundtext() {
		return nobookingfoundtext;
	}
	
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M3.5 11.5a')]")
	private WebElement keybutton;
	public WebElement getKeybutton() {
		return keybutton;
	}
	
	@FindBy(xpath = "//div[contains(text(),'AvailBookings')]")
	private WebElement availBookingButton;
	public WebElement getAvailBookingButton() {
		return availBookingButton;
	}
	
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement firstCustomerOTP;
	public WebElement getFirstCustomerOTP() {
		return firstCustomerOTP;
	}
	
	@FindBy(xpath = "//input[@id=':r6:']")
	private WebElement OTPInput;
	public WebElement getOTPInput() {
		return OTPInput;
	}
	
	@FindBy(xpath = "//button[contains(text(),'submit')]")
	private WebElement ClickSubmit;
	public WebElement getClickSubmit() {
		return ClickSubmit;
	}
}
