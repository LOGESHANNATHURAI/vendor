package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImageUploadPage {
	WebDriver driver;
	public ImageUploadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//div[@id='Image Type']")
	private WebElement  imagetypedropdown;
public WebElement getImagetypedropdown() {
	return imagetypedropdown;
}
		
@FindBy(xpath = "//p[@aria-label='Gallery Image']")	
	private WebElement galleryimage;
public WebElement getGalleryimage() {
	return galleryimage;
}
	
@FindBy(xpath = "//p[@aria-label='Profile Image']")	
private WebElement profileimage;
public WebElement getProfileimage() {
	return profileimage;
}

@FindBy(xpath = "//p[@aria-label='Vendor Banner']")
private WebElement vendorbanner;
public WebElement getVendorbanner() {
	return vendorbanner;
}

@FindBy(xpath = "//input[@id='formFileSm']")
private WebElement filechoosinglink;
public WebElement getFilechoosinglink() {
	return filechoosinglink;
}

@FindBy(xpath = "//p[contains(text(),'Upload')]")
private WebElement uploadbutton;
public WebElement getUploadbutton() {
	return uploadbutton;
}

@FindBy(xpath = "//div[@id='SubActivities ']")
private WebElement subactivitiesdropdown;
public WebElement getSubactivitiesdropdown() {
	return subactivitiesdropdown;
}

@FindBy(xpath = "//p[@aria-label='Badminton']")
private WebElement badmintonoption;
public WebElement getBadmintonoption() {
	return badmintonoption;
}

@FindBy(xpath = "//div[text()=\"Profile image has been Updated!\"]")
private WebElement profileupdatesuccesspopup;
public WebElement getProfileupdatesuccesspopup() {
	return profileupdatesuccesspopup;
}


@FindBy(xpath = "//div/button[contains(text(),'Cancel')]")
private WebElement popupcancelbutton;
public WebElement getPopupcancelbutton() {
	return popupcancelbutton;
}
@FindBy(xpath = "(//button[@type='button'])[4]")
private WebElement imagedeletebutton;
public WebElement getImagedeletebutton() {
	return imagedeletebutton;
}
@FindBy(xpath = "//button[contains(text(),'OK')]")
private WebElement getPopupOkbutton;
public WebElement getGetPopupOkbutton() {
	return getPopupOkbutton;
}





}
