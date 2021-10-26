package pages;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.OR;
import test.PTTDriverClass;

public class PTTApprovalConditions {

	WebDriver driver;

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
	@FindBy(partialLinkText = "PTT Approval Conditions")
	static WebElement nestedSubMenuPTTApprovalCondition;

	@FindBy(partialLinkText = "Other Approval (Force Majeure) List")
	static WebElement nestedSubMenuOtherApproval;

	// -----------APPROVAL CONDITIONS LIST---
	 
	@FindBy(xpath = "//*[@id=\"sbtnCreateNew\"]")
	static WebElement btnCreateNew; // Click on NEW (+)

	// APPROVAL CONDITIONS FORM

	@FindBy(xpath = "//*[@id=\"txtGorupName\"]")
	static WebElement txtGorupName; // Enter Group Name PTT/0
	@FindBy(xpath = "//*[@id=\"txtAppcnd\"]")
	static WebElement txtAppcnd; // Enter Approval Condition
	@FindBy(xpath = "//*[@id=\"btnCreate\"]")
	static WebElement btnCreate; // Click on Create button
	@FindBy(xpath = "//*[@id=\"btnCancel\"]")
	static WebElement btnBack; // Click on Back button
	
//	OTHER APPROVAL (FORCE MAJEURE)
	@FindBy(xpath = "//*[@id=\"txtBRNIDNumber\"]")
	static WebElement txtBRNIDNumber; //BRN/NRIC No./Passport No. %%
	@FindBy(xpath = "//*[@id=\"autocompletediv\"]/li[1]/a")
	static WebElement autocompletediv; //
	@FindBy(xpath = "//*[@id=\"txtImporterName\"]")
	static WebElement txtImporterName; //Importer Name	
	@FindBy(xpath = "//*[@id=\"txtCountryOfOrigin\"]")
	static WebElement txtCountryOfOrigin; // Country of Origin	%%
	@FindBy(xpath = "//*[@id=\"txtFTAManagement\"]")
	static WebElement txtFTAManagement; //Free Trade Agreement (FTA)	%%
	@FindBy(xpath = "//*[@id=\"txtRemarks\"]")
	static WebElement txtRemarks; //Remarks
//	@FindBy(xpath = "//*[@id=\"btnCreate\"]")
//	static WebElement btnCreate; // CLick on Create button
	
//	ITEM DETAILS
	@FindBy(xpath = "//*[@id=\"frame_PTTOtherAppItemDetailsFrPg\"]")
	static WebElement frame_PTTOtherAppItemDetailsFrPg; //
	@FindBy(xpath = "//*[@id=\"txtFTAHSCode\"]")
	static WebElement txtFTAHSCode; //FTA HS Code	%%
	@FindBy(xpath = "//*[@id=\"txtTariffCode\"]")
	static WebElement txtTariffCode; // HS Code	%%
	@FindBy(xpath = "//*[@id=\"txtGoodsDescription\"]")
	static WebElement txtGoodsDescription; //Goods Description	
	@FindBy(xpath = "//*[@id=\"txtUOM\"]")
	static WebElement txtUOM; //UOM %%
	@FindBy(xpath = "//*[@id=\"txtItemQuantity\"]")
	static WebElement txtItemQuantity; // Item Quantity
	@FindBy(xpath = "//*[@id=\"txtItemValue\"]")
	static WebElement txtItemValue; //Item Value (RM)	
	@FindBy(xpath = "//*[@id=\"txtImportDutyvalue\"]")
	static WebElement txtImportDutyvalue; //Import Duty Value (RM)
	@FindBy(xpath = "//*[@id=\"txtPreferentilValue\"]")
	static WebElement txtPreferentilValue; //Preferential Duty Value (RM)	
//	@FindBy(xpath = "//*[@id=\"btnCreate\"]")
//	static WebElement btnCreate; //CLick oin Create button
	@FindBy(xpath = "//*[@id=\"btnClose\"]")
	static WebElement btnBackItemDetails; //CLick on Close button
	
//	PTT APPROVAL CONDITIONS
	@FindBy(xpath = "//*[@id=\"assocbttn\"]")
	static WebElement btnassoc; //Click on Associate button
	@FindBy(xpath = "//*[@id=\"frame_OtherPTTAppConditionsLsPg\"]")
	static WebElement frame_OtherPTTAppConditionsLsPg; //
	@FindBy(xpath = "//*[@id=\"chkallID1EAAAABA\"]")
	static WebElement chkall; //Select all PTT APPROVAL CONDITIONS
	@FindBy(xpath = "//*[@id=\"buttonID1EAAAABA\"]")
	static WebElement btnSaveAll; // Click on Save button
	@FindBy(xpath = "//*[@id=\"submitbutton1\"]")
	static WebElement btnSubmit; //Click on Submit OTHER APPROVAL (FORCE MAJEURE)
	@FindBy(xpath = "//*[@id=\"btnCancel\"]")
	static WebElement btnBackOtherApproval; // Click on Back button 
	

	public PTTApprovalConditions(WebDriver driver) {

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

	public static void clickPTTApprovalConditionNestedSubMenu(String testData) {
		try {

			nestedSubMenuPTTApprovalCondition.click();

			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickOtherApprovalNestedSubMenu(String testData) {
		try {

			nestedSubMenuOtherApproval.click();

			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	// -----------APPROVAL CONDITIONS LIST---------------

	public static void clickCreateNew(String testData) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");
			
			btnCreateNew.click(); // Click on NEW (+)

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	// APPROVAL CONDITIONS FORM

	public static void setGroupName(String testData) {
		try {
			
			Random rand = new Random();
			int value = rand.nextInt(100);
			String gName = Integer.toString(value);
			txtGorupName.sendKeys(testData+" "+gName); // Enter Group Name PTT/0
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setApprovalCondition(String testData) {
		try {
			txtAppcnd.sendKeys(testData); //  Enter Approval Condition
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickCreate(String testData) {
		try {
			btnCreate.click();  // Click on Create button
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickBack(String testData) {
		try {
			btnBack.click();  // Click on Back button
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

//	OTHER APPROVAL (FORCE MAJEURE)
	
	public static void setBRNIDNumber(String testData) {
		try {
			txtBRNIDNumber.sendKeys(testData);  // BRN/NRIC No./Passport No. %%
			autocompletediv.click(); //Select 1st Record.
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setImporterName(String testData) {
		try {
			txtImporterName.sendKeys(testData);  // Importer Name	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setCountryOfOrigin(String testData) {
		try {
			txtCountryOfOrigin.sendKeys(testData);  // Country of Origin	%%	
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setFTAManagement(String testData) {
		try {
			txtFTAManagement.sendKeys(testData);  // Free Trade Agreement (FTA)	%%	
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setRemarks(String testData) {
		try {
			txtRemarks.sendKeys(testData);  // Remarks
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

//	ITEM DETAILS
	public static void setFTAHSCode(String testData) {
		try {
			OR.driver.switchTo().frame(frame_PTTOtherAppItemDetailsFrPg);
			
			txtFTAHSCode.sendKeys(testData);  // FTA HS Code	%%
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setTariffCode(String testData) {
		try {			
			txtTariffCode.sendKeys(testData);  //  HS Code	%%
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setGoodsDescription(String testData) {
		try {			
			txtGoodsDescription.sendKeys(testData);  // Goods Description	
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,500)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setUOM(String testData) {
		try {			
			txtUOM.sendKeys(testData);  // UOM	%%
			autocompletediv.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setItemQuantity(String testData) {
		try {			
			txtItemQuantity.sendKeys(testData);  // Item Quantity	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setItemValue(String testData) {
		try {			
			txtItemValue.sendKeys(testData);  // Item Value	(RM)	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setImportDutyvalue(String testData) {
		try {			
			txtImportDutyvalue.sendKeys(testData);  // Import Duty Value (RM)	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void setPreferentilValue(String testData) {
		try {			
			txtPreferentilValue.sendKeys(testData);  // Preferential Duty Value (RM)	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickBackItemDetails(String testData) {
		try {			
			btnBackItemDetails.click();	
			
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe"); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
//	PTT APPROVAL CONDITIONS
	public static void clickAssociate(String testData) {
		try {		
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			btnassoc.click();	//Click on Associate button
			OR.driver.switchTo().frame(frame_OtherPTTAppConditionsLsPg);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickAllcheckBox(String testData) {
		try {			
			chkall.click();	//Select all PTT APPROVAL CONDITIONS
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickbtnSaveAll(String testData) {
		try {	
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			btnSaveAll.click();	//Click on Save button
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe"); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickbtnSubmit(String testData) {
		try {		
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			btnSubmit.click();//Click on Submit OTHER APPROVAL (FORCE MAJEURE)
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickbtnBackOtherApproval(String testData) {
		try {			
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			btnBackOtherApproval.click();// Click on Back button 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	
	
}
