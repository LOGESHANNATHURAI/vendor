package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOfferspage {
	
	WebDriver driver;
	public ViewOfferspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[normalize-space()='FLAT OFFER']")
	private WebElement flatofferNavigationalBar;
	public WebElement getFlatofferNavigationalBar() {
		return flatofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='FIRST TIME OFFER']")
	private WebElement firsttimeofferNavigationalBar;
	public WebElement getFirsttimeofferNavigationalBar() {
		return firsttimeofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='SLOT OFFER']")
	private WebElement SlotofferNavigationalBar;
	public WebElement getSlotofferNavigationalBar() {
		return SlotofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='ADJACENT OFFER']")
	private WebElement AdjacentofferNavigationalBar;
	public WebElement getAdjacentofferNavigationalBar() {
		return AdjacentofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='HAPPY HOURS']")
	private WebElement happyhoursNavigationalBar;
	public WebElement getHappyhoursNavigationalBar() {
		return happyhoursNavigationalBar;
	}
	
	
	@FindBy(xpath = "//div[@id='Offer Status ']")
	private WebElement OfferStatusDropDown;
	public WebElement getOfferStatusDropDown() {
		return OfferStatusDropDown;
	}
	
	@FindBy(xpath = "//p[@aria-label='Active']")
	private WebElement Activeoption;
	public WebElement getActiveoption() {
		return Activeoption;
	}
	
	@FindBy(xpath = "//p[@aria-label='Expired']")
	private WebElement ExpiredOption;
	public WebElement getExpiredOption() {
		return ExpiredOption;
	}
	
	@FindBy(xpath = "//p[@aria-label='Upcoming']")
	private WebElement UpcomingOption;
	public WebElement getUpcomingOption() {
		return UpcomingOption;
	}
	
	@FindBy(xpath = "//span[@class = 'css-1k5atgd']")
	private WebElement editActionOption;
	public WebElement getEditActionOption() {
		return editActionOption;
	}
	
	@FindBy(xpath = "(//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-12xczkh'])[1]")
	private WebElement actionFromDate;
	public WebElement getActionFromDate() {
		return actionFromDate;
	}

	@FindBy(xpath = "(//button[@class = 'MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-12xczkh'])[2]")
	private WebElement actionToDate;
	public WebElement getActionToDate() {
		return actionToDate;
	}
	
	@FindBy(xpath = "//input[@id = 'Discount Percentage']")
	private WebElement actionDiscountPercentage;
	public WebElement getActionDiscountPercentage() {
		return actionDiscountPercentage;
	}
	
	@FindBy(xpath = "//input[@id = 'Max Discount Amount']")
	private WebElement actionMaxDiscounAmount;
	public WebElement getActionMaxDiscounAmount() {
		return actionMaxDiscounAmount;
	}
	
	@FindBy(xpath = "//input[@id = 'Usage Limit']")
	private WebElement actionUsageLimit;
	public WebElement getActionUsageLimit() {
		return actionUsageLimit;
	}
	
	@FindBy(xpath = "//input[@id = 'Slot Count']")
	private WebElement actionSlotCount;
	public WebElement getActionSlotCount() {
		return actionSlotCount;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement actionUpdate;
	public WebElement getActionUpdate() {
		return actionUpdate;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement actionClose;
	public WebElement getActionClose() {
		return actionClose;
	}
	
	@FindBy(xpath = "//button[contains(text(),'14')]")
	private WebElement startDateAs14;
	public WebElement getStartDateAs14() {
		return startDateAs14;
	}
	
	@FindBy(xpath = "//button[contains(text(),'16')]")
	private WebElement endDateAs16;
	public WebElement getEndDateAs16() {
		return endDateAs16;
	}
	
	@FindBy(xpath = "//p[contains(text(),\"1–5\")]")
	private WebElement totaloffercount;
	public WebElement getTotaloffercount() {
		return totaloffercount;
	}
	
	@FindBy(xpath = "//*[@data-testid=\"KeyboardArrowRightIcon\"]")
	private WebElement rightarrow;
	public WebElement getRightarrow() {
		return rightarrow;
	}
	
	@FindBy(xpath = "//*[@data-testid=\"KeyboardArrowLeftIcon\"]")
	private WebElement leftrarrow;
	public WebElement getLeftrarrow() {
		return leftrarrow;
	}
	
	
	
	
	
}
