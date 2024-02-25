package vendorLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.ViewBookingsPage;

public class Bookings extends Baseclass {
	
@BeforeMethod
public void weblogin() throws Throwable {
	WebApplicationLogin();
	BookingsBeforeMethod();
}

@Test(priority = 1, enabled = true)
public void ViewBookings1() throws Throwable {
	Thread.sleep(2000);
	TakeScreenShot("./screenshots/Bookings/001SelectingFromAndToDates.png"); 
}

@Test(priority = 2, enabled = true)
public void ViewBookings2() throws Throwable {
	RobotTab();RobotTab();RobotEnter();RobotDownArrow();RobotDownArrow();RobotEnter();
	Thread.sleep(2000);
	TakeScreenShot("./screenshots/Bookings/002SelectingRowsPerPageAs25.png");	
}

@Test(priority = 3, enabled = true)
public void ViewBookings3() throws Throwable {
	RobotTab();RobotTab();RobotEnter();RobotDownArrow();RobotEnter();
	Thread.sleep(2000);
	TakeScreenShot("./screenshots/Bookings/003SelectingRowsPerPageAs10.png");
}

@Test(priority = 4, enabled = true)
public void ViewBookings4() throws Throwable {
	ViewBookingsPage ViewBookingsPage = new ViewBookingsPage(driver);
	ViewBookingsPage.getFromdatecalenderdropdown().click();
	CalenderLeftArrow(fileUtils.readTheDataFromPropertyFile("BookingsStartDateAs1"));
	Thread.sleep(1000);ViewBookingsPage.getTodatecalenderdropdown().click();
	CalenderLeftArrow(fileUtils.readTheDataFromPropertyFile("BookingsEndDateAs1"));
	Thread.sleep(2000);TakeScreenShot("./screenshots/Bookings/004NoBookingsFoundMessageDisplay.png");
}



@AfterMethod
public void windowClose() {
	driver.close();}	
}
