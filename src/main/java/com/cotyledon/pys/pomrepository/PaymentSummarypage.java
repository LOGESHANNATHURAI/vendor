package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentSummarypage {
	WebDriver driver;
	public PaymentSummarypage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Payment Summary')]")
    private WebElement paymentsummarydetails;
	public WebElement getPaymentsummarydetails() {
		return paymentsummarydetails;
	}
@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-lw2d7w']")
private WebElement paymentsummarydetailsdropdown;
public WebElement getPaymentsummarydetailsdropdown() {
	return paymentsummarydetailsdropdown;
}
	
	
	
	
	
	
	
	
	
	
}
