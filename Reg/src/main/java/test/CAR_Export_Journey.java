package test;


	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_2;
	import pages.LoginLogout;
import pages.Shipment_order;
import pages.EXport_journey;

	public class CAR_Export_Journey {

		@BeforeTest
		public static void setUp() {
			OR.openBrowser();
			OR.navigateToURL();		
				
		}
		
		@Test(priority = 0)
		public void login() throws Exception {	
			LoginLogout objLogInOut = new LoginLogout(OR.driver);
			POI_2 obj=new POI_2();
			objLogInOut.loginToUcustoms(POI_2.strLoginID,POI_2.strPassword);	
					
		}
		@Test(priority = 1)
		public void Regist() throws Exception {
			
			EXport_journey objGatePass = new EXport_journey(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			EXport_journey.clickMenu();
		
			EXport_journey.clickSubMenu();
		
			EXport_journey.clickNestedSubMenu();
		
			EXport_journey.switchFrame();
		
			EXport_journey.PInbutton11();
			
			EXport_journey.GFMenifests1();
			
			EXport_journey.Storagetype1(POI_2.strStoragetype);
			
//			Create_Journey.Manifest1(POI_1.strManifest);
			
			EXport_journey.Txtport1(POI_2.strTxtport);
			
			EXport_journey.Submittedbutton11();
			
			EXport_journey.Normalbutton1();
			
			EXport_journey.Btnnew1();
			
			EXport_journey.txthouseBillNumber1();
			
			EXport_journey.description1(POI_2.strdescription);
			
			EXport_journey.gweight1();
			
			EXport_journey.ddlGrossWeightUOM1(POI_2.strddlGrossWeightUOM);
			
			EXport_journey.quantitymanifested1();
			
			EXport_journey.BOlQuantity1(POI_2.strBOlQuantity);
			
//			EXport_journey.quantitylanded1();
			
//			EXport_journey.UnitQtyLanded1(POI_1.strUnitQtyLanded);
			
			EXport_journey.txtPortofLanding1(POI_2.strtxtPortofLanding);
			
			EXport_journey.Createbttn1();
			
			EXport_journey.Buttonclick1();
			
			EXport_journey.Hscode1(POI_2.strHscode1);
			
//			Create_Journey.CargoClass1(POI_1.strCargoClass);
//			
			EXport_journey.txtCountryOfOrigin1(POI_2.strtxtCountryOfOrigin);
//			
			EXport_journey.CargoType1(POI_2.strCargoType);
			
			EXport_journey.txtQuantity();
			
			EXport_journey.txtQantityUOM(POI_2.strtxtQantityUOM);
			
			EXport_journey.txtGrossWeight1();
			
			EXport_journey.txtGrossWeightUOM1(POI_2.strtxtQantityUOM);
			
			EXport_journey.txtDesc1(POI_2.strtxtDesc);
			
			EXport_journey.btnSaveNewHBItem1();
			
			EXport_journey.Backbutton11();
			
			EXport_journey.Linkrepo1();
			
			EXport_journey.HBparties1();
			
			EXport_journey.switchFrame1();
			
			EXport_journey.Consignee1(POI_2.strConsignee);
			
			EXport_journey.Shpartyname1(POI_2.strShpartyname);
			
			EXport_journey.StextAddress11(POI_2.strStextAddress1);
			
			EXport_journey.country1(POI_2.strcountry);
			
			EXport_journey.SNMtxtState1(POI_2.strSNMtxtState);
			
			EXport_journey.SNMtxtCity1(POI_2.strSNMtxtCity);
			
			EXport_journey.SNMtxtPostalCode1();
			
			EXport_journey.Createbttn1();
			
			EXport_journey.submitbutton111();
			
			EXport_journey.switchFrame21();
			
			EXport_journey.Linkrepo12();
			
			EXport_journey.lnkAssShipmntOrders1();
			
			EXport_journey.switchFrame12();
			
			
			EXport_journey.btnAssociate1();
			
			EXport_journey.switchFrame121();
			
			EXport_journey.chkallID1EAAAABA1();
			
			
			
			EXport_journey.buttonID1EAAAABA1();
			
			EXport_journey.switchFrame1211();
			
			EXport_journey.btnClose1();
			
			
			EXport_journey.switchFrame2();
			
			
			EXport_journey.bttnCancel1111();
			
//			EXport_journey.chkManifestsDisclaimer1();
//			
//			EXport_journey.btnSubmit1();
			
			
			EXport_journey.normalbutton1121();	
			
//			EXport_journey.cancel1();
			
//			EXport_journey.btnSubmit121();
			
			
			
			
			
			
			
			
			
			
			
			
			
}

}
