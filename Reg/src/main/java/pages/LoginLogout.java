package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginLogout {

	WebDriver driver;
	/*
	static By linkLogin = By.xpath("//*[@id=\"signin-link\"]/strong");
	static By txtLoginId = By.xpath("//*[@id=\"sUserId\"]");
	static By txtPassword = By.xpath("//*[@id=\"sUserPassword\"]");
	static By btnLoginInUcustoms = By.xpath("//*[@id=\"signin-dropdown\"]/form/table/tbody/tr[6]/td/input");
	static By linkSignOut = By.xpath(
			".//*[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a");
*/
	 @FindBy(xpath="//*[@id=\"signin-link\"]/strong") WebElement liLogin;
	 @FindBy(xpath="//*[@id=\"sUserId\"]") WebElement txtLoginId;
	 @FindBy(xpath="//*[@id=\"sUserPassword\"]") WebElement txtPassword;
	 @FindBy(xpath="//*[@id=\"signin-dropdown\"]/form/table/tbody/tr[6]/td/input") WebElement btnLoginInUcustoms;
	 @FindBy(xpath="//*[@id='header']/table/tbody/tr[1]/td/table/tbody/tr/td/div/div/table/tbody/tr[1]/td[2]/div[1]/ul/li[5]/a") WebElement liSignOut;
	
	  public LoginLogout(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	private  void clickLoginLink() {
		try {
//			OR.driver.findElement(linkLogin).click();    POM
			liLogin.click();  //Page Factory
		} catch (Exception e) {
			e.getMessage();
		}

	}

	private  void setLoginId(String strID) {
		try {
			txtLoginId.sendKeys(strID);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	private  void setPassword(String strPassword) {
		try {
			txtPassword.sendKeys(strPassword);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	private  void clickLoginBtn() {
		try {
			btnLoginInUcustoms.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public  void clickSignOut() {
		try {
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			liSignOut.click();
			// OR.driver.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public  void loginToUcustoms(String strID, String strPassword) throws Exception {
		// Click on Login link
		clickLoginLink();
		// Fill User ID
		setLoginId(strID);
		// Fill Password
		Thread.sleep(500);
		setPassword(strPassword);
		// Click Login Button
		clickLoginBtn();

	}
}
