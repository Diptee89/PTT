package test;


	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_1;
	import pages.LoginLogout;
	import pages.Shipment_order;

	public class CAR_shipment_order {

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
			
			Shipment_order objGatePass = new Shipment_order(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			Shipment_order.clickMenu();
		
			Shipment_order.clickSubMenu();
		
			Shipment_order.clickNestedSubMenu();
		
			Shipment_order.switchFrame();
			
			Shipment_order.Addbutton1();
			
			Shipment_order.Text11();
			
			Shipment_order.txtExpJourneyNumber1();
			
			Shipment_order.txtBPartyName1();
			
			Shipment_order.txtBAddress11();
			
			Shipment_order.txtbStateName1();
			
			Shipment_order.txtBCityName1();
			
			Shipment_order.txtPostalCode1();
			
			Shipment_order.submitbutton11();
			
			Shipment_order.btnsubmit1();
//			
//			Shipment_order
//			
//			Shipment_order
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}