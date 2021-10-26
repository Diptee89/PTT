package test;


	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_1;
	import pages.LoginLogout;
	import pages.Create_Journey;

	public class CAR_Create_journey {

		@BeforeTest
		public static void setUp() {
			OR.openBrowser();
			OR.navigateToURL();		
				
		}
		
		@Test(priority = 0)
		public void login() throws Exception {	
			LoginLogout objLogInOut = new LoginLogout(OR.driver);
			POI_1 obj=new POI_1();
			objLogInOut.loginToUcustoms(POI_1.strLoginID,POI_1.strPassword);	
					
		}
		@Test(priority = 1)
		public void Regist() throws Exception {
			
			Create_Journey objGatePass = new Create_Journey(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			Create_Journey.clickMenu();
		
			Create_Journey.clickSubMenu();
		
			Create_Journey.clickNestedSubMenu();
		
			Create_Journey.switchFrame();
			
			Create_Journey.ActivatePort1(POI_1.strActivatePort);
			
			Create_Journey.Newbutton();
			
			Create_Journey.OrginPort1(POI_1.strOrginPort);
			
			Create_Journey.LastPortCall1(POI_1.strLastPortCall);
			
			Create_Journey.NextPortCall1(POI_1.strNextPortCall);
			
			Create_Journey.DateforArrived1();
			
			Create_Journey.Datechange1();
			
			Create_Journey.VesselName1(POI_1.strVesselName);
			
			Create_Journey.FlightNo1();
			
			Create_Journey.Submitedbutton1();
			
			Create_Journey.OKbutton1();
			
			Create_Journey.GFMenifests1();
			
			Create_Journey.Storagetype1(POI_1.strStoragetype);
			
			Create_Journey.Manifest1(POI_1.strManifest);
			
			Create_Journey.Txtport1(POI_1.strTxtport);
			
			Create_Journey.Submittedbutton11();
			
			Create_Journey.Normalbutton1();
			
			Create_Journey.Btnnew1();
			
			Create_Journey.txthouseBillNumber1();
			
			Create_Journey.description1(POI_1.strdescription);
			
			Create_Journey.gweight1();
			
			Create_Journey.ddlGrossWeightUOM1(POI_1.strddlGrossWeightUOM);
			
			Create_Journey.quantitymanifested1();
			
			Create_Journey.BOlQuantity1(POI_1.strBOlQuantity);
			
//			Create_Journey.quantitylanded1();
			
//			Create_Journey.UnitQtyLanded1(POI_1.strUnitQtyLanded);
			
			Create_Journey.txtPortofLanding1(POI_1.strtxtPortofLanding);
			
			Create_Journey.Createbttn1();
			
			Create_Journey.Buttonclick1();
//			
			Create_Journey.Hscode1(POI_1.strHscode1);
			
//			Create_Journey.CargoClass1(POI_1.strCargoClass);
//			
			Create_Journey.txtCountryOfOrigin1(POI_1.strtxtCountryOfOrigin);
//			
			Create_Journey.CargoType1(POI_1.strCargoType);
			
			Create_Journey.txtQuantity();
			
			Create_Journey.txtQantityUOM(POI_1.strtxtQantityUOM);
			
			Create_Journey.txtGrossWeight1();
			
			Create_Journey.txtGrossWeightUOM1(POI_1.strtxtQantityUOM);
			
			Create_Journey.txtDesc1(POI_1.strtxtDesc);
			
			Create_Journey.btnSaveNewHBItem1();
			
			Create_Journey.Backbutton11();
			
			Create_Journey.Linkrepo1();
			
			Create_Journey.HBparties1();
			
			Create_Journey.switchFrame1();
			
			Create_Journey.Consignee1(POI_1.strConsignee);
			
			Create_Journey.Shpartyname1(POI_1.strShpartyname);
			
			Create_Journey.StextAddress11(POI_1.strStextAddress1);
			
			Create_Journey.country1(POI_1.strcountry);
			
			Create_Journey.SNMtxtState1(POI_1.strSNMtxtState);
			
			Create_Journey.SNMtxtCity1(POI_1.strSNMtxtCity);
			
			Create_Journey.SNMtxtPostalCode1();
			
			Create_Journey.Createbttn1();
			
			Create_Journey.submitbutton111();
			
			Create_Journey.switchFrame2();
			
			
			Create_Journey.bttnCancel1111();
			
			Create_Journey.chkManifestsDisclaimer1();
			
			Create_Journey.btnSubmit1();
			
			
			Create_Journey.normalbutton1121();	
			
			Create_Journey.cancel1();
			
			Create_Journey.btnSubmit121();
			
			
			
			
			
			
			
			
			
			
			
			
			
}

		
	}