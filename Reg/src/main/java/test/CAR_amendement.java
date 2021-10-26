package test;


	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_1;
	import pages.LoginLogout;
	import pages.Amendement_cargo;

	public class CAR_amendement {

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
			
			Amendement_cargo objGatePass = new Amendement_cargo(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			Amendement_cargo.clickMenu();
		
			Amendement_cargo.clickSubMenu();
		
			Amendement_cargo.clickNestedSubMenu();
		
			Amendement_cargo.switchFrame();
			
			Amendement_cargo.PINbutton1();
			
			Amendement_cargo.btnAmendJourney1();
			
			
			
			
			
			
			
			
			
}
}