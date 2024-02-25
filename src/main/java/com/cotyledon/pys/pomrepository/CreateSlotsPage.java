package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSlotsPage {
	WebDriver driver;
	public CreateSlotsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='Sub-Activity ']")
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
	
	@FindBy(xpath = "//input[@id='Effective From Date']")
	private WebElement EFromdate;
	public WebElement getEFromdate() {
		return EFromdate;
	}
	
	@FindBy(xpath = "//input[@id='Effective To Date']")
	private WebElement ETodate;
	public WebElement getETodate() {
		return ETodate;
	}
	
	@FindBy(xpath = "//div[@id='Slot Genration type']")
	private WebElement slotgenerationtype;
	public WebElement getSlotgenerationtype() {
		return slotgenerationtype;
	}
	
	@FindBy(xpath = "//p[@aria-label='Auto generation']")
    private WebElement autogenerationtype;
	public WebElement getAutogenerationtype() {
		return autogenerationtype;
	}
	
	@FindBy(xpath = "//p[@aria-label='Manual generation']")
	private WebElement manualgenerationtype;
	public WebElement getManualgenerationtype() {
		return manualgenerationtype;
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
	
	@FindBy(xpath = "//input[contains(@id,\"Duration in minutes\")]")
	private WebElement durationinmin;
	public WebElement getDurationinmin() {
		return durationinmin;
	}
	
	@FindBy(xpath = "//div[contains(@id,'Slot Reccurance')]")
	private WebElement slotReccurencedropdown;
	public WebElement getSlotReccurencedropdown() {
		return slotReccurencedropdown;
	}
	
	@FindBy(xpath = "//input[contains(@id,'No. of courts')]")
	private WebElement noofcourtsfield;
	public WebElement getNoofcourtsfield() {
		return noofcourtsfield;
	}
	
	@FindBy(xpath = "//input[contains(@id,'Cost')]")
	private WebElement costfield;
	public WebElement getCostfield() {
		return costfield;
	}
	
	@FindBy(xpath = "//p[contains(text(),'Generate Slots')]")
	private WebElement generateslotsbutton;
	public WebElement getGenerateslotsbutton() {
		return generateslotsbutton;
	}
	@FindBy(xpath = "//p[contains(text(),'Generate Slot')]")
	private WebElement generateslotbutton;
	public WebElement getGenerateslotbutton() {
		return generateslotbutton;
	}
	
	@FindBy(xpath = "//p[contains(text(),\"Add Slot\")]/parent::button")
	private WebElement addslotbutton;
	public WebElement getAddslotbutton() {
		return addslotbutton;
	}
	
	@FindBy(xpath = "//ul[@id=':rg:']")
	private WebElement listofdays;
	public WebElement getListofdays() {
		return listofdays;
	}
	
	@FindBy(xpath = "(//button[@type=\"button\"])[4]")
	private WebElement fromdatecalender;
	public WebElement getFromdatecalender() {
		return fromdatecalender;
	}
	
	@FindBy(xpath = "(//button[@type='button'])[5]")
	private WebElement todatecalender;
	public WebElement getTodatecalender() {
		return todatecalender;
	}
	
	@FindBy(xpath = "(//button[contains(@aria-label,\"Choose time, selected time\")])[1]") 
	private WebElement Starttimeclock;
	public WebElement getStarttimeclock() {
		return Starttimeclock;
	}
	
	
	@FindBy(xpath = "(//button[contains(@aria-label,\"Choose time, selected time\")])[2]") 
	private WebElement Endtimeclock;
	public WebElement getEndtimeclock() {
		return Endtimeclock;
	}
	
	
	@FindBy(xpath = "//span[text()=\"AM\"]/parent::button")
	private WebElement AMbutton;
	public WebElement getAMbutton() {
		return AMbutton;
	}
	
	
	@FindBy(xpath = "//span[text()=\"PM\"]/parent::button")
	private WebElement PMbutton;
	public WebElement getPMbutton() {
		return PMbutton;
	}
	
	@FindBy(xpath="(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation8 MuiPopover-paper MuiMenu-paper MuiMenu-paper css-snz66x'])[1]")
	private WebElement alldayslist;
	public WebElement getAlldayslist() {
		return alldayslist;
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



	public void setAlldayslist(WebElement alldayslist) {
		this.alldayslist = alldayslist;
	}

	@FindBy(xpath = "//p[contains(text(),'Create')]")
	private WebElement createbutton;
	public WebElement getCreatebutton() {
		return createbutton;
	}
	@FindBy(xpath = "//*[@data-testid=\"ArrowLeftIcon\"]")
	private WebElement leftarrowbutton;
	public WebElement getLeftarrowbutton() {
		return leftarrowbutton;
	}
	
	
	@FindBy(xpath = "//button[@title='Next month']//*[name()='svg']")
	private WebElement RightArrowbutton;
	public WebElement getRightArrowbutton() {
		return RightArrowbutton;
	}
	
	
	@FindBy(xpath = "(//div[@class='MuiPickersCalendarHeader-labelContainer css-195v8y8'])[1]")
	private WebElement Monthyeartext;
	public WebElement getMonthyeartext() {
		return Monthyeartext;
	}
	
	@FindBy(xpath = "//p[contains(text(),'Add Slot')]")
	private WebElement addSlotButton;
	public WebElement getAddSlotButton() {
		return addSlotButton;
	}
	@FindBy(xpath = "//p[contains(text(),'View Slot')]")
	private WebElement viewSlotButton;
	public WebElement getViewSlotButton() {
		return viewSlotButton;
	}
	@FindBy(xpath = "//p[@aria-label='COURSE']")
	private WebElement CourseOption;
	public WebElement getCourseOption() {
		return CourseOption;
	}
	@FindBy(xpath = "//p[@aria-label='MEMBERSHIP']")
	private WebElement MemberShipOption;
	public WebElement getMemberShipOption() {
		return MemberShipOption;
	}
	@FindBy(xpath = "//input[@id='Membership Name']")
	private WebElement MembershipNameField;
	public WebElement getMembershipNameField() {
		return MembershipNameField;
	}
	@FindBy(xpath = "//div[@id='Membership type']")
	private WebElement MembershipTypeDropDown;
	public WebElement getMembershipTypeDropDown() {
		return MembershipTypeDropDown;
	}
	@FindBy(xpath = "//p[@aria-label='Half yearly']")
	private WebElement HalfyearlyOption;
	public WebElement getHalfyearlyOption() {
		return HalfyearlyOption;
	}
	@FindBy(xpath = "//p[@aria-label='Monthly']")
	private WebElement MonthlyOption;
	public WebElement getMonthlyOption() {
		return MonthlyOption;
	}
	@FindBy(xpath = "//p[@aria-label='Quarterly']")
	private WebElement QuarterlyOption;
	public WebElement getQuarterlyOption() {
		return QuarterlyOption;
	}
	@FindBy(xpath = "//p[@aria-label='Yearly']")
	private WebElement YearlyOption;
	public WebElement getYearlyOption() {
		return YearlyOption;
	}
	@FindBy(xpath = "//input[@id='No. of bookings per day']")
	private WebElement NoOfBookingsPerDayField;
	public WebElement getNoOfBookingsPerDayField() {
		return NoOfBookingsPerDayField;
	}
	@FindBy(xpath = "//input[@id='Maximum Allowed']")
	private WebElement MaximumAllowedField;
	public WebElement getMaximumAllowedField() {
		return MaximumAllowedField;
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
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-jd79pv']")
	private WebElement AddSlotMembershipButton;
	public WebElement getAddSlotMembershipButton() {
		return AddSlotMembershipButton;
	}
	@FindBy(xpath = "//button[contains(text(),'View Slots')]")
	private WebElement ViewSlotsButtonMembership;
	public WebElement getViewSlotsButtonMembership() {
		return ViewSlotsButtonMembership;
	}
	@FindBy(xpath = "//p[contains(text(),'Create')]")
	private WebElement CreateButton;
	public WebElement getCreateButton() {
		return CreateButton;
	}	
	@FindBy(xpath = "//p[@aria-label='COURSE']")
	private WebElement courseslottype;
	public WebElement getCourseslottype() {
		return courseslottype;
	}
	
	@FindBy(xpath = "//input[@id='Registration End Date']")
	private WebElement regenddate;
	public WebElement getRegenddate() {
		return regenddate;
	}
	
	@FindBy(xpath = "//input[@id='Course Name']")
	private WebElement coursename;
	public WebElement getCoursename() {
		return coursename;
	}
	
	@FindBy(xpath = "//input[@id='Course End Date']")
	private WebElement courseenddate;
	public WebElement getCourseenddate() {
		return courseenddate;
	}
	
	@FindBy(xpath = "//input[@id='Course Start Date']")
	private WebElement coursestartdate;
	public WebElement getCoursestartdate() {
		return coursestartdate;
	}
	
	@FindBy(xpath = "//input[@id='Course End Date']")
	private WebElement guidelines;
	public WebElement getGuidelines() {
		return guidelines;
	}
	
	@FindBy(xpath = "//input[@id='Maximum Allowed']")
	private WebElement maxAllowed;
	public WebElement getMaxAllowed() {
		return maxAllowed;
	}

	@FindBy(xpath = "//button[normalize-space()='View Slots (1)']")
	private WebElement viewslot;
	public WebElement getViewslot() {
		return viewslot;
	}
	
	@FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-f9ajrd']//span[@class='css-199trak']")
	private WebElement removeaction;
	public WebElement getRemoveaction() {
		return removeaction;
	}
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement OkButton;
	public WebElement getOkButton() {
		return OkButton;
	}
	
	
	
	
	
}
