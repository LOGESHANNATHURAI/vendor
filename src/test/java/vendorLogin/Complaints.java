package vendorLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.CreateComplaintsPage;
import com.cotyledon.pys.pomrepository.HomePage;

public class Complaints extends Baseclass {
	@BeforeMethod
	public void weblogin() throws Throwable {
		WebApplicationLogin();
		HomePage HomePage = new HomePage(driver);
		HomePage.getComplaintsbutton().clear();
	}
	
@Test(priority = 1, enabled = true)
	public void Complaints1() throws Throwable {
		HomePage HomePage = new HomePage(driver);
		HomePage.getCreatecomplaintsoption().click();
		CreateComplaintsPage CreateComplaintsPage = new CreateComplaintsPage(driver);
		CreateComplaintsPage.getComplainttypedropdown().clear();
		CreateComplaintsPage.getBookingoption().clear();
		CreateComplaintsPage.getCommentbox().sendKeys(fileUtils.readTheDataFromPropertyFile("complaintcomment"));
		TakeScreenShot("./screenshots/Complaints/001CreateComplaintTypeBookings1.png"); 
//		CreateComplaintsPage.getSubmitbutton().click();
//		Thread.sleep(2000);
//		TakeScreenShot("./screenshots/Complaints/001CreateComplaintTypeBookings2.png");
	}
@Test(priority = 2, enabled = true)
public void Complaints2() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreatecomplaintsoption().click();
	CreateComplaintsPage CreateComplaintsPage = new CreateComplaintsPage(driver);
	CreateComplaintsPage.getComplainttypedropdown().click();
	CreateComplaintsPage.getOffersoption().click();
	CreateComplaintsPage.getCommentbox().sendKeys(fileUtils.readTheDataFromPropertyFile("complaintcomment"));
	TakeScreenShot("./screenshots/Complaints/002CreateComplaintTypeOffer1.png");
//	CreateComplaintsPage.getSubmitbutton().click();
//	Thread.sleep(2000);
//	TakeScreenShot("./screenshots/Complaints/002CreateComplaintTypeOffer2.png");
}

@Test(priority = 3, enabled = true)
public void Complaints3() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreatecomplaintsoption().click();
	CreateComplaintsPage CreateComplaintsPage = new CreateComplaintsPage(driver);
	CreateComplaintsPage.getComplainttypedropdown().click();
	CreateComplaintsPage.getPaymentoption().click();
	CreateComplaintsPage.getCommentbox().sendKeys(fileUtils.readTheDataFromPropertyFile("complaintcomment"));
	TakeScreenShot("./screenshots/Complaints/003CreateComplaintTypePayment1.png");
//	CreateComplaintsPage.getSubmitbutton().click();
//	Thread.sleep(2000);
//	TakeScreenShot("./screenshots/Complaints/003CreateComplaintTypePayment2.png");
}

@Test(priority = 4, enabled = true)
public void Complaints4() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getCreatecomplaintsoption().click();
	CreateComplaintsPage CreateComplaintsPage = new CreateComplaintsPage(driver);
	CreateComplaintsPage.getComplainttypedropdown().click();
	CreateComplaintsPage.getSlotsoption().click();
	CreateComplaintsPage.getCommentbox().sendKeys(fileUtils.readTheDataFromPropertyFile("complaintcomment"));
	TakeScreenShot("./screenshots/Complaints/004CreateComplaintTypeSlots1.png");
//	CreateComplaintsPage.getSubmitbutton().click();
//	Thread.sleep(2000);
//	TakeScreenShot("./screenshots/Complaints/004CreateComplaintTypeSlots2.png"); 
}

@Test(priority = 5, enabled = true)
public void Complaints5() throws Throwable {
	HomePage HomePage = new HomePage(driver);
	HomePage.getViewcomplaintsoption().click();
	Thread.sleep(2000);
	TakeScreenShot("./screenshots/Complaints/005ViewComplaints.png");
}	
	

@AfterMethod
	public void windowClose() {
		driver.close();
	}	
}

