package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSlotsPage {
	WebDriver driver;
	public ViewSlotsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@id='Sub-Activity '])[1]")
	private WebElement subactivitydropdown;
	public WebElement getSubactivitydropdown() {
		return subactivitydropdown;
	} 
	
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement Badmintonactivity;
	public WebElement getBadmintonactivity() {
		return Badmintonactivity;
	}
	
	@FindBy(xpath = "//div[@id='Slot Type']")
	private WebElement slottypedropdown;
	public WebElement getSlottypedropdown() {
		return slottypedropdown;
	}
	
	@FindBy(xpath = "//p[@aria-label='BADMINTON']")
	private WebElement badmintonslottype;
	public WebElement getBadmintonslottype() {
		return badmintonslottype;
	}
	
	@FindBy(xpath = "(//div[@class='MuiBox-root css-0'])[2]")
	private WebElement listofslots;
	public WebElement getListofslots() {
		return listofslots;
	}
	
	@FindBy(xpath = "(//span[@class='css-1k5atgd'])[1]")
	private WebElement editfirstbutton;
	public WebElement getEditfirstbutton() {
		return editfirstbutton;
	}
	
	@FindBy(xpath = "(//span[@class='css-1k5atgd'])[2]")
	private WebElement editSecondbutton;
	public WebElement geteditSecondbutton() {
		return editSecondbutton;
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[6]")
	private WebElement fromdatecalender;
	public WebElement getFromdatecalender() {
		return fromdatecalender;
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[7]")
	private WebElement todatecalender;
	public WebElement getTodatecalender() {
		return todatecalender;
	}
	
	@FindBy(xpath = "//div[@id='Slot Reccurance']")
	private WebElement slotreccurence;
	public WebElement getSlotreccurence() {
		return slotreccurence;
	}
	
	@FindBy(xpath = "//input[@id='Cost']")
	private WebElement costbutton;
	public WebElement getCostbutton() {
		return costbutton;
	}
	
	@FindBy(xpath = "//input[contains(@id,'Slot starts from')]")
	private WebElement slotstartingtime;
	public WebElement getSlotstartingtime() {
		return slotstartingtime;
	}
	
	@FindBy(xpath = "//input[contains(@id,'Slot ends at')]")
	private WebElement slotendingtime;
	public WebElement getSlotendingtime() {
		return slotendingtime;
	}
	
	@FindBy(xpath = "//p[text()='Update']")
	private WebElement updatebutton;
	public WebElement getUpdatebutton() {
		return updatebutton;
	}
	
	@FindBy(xpath = "//span[text()=\"ALL_DAYS\"]")
	private WebElement alldayscheckbox;
	public WebElement getAllDaysCheckbox() {
		return alldayscheckbox;
	}


	@FindBy(xpath = "//span[text()=\"MONDAY\"]")
	private WebElement mondaycheckbox;
	public WebElement getMondaycheckbox() {
		return mondaycheckbox;
	}


	@FindBy(xpath = "//span[text()=\"TUESDAY\"]")
	private WebElement tuesdaycheckbox;
	public WebElement getTuesdaycheckbox() {
		return tuesdaycheckbox;
	}


	@FindBy(xpath = "//span[text()=\"WEDNESDAY\"]")
	private WebElement WEDNESDAYcheckbox;
	public WebElement getWEDNESDAYcheckbox() {
		return WEDNESDAYcheckbox;
	}


	@FindBy(xpath = "//span[text()=\"THURSDAY\"]")
	private WebElement THURSDAYcheckbox;
	public WebElement getTHURSDAYcheckbox() {
		return THURSDAYcheckbox;
	}


	@FindBy(xpath = "//span[text()=\"FRIDAY\"]")
	private WebElement FRIDAYcheckbox;
	public WebElement getFRIDAYcheckbox() {
		return FRIDAYcheckbox;
	}


	@FindBy(xpath = "//span[text()=\"SATURDAY\"]")
	private WebElement SATURDAYcheckbox;
	public WebElement getSATURDAYcheckbox() {
		return SATURDAYcheckbox;
	}


	@FindBy(xpath = "//span[text()=\"SUNDAY\"]")
	private WebElement SUNDAYcheckbox;
	public WebElement getSUNDAYcheckbox() {
		return SUNDAYcheckbox;
	}


	@FindBy(xpath = "//span[text()=\"WEEKDAYS\"]")
	private WebElement WEEKDAYScheckbox;
	public WebElement getWEEKDAYScheckbox() {
		return WEEKDAYScheckbox;
	}


	@FindBy(xpath = "//span[text()=\"WEEKEND\"]")
	private WebElement WEEKENDcheckbox;
	public WebElement getWEEKENDcheckbox() {
		return WEEKENDcheckbox;
	}
	
	@FindBy(xpath = "//input[@id='Membership Name']")
	private WebElement MembershipNameField;
	public WebElement getMembershipNameField() {
		return MembershipNameField;
	}
	
	@FindBy(xpath = "//input[@id='No. of bookings per day']")
	private WebElement NoOfBookingsPerDayField;
	public WebElement getNoOfBookingsPerDayField() {
		return NoOfBookingsPerDayField;
	}
	
	@FindBy(xpath = "//textarea[@id='Guidelines']")
	private WebElement GuidelinesField;
	public WebElement getGuidelinesField() {
		return GuidelinesField;
	}
	@FindBy(xpath = "//input[@id='Expiry Date']")
	private WebElement ExpiryDateField;
	public WebElement getExpiryDateField() {
		return ExpiryDateField;
	}

	@FindBy(xpath = "//input[@id='Maximum Allowed']")
	private WebElement MaximumAllowedField;
	public WebElement getMaximumAllowedField() {
		return MaximumAllowedField;
	}
	
	@FindBy(xpath = "//p[contains(text(),'Update')]")
	private WebElement MembershipUpdateButton;
	public WebElement getMembershipUpdateButton() {
		return MembershipUpdateButton;
	}
	@FindBy(xpath = "(//button[@aria-label='expand row'])[1]")
	private WebElement FirstExpandRowDropDown;
	public WebElement getFirstExpandRowDropDown() {
		return FirstExpandRowDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='MEMBERSHIP']")
	private WebElement MemberShipOption;
	public WebElement getMemberShipOption() {
		return MemberShipOption;
	}
	@FindBy(xpath = "//span[@class='css-hqpxrg']")
	private WebElement MemberShipFirstEditOption;
	public WebElement getMemberShipFirstEditOption() {
		return MemberShipFirstEditOption;
	}
	@FindBy(xpath = "//div[@class='MuiStack-root css-2trluh']//div[@class='MuiStack-root css-j7qwjs']")
	private WebElement viewslotforcoursetype;
	public WebElement getViewslotforcoursetype() {
		return viewslotforcoursetype;
	}
	@FindBy(xpath = "(//span[@class = 'css-hqpxrg'])[1]")
	private WebElement CourseFirstEditOption;
	public WebElement getCourseFirstEditOption() {
		return CourseFirstEditOption;
	}
	
}
