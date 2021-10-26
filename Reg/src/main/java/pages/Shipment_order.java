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



		public class Shipment_order {
			WebDriver driver;
			
			static @FindBy(xpath="//*[@id=\"mb_ShipCargo\"]/a") WebElement mb_ShipCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_cargo\"]") WebElement subMenuCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_ShipmentOrder\"]") WebElement nestedSubMenu;
			static @FindBy(xpath="//*[@id=\"submitbutton2\"]") WebElement Addbutton;
			static @FindBy(xpath="//*[@id=\"text1\"]") WebElement Text1;
			static @FindBy(xpath="//*[@id=\"txtExpJourneyNumber\"]") WebElement txtExpJourneyNumber;
			static @FindBy(xpath="//*[@id=\"autocompletediv\"]/li/a") WebElement linkAutocomplete1;
			static @FindBy(xpath="//*[@id=\"txtBPartyName\"]") WebElement txtBPartyName;
			static @FindBy(xpath="//*[@id=\"txtBAddress1\"]") WebElement txtBAddress1;
			static @FindBy(xpath="//*[@id=\"txtbStateName\"]") WebElement txtbStateName;
			static @FindBy(xpath="//*[@id=\"txtBCityName\"]") WebElement txtBCityName;
			static @FindBy(xpath="//*[@id=\"txtPostalCode\"]") WebElement txtPostalCode;
			static @FindBy(xpath="//*[@id=\"submitbutton1\"]") WebElement submitbutton1;
			static @FindBy(xpath="//*[@id=\"btnsubmit\"]") WebElement btnsubmit;
			
			
			
			
			
			 public Shipment_order(WebDriver driver){

			        this.driver = driver;

			        //This initElements method will create all WebElements

			        PageFactory.initElements(driver, this);
//			        
			    }
			 
			public static void clickMenu() {
				try {
					Thread.sleep(500);
					mb_ShipCargo.click();
				} catch (Exception e) {
					e.getMessage();
				}
			}

			public static void clickSubMenu() {
				try {
					Thread.sleep(500);
					subMenuCargo.click();
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
			
			
			
			public static void Addbutton1() {
				try {
					Thread.sleep(2000);
					Addbutton.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Text11() {
				try {
					Thread.sleep(2000);
					Text1.sendKeys("1001998");
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtExpJourneyNumber1() {
				try {
					Thread.sleep(2000);
					txtExpJourneyNumber.sendKeys("%%CAR-JRN-S21-07-2019-000013");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void txtBPartyName1() {
				try {
					Thread.sleep(2000);
					txtBPartyName.sendKeys("Saif khan");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void txtBAddress11() {
				try {
					Thread.sleep(2000);
					txtBAddress1.sendKeys("New delhi delhi");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void txtbStateName1() {
				try {
					Thread.sleep(2000);
					txtbStateName.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void txtBCityName1() {
				try {
					Thread.sleep(2000);
					txtBCityName.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void txtPostalCode1() {
				try {
					Thread.sleep(2000);
					txtPostalCode.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void submitbutton11() {
				try {
					Thread.sleep(2000);
					submitbutton1.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void btnsubmit1() {
				try {
					Thread.sleep(2000);
					btnsubmit.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
