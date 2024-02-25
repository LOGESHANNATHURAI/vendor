package vendorLogin;

import java.time.Duration;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.HomePage;

import io.opentelemetry.sdk.metrics.View;
import net.bytebuddy.asm.Advice.Enter;

public class PYSDashBoard extends Baseclass {

	SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void weblogin() throws Throwable {
		WebApplicationLogin();
	}

	@Test(priority = 1, enabled = true)
	public void Dashboardwindow() throws Throwable {
		HomePage HomePage = new HomePage(driver);
		HomePage.getProfileButton().click();
		TakeScreenShot("./screenshots/PYSDashboard/001DashboardProfileButton.png");
		// +timestamp()+"
	}

	@Test(priority = 2, enabled = false)
	public void ChangePassword() throws Throwable {
		ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"),
				fileUtils.readTheDataFromPropertyFile("newpassword"),
				fileUtils.readTheDataFromPropertyFile("confirmpassword"));
		TakeScreenShot("./screenshots/PYSDashboard/002ChangePassword.png");
	}

	@Test(priority = 3, enabled = true)
	public void ChangePassConfirmPassWrong() throws Throwable {
		ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"),
				fileUtils.readTheDataFromPropertyFile("newpassword"),
				fileUtils.readTheDataFromPropertyFile("wrongconfirmpassword"));
		TakeScreenShot("./screenshots/PYSDashboard/003ChangePasswordConfirmPassWrong.png");
	}

	@Test(priority = 4, enabled = true)
	public void ChangePassCurrentPassWrong() throws Throwable {
		ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("wrongcurrentpassword"),
				fileUtils.readTheDataFromPropertyFile("newpassword"),
				fileUtils.readTheDataFromPropertyFile("confirmpassword"));
		TakeScreenShot("./screenshots/PYSDashboard/004ChangePasswordCurrentPassWrong.png");
	}

	@Test(priority = 5, enabled = true)
	public void ChangePassNewPassWrong() throws Throwable {
		ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"),
				fileUtils.readTheDataFromPropertyFile("wrongnewpassword"),
				fileUtils.readTheDataFromPropertyFile("confirmpassword"));
		TakeScreenShot("./screenshots/PYSDashboard/005ChangePasswordNewPassWrong.png");
	}

	@Test(priority = 6, enabled = true)
	public void ChangePassEmptyCurrentPassField() throws Throwable {
		ChangePasswordInDashboard("", fileUtils.readTheDataFromPropertyFile("newpassword"),
				fileUtils.readTheDataFromPropertyFile("confirmpassword"));
		TakeScreenShot("./screenshots/PYSDashboard/006ChangePasswordEmptyCurrentPassField.png");
	}

	@Test(priority = 7, enabled = true)
	public void ChangePassEmptyNewPassField() throws Throwable {
		ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"), "",
				fileUtils.readTheDataFromPropertyFile("confirmpassword"));
		TakeScreenShot("./screenshots/PYSDashboard/007ChangePasswordEmptyNewPassField.png");
	}

	@Test(priority = 8, enabled = true)
	public void ChangePassEmptyConfirmPassField() throws Throwable {
		ChangePasswordInDashboard(fileUtils.readTheDataFromPropertyFile("currentpassword"),
				fileUtils.readTheDataFromPropertyFile("newpassword"), "");
		TakeScreenShot("./screenshots/PYSDashboard/008ChangePasswordEmptyConfirmPassField.png");
	}

	@Test(priority = 9, enabled = true)
	public void DashboardBookingsDropDown1() throws Throwable {
		DashboardDropDown(fileUtils.readTheDataFromPropertyFile("DashboardDate"));
		TakeScreenShot("./screenshots/PYSDashboard/009DashboardBookingDropDown1.png");
	}

	@Test(priority = 10, enabled = true)
	public void DashboardBookingsDropDown2() throws Throwable {
		DashboardDropDown(fileUtils.readTheDataFromPropertyFile("DashboardDate"));
		HomePage HomePage = new HomePage(driver);
		Thread.sleep(1000);
		HomePage.getDashboardBookingDropDown().click();
		HomePage.morebutton().click();
		Thread.sleep(2000);
		TakeScreenShot("./screenshots/PYSDashboard/010DashboardBookingDropDown2.png");
	}

	@Test(priority = 11, enabled = true)
	public void ClickingOnLastTwoWeeks() throws Throwable {
		ScrollWindow1();
		HomePage HomePage = new HomePage(driver);
		HomePage.getLastTwoWeekButton().click();
		Thread.sleep(2000);
		TakeScreenShot("./screenshots/PYSDashboard/011ClickingOnLastTwoWeeks.png");
	}

	@Test(priority = 12, enabled = true)
	public void LastTwoWeeksVerify() throws Throwable {
		HomePage homepage = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOf(homepage.getOnlineBox()));
		homepage.getOnlineBox().click();
		ScrollWindow1();
		Thread.sleep(1000);
		homepage.getLastTwoWeekButton().click();
		String expectedcolor = homepage.getLastTwoWeekButton().getCssValue("color");
		String Actualcolor = "rgba(32, 101, 209, 1)";
		softassert.assertEquals(Actualcolor, expectedcolor, "last two week button is not clicked ");
//	softassert.assertAll();
		TakeScreenShot("./screenshots/PYSDashboard/012ClickingOnLastTwoWeeksVerify.png");
	}

//Verify the User is able to block the slots under the particular subActivityin present date

	@Test(priority = 13, enabled = true)
	public void Viewboookings013() throws Throwable {
		HomePage Homepage = new HomePage(driver);
		Homepage.viewbookingsdropdown().click();
		Homepage.subActivityDropdown().click();
		Homepage.getBadmintonactivity().click();
		Homepage.Slottypedropdown().click();
		Homepage.getBadmintonslottype().click();
		Thread.sleep(1000);
		try {
			for (;;) {
				if (Homepage.firstslotinviewbookings().isDisplayed()) {
					Homepage.firstslotinviewbookings().click();
					Thread.sleep(500);
					Homepage.fromdateinviewbookings().click();
					RobotEnter();
					Homepage.Todateinviewbooking().click();
					RobotEnter();
					Homepage.confirmbutton().click();
					Thread.sleep(500);
					TakeScreenShot("./screenshots/PYSDashboard/013ViewboookingsBlock.png");
					break;
				} else {
					Homepage.dateicon().click();
					RobotRightArrow();
					RobotEnter();
				}
			}
		} catch (Exception e) {

		}
	}

//verify the user is able to unblock the slots in present date
	@Test(priority = 14, enabled = true)
	public void Viewboookings014() throws Throwable {
		HomePage Homepage = new HomePage(driver);
		Homepage.viewbookingsdropdown().click();
		Homepage.subActivityDropdown().click();
		Homepage.getBadmintonactivity().click();
		Homepage.Slottypedropdown().click();
		Homepage.getBadmintonslottype().click();
		Thread.sleep(2000);
		Homepage.unblockbuttoninviewbooking().click();
		Homepage.fromdateinviewbookings().click();
		RobotEnter();
		Homepage.Todateinviewbooking().click();
		RobotEnter();
		Homepage.confirmbutton().click();
		Thread.sleep(500);
		TakeScreenShot("./screenshots/PYSDashboard/014ViewboookingsUnBlock.png");

	}

//Verify the user is able to block the future slot	

	@Test(priority = 15, enabled = true)
	public void Viewboookings015() throws Throwable {
		HomePage Homepage = new HomePage(driver);
		Homepage.viewbookingsdropdown().click();
		Homepage.subActivityDropdown().click();
		Homepage.getBadmintonactivity().click();
		Homepage.Slottypedropdown().click();
		Homepage.getBadmintonslottype().click();
		Homepage.datefieldinviewbookings().click();
		RobotTab();
		RobotEnter();
		RobotRightArrow();
		RobotEnter();
		try {
			while (true) {
				if (Homepage.firstslotinviewbookings().isDisplayed()) {
					Homepage.firstslotinviewbookings().click();
					Thread.sleep(500);
					Homepage.fromdateinviewbookings().click();
					RobotRightArrow();
					RobotEnter();
					Thread.sleep(2000);
					Homepage.Todateinviewbooking().click();
					RobotEnter();
					Thread.sleep(3000);
					Homepage.confirmbutton().click();
					Thread.sleep(3000);
					TakeScreenShot("./screenshots/PYSDashboard/015ViewboookingsBlock.png");
					break;
				} else {
					RobotEnter();
					RobotRightArrow();
					RobotEnter();
				}

			}

		} catch (Exception e) {

		}

	}

//Verify the user is able to unblock the future slots

	@Test(priority = 16, enabled = true)
	public void Viewboookings016() throws Throwable {
		HomePage Homepage = new HomePage(driver);
		Homepage.viewbookingsdropdown().click();
		Homepage.subActivityDropdown().click();
		Homepage.getBadmintonactivity().click();
		Homepage.Slottypedropdown().click();
		Homepage.getBadmintonslottype().click();
		Homepage.datefieldinviewbookings().click();RobotTab();RobotEnter();RobotRightArrow();RobotEnter();
		Thread.sleep(2000);
		try {
			if (Homepage.unblockbuttoninviewbooking().isDisplayed()) {
				Homepage.unblockbuttoninviewbooking().click();
				Homepage.fromdateinviewbookings().click();RobotRightArrow();RobotEnter();
				Homepage.Todateinviewbooking().click();RobotRightArrow();RobotEnter();
				Homepage.confirmbutton().click();
				TakeScreenShot("./screenshots/PYSDashboard/016ViewboookingsBlock.png");
			} else {
				Homepage.datefieldinviewbookings().click();RobotTab();RobotEnter();RobotRightArrow();RobotEnter();
				Homepage.unblockbuttoninviewbooking().click();
				Homepage.fromdateinviewbookings().click();RobotRightArrow();RobotRightArrow();RobotEnter();
				Homepage.Todateinviewbooking().click();RobotRightArrow();RobotRightArrow();RobotEnter();
				Homepage.confirmbutton().click();
				Thread.sleep(1000);
				TakeScreenShot("./screenshots/PYSDashboard/016ViewboookingsUnBlock.png");
			}

		} catch (Exception e) {

		}

	}

//@AfterMethod
	public void windowClose() {
		driver.close();
	}
}