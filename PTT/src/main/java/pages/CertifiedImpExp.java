package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import config.OR;
import test.PTTDriverClass;

public class CertifiedImpExp {

	WebDriver driver;
	public static String FTARequestNo;

	@FindBy(xpath = "//*[@id='signin-link']/strong")
	static WebElement liLogin;
	@FindBy(xpath = "//*[@id='sUserId']")
	static WebElement txtLoginId;

	@FindBy(xpath = "//*[@id='sUserPassword']")
	static WebElement txtPassword;
	@FindBy(xpath = "//*[@id='signin-dropdown']/form/table/tbody/tr[6]/td/input")
	static WebElement btnLoginInUcustoms;
	@FindBy(xpath = "/html/body/div[3]/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a") //// *[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a

	static WebElement liSignOut;
	// ---------------------------------------Menu-------
	@FindBy(xpath = "//*[@id=\"mb_TradeFacilitation\"]/a")
	static WebElement menuTradeFacilitation;
	@FindBy(partialLinkText = "PTT")
	static WebElement subMenuPTT;
	@FindBy(partialLinkText = "Approved Certified Exporter Details")
	static WebElement nestedSubMenuApprovedCertifiedExporterDetails;

	// Importer nested sub menu
	@FindBy(partialLinkText = "Approved Certified Importer Details")
	static WebElement nestedSubMenuApprovedCertifiedImporterDetails;

	// ---------------------------------------New IMPORTER / EXPORTER-------

	@FindBy(xpath = "//*[@id=\"sbtnCreateNew\"]")
	static WebElement btnCreateNew; // Click on New (+) icon to create APPROVED CERTIFIED EXPORTER DETAILS
	@FindBy(xpath = "//*[@id=\"txtMemberState\"]")
	static WebElement txtMemberState; // Enter Member State %%
	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li[1]/a")
	static WebElement autocompletediv; // Select Member State
	@FindBy(xpath = "//*[@id=\"btnCreate\"]")
	static WebElement btnCreate; // Click on Create button

	// IMPORTER / EXPORTER LIST
	// @FindBy(xpath = "//*[@id=\"sbtnCreateNew\"]")
	// static WebElement btnCreateNew; // Click on NEW (+) icon from IMPORTER /
	// EXPORTER List sub list
	@FindBy(xpath = "//*[@id=\"frame_PTTCertifiedImpExpDetailsFrPg\"]")
	static WebElement frame_PTTCertifiedImpExpDetailsFrPg; // Switch iFrame EXPORTER DETAILS
	@FindBy(xpath = "//*[@id=\"txtCmpRegNo\"]")
	static WebElement txtCmpRegNo; // Enter Company Registration No.
	@FindBy(xpath = "//*[@id=\"txtLegalNameofCmp\"]")
	static WebElement txtLegalNameofCmp; // Enter Legal Name of Company
	@FindBy(xpath = "//*[@id=\"txtLocAddress\"]")
	static WebElement txtLocAddress; // Enter Company Location / Address
	@FindBy(xpath = "//*[@id=\"txtAuthorzationCode\"]")
	static WebElement txtAuthorzationCode; // Enter Authorization Code
	@FindBy(xpath = "//*[@id=\"txtIssuanceDateDatePicker\"]")
	static WebElement txtIssuanceDateDatePicker; // Click on Issuance Date icon
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[1]")
	static WebElement dateSelect; // Click on 1 Nov 2020
	@FindBy(xpath = "//*[@id=\"btnCreate\"]")
	static WebElement btnCreateImpExp; // Click on Create Button IMPORTER / EXPORTER DETAILS
	@FindBy(xpath = "//*[@id=\"submitbutton1\"]")
	static WebElement btnActivate; // Click on Activate button IMPORTER / EXPORTER DETAILS
	@FindBy(id = "btnClose")
	static WebElement btnClose; // Click on Close button IMPORTER / EXPORTER DETAILS
	// *[@id="submitbutton1"] Click on Activate button APPROVED CERTIFIED IMPORTER /
	// EXPORTER DETAILS
	@FindBy(xpath = "//*[@id=\"btnCancel\"]")
	static WebElement btnBack; // Click on Back button APPROVED CERTIFIED IMPORTER / EXPORTER DETAILS

	public CertifiedImpExp(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this); // This initElements method will create all WebElements

	}

	public static void switchParentFrame(String testData) {

		try {
			OR.driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;
		}
	}

	public static void navigateToURL(String testData) {

		try {
			OR.driver.get(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;
		}
	}

	@FindBy(id = "userNameInput")
	static WebElement txtUserName;
	@FindBy(id = "passwordInput")
	static WebElement txtpasswordInput;
	@FindBy(id = "submitButton")
	static WebElement btnsubmitButton;

	public static void setLoginId(String testData) {
		try {
			// liLogin.click();
			// // txtLoginId.clear();
			// txtLoginId.sendKeys(testData);

			// UAT
			txtUserName.clear();
			txtUserName.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;
		}
	}

	public static void setPassword(String testData) {
		try {
			Thread.sleep(500);
			// txtPassword.clear();
			// txtPassword.sendKeys(testData);
			txtpasswordInput.clear();
			txtpasswordInput.sendKeys(testData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;
		}
	}

	public static void clickLoginBtn(String testData) {
		try {
			// btnLoginInUcustoms.click();
			// UAT
			btnsubmitButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickSignOut(String testData) {
		try {

			OR.driver.switchTo().defaultContent();
			liSignOut.click();
			// OR.driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;
		}
	}

	// ----------------------------Menu -------------------------
	public static void clickTradeFacilitationMenu(String testData) {
		try {
			OR.driver.switchTo().defaultContent();
			menuTradeFacilitation.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickPTTSubMenu(String testData) {
		try {
			subMenuPTT.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickApprovedCertifiedExporterDetailsNestedSubMenu(String testData) {
		try {

			nestedSubMenuApprovedCertifiedExporterDetails.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickApprovedCertifiedImporterDetailsNestedSubMenu(String testData) {
		try {

			nestedSubMenuApprovedCertifiedImporterDetails.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	// ---------------------------------------New IMPORTER / EXPORTER-------

	public static void clickCreateNew(String testData) {
		try {

			btnCreateNew.click();  // Click on New (+) icon to create APPROVED CERTIFIED EXPORTER DETAILS
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setMemberState(String testData) {
		try {

			txtMemberState.sendKeys(testData);  // Enter Member State %%
			autocompletediv.click();   // Select Member State
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickCreatebtn(String testData) {
		try {

			btnCreate.click();   //Click on Create button
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	// IMPORTER / EXPORTER LIST
	
	public static void setCompanyRegistrationNo(String testData) {
		try {

			OR.driver.switchTo().frame(frame_PTTCertifiedImpExpDetailsFrPg);  // Switch iFrame IMPORTER / EXPORTER DETAILS
			
			txtCmpRegNo.sendKeys(testData);   //Enter Company Registration No.
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setLegalNameofCmp(String testData) {
		try {

			txtLegalNameofCmp.sendKeys(testData);   //Enter Legal Name of Company
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setLocAddress(String testData) {
		try {

			txtLocAddress.sendKeys(testData);   // Enter Company Location / Address
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setAuthorzationCode(String testData) {
		try {

			txtAuthorzationCode.sendKeys(testData);    // Enter Authorization Code
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickIssuanceDateDate(String testData) {
		try {

			txtIssuanceDateDatePicker.click(); // Click on Issuance Date icon
			dateSelect.click();// Click on 1 Nov 2020
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickCreateImpExp(String testData) {
		try {

			btnCreateImpExp.click();    // Click on Create Button IMPORTER / EXPORTER DETAILS
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickActivate(String testData) {
		try {

			btnActivate.click();   // Click on Activate button IMPORTER / EXPORTER DETAILS
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickClose(String testData) {
		try {

			btnClose.click();    // Click on Close button IMPORTER / EXPORTER DETAILS
			
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}		
		
	public static void clickBack(String testData) {
		try {

			btnBack.click();    // Click on Close button IMPORTER / EXPORTER DETAILS
			
	} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}		
		
		
	

}
