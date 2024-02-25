package vendorLogin;
import java.util.Scanner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.AvailBookingPage;

public class AvailBookings extends Baseclass{
	
@BeforeMethod
	public void weblogin() throws Throwable {
	WebApplicationLogin();
	AvailBookingPage AvailBookingPage = new AvailBookingPage(driver);
	AvailBookingPage.getAvailBookingButton().click();
	Thread.sleep(1000);
}
	
@Test(priority = 1, enabled = true)
public void AvailBookings1() throws Throwable {
	Thread.sleep(2000);
	TakeScreenShot("./screenshots/AvailBookings/001AvailBookingsForCurrentDate.png");
}

@Test(priority = 2, enabled = true)
public void AvailBookings2() throws Throwable {
	AvailBookingPage AvailBookingPage = new AvailBookingPage(driver);
	AvailBookingPage.getBookingDateButton().click();Thread.sleep(500);
	AvailBookingPage.getSelectDateAs10().click();Thread.sleep(500);
	AvailBookingPage.getFirstCustomerOTP().click();
	Thread.sleep(1000);RobotTab();
	AvailBookingPage.getOTPInput().sendKeys(fileUtils.readTheDataFromPropertyFile("InvalidOTP"));
	RobotTab();Thread.sleep(500);
	RobotEnter();Thread.sleep(500);
	TakeScreenShot("./screenshots/AvailBookings/002AvailBookingWithCustomerInvalidOTP.png");
}

@Test(priority = 3, enabled = true)
public void AvailBookings3() throws Throwable {
	AvailBookingPage AvailBookingPage = new AvailBookingPage(driver);
	AvailBookingPage.getBookingDateButton().click();Thread.sleep(500);
	AvailBookingPage.getSelectDateAs10().click();Thread.sleep(500);
	AvailBookingPage.getFirstCustomerOTP().click();
	RobotTab();RobotTab();Thread.sleep(2000);
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
    System.out.print("TYPE THE OTP: ");
    String otp = scanner.next();
	AvailBookingPage.getOTPInput().sendKeys(otp);
	Thread.sleep(2000);
	RobotTab();RobotEnter();
	Thread.sleep(1000);
	TakeScreenShot("./screenshots/AvailBookings/003AvailBookingWithCustomerValidOTP.png");
}


@AfterMethod
public void windowClose() {
	driver.close();
	}
}
