package vendorLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
public class ReportGeneration extends Baseclass {

@BeforeMethod
	public void weblogin() throws Throwable {WebApplicationLogin();VendorwiseReportBeforeMethod();}

@Test(priority = 1, enabled = true)
public void VendorWiseReoprt1() throws Throwable {
	VendorwiseReportDownload();
	TakeScreenShot("./screenshots/ReportGeneration/001VendorWiseReport.png");
}



@AfterMethod
public void windowClose() {
	driver.close();
}	

}