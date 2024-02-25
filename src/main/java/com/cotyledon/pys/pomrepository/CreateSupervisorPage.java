package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSupervisorPage {
	WebDriver driver;
	public CreateSupervisorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//input[@id='Supervisor Name']")
private WebElement supervisornametextfield;
public WebElement getSupervisornametextfield() {
	return supervisornametextfield;
}

@FindBy(xpath = "//input[@id='Supervisor Email Id']")
private WebElement supervisoremailidtextfield;
public WebElement getSupervisoremailidtextfield() {
	return supervisoremailidtextfield;
}


@FindBy(xpath = "//input[@id='Contact Number']")
private WebElement contactnofield;
public WebElement getContactnofield() {
	return contactnofield;
}


@FindBy(xpath = "//p[contains(text(),'Add Supervisor')]")
private WebElement addsupervisorbutton;
public WebElement getAddsupervisorbutton() {
	return addsupervisorbutton;
}

@FindBy(xpath = "//div[@role='dialog']")
private WebElement successpopup;
public WebElement getSuccesspopup() {
	return successpopup;
}

@FindBy(xpath = "//div[contains(text(),'Failed!')]")
private WebElement supervisorcreatefailed;
public WebElement getSupervisorcreatefailed() {
	return supervisorcreatefailed;
}

@FindBy(xpath = "//p[text()=\"Invalid Email Address!\"]")
private WebElement emailiderrormessage;
public WebElement getEmailiderrormessage() {
	return emailiderrormessage;
}

@FindBy(xpath = "//p[text()=\"Invalid Mobile Number!\"]")
private WebElement contactnoerrormessage;
public WebElement contactnoerrormessage() {
	return contactnoerrormessage;
}

@FindBy(xpath = "//p[contains(text(),'Supervisor Name')]")
private WebElement supervisornameerrormessage;
public WebElement getSupervisornameerrormessage() {
	return supervisornameerrormessage;
}

@FindBy(xpath = "//p[text()=\"Contact Number is Required!\"]")
private WebElement contactErrormessage;
public WebElement getContactErrormessage() {
	return contactErrormessage;
}





















}
