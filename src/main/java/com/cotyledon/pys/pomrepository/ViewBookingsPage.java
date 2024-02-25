package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewBookingsPage {
	WebDriver driver;
	public ViewBookingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@aria-labelledby='Sub-Activity Sub-Activity']")
	private WebElement subactivitydropdown;
	public WebElement getSubactivitydropdown() {
		return subactivitydropdown;
	}
	
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement Badmintonoption;
	public WebElement getBadmintonoption() {
		return Badmintonoption;
	}
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement fromdatecalenderdropdown;
	public WebElement getFromdatecalenderdropdown() {
		return fromdatecalenderdropdown;
	}
	
	@FindBy(xpath = "//button[contains(text(),'1')])[1]")
	private WebElement selectdateas1;
	public WebElement getSelectdateas1() {
		return selectdateas1;
	}

	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement todatecalenderdropdown;
	public WebElement getTodatecalenderdropdown() {
		return todatecalenderdropdown;
	}
	
	@FindBy(xpath = "//button[contains(text(),'30')]")
	private WebElement selectdateas28;
	public WebElement getSelectdateas28() {
		return selectdateas28;
	}
	
	@FindBy(xpath = "//h5[normalize-space()='No Bookings Found!']")
    private WebElement nobookingtext;
	public WebElement getNobookingtext() {
		return nobookingtext;
	}
	
}
