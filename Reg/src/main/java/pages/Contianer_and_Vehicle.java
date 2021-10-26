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



		public class Contianer_and_Vehicle {
			WebDriver driver;
			
			static @FindBy(xpath="//*[@id=\"mb_ShipCargo\"]/a") WebElement mb_ShipCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_cargo\"]") WebElement subMenuCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_ImportJourney\"]") WebElement nestedSubMenu;
			static @FindBy(xpath="//*[@id=\"List_JourneyLs_0_ID0EBABAAA\"]/a/i") WebElement PINbutton;
			static @FindBy(xpath="//*[@id=\"JourneyFr_Links_icon\"]/i") WebElement Linkrepo;
			static @FindBy(xpath="//*[@id=\"lnkContainer\"]") WebElement lnkContainer;
			static @FindBy(xpath="//*[@id=\"submitbutton2\"]") WebElement submitbutton2;
			static @FindBy(xpath="//*[@id=\"ddlkind\"]") WebElement ddlkind;
			static @FindBy(xpath="//*[@id=\"txtContainerNo\"]") WebElement txtContainerNo;
			static @FindBy(xpath="//*[@id=\"ddlKindType\"]") WebElement ddlKindType;
			static @FindBy(xpath="//*[@id=\"ddlContainerLoadType\"]") WebElement ddlContainerLoadType;
			static @FindBy(xpath="//*[@id=\"txtgrossweight\"]") WebElement txtgrossweight;
			static @FindBy(xpath="//*[@id=\"PGrossUOM\"]") WebElement PGrossUOM;
			static @FindBy(xpath="//*[@id=\"autocompletediv\"]/li/a") WebElement linkAutocomplete1;
			static @FindBy(xpath="//*[@id=\"txtiso\"]") WebElement txtiso;
			static @FindBy(xpath="//*[@id=\"txtpackages\"]") WebElement txtpackages;
			static @FindBy(xpath="//*[@id=\"txtQantityUOM\"]") WebElement txtQantityUOM;
			static @FindBy(xpath="//*[@id=\"textarea1\"]") WebElement textarea1;
			static @FindBy(xpath="//*[@id=\"submitbutton1\"]") WebElement submitbutton1;
			static @FindBy(xpath="//*[@id=\"btnCancel\"]") WebElement Backbutton;
			static @FindBy(xpath="//*[@id=\"new1\"]") WebElement new1;
			static @FindBy(xpath="//*[@id=\"ddlVehicleType\"]") WebElement ddlVehicleType;
			static @FindBy(xpath="//*[@id=\"txtChasisNo\"]") WebElement txtChasisNo;
			static @FindBy(xpath="//*[@id=\"txtEngineNo\"]") WebElement txtEngineNo;
			static @FindBy(xpath="//*[@id=\"txtBrand\"]") WebElement txtBrand;
			static @FindBy(xpath="//*[@id=\"txtVehModel\"]") WebElement txtVehModel;
			static @FindBy(xpath="//*[@id=\"txtYrOfManf\"]") WebElement txtYrOfManf;
			static @FindBy(xpath="//*[@id=\"btnSaveNew\"]") WebElement btnSaveNew;
			static @FindBy(xpath="//*[@id=\"btnSbmt\"]") WebElement btnSbmt;
			static @FindBy(xpath="//*[@id=\"cancel\"]") WebElement cancel;
			
			
			
			
			
			
			
			
			
			 public Contianer_and_Vehicle(WebDriver driver){

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
			
			public static void PINbutton1() {
				try {
					Thread.sleep(2000);
					PINbutton.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Linkrepo1() {
				try {
					Thread.sleep(2000);
					Linkrepo.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void lnkContainer1() {
				try {
					Thread.sleep(2000);
					lnkContainer.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void switchFrame1() {
				try {
//					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame(OR.driver.findElement(By.id("frame_JourneyContainerLsPg")));
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			public static void submitbutton21() {
				try {
					Thread.sleep(2000);
					submitbutton2.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void ddlkind1() {
				try {
					Thread.sleep(2000);
					Select  uplaoddoc = new Select(ddlkind);
					uplaoddoc.selectByValue("126");
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtContainerNo1() {
				try {
					Thread.sleep(2000);
					txtContainerNo.sendKeys("saif khan");
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void ddlKindType1() {
				try {
					Thread.sleep(2000);
					Select  uplaoddoc = new Select(ddlKindType);
					uplaoddoc.selectByValue("1");
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void ddlContainerLoadType1() {
				try {
					Thread.sleep(2000);
					Select  uplaoddoc = new Select(ddlContainerLoadType);
					uplaoddoc.selectByValue("163");
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			
			public static void txtgrossweight1() {
				try {
					Thread.sleep(2000);
					txtgrossweight.sendKeys("00");
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void PGrossUOM() {
				try {
					Thread.sleep(2000);
					PGrossUOM.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void v1() {
				try {
					Thread.sleep(2000);
					txtiso.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtpackages1() {
				try {
					Thread.sleep(2000);
					txtpackages.sendKeys("100");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void txtQantityUOM() {
				try {
					Thread.sleep(2000);
					txtQantityUOM.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			
			public static void textarea11() {
				try {
					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
					jse.executeScript("window.scrollBy(0,9000)");
					Thread.sleep(2000);
					textarea1.sendKeys("sais");
//					linkAutocomplete1.click();
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
			public static void Backbutton1() {
				try {
					Thread.sleep(2000);
					Backbutton.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void new11() {
				try {
					Thread.sleep(2000);
					new1.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void ddlVehicleType1() {
				try {
					Thread.sleep(2000);
					Select  uplaoddoc = new Select(ddlVehicleType);
					uplaoddoc.selectByValue("812");
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void txtChasisNo1() {
				try {
					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
					jse.executeScript("window.scrollBy(0,9000)");
					Thread.sleep(2000);
					txtChasisNo.sendKeys("sais");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtEngineNo1() {
				try {
//					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//					jse.executeScript("window.scrollBy(0,9000)");
					Thread.sleep(2000);
					txtEngineNo.sendKeys("saifkhan");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void txtBrand1() {
				try {
					Thread.sleep(2000);
					txtBrand.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtVehModel1() {
				try {
					Thread.sleep(2000);
					txtVehModel.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtYrOfManf1() {
				try {
					Thread.sleep(2000);
					txtYrOfManf.sendKeys("12343456576");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void btnSaveNew1() {
				try {
					Thread.sleep(2000);
					btnSaveNew.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void btnSbmt1() {
				try {
					Thread.sleep(2000);
					btnSbmt.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void cancel1() {
				try {
					Thread.sleep(2000);
					cancel.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			
			
			
			
}
