package vendorLogin;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.HomePage;
public class Payments extends Baseclass {
	
@BeforeMethod
	public void weblogin() throws Throwable {
					WebApplicationLogin();
					HomePage HomePage = new HomePage(driver);
					HomePage.getPaymentbutton().click();
}					
					
@Test(priority = 1, enabled = true)
public void Payments1() throws Throwable {
			PaymentSummaryDetails();
			TakeScreenShot("./screenshots/Payments/001PaymentSummaryDetails.png");
}

@Test(priority = 2, enabled = true)
public void Payments2() throws Throwable {
			PaymentHistoryDetails();
			TakeScreenShot("./screenshots/Payments/002PaymentHistoryList.png"); 
}


@AfterMethod
public void windowClose() {
	driver.close();
}	

}