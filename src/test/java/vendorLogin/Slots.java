package vendorLogin;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.Blockslotpage;
import com.cotyledon.pys.pomrepository.CreateSlotsPage;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.ViewSlotsPage;

public class Slots extends Baseclass{

@BeforeMethod
	public void weblogin() throws Throwable {
		WebApplicationLogin();
		HomePage homepage = new HomePage(driver);
		homepage.getSlotsbutton().click();
	}

@Test(priority = 1, enabled = true, invocationCount = 1)
public void CreateSlots1() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();Thread.sleep(1000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();Thread.sleep(1000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getBadmintonslottype().click();
	createSlotsPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Slotstartdate3"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear3"));
	Thread.sleep(500);
	createSlotsPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Slotenddate3"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear3"));
	Thread.sleep(500);
	createSlotsPage.getSlotstartingtime().click();
	createSlotsPage.getSlotstartingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotstartingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotstarttime"));
	createSlotsPage.getSlotendingtime().click();
	createSlotsPage.getSlotendingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotendingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotendtime"));
	createSlotsPage.getDurationinmin().sendKeys(fileUtils.readTheDataFromPropertyFile("durationinmin"));
	createSlotsPage.getCostfield().click();
	createSlotsPage.getCostfield().sendKeys(fileUtils.readTheDataFromPropertyFile("cost"));
	createSlotsPage.getNoofcourtsfield().click();
	createSlotsPage.getNoofcourtsfield().sendKeys(fileUtils.readTheDataFromPropertyFile("noofcourts2"));
	createSlotsPage.getSlotReccurencedropdown().click();
	ChoosingDaysForCreateSlotsPage(3);
	RobotEscape();
	Thread.sleep(1000);
	createSlotsPage.getGenerateslotsbutton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Slots/001CreateSlotsAutomaticGeneration.png");
//	createSlotsPage.getCreatebutton().click();
//	Thread.sleep(1000);
//	TakeScreenShot("./screenshots/Slots/001CreateSlots1.png");
	}

@Test(priority = 2, enabled = true, invocationCount = 1)
public void CreateSlots2() throws Throwable {
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	HomePage homepage = new HomePage(driver);
	homepage.getCreateslotsoption().click();Thread.sleep(1000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();Thread.sleep(1000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getBadmintonslottype().click();
	createSlotsPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Slotstartdatemanual"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYearManual"));
	Thread.sleep(500);createSlotsPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Slotenddatemanual"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYearManual"));
	Thread.sleep(500);createSlotsPage.getSlotgenerationtype().click();
	createSlotsPage.getManualgenerationtype().click();Thread.sleep(1000);
	createSlotsPage.getSlotstartingtime().click();
	createSlotsPage.getSlotstartingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotstartingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotstarttimemanual"));
	createSlotsPage.getSlotendingtime().click();
	createSlotsPage.getSlotendingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotendingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotendtimemanual"));
	createSlotsPage.getCostfield().click();
	createSlotsPage.getCostfield().sendKeys(fileUtils.readTheDataFromPropertyFile("cost"));
	createSlotsPage.getNoofcourtsfield().click();
	createSlotsPage.getNoofcourtsfield().sendKeys(fileUtils.readTheDataFromPropertyFile("noofcourts2"));
	createSlotsPage.getSlotReccurencedropdown().click();
	createSlotsPage.getMondaycheckbox().click();
	RobotEscape();Thread.sleep(500);createSlotsPage.getAddSlotButton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Slots/002CreateSlotsforManualGeneration1.png");
	createSlotsPage.getViewSlotButton().click();
	TakeScreenShot("./screenshots/Slots/002CreateSlotsforManualGeneration2.png");
//	createSlotsPage.getCreatebutton().click();
	}

@Test(priority = 3, enabled = true, invocationCount = 1)
public void CreateSlots3() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();
	Thread.sleep(2000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();
	Thread.sleep(2000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getBadmintonslottype().click();
	createSlotsPage.getFromdatecalender().click();Thread.sleep(500);
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Slotstartdate"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear"));
	Thread.sleep(1000);
	createSlotsPage.getDurationinmin().sendKeys(fileUtils.readTheDataFromPropertyFile("durationinmin"));
	createSlotsPage.getSlotstartingtime().click();
	createSlotsPage.getSlotstartingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotstartingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotstarttime1"));
	createSlotsPage.getSlotendingtime().click();
	createSlotsPage.getSlotendingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotendingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotendtime1"));
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Slots/003CheckingForDisplayOfCannotGenerateSlotsMessage.png");
	}

@Test(priority = 4, enabled = true, invocationCount = 1)
public void CreateSlots4() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();
	Thread.sleep(2000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();
	Thread.sleep(2000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getBadmintonslottype().click();
	createSlotsPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotstartdateAllDays"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear"));
	Thread.sleep(1000);
	createSlotsPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("SlotenddateAllDays"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear"));
	Thread.sleep(1000);
	createSlotsPage.getSlotReccurencedropdown().click();
	createSlotsPage.getAllDaysCheckbox().click();
	TakeScreenShot("./screenshots/Slots/004CreateSlotsForSlotReccuranceOptionAllDays.png");
	RobotEscape();
	}

@Test(priority = 5, enabled = true, invocationCount = 1)
public void CreateSlots5() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();
	Thread.sleep(2000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();
	Thread.sleep(2000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getBadmintonslottype().click();
	createSlotsPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotstartdateWeekEnds"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYearWeekEnds"));
	Thread.sleep(1000);
	createSlotsPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("SlotenddateWeekEnds"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYearWeekEnds"));
	Thread.sleep(1000);
	createSlotsPage.getSlotReccurencedropdown().click();
	createSlotsPage.getSATURDAYcheckbox().click();
	createSlotsPage.getSUNDAYcheckbox().click();
	TakeScreenShot("./screenshots/Slots/005CreateSlotsForSlotReccuranceOptionWeekEnds1.png");
	createSlotsPage.getWEEKENDcheckbox().click();
	TakeScreenShot("./screenshots/Slots/005CreateSlotsForSlotReccuranceOptionWeekEnds2.png");
	RobotEscape();
	}

@Test(priority = 6, enabled = true, invocationCount = 1)
public void CreateSlots6() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();
	Thread.sleep(2000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();
	Thread.sleep(2000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getBadmintonslottype().click();
	createSlotsPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotstartdateWeekDays"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYearWeekDays"));
	Thread.sleep(1000);
	createSlotsPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("SlotenddateWeekDays"), fileUtils.readTheDataFromPropertyFile("SlotMonthAndYearWeekDays"));
	Thread.sleep(1000);
	createSlotsPage.getSlotReccurencedropdown().click();
	createSlotsPage.getMondaycheckbox().click();
	createSlotsPage.getTuesdaycheckbox().click();
	createSlotsPage.getWEDNESDAYcheckbox().click();
	createSlotsPage.getTHURSDAYcheckbox().click();
	createSlotsPage.getFRIDAYcheckbox().click();
	TakeScreenShot("./screenshots/Slots/006CreateSlotsForSlotReccuranceOptionWeekDays1.png");
	createSlotsPage.getWEEKDAYScheckbox().click();
	TakeScreenShot("./screenshots/Slots/006CreateSlotsForSlotReccuranceOptionWeekDays2.png");
	RobotEscape();
	}

@Test(priority = 7, enabled = true, invocationCount = 1)
public void CreateSlots7() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();Thread.sleep(2000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();Thread.sleep(500);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getBadmintonslottype().click();
	createSlotsPage.getFromdatecalender().click();Thread.sleep(500);
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Slotstartdate2"), 
			fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear2"));Thread.sleep(500);
	createSlotsPage.getTodatecalender().click();Thread.sleep(500);
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Slotenddate2"), 
			fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear2"));Thread.sleep(500);
	createSlotsPage.getSlotstartingtime().click();
	createSlotsPage.getSlotstartingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotstartingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotstarttime2"));
	createSlotsPage.getSlotendingtime().click();
	createSlotsPage.getSlotendingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	createSlotsPage.getSlotendingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotendtime2"));
	createSlotsPage.getDurationinmin().sendKeys(fileUtils.readTheDataFromPropertyFile("durationinmin2"));
	createSlotsPage.getCostfield().click();
	createSlotsPage.getCostfield().sendKeys(fileUtils.readTheDataFromPropertyFile("cost2"));
	createSlotsPage.getNoofcourtsfield().click();
	createSlotsPage.getNoofcourtsfield().sendKeys(fileUtils.readTheDataFromPropertyFile("noofcourts2"));
	createSlotsPage.getSlotReccurencedropdown().click();
	createSlotsPage.getAllDaysCheckbox().click();
	RobotEscape();
	Thread.sleep(2000);
	createSlotsPage.getGenerateslotbutton().click();
	TakeScreenShot("./screenshots/Slots/007Display of Slots are already allocated for given timings! Message.png");
	}

@Test(priority = 8, enabled = true, invocationCount = 1)
public void ViewSlot1() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewslotbutton().click();
	Thread.sleep(1000);ViewSlotsPage viewSlotsPage = new ViewSlotsPage(driver);
	viewSlotsPage.getSubactivitydropdown().click();viewSlotsPage.getBadmintonactivity().click();
	Thread.sleep(500);
	viewSlotsPage.getSlottypedropdown().click();viewSlotsPage.getBadmintonslottype().click();
	Thread.sleep(2000);
	if (viewSlotsPage.getListofslots().isDisplayed()) {
		System.out.println("passed: All the slots are displayed ");
	}
	RobotTab();RobotTab();RobotEnter();Thread.sleep(500);;RobotDownArrow();RobotDownArrow();RobotEnter();ScrollWindow1();
	TakeScreenShot("./screenshots/Slots/008AllListOfSlotsDisplayes.png");
}

@Test(priority = 9, enabled = true, invocationCount = 1)
public void ViewSlot2() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewslotbutton().click();Thread.sleep(1000);
	ViewSlotsPage viewSlotsPage = new ViewSlotsPage(driver);
	viewSlotsPage.getSubactivitydropdown().click();
	viewSlotsPage.getBadmintonactivity().click();Thread.sleep(1000);
	viewSlotsPage.getSlottypedropdown().click();
	viewSlotsPage.getBadmintonslottype().click();Thread.sleep(2000);
	viewSlotsPage.getEditfirstbutton().click();
	viewSlotsPage.getFromdatecalender().click();Thread.sleep(500);
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Slotstartdate3"), 
			fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear3"));
	viewSlotsPage.getTodatecalender().click();Thread.sleep(500);
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Slotenddate3"), 
			fileUtils.readTheDataFromPropertyFile("SlotMonthAndYear3"));
	viewSlotsPage.getSlotstartingtime().click();
	viewSlotsPage.getSlotstartingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	viewSlotsPage.getSlotstartingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotstarttime3"));
	viewSlotsPage.getSlotendingtime().click();
	viewSlotsPage.getSlotendingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	viewSlotsPage.getSlotendingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotendtime3"));
	viewSlotsPage.getCostbutton().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	viewSlotsPage.getCostbutton().sendKeys(fileUtils.readTheDataFromPropertyFile("cost1"));Thread.sleep(500);
	viewSlotsPage.getUpdatebutton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Slots/009UpdateOfaSlot.png");
	}

@Test(priority = 10, enabled = false, invocationCount = 1)
public void ViewSlot3() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewslotbutton().click();Thread.sleep(1000);
	ViewSlotsPage viewSlotsPage = new ViewSlotsPage(driver);
	viewSlotsPage.getSubactivitydropdown().click();viewSlotsPage.getBadmintonactivity().click();
	Thread.sleep(500);
	viewSlotsPage.getSlottypedropdown().click();viewSlotsPage.getBadmintonslottype().click();
	Thread.sleep(2000);viewSlotsPage.getEditfirstbutton().click();Thread.sleep(500);
	viewSlotsPage.getSlotstartingtime().click();
	viewSlotsPage.getSlotstartingtime().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	viewSlotsPage.getSlotstartingtime().sendKeys(fileUtils.readTheDataFromPropertyFile("slotstarttime4"));	
	
}

@Test(priority = 11, enabled = true, invocationCount = 1)
public void BlockSlotsMultiple() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getBlockslotbutton().click();
	Blockslotpage Blockslotpage = new Blockslotpage(driver);
	Blockslotpage.getSubactivitydropdown().click();Blockslotpage.getBadmintonactivity().click();Thread.sleep(500);
	Blockslotpage.getSlottypedropdown().click();Blockslotpage.getBadmintonslottype().click();Thread.sleep(500);
	Blockslotpage.getDatefield().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotBlockDate"), fileUtils.readTheDataFromPropertyFile("SlotBlockDateMonthYear"));
	Blockslotpage.getMultipleblockbutton().click();Thread.sleep(500);
	Blockslotpage.getFromdatecalender().click();Thread.sleep(500);
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotBlockFromDate"), fileUtils.readTheDataFromPropertyFile("SlotBlockDateMonthYear"));
	Blockslotpage.getTodatecalender().click();Thread.sleep(500);
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("SlotBlockToDate"), fileUtils.readTheDataFromPropertyFile("SlotBlockDateMonthYear"));
	Thread.sleep(500);Blockslotpage.getCommentTexArea().sendKeys(fileUtils.readTheDataFromPropertyFile("Comment"));Thread.sleep(500);
	Blockslotpage.getLayoutbutton().click();Thread.sleep(2000);
	RobotDownArrow();RobotEnter();RobotEscape();Thread.sleep(500);
	Blockslotpage.getConfirmbutton().click();Thread.sleep(1500);
	ScrollWindow1();TakeScreenShot("./screenshots/Slots/011MultipleBlockingOfSlots.png");
	
}

@Test(priority = 12, enabled = true, invocationCount = 1)
public void UnBlockSlotsMultiple() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getBlockslotbutton().click();
	Blockslotpage Blockslotpage = new Blockslotpage(driver);
	Blockslotpage.getSubactivitydropdown().click();Blockslotpage.getBadmintonactivity().click();Thread.sleep(500);
	Blockslotpage.getSlottypedropdown().click();Blockslotpage.getBadmintonslottype().click();Thread.sleep(500);
	Blockslotpage.getDatefield().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotUnBlockDate"), 
			fileUtils.readTheDataFromPropertyFile("SlotUnBlockDateMonthYear"));Thread.sleep(3000);
	Blockslotpage.getMultipleunblock().click();Thread.sleep(500);
	Blockslotpage.getFromdatecalender().click();Thread.sleep(500);
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotUnBlockFromDate"), 
			fileUtils.readTheDataFromPropertyFile("SlotUnBlockDateMonthYear"));
	Blockslotpage.getTodatecalender().click();Thread.sleep(500);
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("SlotUnBlockToDate"), 
			fileUtils.readTheDataFromPropertyFile("SlotUnBlockDateMonthYear"));
	Thread.sleep(500);
	Blockslotpage.getLayoutbutton().click();Thread.sleep(500);
	RobotDownArrow();RobotEnter();RobotEscape();Thread.sleep(500);
	Blockslotpage.getConfirmbutton().click();Thread.sleep(1500);
	ScrollWindow1();TakeScreenShot("./screenshots/Slots/012MultipleUnBlockingOfSlots.png");
}

@Test(priority = 13, enabled = true, invocationCount = 1)
public void BlockSlotSingle() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getBlockslotbutton().click();
	Blockslotpage Blockslotpage = new Blockslotpage(driver);
	Blockslotpage.getSubactivitydropdown().click();Blockslotpage.getBadmintonactivity().click();Thread.sleep(500);
	Blockslotpage.getSlottypedropdown().click();Blockslotpage.getBadmintonslottype().click();Thread.sleep(500);
	Blockslotpage.getDatefield().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotBlockDate"), fileUtils.readTheDataFromPropertyFile("SlotBlockDateMonthYear"));
	Thread.sleep(2000);Blockslotpage.getFirstBlockOrUnblocksymbol().click();
	Blockslotpage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotBlockDate"), fileUtils.readTheDataFromPropertyFile("SlotBlockDateMonthYear"));
	Blockslotpage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("SlotBlockToDate"), fileUtils.readTheDataFromPropertyFile("SlotBlockDateMonthYear"));
	Thread.sleep(500);Blockslotpage.getCommentTexArea().sendKeys(fileUtils.readTheDataFromPropertyFile("Comment"));Thread.sleep(500);
	Thread.sleep(500);Blockslotpage.getConfirmbutton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Slots/013SingleBlockingOfSlot.png");
	}

@Test(priority = 14, enabled = true, invocationCount = 1)
public void UnBlockSlotSingle() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getBlockslotbutton().click();
	Blockslotpage Blockslotpage = new Blockslotpage(driver);
	Blockslotpage.getSubactivitydropdown().click();Blockslotpage.getBadmintonactivity().click();Thread.sleep(500);
	Blockslotpage.getSlottypedropdown().click();Blockslotpage.getBadmintonslottype().click();Thread.sleep(500);
	Blockslotpage.getDatefield().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotUnBlockDate"), fileUtils.readTheDataFromPropertyFile("SlotUnBlockDateMonthYear"));
	Thread.sleep(2000);;Blockslotpage.getFirstBlockOrUnblocksymbol().click();
	Blockslotpage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("SlotUnBlockDate"), fileUtils.readTheDataFromPropertyFile("SlotUnBlockDateMonthYear"));
	Blockslotpage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("SlotUnBlockToDate"), fileUtils.readTheDataFromPropertyFile("SlotUnBlockDateMonthYear"));
	Thread.sleep(500);Blockslotpage.getConfirmbutton().click();Thread.sleep(500);
	TakeScreenShot("./screenshots/Slots/014SingleUnBlockingOfSlot.png");
	}

@Test(priority = 15, enabled = true, invocationCount = 1)
public void CreateSlots8() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();Thread.sleep(1000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();Thread.sleep(1000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getMemberShipOption().click();
	createSlotsPage.getMembershipNameField().
	sendKeys(fileUtils.readTheDataFromPropertyFile("MembershipName"));
	createSlotsPage.getMembershipTypeDropDown().click();
	createSlotsPage.getMonthlyOption().click();
	createSlotsPage.getExpiryDateField().click();RobotTab();RobotEnter();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("ExpiryDate"), 
			fileUtils.readTheDataFromPropertyFile("MonthYear"));
	createSlotsPage.getSlotReccurencedropdown().click();
	createSlotsPage.getAllDaysCheckbox().click();RobotEscape();
	createSlotsPage.getNoOfBookingsPerDayField().
	sendKeys(fileUtils.readTheDataFromPropertyFile("NoOfBookingsPerDay"));
	createSlotsPage.getCostfield().
	sendKeys(fileUtils.readTheDataFromPropertyFile("cost"));
	createSlotsPage.getMaximumAllowedField().
	sendKeys(fileUtils.readTheDataFromPropertyFile("MaximumAllowed"));
	createSlotsPage.getGuidelinesField().
	sendKeys(fileUtils.readTheDataFromPropertyFile("Guidelines"));
	createSlotsPage.getAddSlotMembershipButton().click();
	TakeScreenShot("./screenshots/Slots/015CreateSlotsMembership01.png");
	createSlotsPage.getViewSlotsButtonMembership().click();Thread.sleep(500);
//	createSlotsPage.getCreateButton().click();
//	TakeScreenShot("./screenshots/Slots/015CreateSlotsMembership02.png");
}

@Test(priority = 16, enabled = true, invocationCount = 1)
public void ViewSlot4() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewslotbutton().click();Thread.sleep(1000);
	ViewSlotsPage viewSlotsPage = new ViewSlotsPage(driver);
	viewSlotsPage.getSubactivitydropdown().click();
	viewSlotsPage.getBadmintonactivity().click();Thread.sleep(1000);
	viewSlotsPage.getSlottypedropdown().click();
	viewSlotsPage.getMemberShipOption().click();Thread.sleep(2000);
	viewSlotsPage.getFirstExpandRowDropDown().click();
//	TakeScreenShot("./screenshots/Slots/016MembershipSlotDetails01.png");
	viewSlotsPage.getMemberShipFirstEditOption().click();
	viewSlotsPage.getCostbutton().sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
	viewSlotsPage.getCostbutton().
	sendKeys(fileUtils.readTheDataFromPropertyFile("NewCost"));
//	viewSlotsPage.getMembershipUpdateButton().click();
//	TakeScreenShot("./screenshots/Slots/016MembershipSlotDetails02.png");
}

@Test(priority = 17, enabled = true, invocationCount = 1)
public void CreateSlots9() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getCreateslotsoption().click();Thread.sleep(1000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();Thread.sleep(1000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getCourseslottype().click();
	createSlotsPage.getRegenddate().click();RobotTab();RobotEnter();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("CourseSlotDate"), 
			fileUtils.readTheDataFromPropertyFile("CourseSlotMonthAndYear"));
	createSlotsPage.getCoursename().sendKeys(fileUtils.readTheDataFromPropertyFile("CourseName"));
	createSlotsPage.getMaxAllowed().sendKeys(fileUtils.readTheDataFromPropertyFile("MaxAllowed"));
	createSlotsPage.getCoursestartdate().click();RobotTab();RobotEnter();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("CourseStartDate"), 
			fileUtils.readTheDataFromPropertyFile("CourseMonthYear"));
	createSlotsPage.getCourseenddate().click();RobotTab();RobotEnter();Thread.sleep(500);
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("CourseEndDate"), 
			fileUtils.readTheDataFromPropertyFile("CourseMonthYear"));
	createSlotsPage.getSlotReccurencedropdown().click();
	createSlotsPage.getAllDaysCheckbox().click();RobotEscape();
//	createSlotsPage.getSlotstartingtime().click();
//	RobotClearingField();Thread.sleep(500);
//	createSlotsPage.getOkButton().click();
//	createSlotsPage.getSlotstartingtime().click();
//	createSlotsPage.getSlotstartingtime().
//	sendKeys(fileUtils.readTheDataFromPropertyFile("CourseStartTime"));
//	createSlotsPage.getSlotendingtime().click();
//	RobotClearingField();Thread.sleep(500);
//	createSlotsPage.getOkButton().click();
//	createSlotsPage.getSlotendingtime().click();
//	createSlotsPage.getSlotendingtime().
//	sendKeys(fileUtils.readTheDataFromPropertyFile("CourseEndTime"));
	createSlotsPage.getCostfield().click();
	createSlotsPage.getCostfield().
	sendKeys(fileUtils.readTheDataFromPropertyFile("CourseCost"));
	createSlotsPage.getGuidelines().
	sendKeys(fileUtils.readTheDataFromPropertyFile("CourseGuidelines"));Thread.sleep(1000);
//	createSlotsPage.getAddslotbutton().click();
//	createSlotsPage.getViewslot().click();
//	TakeScreenShot("./screenshots/Slots/017CourseCreating01.png")
//	createSlotsPage.getRemoveaction().click();
//	createSlotsPage.getCreatebutton().click();
//	TakeScreenShot("./screenshots/Slots/017CourseCreating02.png")
}


@Test(priority = 18, enabled = true, invocationCount = 1)
public void ViewSlot5() throws Throwable {
	HomePage homepage = new HomePage(driver);
	CreateSlotsPage createSlotsPage = new CreateSlotsPage(driver);
	homepage.getViewslotbutton().click();Thread.sleep(1000);
	createSlotsPage.getSubactivitydropdown().click();
	createSlotsPage.getBadmintonactivity().click();Thread.sleep(1000);
	createSlotsPage.getSlottypedropdown().click();
	createSlotsPage.getCourseslottype().click();
	ViewSlotsPage ViewSlotsPage= new ViewSlotsPage(driver);
	if (ViewSlotsPage.getViewslotforcoursetype().isDisplayed()) {
		System.out.println("PASS");
		}
	ViewSlotsPage.getCourseFirstEditOption().click();
	ViewSlotsPage.getCostbutton().click();RobotClearingField();
	ViewSlotsPage.getCostbutton().sendKeys(fileUtils.readTheDataFromPropertyFile("CourseCost1"));
//	ViewSlotsPage.getUpdatebutton();
//	TakeScreenShot("./screenshots/Slots/018MembershipSlotDetails02.png");

}

@AfterMethod
public void windowClose() {
	driver.close();}	

}

