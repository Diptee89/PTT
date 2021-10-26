package pages;



	
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	import config.OR;



	public class Air_Carrier {
		WebDriver driver;
		
		static @FindBy(xpath="//*[@id=\"mb_Registration\"]/a") WebElement mb_Registration;
		static @FindBy(xpath="//*[@id=\"_submenuitem_regCarrier\"]") WebElement subMenuGatePass;
		static @FindBy(xpath="//*[@id=\"_submenuitem_AirCarrier\"]") WebElement nestedSubMenu;
		static @FindBy(xpath="//*[@id=\"submitbutton1\"]") WebElement Activatebutton;
		static @FindBy(xpath="//*[@id=\"txtCarrierCode\"]") WebElement txtcarrier;
		
		static @FindBy(xpath="//*[@id=\"Cname\"]") WebElement Cname;
		static @FindBy(xpath="//*[@id=\"CarrierNationality\"]") WebElement CarrierNationality;
		static @FindBy(xpath="//*[@id=\"autocompletediv\"]/li/a") WebElement linkAutocomplete1;
		static @FindBy(xpath="//*[@id=\"txtCarrierOwner\"]") WebElement txtCarrierQwner;
		static @FindBy(xpath="//*[@id=\"txtaRemarks\"]") WebElement txtRemarks;
		static @FindBy(xpath="//*[@id=\"submitbutton1\"]") WebElement Createbutton;
		static @FindBy(xpath="//*[@id=\"btnNewAC\"]") WebElement Newbutton;
		static @FindBy(xpath="//*[@id=\"text1\"]") WebElement Text1;
		static @FindBy(xpath="//*[@id=\"txtRouteNo\"]") WebElement RouteNo;
		static @FindBy(xpath="//*[@id=\"OriginPort\"]") WebElement OrginPort;
		static @FindBy(xpath="//*[@id=\"DestinationPort\"]") WebElement DestinationPort;
		static @FindBy(xpath="//*[@id=\"submitbutton5\"]") WebElement Submitbutton;
		static @FindBy(xpath="//*[@id=\"normalbutton1\"]") WebElement Normalbutton;
		static @FindBy(xpath="//*[@id=\"submitbutton1\"]") WebElement Activatedbutton;
		
		 public Air_Carrier(WebDriver driver){

		        this.driver = driver;

		        //This initElements method will create all WebElements

		        PageFactory.initElements(driver, this);
//		        
		    }
		 
		public static void clickMenu() {
			try {
				Thread.sleep(500);
				mb_Registration.click();
			} catch (Exception e) {
				e.getMessage();
			}
		}

		public static void clickSubMenu() {
			try {
				Thread.sleep(500);
				subMenuGatePass.click();
			} catch (Exception e) {
				e.getMessage();
			}
		}

		public static void clickNestedSubMenu() {
			try {
				Thread.sleep(2000);
				nestedSubMenu.click();
			} catch (Exception e) {
				e.getMessage();
			}

		}

		public static void switchFrame() {
			try {
				OR.driver.switchTo().defaultContent();
				OR.driver.switchTo().frame("contentframe");
			} catch (Exception e) {
				e.getMessage();
			}
		}

		public static void Activatebutton1() {
			try {
				Thread.sleep(3000);
				JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
				jse.executeScript("window.scrollBy(0,8000)");
				Activatebutton.click();
			} catch (Exception e) {
				e.getMessage();
			}

		}
		public static void txtcarrier1() {
			try {
				txtcarrier.sendKeys("123456");
			} catch (Exception e) {
				e.getMessage();
			}

		}
		
		public static void Cname1(String strCname) {
			try {
				Thread.sleep(1000);
				Cname.sendKeys(strCname);
//				Alert alert = OR.driver.switchTo().alert();
//				alert.accept();
			} catch (Exception e) {
				e.getMessage();
			}

		}
		public static void CarrierNationality1(String strNationality) {
			try {
				Thread.sleep(1000);
				CarrierNationality.sendKeys(strNationality);
				linkAutocomplete1.click();
//				Alert alert = OR.driver.switchTo().alert();
//				alert.accept();
			} catch (Exception e) {
				e.getMessage();
			}

		}
		public static void txtCarrierQwner1(String strcarrierOwner ) {
			try {
//				JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//				jse.executeScript("window.scrollBy(0,8000)");
				Thread.sleep(3000);
				txtCarrierQwner.sendKeys(strcarrierOwner);
//				Alert alert = OR.driver.switchTo().alert();
//				alert.accept();
			} catch (Exception e) {
				e.getMessage();
			}

		}
		public static void txtRemarks1(String strRemerks ) {
			try {
				Thread.sleep(3000);
				txtRemarks.sendKeys(strRemerks);
//				Alert alert = OR.driver.switchTo().alert();
//				alert.accept();
			} catch (Exception e) {
				e.getMessage();
			}

		}
		public static void Createbutton1() {
			try {
				Thread.sleep(3000);
				Createbutton.click();
//				Alert alert = OR.driver.switchTo().alert();
//				alert.accept();
			} catch (Exception e) {
				e.getMessage();
			}

		}
		public static void Newbutton1() {
			try {
				Thread.sleep(3000);
				Newbutton.click();
//				Alert alert = OR.driver.switchTo().alert();
//				alert.accept();
			} catch (Exception e) {
				e.getMessage();
			}

		}
		public static void Text1() {
			try {
				Thread.sleep(500);
				Text1.sendKeys("110014");
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		public static void RouteNo1() {
			try {
				Thread.sleep(500);
				RouteNo.sendKeys("00110011");
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		public static void OrginPort1(String strOrginNo) {
			try {
				Thread.sleep(1000);
				OrginPort.sendKeys(strOrginNo);
				linkAutocomplete1.click();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		public static void DestinationPort1(String strDestinationPort) {
			try {
				Thread.sleep(500);
				DestinationPort.sendKeys(strDestinationPort);
				linkAutocomplete1.click();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		public static void Submitbutton1() {
			try {
				Thread.sleep(500);
				Submitbutton.click();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		public static void Normalbutton1() {
			try {
				Thread.sleep(500);
				Normalbutton.click();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		public static void Activatedbutton1() {
			try {
				Thread.sleep(500);
				Activatedbutton.click();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
