package pages;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.OR;
import test.PTTDriverClass;

public class AgreementNameTypes {

	WebDriver driver;
	public static String AgreementName;

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
	@FindBy(xpath = "//*[@id=\"mb_Admin\"]/a")
	static WebElement menuAdmin;
	@FindBy(partialLinkText = "General")
	static WebElement subMenuGeneral;
	@FindBy(partialLinkText = "Types")
	static WebElement nestedSubMenuTypes;

	@FindBy(xpath = "//*[@id=\"1\"]")
	static WebElement txtNameMODULETYPES;// Search with Enter Name MODULETYPES
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[6]/td/div/input[1]")
	static WebElement btnSearchMODULETYPES; // Click on Search Button
	@FindBy(xpath = "//*[@id=\"List_TypesList_0_ID0EAABAAA\"]/a/i")
	static WebElement lnkOpenMODULETYPES; // Open Module Types from Types List Screen

	// TYPES ENTRIES sub list
	@FindBy(xpath = "//*[@id=\"_Search_icon\"]/img")
	static WebElement lnkSearchTypeEntries; // Click on Search icon from TYPES ENTRIES sub list
	@FindBy(xpath = "//*[@id=\"txtName\"]")
	static WebElement txtNameTypeEntries; // Enter Name TARIFFTYPES
	@FindBy(xpath = "//*[@id=\"SP_TypesEntriesList\"]/table[2]/tbody/tr[3]/td/input[1]")
	static WebElement btnSearchTypeEntries; // Click on Search button.
	@FindBy(xpath = "//*[@id=\"List_TypesEntriesList_0_ID1EBABAAA\"]/a/i")
	static WebElement lnkOpenTariff; // Click on Open TYPES ENTRIES.

	// AGREEMENTNAMETYPES
	@FindBy(xpath = "//*[@id=\"2\"]")
	static WebElement txtNameAGREEMENTNAMETYPES; // Enter Name AGREEMENTNAMETYPES
	@FindBy(xpath = "//*[@id=\"ID0EABBA\"]/td/table/tbody/tr/td/table/tbody/tr[6]/td/div/input[1]")
	static WebElement btnSearchAGREEMENTNAMETYPES; // Click on Search button
	@FindBy(xpath = "//*[@id=\"List_ModuleTypesList_0_common.edit\"]/a/i")
	static WebElement lnkOpenAGREEMENTNAMETYPES; // Open AgreementNameTypes

	@FindBy(xpath = "//*[@id=\"new1\"]")
	static WebElement btnNewAgreement; // Click on New button from MODULE TYPE ENTRIES LIST sub list

	@FindBy(xpath = "//*[@id=\"TypeName\"]")
	static WebElement txtAgreementName; // Enter Name "MALAYSIA-JAPAN ECONOMIC PARTNERSHIP AGREEMENT " from MODULE TYPE
										// ENTRY FORM screen
	@FindBy(xpath = "//*[@id=\"remarks\"]")
	static WebElement txtAgreementDescription; // Enter Description "MLAYSIA JAPAN FTA" from MODULE TYPE ENTRY FORM
												// screen
	@FindBy(xpath = "//*[@id=\"SaveNewType\"]")
	static WebElement btnCrerateAgreement; // Click on Create button from MODULE TYPE ENTRY FORM screen
	@FindBy(xpath = "//*[@id=\"btnActivate\"]")
	static WebElement btnActivateAgreement; // Click on Activate button
	@FindBy(xpath = "//*[@id=\"cancel\"]")
	static WebElement btnBackAgreement; // CLick on Back button'

	public AgreementNameTypes(WebDriver driver) {

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
	public static void clickAdminMenu(String testData) {
		try {
			menuAdmin.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickGeneralSubMenu(String testData) {
		try {
			subMenuGeneral.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickTypeNestedSubMenu(String testData) {
		try {

			nestedSubMenuTypes.click();
			OR.driver.switchTo().defaultContent();
			OR.driver.switchTo().frame("contentframe");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void setNameMODULETYPES(String testData) {
		try {
			txtNameMODULETYPES.sendKeys(testData);// Search with Enter Name MODULETYPES

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickSearchMODULETYPES(String testData) {
		try {
			btnSearchMODULETYPES.click();// Click on Search Button

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickOpenMODULETYPES(String testData) {
		try {
			lnkOpenMODULETYPES.click();// Open Module Types from Types List Screen

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	// TYPES ENTRIES sub list

	public static void clickSearchTypeEntries(String testData) {
		try {
			lnkSearchTypeEntries.click(); // Click on Search icon from TYPES ENTRIES sub list

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void setNameTypeEntries(String testData) {
		try {
			txtNameTypeEntries.sendKeys(testData);// Enter Name TARIFFTYPES

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickSearchEntries(String testData) {
		try {
			btnSearchTypeEntries.click(); // Click on Search button.

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickOpenTariff(String testData) {
		try {
			lnkOpenTariff.click(); // Click on Open TYPES ENTRIES.

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	// AGREEMENTNAMETYPES

	public static void setNameAGREEMENTNAMETYPES(String testData) {
		try {
			txtNameAGREEMENTNAMETYPES.sendKeys(testData); // Enter Name AGREEMENTNAMETYPES

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickSearchAGREEMENTNAMETYPES(String testData) {
		try {
			btnSearchAGREEMENTNAMETYPES.click(); // Click on Search button

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}

	public static void clickOpenAGREEMENTNAMETYPES(String testData) {
		try {
			lnkOpenAGREEMENTNAMETYPES.click(); // Open AgreementNameTypes

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
//Create & Activate New Agreement Name & Description
	
	public static void clickNewAgreement(String testData) {
		try {
			
			JavascriptExecutor jse = (JavascriptExecutor) OR.driver;
			jse.executeScript("window.scrollBy(0,2500)");
			
			btnNewAgreement.click();// Click on New button from MODULE TYPE ENTRIES LIST sub list

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	
	public static void setAgreementName(String testData) {
		try {
			
			txtAgreementName.clear();
			Random rand = new Random();
			int value = rand.nextInt(100);
			String gAgreementName = Integer.toString(value);

			txtAgreementName.sendKeys(testData + " " + gAgreementName);// Enter Name "MALAYSIA-JAPAN ECONOMIC PARTNERSHIP AGREEMENT " from MODULE TYPE
			AgreementName = testData + " " + gAgreementName;
			
			System.out.println("Agreement Name: " + AgreementName);
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}						
	
	public static void setAgreementDescription(String testData) {
		try {
			txtAgreementDescription.sendKeys(testData); // Enter Description "MLAYSIA JAPAN FTA" from MODULE TYPE ENTRY FORM

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}										
	
	public static void clickCrerateAgreement(String testData) {
		try {
			btnCrerateAgreement.click();  // Click on Create button from MODULE TYPE ENTRY FORM screen

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	
	public static void clickActivateAgreement(String testData) {
		try {
			btnActivateAgreement.click();  // Click on Activate button

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
	public static void clickBackAgreement(String testData) {
		try {
			btnBackAgreement.click(); // CLick on Back button'

		} catch (Exception e) {
			System.out.println(e.getMessage());
			PTTDriverClass.testResult = false;

		}
	}
}
