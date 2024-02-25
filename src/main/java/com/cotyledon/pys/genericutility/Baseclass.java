package com.cotyledon.pys.genericutility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cotyledon.pys.pomrepository.CreateSlotsPage;
import com.cotyledon.pys.pomrepository.CreateSupervisorPage;
import com.cotyledon.pys.pomrepository.HomePage;
import com.cotyledon.pys.pomrepository.ImageUploadPage;
import com.cotyledon.pys.pomrepository.PaymentHistoryPage;
import com.cotyledon.pys.pomrepository.PaymentSummarypage;
import com.cotyledon.pys.pomrepository.SigninPage;
import com.cotyledon.pys.pomrepository.VendorwiseRepotPage;
import com.cotyledon.pys.pomrepository.ViewBookingsPage;
import com.cotyledon.pys.pomrepository.ViewSlotsPage;
import com.cotyledon.pys.pomrepository.ViewSupervisorPage;

public class Baseclass {
	public WebDriver driver;
	public FileUtility fileUtils = new FileUtility();
	public WebDriverUtility webdriverUtils = new WebDriverUtility();
	public ExcelUtility ExcelUtility = new ExcelUtility();
	public JavaUtility JavaUtility = new JavaUtility();

//Method for Browser Launch
		 public void BrowserLaunch(int BrowserValue) throws Throwable {
			 int BrowserName = BrowserValue;
			 switch (BrowserName) {
			  case 1:
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			    break;
			  case 2:
		 		driver= new ChromeDriver();
		 		driver.manage().window().maximize();
				 break;
			  case 3:
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);RobotEnter();
				  break;
			 }
	 }
	
//Opening Browser and Signin to PYS testvendor login web application with proper credentials.
	 public void WebApplicationLogin() throws Throwable {
		 	BrowserLaunch(2);
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	 		SigninPage SigninPage = new SigninPage(driver);
	 		driver.get(fileUtils.readTheDataFromPropertyFile("URL"));
	 		SigninPage.getEmailormobilefield().sendKeys(fileUtils.readTheDataFromPropertyFile("mobileno"));
	 		SigninPage.getPasswordfield().sendKeys(fileUtils.readTheDataFromPropertyFile("password"));
	 		SigninPage.getLoginbutton().click();
	 		Thread.sleep(1000);
	 }
	 	 
//Quitting the web browser.
		public void ExecuteAfterMethod() {
			driver.manage().window().minimize();
			driver.quit();
		}
		
//Method for clicking on view bookings and giving first sub activity and selecting from and to dates.
		public void BookingsBeforeMethod() throws Throwable {
			HomePage HomePage = new HomePage(driver);
			HomePage.getBookingsbutton().click();
			HomePage.getViewbookingsbutton().click();
			ViewBookingsPage ViewBookingsPage = new ViewBookingsPage(driver);
			ViewBookingsPage.getSubactivitydropdown().click();Thread.sleep(1000);
			ViewBookingsPage.getBadmintonoption().click();Thread.sleep(1000);
			ViewBookingsPage.getFromdatecalenderdropdown().click();
			EffectiveFromDateCalender(fileUtils.readTheDataFromPropertyFile("BookingsStartDate"), fileUtils.readTheDataFromPropertyFile("BookingsMonthAndYear"));
			Thread.sleep(1000);ViewBookingsPage.getTodatecalenderdropdown().click();
			EffectiveToDateCalender(fileUtils.readTheDataFromPropertyFile("BookingsEndDate"), fileUtils.readTheDataFromPropertyFile("BookingsMonthAndYear"));
			Thread.sleep(2000);
		}
		
//Method for clicking image gallery and clicking on upload image dropdown and clicking Image type.		
		public void ImageGalleryBeforeMethod() throws Throwable {
			HomePage HomePage = new HomePage(driver);
			HomePage.getImagegallerybutton().click();
			HomePage.getUploadimagebutton().click();
			ImageUploadPage ImageUploadPage = new ImageUploadPage(driver);
			ImageUploadPage.getImagetypedropdown().click();Thread.sleep(1000);
		}
				
//Method for going to login page in firefox browser.
		public void LoginBeforeMethod() throws Throwable {
			BrowserLaunch(2);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			driver.get(fileUtils.readTheDataFromPropertyFile("URL"));
			
		}
	
//Method for input of email, password and clicking submit button in login page.
		public void LoginScenarios(String mobileno, String password) throws Throwable {
			SigninPage SigninPage = new SigninPage(driver);
			SigninPage.getEmailormobilefield().sendKeys(mobileno);
			SigninPage.getPasswordfield().sendKeys(password);
			SigninPage.getLoginbutton().click();Thread.sleep(2000);
		}
			
//Method for going to forgot password page to input mobile number and clicking send OTP to 
//typing new password, confirm password and entering OTP using scanner class.
		public void ForgetPasswordScenarios(String mobileno, String newpassword, String confirmpassword) throws Throwable {
			SigninPage SigninPage = new SigninPage(driver);
			SigninPage.getForgotpasswordlink().click();
			SigninPage.getForgotpasswordmobileno().sendKeys(mobileno);
			SigninPage.getSendOTPButton().click();
			SigninPage.getForgotpasswordnewpassword().sendKeys(newpassword); 
			SigninPage.getForgotpasswordconfirmpassword().sendKeys(confirmpassword);
		    @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
		    System.out.print("TYPE THE OTP: ");
		    String otp=scanner.next();
		    SigninPage.getForgotpasswordOTP().sendKeys(otp);
		    SigninPage.getForgotpasswordUpdateButton().click();
		    Thread.sleep(1000);
		}
			
//Method for entering mobile number and clicking send OTP button.		
		public void ForgetPasswordPageScenarios(String mobileno) throws Throwable {
			SigninPage SigninPage = new SigninPage(driver);
			SigninPage.getForgotpasswordlink().click();
			SigninPage.getForgotpasswordmobileno().sendKeys(mobileno);
			SigninPage.getSendOTPButton().click();
		    Thread.sleep(1000);
		}
			
//Method for going to page with payment summary details.		
		public void PaymentSummaryDetails() throws Throwable {
			PaymentSummarypage PaymentSummarypage = new PaymentSummarypage(driver);
			PaymentSummarypage.getPaymentsummarydetails().click();
			PaymentSummarypage.getPaymentsummarydetailsdropdown().click();
		}
				
//Method for going to payment history and selecting respective sub activity and from date.
		public void PaymentHistoryDetails() throws InterruptedException {
			HomePage HomePage = new HomePage(driver);
			PaymentHistoryPage PaymentHistoryPage = new PaymentHistoryPage(driver);
			HomePage.getPaymenthistoryoption().click();
			PaymentHistoryPage.getSubactivitydropdown().click();
			PaymentHistoryPage.getBadmintonoption().click();Thread.sleep(500);
			PaymentHistoryPage.getFromdatecalenderdropdown().click();
			PaymentHistoryPage.getSelectdateas1().click();
			Thread.sleep(2000);
		}
				
//Method for changing password by clicking profile photo button.		
		public void ChangePasswordInDashboard(String currentpassword, String newpassword, String confirmpassword) throws Throwable {
			HomePage HomePage = new HomePage(driver);
			HomePage.getProfileButton().click();
			HomePage.getChangepasswordlink().click();
			HomePage.getCurrentpasswordtextfield().sendKeys(currentpassword);
			HomePage.getNewpasswordtextfield().sendKeys(newpassword);
			HomePage.getConfirmnewpasswordfield().sendKeys(confirmpassword);
			HomePage.getUpdatepasswordbutton().click();
			Thread.sleep(2000);
		}
				
//Method for clicking the particular vendor booking details summary.
		public void DashboardDropDown(String pastdayvalue) throws Throwable {
			HomePage HomePage = new HomePage(driver);Thread.sleep(1000);
			HomePage.getDashboardcalenderdropdown().click();Thread.sleep(1000);
			String pastday1 = pastdayvalue;
			CreateSlotsPage CreateSlotsPage = new CreateSlotsPage(driver);
			CreateSlotsPage.getLeftarrowbutton().click();Thread.sleep(500);
			driver.findElement(By.xpath("//button[normalize-space()=" + pastday1 + "]")).click();

		}
				
//Method for scrolling down the window.		
		public void ScrollWindow1() throws Throwable {
			JavascriptExecutor JavascriptExecutor = (JavascriptExecutor) driver;
			JavascriptExecutor.executeScript(fileUtils.readTheDataFromPropertyFile("ScrollRate"), "");
			Thread.sleep(1000);
		}
		
//Method for going to vendor wise report generation.
		public void VendorwiseReportBeforeMethod() throws Throwable {
			HomePage HomePage = new HomePage(driver);
			HomePage.getReportgenerationbutton().click();
			HomePage.getVendorwisereportoption().click();Thread.sleep(1000);
		}
				
//Method for going to vendor wise report download for a certain dates.	
		public void VendorwiseReportDownload() throws Throwable  {
			VendorwiseRepotPage VendorwiseRepotPage = new VendorwiseRepotPage(driver);
			VendorwiseRepotPage.getFromdatecalenderdropdown().click();
			VendorwiseRepotPage.getSelectdateas1().click();
			VendorwiseRepotPage.getTodatecalenderdropdown().click();
			VendorwiseRepotPage.getSelectdateas28().click();Thread.sleep(1000);
			VendorwiseRepotPage.getDownloadbutton().click();Thread.sleep(3000);RobotEnter();
		}
		
//Method for creating supervisor with given credentials.
		public void SupervisorCreateSupervisor(String SupervisorName, String SupervisorEmailID, String SupervisorPhoneno) throws Throwable{
			HomePage HomePage = new HomePage(driver);
			HomePage.getCreatesupervisorbutton().click();
			CreateSupervisorPage CreateSupervisorPage = new CreateSupervisorPage(driver);
			CreateSupervisorPage.getSupervisornametextfield().sendKeys(SupervisorName);
			CreateSupervisorPage.getSupervisoremailidtextfield().sendKeys(SupervisorEmailID);
			CreateSupervisorPage.getContactnofield().sendKeys(SupervisorPhoneno);
		}
		
//Method for clicking view supervisor button.		
		public void SupervisorViewSupervisor() throws Throwable {
			HomePage HomePage = new HomePage(driver);
			HomePage.getViewsupervisoroption().click();
			Thread.sleep(2000);
		}
				
//Method for deleting supervisor and clicking confirm button.		
		public void DeleteSupervisorConfirmButton() throws Throwable {
			ViewSupervisorPage ViewSupervisorPage = new ViewSupervisorPage(driver);
			ViewSupervisorPage.getDeletesupervisorbutton().click();Thread.sleep(2000);
			ViewSupervisorPage.getClickconfirmbutton().click();Thread.sleep(2000);
		}
				
//Method for deleting supervisor and clicking cancel button.		
		public void DeleteSupervisorCancelButton() throws Throwable {
			ViewSupervisorPage ViewSupervisorPage = new ViewSupervisorPage(driver);
			ViewSupervisorPage.getDeletesupervisorbutton2().click();
			Thread.sleep(2000);ViewSupervisorPage.getClickcancelbutton().click();	
		}
				
//Method for taking screenshot and storing the file in certain location.	
		public void TakeScreenShot(String location) throws Throwable {
			TakesScreenshot Javascript = (TakesScreenshot)driver;
		    File source = Javascript.getScreenshotAs(OutputType.FILE);
		    File target = new File(location);
		    FileUtils.copyFile(source, target);
		}
		
//Method for uploading Gallery image.
		public void UploadGalleryImage() throws Throwable {
			ImageUploadPage ImageUploadPage = new ImageUploadPage(driver);
			ImageUploadPage.getGalleryimage().click();Thread.sleep(1000);
			ImageUploadPage.getSubactivitiesdropdown().click();
			ImageUploadPage.getBadmintonoption().click();Thread.sleep(7000);
			ImageUploadPage.getFilechoosinglink().sendKeys(fileUtils.readTheDataFromPropertyFile("galleryimage"));
			Thread.sleep(1000);ScrollWindow1();
			ImageUploadPage.getUploadbutton().click();Thread.sleep(2000);
	}
		
//Method for deleting the first image in the gallery image.
		public void DeleteGalleryImage() throws Throwable {
			ImageUploadPage ImageUploadPage = new ImageUploadPage(driver);
			ImageUploadPage.getGalleryimage().click();Thread.sleep(1000);
			ImageUploadPage.getSubactivitiesdropdown().click();
			ImageUploadPage.getBadmintonoption().click();Thread.sleep(10000);
			ImageUploadPage.getImagedeletebutton().click();Thread.sleep(2000);
		}
				
//Method for uploading Profile image.
		public void UploadProfileImage() throws Throwable {
		ImageUploadPage ImageUploadPage = new ImageUploadPage(driver);
		ImageUploadPage.getProfileimage().click();Thread.sleep(2000);
		ImageUploadPage.getFilechoosinglink().sendKeys(fileUtils.readTheDataFromPropertyFile("profileimage"));
		Thread.sleep(2000);ImageUploadPage.getUploadbutton().click();Thread.sleep(3000);
	}	
		
//Method for uploading Vendor Banner.	
		public void UploadVendorBanner() throws Throwable {
		ImageUploadPage ImageUploadPage = new ImageUploadPage(driver);
		ImageUploadPage.getVendorbanner().click();Thread.sleep(2000);
		ImageUploadPage.getFilechoosinglink().sendKeys(fileUtils.readTheDataFromPropertyFile("vendorbanner"));
		Thread.sleep(2000);ImageUploadPage.getUploadbutton().click();Thread.sleep(3000);
	}		

//Method for calender from Effective From Date.	
		public void EffectiveFromDateCalender(String fromdayvalue, String monthyearvalue) throws Throwable {
		String fromday = fromdayvalue;
		String monthyear = monthyearvalue;
		for (;;) {
			CreateSlotsPage CreateSlotsPage = new CreateSlotsPage(driver);
			String monthyeartext = CreateSlotsPage.getMonthyeartext().getText();
			if (monthyeartext.equalsIgnoreCase(monthyear)) {
				break;
			} else {
				CreateSlotsPage.getRightArrowbutton().click();
					}
				}
			driver.findElement(By.xpath("//button[normalize-space()=" + fromday + "]")).click();
		}
			
		
//Method for calender from Effective To Date.	
		public void EffectiveToDateCalender(String enddayvalue, String monthyearvalue) throws Throwable {
			String endday = enddayvalue;
			String monthyear = monthyearvalue;
			for (;;) {
				CreateSlotsPage CreateSlotsPage = new CreateSlotsPage(driver);
				String monthyeartext = CreateSlotsPage.getMonthyeartext().getText();
				if (monthyeartext.equalsIgnoreCase(monthyear)) {
					break;
				} else {
					CreateSlotsPage.getRightArrowbutton().click();
				}
			}
			driver.findElement(By.xpath("//button[normalize-space()=" + endday + "]")).click();
		}
		
//Method for calender dropdown left arrow
		public void CalenderLeftArrow(String pastdayvalue) {
			String pastday = pastdayvalue;
			CreateSlotsPage CreateSlotsPage = new CreateSlotsPage(driver);
			CreateSlotsPage.getLeftarrowbutton().click();
			driver.findElement(By.xpath("//button[normalize-space()=" + pastday + "]")).click();
		}
		
//Method for find the one booked date in past
			

		
//Method for selecting date as 30.		
		public void Date() {
			driver.findElement(By.xpath("//button[normalize-space()='30']")).click();
		}
		
////////////// Start of robot class 	
//Method for robotclass Escape button in keyboard.
		public void RobotEscape() throws Throwable {
			Robot Robot = new Robot();
	     	Robot.keyPress(KeyEvent.VK_ESCAPE);Robot.keyRelease(KeyEvent.VK_ESCAPE);
		}
	
//Method for robotclass Tab button in keyboard.
		public void RobotTab() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_TAB);Robot.keyRelease(KeyEvent.VK_TAB);
		}
	
//Method for robotclass Enter button in keyboard.
		public void RobotEnter() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_ENTER);Robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
//Method for robotclass Up Arrow button in keyboard.		
		public void RobotUpArrow() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_UP);Robot.keyRelease(KeyEvent.VK_UP);
		}	

//Method for robotclass Down Arrow button in keyboard.		
		public void RobotDownArrow() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_DOWN);Robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
//Method for robotclass Left Arrow button in keyboard.
		public void RobotLeftArrow() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_LEFT);Robot.keyRelease(KeyEvent.VK_LEFT);
		}

//Method for robotclass Right Arrow button in keyboard.
		public void RobotRightArrow() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_RIGHT);Robot.keyRelease(KeyEvent.VK_RIGHT);
		}

//Method for robotclass capital letter 'L' button in keyboard.
		public void RobotL() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_SHIFT);
			Robot.keyPress(KeyEvent.VK_L);Robot.keyRelease(KeyEvent.VK_L);
			Robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		
//Method for robotclass capital letter 'O' button in keyboard.
		public void RobotO() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_SHIFT);
			Robot.keyPress(KeyEvent.VK_O);Robot.keyRelease(KeyEvent.VK_O);
			Robot.keyRelease(KeyEvent.VK_SHIFT);
		}	

//Method for robotclass small letter 'o' button in keyboard.
		public void Roboto() throws Throwable {
			Robot Robot = new Robot();
			Robot.keyPress(KeyEvent.VK_O);Robot.keyRelease(KeyEvent.VK_O);
		}
	
//Method for robotclass capital letter 'G' button in keyboard.
		public void RobotG() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyPress(KeyEvent.VK_G);Robot.keyRelease(KeyEvent.VK_G);
		Robot.keyPress(KeyEvent.VK_SHIFT);
		}
		
//Method for robotclass small letter 'g' button in keyboard.
		public void Robotg() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_G);Robot.keyRelease(KeyEvent.VK_G);
				}		
						
//Method for robotclass Back Space button in keyboard.
		public void RobotBackSpace() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_BACK_SPACE);Robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		}		
		
//Method for robotclass exit locking keys button in keyboard.
//Method for robotclass escaping lock of keys in keyboard.
		public void RobotExitLockingKeys() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_CONTROL);Robot.keyPress(KeyEvent.VK_SHIFT);
		Robot.keyRelease(KeyEvent.VK_SHIFT);Robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		
		
//Method for clearing the field using Robot class.
		public void RobotClearingField() throws Throwable {
		Robot Robot = new Robot();
		Robot.keyPress(KeyEvent.VK_CONTROL);
		Robot.keyPress(KeyEvent.VK_A);
		Robot.keyRelease(KeyEvent.VK_A);
		Robot.keyRelease(KeyEvent.VK_CONTROL);
		Robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
		
/////////////End of robot class
		
		
//Method for choosing dates for from list.
		public void ChoosingDaysForCreateSlotsPage(int dayvalue) {
			int day = dayvalue;
			CreateSlotsPage CreateSlotsPage = new CreateSlotsPage(driver);
			switch (day) {
			  case 1:
				CreateSlotsPage.getAllDaysCheckbox().click();
			    System.out.println("AllDays");
			    break;
			  case 2:
				CreateSlotsPage.getMondaycheckbox().click();  
			    System.out.println("Monday");
			    break;
			  case 3:
				CreateSlotsPage.getTuesdaycheckbox().click();  
			    System.out.println("Tuesday");
			    break;
			  case 4:
				CreateSlotsPage.getWEDNESDAYcheckbox().click();
			    System.out.println("Wednesday");
			    break;
			  case 5:
				  CreateSlotsPage.getTHURSDAYcheckbox().click();
			    System.out.println("Thursday");
			    break;
			  case 6:
				  CreateSlotsPage.getFRIDAYcheckbox().click();
			    System.out.println("Friday");
			    break;
			  case 8:
				  CreateSlotsPage.getSATURDAYcheckbox().click();
			    System.out.println("Saturday");
			    break;
			  case 9:
				  CreateSlotsPage.getSUNDAYcheckbox().click();
				    System.out.println("All Days");
				    break;
			  case 10:
				  CreateSlotsPage.getWEEKDAYScheckbox().click();
				    System.out.println("Week Days");
				    break;
			  case 11:
				  CreateSlotsPage.getWEEKENDcheckbox().click();
				    System.out.println("Week Ends");
				    break;
			}

		}
		
		
//Method for choosing days for Create Slots Page
		public void ChoosingDayForCreateSlotsPage() {
		CreateSlotsPage CreateSlotsPage = new CreateSlotsPage(driver);
		if (CreateSlotsPage.getAllDaysCheckbox().isDisplayed()){
			CreateSlotsPage.getAllDaysCheckbox().click();
		} else if (CreateSlotsPage.getMondaycheckbox().isDisplayed()) {
			CreateSlotsPage.getMondaycheckbox().click();
		} else if (CreateSlotsPage.getTuesdaycheckbox().isDisplayed()) {
			CreateSlotsPage.getTuesdaycheckbox().click();
		}else if (CreateSlotsPage.getWEDNESDAYcheckbox().isDisplayed()) {
			CreateSlotsPage.getWEDNESDAYcheckbox().click();
		}else if (CreateSlotsPage.getTHURSDAYcheckbox().isDisplayed()) {
			CreateSlotsPage.getTHURSDAYcheckbox().click();
		}else if (CreateSlotsPage.getFRIDAYcheckbox().isDisplayed()) {
			CreateSlotsPage.getFRIDAYcheckbox().click();
		}else if (CreateSlotsPage.getSATURDAYcheckbox().isDisplayed()) {
			CreateSlotsPage.getSATURDAYcheckbox().click();
		}else if (CreateSlotsPage.getSUNDAYcheckbox().isDisplayed()) {
			CreateSlotsPage.getSUNDAYcheckbox().click();
		}else if (CreateSlotsPage.getWEEKDAYScheckbox().isDisplayed()) {
			CreateSlotsPage.getWEEKDAYScheckbox().click();
		}else if (CreateSlotsPage.getWEEKENDcheckbox().isDisplayed()) {
			CreateSlotsPage.getWEEKENDcheckbox().click();
		}else {
			System.out.println("Nothing is Displayed");
		}
		}
		
//Method for choosing days for View Slots Page
		public void ChoosingDayForViewSlotsPage() {
			ViewSlotsPage ViewSlotsPage = new ViewSlotsPage(driver);
		if (ViewSlotsPage.getAllDaysCheckbox().isEnabled()){
			ViewSlotsPage.getAllDaysCheckbox().click();
		} else if (ViewSlotsPage.getMondaycheckbox().isEnabled()) {
			ViewSlotsPage.getMondaycheckbox().click();
		} else if (ViewSlotsPage.getTuesdaycheckbox().isEnabled()) {
			ViewSlotsPage.getTuesdaycheckbox().click();
		}else if (ViewSlotsPage.getWEDNESDAYcheckbox().isEnabled()) {
			ViewSlotsPage.getWEDNESDAYcheckbox().click();
		}else if (ViewSlotsPage.getTHURSDAYcheckbox().isEnabled()) {
			ViewSlotsPage.getTHURSDAYcheckbox().click();
		}else if (ViewSlotsPage.getFRIDAYcheckbox().isEnabled()) {
			ViewSlotsPage.getFRIDAYcheckbox().click();
		}else if (ViewSlotsPage.getSATURDAYcheckbox().isEnabled()) {
			ViewSlotsPage.getSATURDAYcheckbox().click();
		}else if (ViewSlotsPage.getSUNDAYcheckbox().isEnabled()) {
			ViewSlotsPage.getSUNDAYcheckbox().click();
		}else if (ViewSlotsPage.getWEEKDAYScheckbox().isEnabled()) {
			ViewSlotsPage.getWEEKDAYScheckbox().click();
		}else if (ViewSlotsPage.getWEEKENDcheckbox().isEnabled()) {
			ViewSlotsPage.getWEEKENDcheckbox().click();
		}
		}		
		
		
		
		
		
	
}

