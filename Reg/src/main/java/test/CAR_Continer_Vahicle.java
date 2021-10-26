package test;


	import java.io.IOException;
	import java.lang.reflect.Method;

	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import config.OR;
	import config.POI_1;
	import pages.LoginLogout;
	import pages.Contianer_and_Vehicle;

	public class CAR_Continer_Vahicle {

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
			
			Contianer_and_Vehicle objGatePass = new Contianer_and_Vehicle(OR.driver);
			
			Method[] meth = objGatePass.getClass().getDeclaredMethods();
			System.out.println(meth.length);
			
			Contianer_and_Vehicle.clickMenu();
		
			Contianer_and_Vehicle.clickSubMenu();
		
			Contianer_and_Vehicle.clickNestedSubMenu();
		
			Contianer_and_Vehicle.switchFrame();
			
			Contianer_and_Vehicle.PINbutton1();
			
			Contianer_and_Vehicle.Linkrepo1();
			
			Contianer_and_Vehicle.lnkContainer1();
			
			Contianer_and_Vehicle.switchFrame1();
			
			Contianer_and_Vehicle.submitbutton21();
			
			Contianer_and_Vehicle.ddlkind1();
			
			Contianer_and_Vehicle.txtContainerNo1();
			
			Contianer_and_Vehicle.ddlKindType1();
			
			Contianer_and_Vehicle.ddlContainerLoadType1();
			
			Contianer_and_Vehicle.txtgrossweight1();
			
			Contianer_and_Vehicle.PGrossUOM();
			
			Contianer_and_Vehicle.v1();
			
			Contianer_and_Vehicle.txtpackages1();
			
			Contianer_and_Vehicle.txtQantityUOM();
			
			Contianer_and_Vehicle.textarea11();
			
			Contianer_and_Vehicle.submitbutton11();
			
			Contianer_and_Vehicle.Backbutton1();
//			
			Contianer_and_Vehicle.new11();
			
			Contianer_and_Vehicle.ddlVehicleType1();
			
			Contianer_and_Vehicle.txtChasisNo1();
			
			Contianer_and_Vehicle.txtEngineNo1();
			
			Contianer_and_Vehicle.txtBrand1();
			
//			
			Contianer_and_Vehicle.txtVehModel1();
			
			Contianer_and_Vehicle.txtYrOfManf1();
			
			Contianer_and_Vehicle.btnSaveNew1();
			
			Contianer_and_Vehicle.btnSbmt1();

			Contianer_and_Vehicle.cancel1();
			
			
			
			
}
	}