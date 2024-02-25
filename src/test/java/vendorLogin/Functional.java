//FUNCTIONAL TESTING

package vendorLogin;


import java.time.LocalDateTime;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.CreateSupervisorPage;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.ViewOfferspage;
import com.cotyledon.pys.pomrepository.ViewSupervisorPage;

public class Functional extends Baseclass {
	SoftAssert softassert = new SoftAssert();
	public String timeStamp = LocalDateTime.now().toString().replace(':', '-');

@BeforeMethod
public void Login() throws Throwable {
	WebApplicationLogin();

}

	
//Verify the user is able to see the all past,future and present date bookings
	@Test
	public void bookings() throws Throwable {
		HomePage homepage = new HomePage(driver);
		softassert.assertTrue(homepage.getNobookingtext().isDisplayed() || homepage.getBookingdetails().isDisplayed(),
				"something went wrong");
		homepage.getDashboardcalenderdropdown().click();
		RobotLeftArrow();RobotEnter();
		softassert.assertTrue(homepage.getNobookingtext().isDisplayed() || homepage.getBookingdetails().isDisplayed(),
				"something went wrong");
		homepage.getDashboardcalenderdropdown().click();
		RobotDownArrow();RobotEnter();
		softassert.assertTrue(homepage.getNobookingtext().isDisplayed() || homepage.getBookingdetails().isDisplayed(),
				"something went wrong");
	}

//Check the user is not able to add the supervisor without filling the mandatory fields	
	@Test(dataProvider = "SupervisorDetails", dataProviderClass = Datasupply.class)
	public void FunctionalityOfSupervisorPage(String SupervisorName, String Email, String ContactNumber) throws Throwable {
		CreateSupervisorPage createSupervisorPage = new CreateSupervisorPage(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getSupervisormanagementoption().click();
		homepage.getCreatesupervisorbutton().click();
		createSupervisorPage.getSupervisornametextfield().sendKeys(SupervisorName);
		createSupervisorPage.getSupervisoremailidtextfield().sendKeys(Email);
		createSupervisorPage.getContactnofield().sendKeys(ContactNumber);
		try {
			createSupervisorPage.getAddsupervisorbutton().isEnabled();
		} catch (Exception e) {
			TakeScreenShot("./screenshots/NegativeScenarioFunctional/001FunctionalityOfSupervisorPage"+timeStamp+".png");
		}
	}

//Check the SupervisorName Textfield with all the datatypes	
	@Test(dataProvider = "S.NameFieldCheck", dataProviderClass = Datasupply.class)
	public void SupervisorNameFieldCheck(String SupervisorName) throws Throwable {
		CreateSupervisorPage createSupervisorPage = new CreateSupervisorPage(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getSupervisormanagementoption().click();
		homepage.getCreatesupervisorbutton().click();
		createSupervisorPage.getSupervisornametextfield().sendKeys(SupervisorName);
		try {
			createSupervisorPage.getSupervisornameerrormessage().isDisplayed();
		} catch (Exception e) {
			System.out.println("Fail:SupervisorName field Accepting " + SupervisorName + ".");
			TakeScreenShot("./screenshots/NegativeScenarioFunctional/002SupervisorNameFieldCheck"+timeStamp+".png");
		}
	}

//Check contact Number field with all the datatypes	
	@Test(dataProvider = "S.NameFieldCheck", dataProviderClass = Datasupply.class)
	public void EmailFieldCheck(String Email) throws Throwable {
		CreateSupervisorPage createSupervisorPage = new CreateSupervisorPage(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getSupervisormanagementoption().click();
		homepage.getCreatesupervisorbutton().click();
		createSupervisorPage.getSupervisoremailidtextfield().sendKeys(Email);
		try {
			createSupervisorPage.getSupervisornameerrormessage().isDisplayed();
		} catch (Exception e) {
			System.out.println("Fail:Email field Accepting " + Email + ".");
			TakeScreenShot("./screenshots/NegativeScenarioFunctional/003EmailFieldCheck"+timeStamp+".png");
		}
	}

//Check contact Number field with all the datatypes	
	@Test(dataProvider = "S.ContactNoFieldCheck", dataProviderClass = Datasupply.class)
	public void ContactNoFieldCheck(String ContactNo) throws Throwable {
		CreateSupervisorPage createSupervisorPage = new CreateSupervisorPage(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getSupervisormanagementoption().click();
		homepage.getCreatesupervisorbutton().click();
		createSupervisorPage.getContactnofield().sendKeys(ContactNo);
		try {
			if (createSupervisorPage.contactnoerrormessage().isDisplayed()
					|| createSupervisorPage.getContactErrormessage().isDisplayed()) {
			}
		} catch (Exception e) {
			System.out.println("Fail:ContactNofield Accepting " + ContactNo + ".");
			TakeScreenShot("./screenshots/NegativeScenarioFunctional/004ContactNoFieldCheck"+timeStamp+".png");
		}
	}

//Verify the user is able to delete the Active,New,Deactive Supervisor
	@Test
	public void DeleteEachStatusSupervisor() throws Throwable {
		HomePage homepage = new HomePage(driver);
		homepage.getSupervisormanagementoption().click();
		homepage.getViewsupervisoroption().click();
		ViewSupervisorPage viewSupervisorPage = new ViewSupervisorPage(driver);
		viewSupervisorPage.getFirstNewtext().click();
		RobotTab();
		RobotEnter();
		RobotEnter();
		TakeScreenShot("./screenshots/NegativeScenarioFunctional/DeleteEachStatusSupervisor1"+timeStamp+".png");
		viewSupervisorPage.getSecondActivetext().click();
		RobotTab();
		RobotEnter();
		RobotEnter();
		TakeScreenShot("./screenshots/NegativeScenarioFunctional/DeleteEachStatusSupervisor2"+timeStamp+".png");
		viewSupervisorPage.getFirstDeactivetext().click();
		RobotTab();
		RobotEnter();
		RobotEnter();
		TakeScreenShot("./screenshots/NegativeScenarioFunctional/DeleteEachStatusSupervisor3"+timeStamp+".png");

	}

//verify the total count of the offer
	@Test
	public void Offercount() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.getOffersbutton().click();
		homePage.getViewoffersoption().click();
		ViewOfferspage viewOfferspage = new ViewOfferspage(driver);
		viewOfferspage.getOfferStatusDropDown().click();
		viewOfferspage.getUpcomingOption().click();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		String firstcount = viewOfferspage.getTotaloffercount().getText();
		System.out.println(firstcount);
		Thread.sleep(2000);
		viewOfferspage.getRightarrow().click();
		Thread.sleep(2000);
		viewOfferspage.getLeftrarrow().click();
		String secondcount = viewOfferspage.getTotaloffercount().getText();
		System.out.println(secondcount);
		if (firstcount.equals(secondcount)) {
			System.out.println("passed");
		} else {
			System.out.println("Failed:Something Went Wrong");
		}
	}
@AfterMethod
	public void windowClose() {
		driver.close();
}
	
	
}
