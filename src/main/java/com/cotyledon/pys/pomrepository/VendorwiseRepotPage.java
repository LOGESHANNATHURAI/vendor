package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorwiseRepotPage {
	
	WebDriver driver;
	public VendorwiseRepotPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement fromdatecalenderdropdown;
	public WebElement getFromdatecalenderdropdown() {
		return fromdatecalenderdropdown;
	}
	
	@FindBy(xpath = "//input[@id='To Date']")
	private WebElement Toelementfield;
	public WebElement getToelementfield() {
		return Toelementfield;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Download')]")
    private WebElement downloadbutton;
	public WebElement getDownloadbutton() {
		return downloadbutton;
	}
	@FindBy(xpath = "(//button[contains(text(),'1')])[1]")
	private WebElement selectdateas1;
	public WebElement getSelectdateas1() {
		return selectdateas1;
	}
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement todatecalenderdropdown;
	public WebElement getTodatecalenderdropdown() {
		return todatecalenderdropdown;
	}
	@FindBy(xpath = "//button[contains(text(),'28')]")
	private WebElement selectdateas28;
	public WebElement getSelectdateas28() {
		return selectdateas28;
	}
	
	
	
	
	
	
}
