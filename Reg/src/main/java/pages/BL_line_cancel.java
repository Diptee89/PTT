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



		public class BL_line_cancel {
			WebDriver driver;
			
			static @FindBy(xpath="//*[@id=\"mb_ShipCargo\"]/a") WebElement mb_ShipCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_cargo\"]") WebElement subMenuCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_ImportJourney\"]") WebElement nestedSubMenu;
			static @FindBy(xpath="//*[@id=\"List_JourneyLs_1_ID0EBABAAA\"]/a/i") WebElement Pinbutton;
//			static @FindBy(xpath="//*[@id=\"List_JourneyManifestLs_0_Editlnks\"]/a/i") WebElement Manifestpinbutton;
//			static @FindBy(xpath="//*[@id=\"List_ManifestHouseBillLs_0_ID1EAABCAA\"]/a/i") WebElement BLine;
//			static @FindBy(xpath="//*[@id=\"btnReq\"]") WebElement Cancel;
//			static @FindBy(xpath="//*[@id=\"List_HBItemsLs_0_cell_HBItemId\"]/a/i") WebElement bllist;
//			static @FindBy(xpath="//*[@id=\"ddlCancellationReason\"]") WebElement Cancelreason;
//			static @FindBy(xpath="//*[@id=\"txtRemarks\"]") WebElement Remarks;
//			static @FindBy(xpath="//*[@id=\"btnUpload\"]") WebElement Okbutton;
//			static @FindBy(xpath="//*[@id=\"btnCancel\"]") WebElement BAckbutton;
//			static @FindBy(xpath="//*[@id=\"cancelBL\"]") WebElement Cancelbutton;
			static @FindBy(xpath="//*[@id=\"btnCancel\"]") WebElement btnCancel;
			static @FindBy(xpath="//*[@id=\"List_JourneyManifestLs_0_Editlnks\"]/a/i") WebElement Pinbutton1;
			static @FindBy(xpath="//*[@id=\"submitbutton3\"]") WebElement submitbutton3;
			
			
			
			
			
			
			
			
			
			
			
			
			 public BL_line_cancel(WebDriver driver){

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
	
			
			public static void Pinbutton1() {
				try {
					Thread.sleep(2000);
					Pinbutton.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
	
			
//			public static void Manifestpinbutton1() {
//				try {
//					Thread.sleep(2000);
//					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//					jse.executeScript("window.scrollBy(0,8000)");
//					Manifestpinbutton.click();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			
//			public static void BLine1() {
//				try {
//					Thread.sleep(2000);
//					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//					jse.executeScript("window.scrollBy(0,8000)");
//					BLine.click();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			
//			public static void bllist1() {
//				try {
//					Thread.sleep(2000);
//					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//					jse.executeScript("window.scrollBy(0,8000)");
//					bllist.click();
//					Thread.sleep(2000);
//					
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			
//			public static void Cancel1() {
//				try {
//					Thread.sleep(2000);
//					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//					jse.executeScript("window.scrollBy(0,8000)");
//					Cancel.click();
//					Alert alert = OR.driver.switchTo().alert();
//					alert.accept();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			
//			public static void switchFrame1() {
//				try {
////					OR.driver.switchTo().defaultContent();
//					OR.driver.switchTo().frame(OR.driver.findElement(By.id("frame_CancellationPg")));
//				} catch (Exception e) {
//					e.getMessage();
//				}
//			}
//	
//			
//			public static void Cancelreason1() {
//				try {
//					Thread.sleep(2000);
//					Select  uplaoddoc = new Select(Cancelreason);
//					uplaoddoc.selectByValue("202");
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			
//			public static void Remarks1() {
//				try {
//					Thread.sleep(2000);
//					Remarks.sendKeys("remkars");
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			
//			public static void Okbutton1() {
//				try {
//					Thread.sleep(2000);
//					Okbutton.click();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			public static void switchFrame2() {
//				try {
//					OR.driver.switchTo().defaultContent();
//					OR.driver.switchTo().frame("contentframe");
//				} catch (Exception e) {
//					e.getMessage();
//				}
//			}
//			
//			
//			
//			public static void BAckbutton1() {
//				try {
//					Thread.sleep(2000);
//					BAckbutton.click();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
//			
//			public static void Cancelbutton1() {
//				try {
//					Thread.sleep(2000);
//					Cancelbutton.click();
//					Alert alert = OR.driver.switchTo().alert();
//					alert.accept();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
			
//			public static void btnCancel1() {
//				try {
//					Thread.sleep(2000);
//					btnCancel.click();
//					Alert alert = OR.driver.switchTo().alert();
//					alert.accept();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
			
			public static void Pinbutton11() {
				try {
					Thread.sleep(2000);
					Pinbutton1.click();
//					Alert alert = OR.driver.switchTo().alert();
//					alert.accept();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void submitbutton31() {
				try {
					Thread.sleep(2000);
					submitbutton3.click();
					Alert alert = OR.driver.switchTo().alert();
					alert.accept();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
	
}
