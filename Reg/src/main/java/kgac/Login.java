package kgac;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login {
	public static WebDriver driver;
	
	public static String URL="http://10.138.108.44/MCKWFX5Test/Main.aspx";
	
	public static String LoginID= "KU.CSA";
	public static String LoginPassword="fx5test";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.ie.driver","D://Diptee 657//Workspace//Selenium Installation//IEDriverServer.exe");

			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			
//			Navigate to URL			
			driver.get(URL);
			
			
			String parent=driver.getWindowHandle();

			Set<String>s=driver.getWindowHandles();

			// Now iterate using Iterator
			Iterator<String> I1= s.iterator();

			while(I1.hasNext())
			{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
			driver.findElement(By.id("sUserId")).sendKeys("KU.CSA");
			driver.close();
			}

			}

			

			
//			Enter Login ID in the Text box
//			driver.findElement(By.id("sUserId")).sendKeys("KU.CSA");
			
//			Enter Login Password in Text box
//			driver.findElement(By.id("sUserPassword")).sendKeys(LoginPassword);
			
//			Click on Login button
//			driver.findElement(By.className("FX50loginPanelLoginButton")).click();
			
//			Click on menu Navigate Icon
			
//			Click on Site Menu "CARGO" Link
			
//			Click on Create Manifest link
			
//			Click on New button from Manifest List screen
			
//			Enter / Search and select Mandatory field "Port Of Origin" from "Manifest Information" section.- PUERTO PLATA > Name "OriginPort"
			
//			Enter / Search and select Mandatory field "Carrier / Shipping Line" from "Carrier Details" section.
			
//			Enter / Search and select Mandatory field "Voyage/Flight No." from "Carrier Details" section.
			
//			Click on Create Button.
			
			
		} catch (Exception e) {
			e.getMessage();
		}
}
	
}
