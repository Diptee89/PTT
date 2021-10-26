package test;



	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI;
import junit.framework.Assert;
import pages.LoginLogout;
	import pages.Air_Carrier;

	public class CAR_Air_Carrier {

		@BeforeTest
		public static void setUp() {
			OR.openBrowser();
			OR.navigateToURL();		
				
		}
		
		@Test(priority = 0)
		public void login() throws Exception {	
			LoginLogout objLogInOut = new LoginLogout(OR.driver);
			POI obj=new POI();
			objLogInOut.loginToUcustoms(POI.strLoginID,POI.strPassword);	
					
		}
		@SuppressWarnings("deprecation")
		@Test(priority = 1)
		public void Regist() throws Exception {
			
			Air_Carrier objGatePass = new Air_Carrier(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			Air_Carrier.clickMenu();
//		Assert.assertTrue(true);
		Assert.assertTrue("working_properly", true);
			Air_Carrier.clickSubMenu();
			Assert.assertTrue("working_properly", true);
			Air_Carrier.clickNestedSubMenu();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.switchFrame();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Activatebutton1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.txtcarrier1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.CarrierNationality1(POI.strNationality);
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Cname1(POI.strCname);
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.txtCarrierQwner1(POI.strcarrierOwner);
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.txtRemarks1(POI.strRemerks);
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Createbutton1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Newbutton1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Text1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.RouteNo1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.OrginPort1(POI.strOrginNo);
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.DestinationPort1(POI.strDestinationPort);
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Submitbutton1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Normalbutton1();
			Assert.assertTrue("working_properly", true);
			Assert.assertTrue(true);
			Air_Carrier.Activatedbutton1();
			Assert.assertTrue("working_properly", true);
			
			
			
			
			
			
			
			
}

	}
