package vendorLogin;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cotyledon.pys.genericutility.Baseclass;

public class LoginIDAndForgotPassword extends Baseclass{

@BeforeMethod
	public void weblogin() throws Throwable {
	LoginBeforeMethod();
}
@Test(priority = 1, enabled = true)
public void validIdvalidPassword() throws Throwable {
	LoginScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), fileUtils.readTheDataFromPropertyFile("password"));
	TakeScreenShot("./screenshots/Loginpage/001ValidIdValidPass.png");
    //+timestamp()+"
}

@Test(priority = 2, enabled = true)
public void inValidIdvalidPassword() throws Throwable {
	LoginScenarios(fileUtils.readTheDataFromPropertyFile("invalidmobileno"), fileUtils.readTheDataFromPropertyFile("password"));
	TakeScreenShot("./screenshots/Loginpage/002InValidIdValidPass.png");
}

@Test(priority = 3, enabled = true)
public void validIdInValidPassword() throws Throwable {
	LoginScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), fileUtils.readTheDataFromPropertyFile("invalidpassword"));
	TakeScreenShot("./screenshots/Loginpage/003ValidId InValidPassword.png");
}

@Test(priority = 4, enabled = true)
public void inValidIdInValidPassword() throws Throwable {
	LoginScenarios(fileUtils.readTheDataFromPropertyFile("invalidmobileno"), fileUtils.readTheDataFromPropertyFile("invalidpassword"));
	TakeScreenShot("./screenshots/Loginpage/004InValidIdInValidPassword.png");   
}

@Test(priority = 5, enabled = true)
public void noIdnoPass() throws Throwable {
	LoginScenarios("", "");
	TakeScreenShot("./screenshots/Loginpage/005NOId NoPassword.png");  
}

@Test(priority = 6, enabled = true)
public void validIdNoPassword() throws Throwable {
	LoginScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), "");
	TakeScreenShot("./screenshots/Loginpage/006ValidId NoPassword.png");
}

@Test(priority = 7, enabled = true)
public void noIdIdValidPassword() throws Throwable {
	LoginScenarios("", fileUtils.readTheDataFromPropertyFile("password"));
	TakeScreenShot("./screenshots/Loginpage/007NoIdValidPassword.png");   
}

@Test(priority = 8, enabled = true)
public void forgotpassword1() throws Throwable {
	ForgetPasswordScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), 
	fileUtils.readTheDataFromPropertyFile("newpassword"), 
	fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/ForgotPassword/008ForgotPassword.png");
}

@Test(priority = 9, enabled = true)
public void forgotpassword2() throws Throwable {
	ForgetPasswordPageScenarios("");
	TakeScreenShot("./screenshots/ForgotPassword/009NoPhnumberOrEmail.png"); 
}

@Test(priority = 10, enabled = true)
public void forgotpassword3() throws Throwable {
	ForgetPasswordPageScenarios(fileUtils.readTheDataFromPropertyFile("invalidmobileno"));
	TakeScreenShot("./screenshots/ForgotPassword/010IncorrectPhnumberOrEmail.png"); 
}

@Test(priority = 11, enabled = true)
public void forgotpassword4() throws Throwable {
	ForgetPasswordScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), 
			fileUtils.readTheDataFromPropertyFile("newpassword"), "");
	TakeScreenShot("./screenshots/ForgotPassword/011OnlyPasswordAndOTP.png"); 
}

@Test(priority = 12, enabled = true)
public void forgotpassword5() throws Throwable {
	ForgetPasswordScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), 
			fileUtils.readTheDataFromPropertyFile("newpassword"), 
			fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/ForgotPassword/012OnlyPasswordAndConfirmPassword.png");
}

@Test(priority = 13, enabled = true)
public void forgotpassword6() throws Throwable {
	ForgetPasswordScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), 
			fileUtils.readTheDataFromPropertyFile("newpassword"), 
			fileUtils.readTheDataFromPropertyFile("wrongconfirmpassword"));
	TakeScreenShot("./screenshots/ForgotPassword/013MismatchPasswordAndConfirmPassword.png"); 
}

@Test(priority = 14, enabled = true)
public void forgotpassword7() throws Throwable {
	ForgetPasswordScenarios(fileUtils.readTheDataFromPropertyFile("mobileno"), "", 
			fileUtils.readTheDataFromPropertyFile("confirmpassword"));
	TakeScreenShot("./screenshots/ForgotPassword/014OnlyConfirmPasswordAndOTP.png"); 
}


@AfterMethod
public void windowClose() {
	driver.close();
}
}
