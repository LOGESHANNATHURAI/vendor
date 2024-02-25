package com.cotyledon.pys.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blockslotpage {
	
	WebDriver driver;
	public Blockslotpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='Sub-Activity']")
	private WebElement subactivitydropdown;
	public WebElement getSubactivitydropdown() {
		return subactivitydropdown;
	}
	
	@FindBy(xpath = "//p[@aria-label='Badminton']")
	private WebElement Badmintonactivity;
	public WebElement getBadmintonactivity() {
		return Badmintonactivity;
	}
	
	@FindBy(xpath = "//div[@id='Slot Type']")
	private WebElement slottypedropdown;
	public WebElement getSlottypedropdown() {
		return slottypedropdown;
	}
	
	@FindBy(xpath = "//p[@aria-label='BADMINTON']")
	private WebElement badmintonslottype;
	public WebElement getBadmintonslottype() {
		return badmintonslottype;
	}
	
	@FindBy(xpath = "(//button[@type = 'button'])[4]")
	private WebElement datefield;
	public WebElement getDatefield() {
		return datefield;
	}
	
	@FindBy(xpath = "(//button[contains(text(),'2')])[1]")
	private WebElement SelectDateAs2;
	public WebElement getSelectDateAs2() {
		return SelectDateAs2;
	}

	@FindBy(xpath = "//button[normalize-space()='Multiple Block']")
	private WebElement multipleblockbutton;
	public WebElement getMultipleblockbutton() {
		return multipleblockbutton;
	}
	
	@FindBy(xpath = "//button[normalize-space()='Multiple UnBlock']")
    private WebElement multipleunblock;
	public WebElement getMultipleunblock() {
		return multipleunblock;
	}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement selectallcheckbox;
	public WebElement getSelectallcheckbox() {
		return selectallcheckbox;
	}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement firstcheckbox;
	public WebElement getFirstcheckbox() {
		return firstcheckbox;
	}
	
	@FindBy(xpath = "(//span[@class = 'css-1k5atgd'])[1]")
	private WebElement firstBlockOrUnblocksymbol;
	public WebElement getFirstBlockOrUnblocksymbol() {
		return firstBlockOrUnblocksymbol;
	}
	
	@FindBy(xpath = "(//div[@id=':ra7:'])[1]")
	private WebElement RowsPerpageDropDown;
	public WebElement getRowsPerpageDropDown() {
		return RowsPerpageDropDown;
	}
	
	@FindBy(xpath = "//li[normalize-space()='10']")
	private WebElement TenRowoption;
	public WebElement getTenRowoption() {
		return TenRowoption;
	}
	
	@FindBy(xpath = "//li[normalize-space()='20']")
	private WebElement TwentyRowoption;
	public WebElement getTwentyRowoption() {
		return TwentyRowoption;
	}
	
	@FindBy(xpath = "//li[normalize-space()='50']")
	private WebElement FiftyRowoption;
	public WebElement getFiftyRowoption() {
		return FiftyRowoption;
	}
	
	@FindBy(xpath = "//button[@title='Go to next page']//*[name()='svg']")
	private WebElement NextpageArrow;
	public WebElement getNextpageArrow() {
		return NextpageArrow;
	}
	
	@FindBy(xpath = "//*[@data-testid=\"CalendarIcon\"]")
	private WebElement datecalender;
	public WebElement getDatecalender() {
		return datecalender;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[4]")
	private WebElement fromdatecalender;
	public WebElement getFromdatecalender() {
		return fromdatecalender;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[5]")
	private WebElement todatecalender;
	public WebElement getTodatecalender() {
		return todatecalender;
	}
	
	@FindBy(xpath = "//input[@class = 'MuiInputBase-input MuiOutlinedInput-input css-yzm7vx']")
	private WebElement CommentTexArea;
	public WebElement getCommentTexArea() {
		return CommentTexArea;
	}

@FindBy(xpath = "//div[@id='demo-simple-select']")	
	private WebElement layoutbutton;
   	public WebElement getLayoutbutton() {
	return layoutbutton;
}
	
//	@FindBy(xpath = "(//input[@type='checkbox'])[38]")
//	private WebElement layoutA;
//	public WebElement getLayoutA() {
//		return layoutA;
//	}
	
//	@FindBy(xpath = "//li[normalize-space()='B']//input[@type='checkbox']")
//	private WebElement layoutB;
//	public WebElement getLayoutB() {
//		return layoutB;
//	}
	
	@FindBy(xpath = "(//input[@type='checkbox'])[40]")
	private WebElement layoutC;
	public WebElement getLayoutC() {
		return layoutC;
	}

	
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	private WebElement confirmbutton;
	public WebElement getConfirmbutton() {
		return confirmbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
