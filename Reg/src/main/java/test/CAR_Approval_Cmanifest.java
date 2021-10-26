package test;



	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_1;
	import pages.LoginLogout;
	import pages.Approval_Cmanifest;

	public class CAR_Approval_Cmanifest {

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
			
			Approval_Cmanifest objGatePass = new Approval_Cmanifest(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			Approval_Cmanifest.clickMenu();
		
			Approval_Cmanifest.clickSubMenu();
		
			Approval_Cmanifest.clickNestedSubMenu();
		
			Approval_Cmanifest.switchFrame();
			
			Approval_Cmanifest.PInbutton1();
			
			Approval_Cmanifest.Approvedbutton1();
			
			Approval_Cmanifest.normalbutton11();
			
			
			
}
}