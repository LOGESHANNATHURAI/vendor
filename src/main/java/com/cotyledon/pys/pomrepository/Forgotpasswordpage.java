package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpasswordpage {

	WebDriver driver;
	public Forgotpasswordpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@autocomplete=\"username\" and @type=\"email\"]")
	private WebElement mobilenooremailid;
	public WebElement getMobilenooremailid() {
		return mobilenooremailid;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Send OTP')]")
	private WebElement sendotpbutton;
	public WebElement getSendotpbutton() {
		return sendotpbutton;
	}
	
	@FindBy(xpath = "//label[text()='Password']/parent::div/child::div/child::input")
	private WebElement newpassword;
	public WebElement getNewpassword() {
		return newpassword;
	}

	@FindBy(xpath = "//label[contains(text(),'Confirm Password')]/parent::div/child::div/child::input")
	private WebElement confirmpassword;
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	
	@FindBy(xpath="//input[@autocomplete=\"current-password\"]")
	private WebElement otpno;
	public WebElement getOtpno() {
		return otpno;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement updatebutton;
	public WebElement getUpdatebutton() {
		return updatebutton;
	}
	
	
}
