package vendorLogin;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.CreateOffersPage;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.ViewOfferspage;


public class Offers extends Baseclass{

	@BeforeMethod
	public void weblogin() throws Throwable {
		WebApplicationLogin();
		HomePage HomePage = new HomePage(driver);
		HomePage.getOffersbutton().click();
		
	}

@Test(priority = 1, enabled = true, invocationCount = 1)
public void CreateFlatOfferForAll() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getFlatofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	createOffersPage.getAllOption().click();Thread.sleep(1000);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getDiscountPercentagefield().
	sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().
	sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().
	sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getPublishofferbutton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/001CreateFlatOfferForAll.png"); 
}

@Test(priority = 2, enabled = true, invocationCount = 1)
public void CreateFlatOfferForParticular() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getFlatofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	createOffersPage.getParticularoption().click();
	Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"), fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getSubactivitylistdropdown().click();
	createOffersPage.getBadmintoncheckbox().click();
	RobotEscape();Thread.sleep(500);
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getPublishofferbutton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/002CreateFlatOfferForParticular.png"); 
	}

@Test(priority = 3, enabled = true, invocationCount = 1)
public void CreateFirstTimeOfferForAll() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getFirsttimeofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	Thread.sleep(500);
	createOffersPage.getAllOption().click();Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"), fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getPublishofferbutton().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/003CreateFirstTimeOfferForAll.png");
}

@Test(priority = 4, enabled = true, invocationCount = 1)
public void CreateFirstTimeOfferForParticular() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getFirsttimeofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	createOffersPage.getParticularoption().click();Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"),
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getDiscountPercentagefield().
	sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().
	sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getSubactivitylistdropdown().click();
	createOffersPage.getBadmintoncheckbox().click();RobotEscape();
//	createOffersPage.getPublishofferbutton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/004CreateFirstTimeOfferForParticular.png");
}

@Test(priority = 5, enabled = true, invocationCount = 1)
public void CreateSlotOfferForAll() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getSlotofferNavigationalBar().click();
	createOffersPage.getSubactivitydropdown().click();
	createOffersPage.getBadmintonoptioninsubactivity().click();
	Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"), fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getBookingtypedropdown().click();
	createOffersPage.getBadmintonoptioninbookingtype().click();
	Thread.sleep(500);
	createOffersPage.getAllRadiobutton().click();
	Thread.sleep(3000);
	createOffersPage.getFirstSlotSelection().click();
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
 	createOffersPage.getPublishofferbutton().click();	
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/005CreateSlotOfferForAll.png");
}

@Test(priority = 6, enabled = true, invocationCount = 1)
public void CreateSlotOfferForParticular() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	
	createOffersPage.getSlotofferNavigationalBar().click();
	createOffersPage.getSubactivitydropdown().click();
	createOffersPage.getBadmintonoptioninsubactivity().click();
	Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));Thread.sleep(500);
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getBookingtypedropdown().click();
	createOffersPage.getBadmintonoptioninbookingtype().click();Thread.sleep(500);
	createOffersPage.getParticularRadiobutton().click();
	Thread.sleep(3000);
	RobotTab();RobotDownArrow();RobotDownArrow();RobotDownArrow();RobotDownArrow();RobotEnter();
	createOffersPage.getFirstSlotSelection().click();Thread.sleep(1000);
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));Thread.sleep(500);
 	createOffersPage.getPublishofferbutton().click();	
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/006CreateSlotOfferForParticular.png");
}

@Test(priority = 7, enabled = true, invocationCount = 1)
public void CreateAdjacentOfferForAll() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getAdjacentofferofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	createOffersPage.getAllOption().click();
	Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getNoofslotsfield().sendKeys(fileUtils.readTheDataFromPropertyFile("noofslots"));
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getPublishofferbutton().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/007CreateAdjacentOfferForAll.png");
	}

@Test(priority = 8, enabled = true, invocationCount = 1)
public void CreateAdjacentOfferForParticular() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getAdjacentofferofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	createOffersPage.getParticularoption().click();
	Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("Offerstartdate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getNoofslotsfield().sendKeys(fileUtils.readTheDataFromPropertyFile("noofslots"));
	createOffersPage.getSubactivitylistdropdown().click();
	createOffersPage.getBadmintoncheckbox().click();
	RobotEscape();Thread.sleep(500);
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("Offerenddate"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYear"));
	createOffersPage.getPublishofferbutton().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/008CreateAdjacentOfferForParticular.png");
	}

@Test(priority = 9, enabled = true, invocationCount = 1)
public void CreateHappyHoursForAll() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getHappyhoursofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	createOffersPage.getPYSoption().click();
	Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("OfferstartdateHH"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYearHH"));
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("OfferenddateHH"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYearHH"));
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getShopnamedropdown().click();Thread.sleep(1000);
	RobotEscape();Thread.sleep(1000);
	RobotL();Roboto();Robotg();RobotExitLockingKeys();Thread.sleep(3000);
	RobotDownArrow();RobotEnter();Thread.sleep(1000);
	createOffersPage.getSubactivitydropdown().click();Thread.sleep(500);
	createOffersPage.getBadmintonoptioninsubactivity().click();Thread.sleep(500);
	createOffersPage.getSlottypedropdown().click();
	createOffersPage.getBADMINTONSlotType().click();
	Thread.sleep(500);
	createOffersPage.getStarttimefield().sendKeys(fileUtils.readTheDataFromPropertyFile("HappyHoursStartTime"));
	RobotTab();RobotTab();Thread.sleep(500);
	createOffersPage.getEndtimefield().sendKeys(fileUtils.readTheDataFromPropertyFile("HappyHoursEndTime"));
	createOffersPage.getSlotsdropdown().click();
	createOffersPage.getFirstcheckbox().click();
	RobotEscape();RobotTab();RobotEnter();
	createOffersPage.getAllOption().click();Thread.sleep(1000);
	createOffersPage.getPublishofferbutton().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/009CreateHappyHoursForAll.png");
	}

@Test(priority = 10, enabled = true, invocationCount = 1)
public void CreateHappyHoursForParticular() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getCreateoffersoption().click();
	CreateOffersPage createOffersPage = new CreateOffersPage(driver);
	createOffersPage.getHappyhoursofferNavigationalBar().click();
	createOffersPage.getCustomertypedropdown().click();
	createOffersPage.getPYSoption().click();
	Thread.sleep(500);
	createOffersPage.getFromdatecalender().click();
	EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("OfferstartdateHH"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYearHH"));
	createOffersPage.getTodatecalender().click();
	EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("OfferenddateHH"), 
			fileUtils.readTheDataFromPropertyFile("OfferMonthAndYearHH"));
	createOffersPage.getDiscountPercentagefield().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	createOffersPage.getMaxDiscountpercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	createOffersPage.getUsagelimitfield().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	createOffersPage.getShopnamedropdown().click();Thread.sleep(1000);
	RobotEscape();Thread.sleep(1000);
	RobotL();Roboto();Robotg();RobotExitLockingKeys();Thread.sleep(3000);
	RobotDownArrow();RobotEnter();Thread.sleep(1000);
	RobotExitLockingKeys();Thread.sleep(500);
	createOffersPage.getSubactivitydropdown().click();
	createOffersPage.getBadmintonoptioninsubactivity().click();Thread.sleep(500);
	createOffersPage.getSlottypedropdown().click();
	createOffersPage.getBADMINTONSlotType().click();
	Thread.sleep(500);
	createOffersPage.getStarttimefield().sendKeys(fileUtils.readTheDataFromPropertyFile("HappyHoursStartTime"));
	Thread.sleep(500);
	createOffersPage.getEndtimefield().sendKeys(fileUtils.readTheDataFromPropertyFile("HappyHoursEndTime"));
	createOffersPage.getSlotsdropdown().click();
	createOffersPage.getFirstcheckbox().click();
	RobotEscape();RobotTab();RobotEnter();
	createOffersPage.getParticularoption().click();Thread.sleep(1000);
	createOffersPage.getCustomernamedropdown().click();
	RobotL();Roboto();Robotg();RobotExitLockingKeys();Thread.sleep(3000);
	RobotDownArrow();RobotEnter();Thread.sleep(1000);
	createOffersPage.getPublishofferbutton().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/010CreateHappyHoursForParticular.png");
	}

@Test(priority = 11, enabled = true, invocationCount = 1)
public void ViewOfferFlatOfferActive() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFlatofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getActiveoption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/011ViewOfferFlatOfferActive.png");
}	

@Test(priority = 12, enabled = true, invocationCount = 1)
public void ViewOfferFlatOfferExpired() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFlatofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getExpiredOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/012ViewOfferFlatOfferExpired.png");
}	

@Test(priority = 13, enabled = true, invocationCount = 1)
public void ViewOfferFlatOfferUpcoming() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFlatofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/013ViewOfferFlatOfferUpcoming.png");
}	

@Test(priority = 14, enabled = true)
public void ViewOfferFirstTimeOfferActive() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFirsttimeofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getActiveoption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/014ViewOfferFirstTimeOfferActive.png");
}	

@Test(priority = 15, enabled = true)
public void ViewOfferFirstTimeOfferExpired() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFirsttimeofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getExpiredOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/015ViewOfferFirstTimeOfferExpired.png");
}	

@Test(priority = 16, enabled = true)
public void ViewOfferFirstTimeOfferUpcoming() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFirsttimeofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/016ViewOfferFlatOfferUpcoming.png");
}	

@Test(priority = 17, enabled = true, invocationCount = 1)
public void ViewOfferSlotOfferActive() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getSlotofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getActiveoption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/017ViewOfferSlotOfferActive.png");
}	

@Test(priority = 18, enabled = true, invocationCount = 1)
public void ViewOfferSlotOfferExpired() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getSlotofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getExpiredOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/018ViewOfferSlotOfferExpired.png");
}

@Test(priority = 19, enabled = true, invocationCount = 1)
public void ViewOfferSlotOfferUpcoming() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getSlotofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/019ViewOfferSlotOfferUpcoming.png");
}

@Test(priority = 20, enabled = true, invocationCount = 1)
public void ViewOfferAdjacentOfferActive() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getAdjacentofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getActiveoption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/020ViewOfferAdjacentOfferActive.png");
}

@Test(priority = 21, enabled = true, invocationCount = 1)
public void ViewOfferAdjacentOfferExpired() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getAdjacentofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getExpiredOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/021ViewOfferAdjacentOfferExpired.png");
}

@Test(priority = 22, enabled = true, invocationCount = 1)
public void ViewOfferAdjacentOfferUpcoming() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getAdjacentofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/022ViewOfferAdjacentOfferUpcoming.png");
}

@Test(priority = 23, enabled = true, invocationCount = 1)
public void ViewOfferHappyHoursActive() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getHappyhoursNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getActiveoption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/023ViewOfferHappyHoursActive.png");
}

@Test(priority = 24, enabled = true, invocationCount = 1)
public void ViewOfferHappyHoursExpired() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getHappyhoursNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getExpiredOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/024ViewOfferHappyHoursExpired.png");
}

@Test(priority = 25, enabled = true, invocationCount = 1)
public void ViewOfferHappyHoursUpcoming() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getHappyhoursNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/025ViewOfferHappyHoursUpcoming.png");
}

@Test(priority = 26, enabled = true, invocationCount = 1)
public void ActionButtonForFlatOffer() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFlatofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	ViewOfferspage.getEditActionOption().click();
	ViewOfferspage.getActionFromDate().click();ViewOfferspage.getStartDateAs14().click();Thread.sleep(1000);
	ViewOfferspage.getActionToDate().click();ViewOfferspage.getEndDateAs16().click();Thread.sleep(1000);
	ViewOfferspage.getActionDiscountPercentage().click();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionDiscountPercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	ViewOfferspage.getActionMaxDiscounAmount().click();RobotBackSpace();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionMaxDiscounAmount().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	ViewOfferspage.getActionUsageLimit().click();RobotBackSpace();
	ViewOfferspage.getActionUsageLimit().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	ViewOfferspage.getActionUpdate().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/026ViewOfferFlatOfferActionUpdated.png");
}

@Test(priority = 27, enabled = true, invocationCount = 1)
public void ActionButtonForFirstTimeOffer() throws Throwable{
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getFirsttimeofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	ViewOfferspage.getEditActionOption().click();
	ViewOfferspage.getActionFromDate().click();ViewOfferspage.getStartDateAs14().click();Thread.sleep(1000);
	ViewOfferspage.getActionToDate().click();ViewOfferspage.getEndDateAs16().click();Thread.sleep(1000);
	ViewOfferspage.getActionDiscountPercentage().click();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionDiscountPercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	ViewOfferspage.getActionMaxDiscounAmount().click();RobotBackSpace();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionMaxDiscounAmount().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	ViewOfferspage.getActionUpdate().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/027ViewOfferFirstTimeOfferActionUpdated.png");
	
}

@Test(priority = 28, enabled = true, invocationCount = 1)
public void ActionButtonForSlotOffer() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getSlotofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	ViewOfferspage.getEditActionOption().click();
	ViewOfferspage.getActionFromDate().click();ViewOfferspage.getStartDateAs14().click();Thread.sleep(1000);
	ViewOfferspage.getActionToDate().click();ViewOfferspage.getEndDateAs16().click();Thread.sleep(1000);
	ViewOfferspage.getActionDiscountPercentage().click();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionDiscountPercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	ViewOfferspage.getActionMaxDiscounAmount().click();RobotBackSpace();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionMaxDiscounAmount().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	ViewOfferspage.getActionUsageLimit().click();RobotBackSpace();
	ViewOfferspage.getActionUsageLimit().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	ViewOfferspage.getActionUpdate().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/028ViewOfferSlotOfferActionUpdated.png");
}

@Test(priority = 29, enabled = true, invocationCount = 1)
public void ActionButtonForAdjacentOffer() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getAdjacentofferNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	ViewOfferspage.getEditActionOption().click();
	ViewOfferspage.getActionFromDate().click();ViewOfferspage.getStartDateAs14().click();Thread.sleep(1000);
	ViewOfferspage.getActionToDate().click();ViewOfferspage.getEndDateAs16().click();Thread.sleep(1000);
	ViewOfferspage.getActionDiscountPercentage().click();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionDiscountPercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	ViewOfferspage.getActionMaxDiscounAmount().click();RobotBackSpace();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionMaxDiscounAmount().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	ViewOfferspage.getActionUsageLimit().click();RobotBackSpace();
	ViewOfferspage.getActionUsageLimit().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	ViewOfferspage.getActionSlotCount().click();RobotBackSpace();
	ViewOfferspage.getActionSlotCount().sendKeys(fileUtils.readTheDataFromPropertyFile("SlotCount"));
	ViewOfferspage.getActionUpdate().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/029ViewOfferAdjacentOfferActionUpdated.png");
}

@Test(priority = 30, enabled = true, invocationCount = 1)
public void ActionButtonForHappyHours() throws Throwable {
	HomePage homepage = new HomePage(driver);
	homepage.getViewoffersoption().click();
	ViewOfferspage ViewOfferspage = new ViewOfferspage(driver);
	ViewOfferspage.getHappyhoursNavigationalBar().click();
	ViewOfferspage.getOfferStatusDropDown().click();
	ViewOfferspage.getUpcomingOption().click();
	ViewOfferspage.getEditActionOption().click();
	ViewOfferspage.getActionFromDate().click();ViewOfferspage.getStartDateAs14().click();Thread.sleep(1000);
	ViewOfferspage.getActionToDate().click();ViewOfferspage.getEndDateAs16().click();Thread.sleep(1000);
	ViewOfferspage.getActionDiscountPercentage().click();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionDiscountPercentage().sendKeys(fileUtils.readTheDataFromPropertyFile("DiscountPercentage"));
	ViewOfferspage.getActionMaxDiscounAmount().click();RobotBackSpace();RobotBackSpace();RobotBackSpace();
	ViewOfferspage.getActionMaxDiscounAmount().sendKeys(fileUtils.readTheDataFromPropertyFile("maxDiscountAmt"));
	ViewOfferspage.getActionUsageLimit().click();RobotBackSpace();
	ViewOfferspage.getActionUsageLimit().sendKeys(fileUtils.readTheDataFromPropertyFile("UsageLimit"));
	ViewOfferspage.getActionUpdate().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/Offers/030ViewOfferHappyHoursActionUpdated.png");
}


	
@AfterMethod
public void windowClose() {
	driver.close();}	
	
}
