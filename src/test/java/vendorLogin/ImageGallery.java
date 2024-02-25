package vendorLogin;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;
import com.cotyledon.pys.pomrepository.ImageUploadPage;

public class ImageGallery extends Baseclass {

@BeforeMethod
public void weblogin() throws Throwable {WebApplicationLogin();ImageGalleryBeforeMethod();}

@Test(priority = 1, enabled = true)
public void UploadImageGallery1() throws Throwable {
			UploadGalleryImage();Thread.sleep(3000);
			TakeScreenShot("./screenshots/ImageGallery/001SelectingGalleryImage.png");
//+timestamp()+"  
}	

@Test(priority = 2, enabled = true)
public void UploadImage2() throws Throwable {
			DeleteGalleryImage();
			ImageUploadPage ImageUploadPage = new ImageUploadPage(driver);
			TakeScreenShot("./screenshots/ImageGallery/002DeletingGalleryImage1.png");
			ImageUploadPage.getGetPopupOkbutton().click();Thread.sleep(1000);
			TakeScreenShot("./screenshots/ImageGallery/002DeletingGalleryImage2.png");
}

@Test(priority = 3, enabled = true)
public void UploadImage3() throws Throwable {
	UploadProfileImage();
	TakeScreenShot("./screenshots/ImageGallery/003ProfileImage.png");    
}

@Test(priority = 4, enabled = true)
public void UploadImage4() throws Throwable {
	UploadVendorBanner();
	TakeScreenShot("./screenshots/ImageGallery/004VendorBanner.png");   
}

@AfterMethod
public void windowClose() {
	driver.close();
}	
	
}
