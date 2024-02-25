package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOffersPage {
	WebDriver driver;
	public CreateOffersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[normalize-space()='Flat Offer']")
	private WebElement flatofferNavigationalBar;
	public WebElement getFlatofferNavigationalBar() {
		return flatofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='First Time Offer']")
	private WebElement firsttimeofferNavigationalBar;
	public WebElement getFirsttimeofferNavigationalBar() {
		return firsttimeofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='Slot Offer']")
	private WebElement SlotofferNavigationalBar;
	public WebElement getSlotofferNavigationalBar() {
		return SlotofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='Adjacent Offer']")
	private WebElement AdjacentofferofferNavigationalBar;
	public WebElement getAdjacentofferofferNavigationalBar() {
		return AdjacentofferofferNavigationalBar;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='Happy Hours']")
	private WebElement happyhoursofferNavigationalBar;
	public WebElement getHappyhoursofferNavigationalBar() {
		return happyhoursofferNavigationalBar;
	}
	
	
	
	@FindBy(xpath = "//div[@id='Sub-Activity Type']")
	private WebElement Subactivitydropdown;
	public WebElement getSubactivitydropdown() {
		return Subactivitydropdown;
	}
	
	
	@FindBy(xpath = "//p[contains(@aria-label,'ALL')]")
	private WebElement AllOption;
	public WebElement getAllOption() {
		return AllOption;
	}
	
	
	@FindBy(xpath = "//p[@aria-label='Particular']")
	private WebElement Particularoption;
	public WebElement getParticularoption() {
		return Particularoption;
	}
	
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement badmintonoptioninsubactivity;
	public WebElement getBadmintonoptioninsubactivity() {
		return badmintonoptioninsubactivity;
	}

	@FindBy(xpath = "//div[@id='SubActivity List']")
	private WebElement Subactivitylistdropdown;
	public WebElement getSubactivitylistdropdown() {
		return Subactivitylistdropdown;
	}
	
	@FindBy(xpath = "//p[@aria-label='BADMINTON']")
	private WebElement badmintonoptioninbookingtype;
	public WebElement getBadmintonoptioninbookingtype() {
		return badmintonoptioninbookingtype;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement Badmintoncheckbox;
	public WebElement getBadmintoncheckbox() {
		return Badmintoncheckbox;
	}
	
	
	@FindBy(xpath = "//input[@id='Start Date']")
	private WebElement StartDatefield;
	public WebElement getStartDatefield() {
		return StartDatefield;
	}
	
	@FindBy(xpath = "//input[@id=' Start Date']")
	private WebElement FirsttimeStartDatefield;
	public WebElement getFirsttimeStartDatefield() {
		return FirsttimeStartDatefield;
	}
	
	
	@FindBy(xpath = "//input[@id='End Date']")
	private WebElement EndDatefield;
	public WebElement getEndDatefield() {
		return EndDatefield;
	}
	
	
	
	@FindBy(xpath = "//input[@id='Discount Percentage']")
	private WebElement DiscountPercentagefield;
	public WebElement getDiscountPercentagefield() {
		return DiscountPercentagefield;
	}
	
	
	@FindBy(xpath = "//input[@id='Max Discount Amount']")
	private WebElement MaxDiscountpercentage;
	public WebElement getMaxDiscountpercentage() {
		return MaxDiscountpercentage;
	}
	
	
	@FindBy(xpath = "//input[@id='Usage Limit']")
	private WebElement Usagelimitfield;
	public WebElement getUsagelimitfield() {
		return Usagelimitfield;
	}

	
	
	@FindBy(xpath = "//p[text()='Publish Offer']")
	private WebElement Publishofferbutton;
	public WebElement getPublishofferbutton() {
		return Publishofferbutton;
	}
	
	
	@FindBy(xpath = "//div[@id='Booking Type']")
	private WebElement Bookingtypedropdown;
	public WebElement getBookingtypedropdown() {
		return Bookingtypedropdown;
	}

	
	@FindBy(xpath = "//input[@value='ALL']")
	private WebElement AllRadiobutton;
	public WebElement getAllRadiobutton() {
		return AllRadiobutton;
	}

	
	@FindBy(xpath = "//input[@value='Particular']")
	private WebElement ParticularRadiobutton;
	public WebElement getParticularRadiobutton() {
		return ParticularRadiobutton;
	}

	
	@FindBy(xpath = "//input[@id='No of Slots']")
	private WebElement Noofslotsfield;
	public WebElement getNoofslotsfield() {
		return Noofslotsfield;
	}
	
	
	@FindBy(xpath = "//div[@id='Customer Type']")
	private WebElement Customertypedropdown;
	public WebElement getCustomertypedropdown() {
		return Customertypedropdown;
	}
	
	
	@FindBy(xpath = "(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedEnd MuiAutocomplete-inputRoot css-1nbpy92'])[1]")
	private WebElement Shopnamedropdown;
	public WebElement getShopnamedropdown() {
		return Shopnamedropdown;
	}

	
	
	@FindBy(xpath = "//input[@id='Customer Name']")
	private WebElement Customernamedropdown;
	public WebElement getCustomernamedropdown() {
		return Customernamedropdown;
	}
	
	@FindBy(xpath = "//div[@id='slots']")
	private WebElement Slotsdropdown;
	public WebElement getSlotsdropdown() {
		return Slotsdropdown;
	}
	
	
	@FindBy(xpath = "//input[@id='Start time']")
	private WebElement Starttimefield;
	public WebElement getStarttimefield() {
		return Starttimefield;
	}
	
	@FindBy(xpath = "//input[@id='End time']")
	private WebElement Endtimefield;
	public WebElement getEndtimefield() {
		return Endtimefield;
	}


	@FindBy(xpath = "(//button[@aria-label='Choose date'])[1]")
	private WebElement fromdatecalender;
	public WebElement getFromdatecalender() {
		return fromdatecalender;
	}
	
	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//button[1]")	
	private WebElement todatecalender;
	public WebElement getTodatecalender() {
		return todatecalender;
	}
	
	
	@FindBy(xpath = "//p[@aria-label='Vendor']")
	private WebElement vendoroption;
	public WebElement getVendoroption() {
		return vendoroption;
	}
	
	
	@FindBy(xpath = "//p[@aria-label='PYS']")
    private WebElement pysoption;
	public WebElement getPYSoption() {
		return pysoption;
	}	
	
	
	@FindBy(xpath = "//div[@id='Slot Type']")
	private WebElement slottypedropdown;
	public WebElement getSlottypedropdown() {
		return slottypedropdown;
	}
	
	
	@FindBy(xpath = "//li[@role='option']//p[@aria-label='BADMINTON'][normalize-space()='BADMINTON']")
	private WebElement BADMINTONSlotType;
	public WebElement getBADMINTONSlotType() {
		return BADMINTONSlotType;
	}	
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement selectallcheckbox;
	public WebElement getSelectallcheckbox() {
		return selectallcheckbox;
	}
	
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement firstcheckbox;
	public WebElement getFirstcheckbox() {
		return firstcheckbox;
	}
	
	@FindBy(xpath = "//div[@class = 'MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-sm-4 MuiGrid-grid-md-3 css-pq7chb']")
	private WebElement firstSlotSelection;
	public WebElement getFirstSlotSelection() {
		return firstSlotSelection;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
