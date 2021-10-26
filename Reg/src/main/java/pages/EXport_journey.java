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



		public class EXport_journey {
			WebDriver driver;
			
			static @FindBy(xpath="//*[@id=\"mb_ShipCargo\"]/a") WebElement mb_ShipCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_cargo\"]") WebElement subMenuCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_ExportJourney\"]") WebElement nestedSubMenu;
			static @FindBy(xpath="//*[@id=\"List_ExportJourneyLs_0_ID0EBABAAA\"]/a/i") WebElement PInbutton1;
			static @FindBy(xpath="//*[@id=\"autocompletediv\"]/li/a") WebElement linkAutocomplete1;
			//*[@id="btnGetNewManifests"]
			static @FindBy(xpath="//*[@id=\"btnGetNewManifests\"]") WebElement Menifests;
			static @FindBy(xpath="//*[@id=\"ddlStorageType\"]") WebElement Storagetype;
//			static @FindBy(xpath="//*[@id=\"ddlManifestFor\"]") WebElement Manifest;
			static @FindBy(xpath="//*[@id=\"txtPort\"]") WebElement Txtport;
			static @FindBy(xpath="//*[@id=\"txtManifestDateDatePicker\"]") WebElement Datepicker1;
			static @FindBy(xpath="//*[@id=\"submitbutton2\"]") WebElement Submittedbutton1;
			static @FindBy(xpath="//*[@id=\"normalbutton1\"]") WebElement Normalbutton;
			static @FindBy(xpath="//*[@id=\"btnHBNew\"]") WebElement Btnnew;
			static @FindBy(xpath="//*[@id=\"txtHouseBillNumber\"]") WebElement txthouseBillNumber;
			static @FindBy(xpath="//*[@id=\"txtExpJourneyNumber\"]") WebElement txtExpJourneyNumber;
			
			static @FindBy(xpath="//*[@id=\"description\"]") WebElement description;
			static @FindBy(xpath="//*[@id=\"gweight\"]") WebElement gweight;
			static @FindBy(xpath="//*[@id=\"ddlGrossWeightUOM\"]") WebElement ddlGrossWeightUOM;
			static @FindBy(xpath="//*[@id=\"quantitymanifested\"]") WebElement quantitymanifested;
			static @FindBy(xpath="//*[@id=\"BOlQuantity\"]") WebElement BOlQuantity;
//			static @FindBy(xpath="//*[@id=\"quantitylanded\"]") WebElement quantitylanded;
			static @FindBy(xpath="//*[@id=\"UnitQtyLanded\"]") WebElement UnitQtyLanded;
			static @FindBy(xpath="//*[@id=\"txtPortofLanding\"]") WebElement txtPortofLanding;
			static @FindBy(xpath="//*[@id=\"Createbttn\"]") WebElement Createbttn;
			static @FindBy(xpath="//*[@id=\"btnHBItemNew\"]") WebElement Buttonclick;
			static @FindBy(xpath="//*[@id=\"txtHS6code\"]") WebElement Hscode;
			static @FindBy(xpath="//*[@id=\"CargoClass\"]") WebElement CargoClass;
			static @FindBy(xpath="//*[@id=\"txtCountryOfOrigin\"]") WebElement txtCountryOfOrigin;
			//*[@id="CargoClass"]
			static @FindBy(xpath="//*[@id=\"CargoType\"]") WebElement CargoType;
			static @FindBy(xpath="//*[@id=\"txtQuantity\"]") WebElement txtQuantity;
			static @FindBy(xpath="//*[@id=\"txtQantityUOM\"]") WebElement txtQantityUOM;
			static @FindBy(xpath="//*[@id=\"txtGrossWeight\"]") WebElement txtGrossWeight;
			static @FindBy(xpath="//*[@id=\"txtGrossWeightUOM\"]") WebElement txtGrossWeightUOM;
			static @FindBy(xpath="//*[@id=\"txtDesc\"]") WebElement txtDesc;
			static @FindBy(xpath="//*[@id=\"btnSaveNewHBItem\"]") WebElement btnSaveNewHBItem;
			static @FindBy(xpath="//*[@id=\"btnCancel\"]") WebElement Backbutton1;
			static @FindBy(xpath="//*[@id=\"HouseBillsFr_Links_icon\"]/i") WebElement Linkrepo;
			static @FindBy(xpath="//*[@id=\"lnkViewSplitHB\"]") WebElement HBparties;
			static @FindBy(xpath="//*[@id=\"txtConsignee\"]") WebElement Consignee;
			//*[@id="txtConsignee"]
			static @FindBy(xpath="//*[@id=\"txtSHBPartyName\"]") WebElement Shpartyname;
			static @FindBy(xpath="//*[@id=\"StextAddress1\"]") WebElement StextAddress1;
			static @FindBy(xpath="//*[@id=\"country\"]") WebElement country;
			static @FindBy(xpath="//*[@id=\"SNMtxtState\"]") WebElement SNMtxtState;
			static @FindBy(xpath="//*[@id=\"SNMtxtCity\"]") WebElement SNMtxtCity;
			static @FindBy(xpath="//*[@id=\"SNMtxtPostalCode\"]") WebElement SNMtxtPostalCode;
			static @FindBy(xpath="//*[@id=\"Createbttn\"]") WebElement Createbttn1;
			static @FindBy(xpath="//*[@id=\"submitbutton1\"]") WebElement submitbutton11;
			static @FindBy(xpath="//*[@id=\"bttnCancel\"]") WebElement bttnCancel11;
			static @FindBy(xpath="//*[@id=\"chkManifestsDisclaimer\"]") WebElement chkManifestsDisclaimer;
			static @FindBy(xpath="//*[@id=\"btnSubmit\"]") WebElement btnSubmit;
			static @FindBy(xpath="//*[@id=\"normalbutton1\"]") WebElement normalbutton112;
			static @FindBy(xpath="//*[@id=\"cancel\"]") WebElement cancel;
			static @FindBy(xpath="//*[@id=\"btnSubmit\"]") WebElement btnSubmit12;
			static @FindBy(xpath="//*[@id=\"normalbutton1\"]") WebElement okkbutton;
			static @FindBy(xpath="//*[@id=\"lnkAssShipmntOrders\"]") WebElement lnkAssShipmntOrders;
			static @FindBy(xpath="//*[@id=\"btnAssociate\"]") WebElement btnAssociate;
			static @FindBy(xpath="//*[@id=\"chkallID1EAAAABA\"]") WebElement chkallID1EAAAABA;
			static @FindBy(xpath="//*[@id=\"buttonID1EAAAABA\"]") WebElement buttonID1EAAAABA;
			static @FindBy(xpath="//*[@id=\"btnClose\"]") WebElement btnClose;
			
			//*[@id="btnClose"]
			//*[@id="normalbutton1"]
			
			
			
			
			
			 public EXport_journey(WebDriver driver){

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
			
			public static void PInbutton11() {
				try {
					Thread.sleep(200);
//					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
//					jse.executeScript("window.scrollBy(0,9000)");
					PInbutton1.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void GFMenifests1() {
				try {
					Thread.sleep(200);
					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
					jse.executeScript("window.scrollBy(0,9000)");
					Menifests.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void Storagetype1(String strStoragetype) {
				try {
					Thread.sleep(2000);
					Select  uplaoddoc = new Select(Storagetype);
					uplaoddoc.selectByValue(strStoragetype);
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
//			public static void Manifest1(String strManifest) {
//				try {
//					Thread.sleep(2000);
//					Select  uplaoddoc = new Select(Manifest);
//					uplaoddoc.selectByValue(strManifest);
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
			
			public static void Txtport1(String strTxtport) {
				try {
					Thread.sleep(2000);
					Txtport.sendKeys(strTxtport);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void Datepicker11() {
				try {
					Thread.sleep(3000);
					Datepicker1.click();
					OR.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a")).click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Submittedbutton11() {
				try {
					Thread.sleep(2000);
					Submittedbutton1.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Normalbutton1() {
				try {
					Thread.sleep(2000);
					Normalbutton.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Btnnew1() {
				try {
					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
					jse.executeScript("window.scrollBy(0,9000)");
					Thread.sleep(2000);
					Btnnew.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txthouseBillNumber1() {
				try {
					Thread.sleep(2000);
					txthouseBillNumber.sendKeys("1100144");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void txtExpJourneyNumber() {
				try {
					Thread.sleep(2000);
					txtExpJourneyNumber.sendKeys("%%");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void description1(String strdescription) {
				try {
					Thread.sleep(2000);
					description.sendKeys(strdescription);
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void gweight1() {
				try {
					Thread.sleep(2000);
					gweight.sendKeys("100");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void ddlGrossWeightUOM1(String strddlGrossWeightUOM) {
				try {
					Thread.sleep(2000);
					ddlGrossWeightUOM.sendKeys(strddlGrossWeightUOM);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void quantitymanifested1() {
				try {
					Thread.sleep(2000);
					quantitymanifested.sendKeys("100");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			

			public static void BOlQuantity1(String strBOlQuantity) {
				try {
					Thread.sleep(2000);
					BOlQuantity.sendKeys(strBOlQuantity);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
//			public static void quantitylanded1() {
//				try {
//					Thread.sleep(2000);
//					quantitylanded.sendKeys("100");
////					linkAutocomplete1.click();
//				} catch (Exception e) {
//					e.getMessage();
//				}
//
//			}
			
			public static void UnitQtyLanded1(String strUnitQtyLanded) {
				try {
					Thread.sleep(2000);
					UnitQtyLanded.sendKeys(strUnitQtyLanded);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtPortofLanding1(String strtxtPortofLanding) {
				try {
					Thread.sleep(2000);
					txtPortofLanding.sendKeys(strtxtPortofLanding);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Createbttn1() {
				try {
					Thread.sleep(2000);
					Createbttn.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Buttonclick1() {
				try {
					JavascriptExecutor jse =(JavascriptExecutor) OR.driver; 
					jse.executeScript("window.scrollBy(0,9000)");
					Thread.sleep(2000);
					Buttonclick.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void Hscode1(String strHscode1) {
				try {
					Thread.sleep(2000);
					Hscode.sendKeys(strHscode1);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void CargoClass1() {
				try {
					Thread.sleep(2000);
					Select  uplaoddoc = new Select(CargoClass);
					uplaoddoc.deselectByValue("301");
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void txtCountryOfOrigin1(String strtxtCountryOfOrigin) {
				try {
					Thread.sleep(2000);
					txtCountryOfOrigin.sendKeys(strtxtCountryOfOrigin);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void CargoType1(String strCargoType) {
				try {
					Thread.sleep(2000);
					Select  uplaoddoc = new Select(CargoType);
					uplaoddoc.deselectByVisibleText(strCargoType);
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtQuantity() {
				try {
					Thread.sleep(2000);
					txtQuantity.sendKeys("100");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtQantityUOM(String strtxtQantityUOM) {
				try {
					Thread.sleep(2000);
					txtQantityUOM.sendKeys(strtxtQantityUOM);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtGrossWeight1() {
				try {
					Thread.sleep(2000);
					txtGrossWeight.sendKeys("100");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtGrossWeightUOM1(String strtxtGrossWeightUOM) {
				try {
					Thread.sleep(2000);
					txtGrossWeightUOM.sendKeys(strtxtGrossWeightUOM);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void txtDesc1(String strtxtDesc) {
				try {
					Thread.sleep(2000);
					txtDesc.sendKeys(strtxtDesc);
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void btnSaveNewHBItem1() {
				try {
					Thread.sleep(2000);
					btnSaveNewHBItem.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Backbutton11() {
				try {
					Thread.sleep(2000);
					Backbutton1.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Linkrepo1() {
				try {
					Thread.sleep(2000);
					Linkrepo.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void HBparties1() {
				try {
					Thread.sleep(2000);
					HBparties.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void switchFrame1() {
				try {
					Thread.sleep(2000);
//					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame(OR.driver.findElement(By.id("frame_HBPartiesFrPg")));
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			public static void Consignee1(String strConsignee) {
				try {
					Thread.sleep(3000);
					Consignee.sendKeys(strConsignee);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Shpartyname1(String strShpartyname) {
				try {
					Thread.sleep(2000);
					Shpartyname.sendKeys(strShpartyname);
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void StextAddress11(String strStextAddress1) {
				try {
					Thread.sleep(2000);
					StextAddress1.sendKeys(strStextAddress1);
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void country1(String strcountry) {
				try {
					Thread.sleep(2000);
					country.sendKeys(strcountry);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void SNMtxtState1(String strSNMtxtState) {
				try {
					Thread.sleep(2000);
					SNMtxtState.sendKeys(strSNMtxtState);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void SNMtxtCity1(String strSNMtxtCity) {
				try {
					Thread.sleep(2000);
					SNMtxtCity.sendKeys(strSNMtxtCity);
					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void SNMtxtPostalCode1() {
				try {
					Thread.sleep(2000);
					SNMtxtPostalCode.sendKeys("110014");
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void Createbttn11() {
				try {
					Thread.sleep(2000);
					Createbttn1.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void submitbutton111() {
				try {
					Thread.sleep(2000);
					submitbutton11.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void switchFrame21() {
				try {
					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame("contentframe");
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			
			
			public static void Linkrepo12() {
				try {
					Thread.sleep(2000);
					Linkrepo.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			

			public static void lnkAssShipmntOrders1() {
				try {
					Thread.sleep(2000);
					lnkAssShipmntOrders.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void switchFrame12() {
				try {
					Thread.sleep(2000);
//					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame(OR.driver.findElement(By.id("frame_HBAssShipmentOrdersLsPg")));
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			public static void btnAssociate1() {
				try {
					Thread.sleep(2000);
					btnAssociate.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			public static void switchFrame121() {
				try {
					Thread.sleep(2000);
//					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame(OR.driver.findElement(By.id("frame_HBShipmentOrdersPopUpLsPg")));
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			
			public static void chkallID1EAAAABA1() {
				try {
					Thread.sleep(2000);
					chkallID1EAAAABA.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			public static void buttonID1EAAAABA1() {
				try {
					Thread.sleep(2000);
					buttonID1EAAAABA.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			public static void switchFrame1211() {
				try {
					Thread.sleep(2000);
//					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame(OR.driver.findElement(By.id("frame_HBAssShipmentOrdersLsPg")));
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			public static void btnClose1() {
				try {
					Thread.sleep(2000);
					btnClose.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			
			public static void switchFrame2() {
				try {
					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame("contentframe");
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			
			
			public static void bttnCancel1111() {
				try {
					Thread.sleep(2000);
					bttnCancel11.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void chkManifestsDisclaimer1() {
				try {
					Thread.sleep(2000);
					chkManifestsDisclaimer.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			public static void btnSubmit1() {
				try {
					Thread.sleep(2000);
					btnSubmit.click();
//					linkAutocomplete1.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			public static void normalbutton1121() {
				try {
					Thread.sleep(2000);
					normalbutton112.click();
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
