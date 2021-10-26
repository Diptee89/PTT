package test;


	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_3;
	import pages.LoginLogout;
import pages.Shipment_order;
import pages.Export_submitjourney;

public class CAR_Export_submitjourney {

		@BeforeTest
		public static void setUp() {
			OR.openBrowser();
			OR.navigateToURL();		
				
		}
		
		@Test(priority = 0)
		public void login() throws Exception {	
			LoginLogout objLogInOut = new LoginLogout(OR.driver);
			POI_3 obj=new POI_3();
			objLogInOut.loginToUcustoms(POI_3.strLoginID,POI_3.strPassword);	
					
		}
		@Test(priority = 1)
		public void Regist() throws Exception {
			
			Export_submitjourney objGatePass = new Export_submitjourney(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			Export_submitjourney.clickMenu();
		
			Export_submitjourney.clickSubMenu();
		
			Export_submitjourney.clickNestedSubMenu();
		
			Export_submitjourney.switchFrame();
			
			Export_submitjourney.ActivatePort1(POI_3.strActivatePort);
			
			Export_submitjourney.Newbutton();
			
			Export_submitjourney.switchFrame0();
			
			Export_submitjourney.okbutton1();
			
			Export_submitjourney.switchFrame9();
						
			Export_submitjourney.LastPortCall1(POI_3.strLastPortCall);
			
			Export_submitjourney.portname1(POI_3.strOrginPort);
			
			Export_submitjourney.NextPortCall1(POI_3.strNextPortCall);
			
			Export_submitjourney.DateforArrived1();
			
			Export_submitjourney.Datechange1();
			
			Export_submitjourney.VesselName1(POI_3.strVesselName);
			
			Export_submitjourney.FlightNo1();
			
			Export_submitjourney.Submitedbutton1();
			
			Export_submitjourney.OKbutton1();
			
			Export_submitjourney.btnSubmit121();
			
			Export_submitjourney.okkbutton1();
			
}
}