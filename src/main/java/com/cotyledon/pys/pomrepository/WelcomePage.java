package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

		WebDriver driver;
		public WelcomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
@FindBy(xpath = "//div/button[contains(text(),\"Sign in\")]")
private WebElement signinlink;
public WebElement getSigninlink() {
	return signinlink;
}

@FindBy(xpath = "//img[@alt=\"PickYourSlot\"]")
private WebElement Pyslogo;
public WebElement getPyslogo() {
	return Pyslogo;
}

}
