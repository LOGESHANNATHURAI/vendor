package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='dashboard']")
	private WebElement dashboardbutton;

	public WebElement getDashboardbutton() {
		return dashboardbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Supervisors Management')]")
	private WebElement supervisormanagementoption;

	public WebElement getSupervisormanagementoption() {
		return supervisormanagementoption;
	}

	@FindBy(xpath = "//div[contains(text(),'Create Supervisors')]")
	private WebElement createsupervisorbutton;

	public WebElement getCreatesupervisorbutton() {
		return createsupervisorbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'View Supervisors')]")
	private WebElement viewsupervisoroption;

	public WebElement getViewsupervisoroption() {
		return viewsupervisoroption;
	}

	@FindBy(xpath = "//div[contains(text(),'Image Gallery')]")
	private WebElement imagegallerybutton;

	public WebElement getImagegallerybutton() {
		return imagegallerybutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Upload Image')]")
	private WebElement uploadimagebutton;

	public WebElement getUploadimagebutton() {
		return uploadimagebutton;
	}

	@FindBy(xpath = "(//div[contains(text(),'Bookings')])[2]")
	private WebElement viewbookingsbutton;

	public WebElement getViewbookingsbutton() {
		return viewbookingsbutton;
	}

	@FindBy(xpath = "(//div[contains(text(),'Bookings')])[1]")
	private WebElement bookingsbutton;

	public WebElement getBookingsbutton() {
		return bookingsbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Payments')]")
	private WebElement paymentbutton;

	public WebElement getPaymentbutton() {
		return paymentbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Payment Summary')]")
	private WebElement paymentsummaryoption;

	public WebElement getPaymentsummaryoption() {
		return paymentsummaryoption;
	}

	@FindBy(xpath = "//div[contains(text(),'Payment History')]")
	private WebElement paymenthistoryoption;

	public WebElement getPaymenthistoryoption() {
		return paymenthistoryoption;
	}

	@FindBy(xpath = "//button/div/img[@alt='photoURL']")
	private WebElement ProfileButton;

	public WebElement getProfileButton() {
		return ProfileButton;
	}

	@FindBy(xpath = "//p[text()='8778544520']")
	private WebElement usersmobileno;

	public WebElement getUsersmobileno() {
		return usersmobileno;
	}

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement currentpasswordtextfield;

	public WebElement getCurrentpasswordtextfield() {
		return currentpasswordtextfield;
	}

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement newpasswordtextfield;

	public WebElement getNewpasswordtextfield() {
		return newpasswordtextfield;
	}

	@FindBy(xpath = "(//input[@type='password'])[3]")
	private WebElement confirmnewpasswordfield;

	public WebElement getConfirmnewpasswordfield() {
		return confirmnewpasswordfield;
	}

	@FindBy(xpath = "//button/p[contains(text(),'Update Password')]")
	private WebElement updatepasswordbutton;

	public WebElement getUpdatepasswordbutton() {
		return updatepasswordbutton;
	}

	@FindBy(xpath = "//a[contains(text(),\"Change Password\")]")
	private WebElement changepasswordlink;

	public WebElement getChangepasswordlink() {
		return changepasswordlink;
	}

	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logoutbutton;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	@FindBy(xpath = "//input[@placeholder=\"dd/mm/yyyy\" and @id=\"Date\"]")
	private WebElement datefield;

	public WebElement getDatefield() {
		return datefield;
	}

	@FindBy(xpath = "//h6[contains(text(),'Online ')]")
	private WebElement onlineBox;

	public WebElement getOnlineBox() {
		return onlineBox;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiBox-root css-1t9pz9x iconify iconify--eva'])[1]")
	private WebElement searchicon;

	public WebElement getSearchicon() {
		return searchicon;
	}

	@FindBy(xpath = "//input[@id='vendor routes']")
	private WebElement Searchbox;

	public WebElement getSearchbox() {
		return Searchbox;
	}

	@FindBy(xpath = "//button[@title='Open']//*[name()='svg']")
	private WebElement searchdropdownicon;

	public WebElement getSearchdropdownicon() {
		return searchdropdownicon;
	}

	@FindBy(xpath = "//div[@class='MuiList-root css-1uzmcsd']")
	private WebElement submoduleofsupervisormanagement;

	public WebElement getSubmoduleofsupervisormanagement() {
		return submoduleofsupervisormanagement;
	}

	@FindBy(xpath = "//div[@class='MuiList-root css-1uzmcsd']")
	private WebElement submoduleofpayments;

	public WebElement getSubmoduleofpayments() {
		return submoduleofpayments;
	}

	@FindBy(xpath = "//div[contains(text(),'Slots')]")
	private WebElement slotsbutton;

	public WebElement getSlotsbutton() {
		return slotsbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Create Slots')]")
	private WebElement createslotsoption;

	public WebElement getCreateslotsoption() {
		return createslotsoption;
	}

	@FindBy(xpath = "//div[normalize-space()='View Slots']")
	private WebElement viewslotbutton;

	public WebElement getViewslotbutton() {
		return viewslotbutton;
	}

	@FindBy(xpath = "//div[normalize-space()='Block Slots']")
	private WebElement blockslotbutton;

	public WebElement getBlockslotbutton() {
		return blockslotbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Offers')]")
	private WebElement offersbutton;

	public WebElement getOffersbutton() {
		return offersbutton;
	}

	@FindBy(xpath = "//div[normalize-space()='Create Offers']")
	private WebElement createoffersoption;

	public WebElement getCreateoffersoption() {
		return createoffersoption;
	}

	@FindBy(xpath = "//div[normalize-space()='View Offers']")
	private WebElement viewoffersoption;

	public WebElement getViewoffersoption() {
		return viewoffersoption;
	}

	@FindBy(xpath = "//div[contains(text(),'Complaints')]")
	private WebElement complaintsbutton;

	public WebElement getComplaintsbutton() {
		return complaintsbutton;
	}

	@FindBy(xpath = "//div[normalize-space()='Create Complaints']")
	private WebElement createcomplaintsoption;

	public WebElement getCreatecomplaintsoption() {
		return createcomplaintsoption;
	}

	@FindBy(xpath = "//div[normalize-space()='View Complaints']")
	private WebElement viewcomplaintsoption;

	public WebElement getViewcomplaintsoption() {
		return viewcomplaintsoption;
	}

	@FindBy(xpath = "//div[contains(text(),'Report Generation')]")
	private WebElement Reportgenerationbutton;

	public WebElement getReportgenerationbutton() {
		return Reportgenerationbutton;
	}

	@FindBy(xpath = "//div[contains(text(),'Vendor Wise Report')]")
	private WebElement vendorwisereportoption;

	public WebElement getVendorwisereportoption() {
		return vendorwisereportoption;
	}

	@FindBy(xpath = "//div[normalize-space()='AvailBookings']")
	private WebElement AvailBookingsbutton;

	public WebElement getAvailBookingsbutton() {
		return AvailBookingsbutton;
	}

	@FindBy(xpath = "//p[contains(text(),'more')]")
	private WebElement morebutton;

	public WebElement morebutton() {
		return morebutton;
	}

	@FindBy(xpath = "(//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiAccordion-root css-9exctb'])[1]")
	private WebElement DashboardBookingDropDown;

	public WebElement getDashboardBookingDropDown() {
		return DashboardBookingDropDown;
	}

	@FindBy(xpath = "//button[contains(text(),'Last Two Week')]")
	private WebElement LastTwoWeekButton;

	public WebElement getLastTwoWeekButton() {
		return LastTwoWeekButton;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]")
	private WebElement dashboardcalenderdropdown;

	public WebElement getDashboardcalenderdropdown() {
		return dashboardcalenderdropdown;
	}

	@FindBy(xpath = "//button[contains(text(),'27')]")
	private WebElement selectdateas27;

	public WebElement getSelectdateas27() {
		return selectdateas27;
	}

	@FindBy(xpath = "//p[contains(text(),'Logesh Badminton')]")
	private WebElement selectingLogeshbadminton;

	public WebElement getSelectingLogeshbadminton() {
		return selectingLogeshbadminton;
	}

	@FindBy(xpath = "(//div[@class='MuiAccordionDetails-root css-ewy1r3'])[1]")
	private WebElement bookingdetails;

	public WebElement getBookingdetails() {
		return bookingdetails;
	}

	@FindBy(xpath = "(//span[@class='css-eevf4e'])[1]")
	private WebElement nobookingtext;

	public WebElement getNobookingtext() {
		return nobookingtext;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='View Bookings']")
	private WebElement viewbookingsdropdown;
	public WebElement viewbookingsdropdown() {
		return viewbookingsdropdown;
	}
	
	@FindBy(xpath = "//div[@id='Sub-Activity']")
	private WebElement subActivityDropdown;
	public WebElement subActivityDropdown() {
		return subActivityDropdown;
	}
	
	@FindBy(xpath = "//div[@id='Slot Type']")
	private WebElement Slottypedropdown;
	public WebElement Slottypedropdown() {
		return Slottypedropdown;
	}
	
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M17 12h-5v')]")
	private WebElement dateicon;
	public WebElement dateicon() {
		return dateicon;
	}
	
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement Badmintonactivity;
	public WebElement getBadmintonactivity() {
		return Badmintonactivity;
	}
	
	@FindBy(xpath = "//p[@aria-label='BADMINTON']")
	private WebElement badmintonslottype;
	public WebElement getBadmintonslottype() {
		return badmintonslottype;
	}
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/p[1]")
	private WebElement firstslotinviewbookings;
	public WebElement firstslotinviewbookings() {
		return firstslotinviewbookings;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[5]")
	private WebElement fromdateinviewbookings;
	public WebElement fromdateinviewbookings() {
		return fromdateinviewbookings;
	}
	
	@FindBy(xpath = "(//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeSmall css-5zxort'])[3]")
	private WebElement Todateinviewbooking;
	public WebElement Todateinviewbooking() {
		return Todateinviewbooking;
	}
	
	
	@FindBy(xpath = "(//span[@class='css-199trak'])[1]")
	private WebElement unblockbuttoninviewbooking;
	public WebElement unblockbuttoninviewbooking() {
		return unblockbuttoninviewbooking;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	private WebElement confirmbutton;
	public WebElement confirmbutton() {
		return confirmbutton;
	}
	
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	private WebElement cancelbutton;
	public WebElement cancelbutton() {
		return cancelbutton;
	}
	
	
	@FindBy(xpath = "//input[@id='Date']")
	private WebElement datefieldinviewbookings;
	public WebElement datefieldinviewbookings() {
		return datefieldinviewbookings;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
