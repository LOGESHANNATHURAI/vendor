package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	WebDriver driver;
	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//input[@name='email']")
	private WebElement Emailormobilefield;
public WebElement getEmailormobilefield() {
	return Emailormobilefield;
}
@FindBy(xpath="//input[@name='password']")	
private WebElement passwordfield;
public WebElement getPasswordfield() {
	return passwordfield;
}

@FindBy(xpath = "//button[@type='submit']")
private WebElement loginbutton;
public WebElement getLoginbutton() {
	return loginbutton;
}

@FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
private WebElement forgotpasswordlink;
public WebElement getForgotpasswordlink() {
	return forgotpasswordlink;
}

@FindBy(xpath = "//h4[contains(text(),'Sign in')]/parent::div")
private WebElement signinpage;
public WebElement getSigninpage() {
	return signinpage;
}
@FindBy(xpath = "//input[@autocomplete='username']")
private WebElement forgotpasswordmobileno;
public WebElement getForgotpasswordmobileno() {
	return forgotpasswordmobileno;
}
@FindBy(xpath = "//button[contains(text(),'Send OTP')]")
private WebElement sendOTPButton;
public WebElement getSendOTPButton() {
	return sendOTPButton;
}
@FindBy(xpath = "(//input[@type='password' and @aria-invalid='false'])[1]")
private WebElement forgotpasswordnewpassword;
public WebElement getForgotpasswordnewpassword() {
	return forgotpasswordnewpassword;
}
@FindBy(xpath = "(//input[@type='password' and @aria-invalid='false'])[2]")
private WebElement forgotpasswordconfirmpassword;
public WebElement getForgotpasswordconfirmpassword() {
	return forgotpasswordconfirmpassword;
}
@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input css-yzm7vx']")
private WebElement forgotpasswordOTP;
public WebElement getForgotpasswordOTP() {
	return forgotpasswordOTP;
}
@FindBy(xpath = "//button[contains(text(),'Update')]")
private WebElement forgotpasswordUpdateButton;
public WebElement getForgotpasswordUpdateButton() {
	return forgotpasswordUpdateButton;
}






}
