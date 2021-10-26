package test;


	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_1;
	import pages.LoginLogout;
	import pages.BL_line_cancel;

	public class CAR_BLLINE_Cancel {

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
			
			BL_line_cancel objGatePass = new BL_line_cancel(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			BL_line_cancel.clickMenu();
		
			BL_line_cancel.clickSubMenu();
		
			BL_line_cancel.clickNestedSubMenu();
		
			BL_line_cancel.switchFrame();
			
			BL_line_cancel.Pinbutton1();
			
//			BL_line_cancel.Manifestpinbutton1();
//			
//			BL_line_cancel.BLine1();
//			
//			BL_line_cancel.bllist1();
//			
//			BL_line_cancel.Cancel1();
//			
//			BL_line_cancel.switchFrame1();
//			
//			BL_line_cancel.Cancelreason1();
//			
//			BL_line_cancel.Remarks1();
//			
//			BL_line_cancel.Okbutton1();
//			
//			BL_line_cancel.switchFrame2();
//			
//			BL_line_cancel.BAckbutton1();
//			
//			BL_line_cancel.Cancelbutton1();
			
//			BL_line_cancel.btnCancel1();
			
			BL_line_cancel.Pinbutton11();
			
			BL_line_cancel.submitbutton31();
			
			
			
}

		
	}