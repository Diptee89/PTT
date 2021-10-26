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



		public class Export_submitjourney {
			WebDriver driver;
			
			static @FindBy(xpath="//*[@id=\"mb_ShipCargo\"]/a") WebElement mb_ShipCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_cargo\"]") WebElement subMenuCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_ExportJourney\"]") WebElement nestedSubMenu;
			static @FindBy(xpath="//*[@id=\"txtOrginport\"]") WebElement ActivatePort;
			static @FindBy(xpath="//*[@id=\"autocompletediv\"]/li/a") WebElement linkAutocomplete1;
			static @FindBy(xpath="//*[@id=\"submitbutton1\"]") WebElement Newbutton;
			static @FindBy(xpath="//*[@id=\"okbutton\"]") WebElement okbutton;
			static @FindBy(xpath="//*[@id=\"btnsubmit\"]") WebElement btnsubmit;
			static @FindBy(xpath="//*[@id=\"portname\"]") WebElement portname;
			static @FindBy(xpath="//*[@id=\"LastPortOfCall\"]") WebElement LastPortCall;
			static @FindBy(xpath="//*[@id=\"NextPortOfCall\"]") WebElement NextPortCall;
			static @FindBy(xpath="//*[@id=\"dateofshipmentDatePicker\"]") WebElement DateforArrived;
			static @FindBy(xpath="//*[@id=\"ExpectedDepartureDateDatePicker\"]") WebElement Datechange;
			static @FindBy(xpath="//*[@id=\"vesselname\"]") WebElement VesselName;
			static @FindBy(xpath="//*[@id=\"FlightNo\"]") WebElement FlightNo;
			static @FindBy(xpath="//*[@id=\"submitbutton5\"]") WebElement Submitedbutton;
			static @FindBy(xpath="//*[@id=\"normalbutton1\"]") WebElement OKbutton;
			static @FindBy(xpath="//*[@id=\"btnSubmit\"]") WebElement btnSubmit12;
			static @FindBy(xpath="//*[@id=\"normalbutton1\"]") WebElement okkbutton;
			
			
			 public Export_submitjourney(WebDriver driver){

			        this.driver = driver;

			        //This initElements method will create all WebElements

			        PageFactory.initElements(driver, this);
//			        
			    }
			 
			public static void clickMenu() {
				try {
					Thread.sleep(6000);
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
			public static void ActivatePort1(String strActivatePort) {
				try {
					Thread.sleep(2000);
					ActivatePort.sendKeys(strActivatePort);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void Newbutton() {
				try {
					Thread.sleep(2000);
					Newbutton.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void switchFrame0() {
				try {
					Thread.sleep(500);
//					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame(OR.driver.findElement(By.id("frame_NewExpJourneyConfirmFrPg")));
				} catch (Exception e) {
					e.getMessage();
				}
			}
			public static void okbutton1() {
				try {
					Thread.sleep(2000);
					okbutton.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void switchFrame9() {
				try {
					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame("contentframe");
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			
			public static void portname1(String strOrginPort) {
				try {
					Thread.sleep(2000);
					portname.sendKeys(strOrginPort);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void LastPortCall1(String strLastPortCall) {
				try {
					Thread.sleep(2000);
					LastPortCall.sendKeys(strLastPortCall);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void NextPortCall1(String strNextPortCall) {
				try {
					Thread.sleep(2000);
					NextPortCall.sendKeys(strNextPortCall);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void DateforArrived1() {
				try {
					Thread.sleep(3000);
					DateforArrived.click();
					OR.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Datechange1() {
				try {
					Thread.sleep(3000);
					Datechange.click();
					OR.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[7]/a")).click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void VesselName1(String strVesselName) {
				try {
					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
					jse.executeScript("window.scrollBy(0,8000)");
					Thread.sleep(2000);
					VesselName.sendKeys(strVesselName);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void FlightNo1() {
				try {
					Thread.sleep(2000);
					FlightNo.sendKeys("110014");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Submitedbutton1() {
				try {
					Thread.sleep(2000);
					Submitedbutton.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void OKbutton1() {
				try {
					Thread.sleep(2000);
					OKbutton.click();
//					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//					jse.executeScript("window.scrollBy(0,90000)");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void btnSubmit121() {
				try {
					Thread.sleep(2000);
					btnSubmit12.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void okkbutton1() {
				try {
					Thread.sleep(2000);
					okkbutton.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
}
