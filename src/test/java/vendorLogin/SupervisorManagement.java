package vendorLogin;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.CreateSupervisorPage;
import com.cotyledon.pys.pomrepository.HomePage;
public class SupervisorManagement extends Baseclass {
	
@BeforeMethod
public void weblogin() throws Throwable {
		WebApplicationLogin();
		HomePage HomePage = new HomePage(driver);
		HomePage.getSupervisormanagementoption().click();
		Thread.sleep(1000);		
	}

@Test(priority = 1, enabled = true)
public void SupervisorManagement1() throws Throwable {
	TakeScreenShot("./screenshots/SupervisorManagement/001SupervisorManagementDropDown.png"); 
    //+timestamp()+"  
	}

@Test(priority = 2, enabled = true)
public void SupervisorManagement2() throws Throwable {
	SupervisorCreateSupervisor(fileUtils.readTheDataFromPropertyFile("supervisorname"), 
			fileUtils.readTheDataFromPropertyFile("supervisormailid"), 
			fileUtils.readTheDataFromPropertyFile("supervisorcontactno"));
	Thread.sleep(500);
	CreateSupervisorPage CreateSupervisorPage = new CreateSupervisorPage(driver);
	CreateSupervisorPage.getAddsupervisorbutton().click();Thread.sleep(500);
	TakeScreenShot("./screenshots/SupervisorManagement/002CreateSupervisor.png"); 
	}

@Test(priority = 3, enabled = true)
public void SupervisorManagement3() throws Throwable {
	SupervisorCreateSupervisor(fileUtils.readTheDataFromPropertyFile("supervisorname"), 
			fileUtils.readTheDataFromPropertyFile("wrongsupervisormailid"), 
			fileUtils.readTheDataFromPropertyFile("supervisorcontactno1"));
	Thread.sleep(500);
	CreateSupervisorPage CreateSupervisorPage = new CreateSupervisorPage(driver);
	CreateSupervisorPage.getAddsupervisorbutton().click();Thread.sleep(500);
	TakeScreenShot("./screenshots/SupervisorManagement/003EmailWithout.com(or).in Atend.png");
	}

@Test(priority = 4, enabled = true)
public void SupervisorManagement4() throws Throwable {
	SupervisorCreateSupervisor(fileUtils.readTheDataFromPropertyFile("supervisorname1"), 
			fileUtils.readTheDataFromPropertyFile("supervisormailid1"), 
			fileUtils.readTheDataFromPropertyFile("supervisorexistingcontactno"));
	CreateSupervisorPage createSupervisorPage = new CreateSupervisorPage(driver);
	createSupervisorPage.getAddsupervisorbutton().click();Thread.sleep(1000);
	TakeScreenShot("./screenshots/SupervisorManagement/004ExistingMobileNumber .png");
	WebElement failed = createSupervisorPage.getSupervisorcreatefailed();
if (failed.isDisplayed()) {
	System.out.println("The test case failed as expected.Which indicates the test scenario SupervisorManagement4 passed.");
}
else {System.out.println("There seems to be an error.");}
	}

@Test(priority = 5, enabled = true)
public void SupervisorManagement5() throws Throwable {
	
	SupervisorCreateSupervisor("", fileUtils.readTheDataFromPropertyFile("supervisormailid1"), 
			fileUtils.readTheDataFromPropertyFile("supervisorcontactno1"));
	TakeScreenShot("./screenshots/SupervisorManagement/005EmptyNameField .png");
	}

@Test(priority = 6, enabled = true)
public void SupervisorManagement6() throws Throwable {
	
	SupervisorCreateSupervisor(fileUtils.readTheDataFromPropertyFile("supervisorname1"), "", 
			fileUtils.readTheDataFromPropertyFile("supervisorcontactno1"));
	TakeScreenShot("./screenshots/SupervisorManagement/006EmptyEmailField .png"); 
	}

@Test(priority = 7, enabled = true)
public void SupervisorManagement7() throws Throwable {
	
	SupervisorCreateSupervisor(fileUtils.readTheDataFromPropertyFile("supervisorname1"), 
			fileUtils.readTheDataFromPropertyFile("supervisormailid1"), "");
	TakeScreenShot("./screenshots/SupervisorManagement/007EmptyContactNumberField .png");
	}

@Test(priority = 8, enabled = true)
public void SupervisorManagement8() throws Throwable {
	
	SupervisorCreateSupervisor(fileUtils.readTheDataFromPropertyFile("supervisorname1"), 
			fileUtils.readTheDataFromPropertyFile("existingsupervisormailid"), 
			fileUtils.readTheDataFromPropertyFile("supervisorcontactno1"));
	TakeScreenShot("./screenshots/SupervisorManagement/008ExistingEmailID.png"); 
	}

@Test(priority = 9, enabled = true)
public void SupervisorManagement9() throws Throwable {
	SupervisorViewSupervisor();
	TakeScreenShot("./screenshots/SupervisorManagement/009ViewSupervisorScreen.png");
	}

@Test(priority = 10, enabled = true)
public void SupervisorManagement10() throws Throwable {
	
	SupervisorViewSupervisor();
	DeleteSupervisorConfirmButton();
	TakeScreenShot("./screenshots/SupervisorManagement/010DeleteSupervisor1.png"); 
	}

@Test(priority = 11, enabled = true)
public void SupervisorManagement11() throws Throwable {
	
	SupervisorViewSupervisor();
	DeleteSupervisorCancelButton();
	TakeScreenShot("./screenshots/SupervisorManagement/011DeleteSupervisor2.png");
	}


@AfterMethod
public void windowClose() {
	driver.close();
	}	
}
