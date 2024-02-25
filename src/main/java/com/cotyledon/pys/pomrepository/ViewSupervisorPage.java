package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSupervisorPage {
	WebDriver driver;
	public ViewSupervisorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//div[contains(@class,'MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation0 MuiCard-root css-mjc0mt')]" )	
private WebElement listofsupervisor;
public WebElement getListofsupervisor() {
	return listofsupervisor;
}	
@FindBy(xpath = "(//button[@type='button'])[6]")
private WebElement deletesupervisorbutton;
public WebElement getDeletesupervisorbutton() {
	return deletesupervisorbutton;
}
@FindBy(xpath = "(//button[@type='button'])[5]")
private WebElement deletesupervisorbutton2;
public WebElement getDeletesupervisorbutton2() {
	return deletesupervisorbutton2;
}
@FindBy(xpath = "//button[contains(text(),'confirm')]")
private WebElement clickconfirmbutton;
public WebElement getClickconfirmbutton() {
	return clickconfirmbutton;
}
@FindBy(xpath = "//button[contains(text(),'Cancel')]")
private WebElement clickcancelbutton;
public WebElement getClickcancelbutton() {
	return clickcancelbutton;
}
@FindBy(xpath = "(//span[text()=\"ACTIVE\"])[2]")
private WebElement SecondActivetext;
public WebElement getSecondActivetext() {
	return SecondActivetext;
}	
@FindBy(xpath = "(//span[text()=\"DEACTIVE\"])[1]")
private WebElement FirstDeactivetext;
public WebElement getFirstDeactivetext() {
	return FirstDeactivetext;
}
@FindBy(xpath = "(//span[text()=\"NEW\"])[1]")
private WebElement FirstNewtext;
public WebElement getFirstNewtext() {
	return FirstNewtext;
}




}
