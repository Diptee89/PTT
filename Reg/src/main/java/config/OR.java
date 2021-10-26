package config;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OR {

	public static WebDriver driver;
	public static Random rand;
	
	public static String localUrl = "http://10.138.108.11/ucustomscoredevtest/Main.aspx";
	public static String pathChromeDriver= "D://Diptee 657//Workspace//Selenium Installation//chromedriver.exe";

	public static void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",pathChromeDriver);

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.getMessage();
		}

	}
	

	public static void navigateToURL() {

		try {
			driver.get(localUrl);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public static void scroll() throws InterruptedException {
		try {
			JavascriptExecutor jse =(JavascriptExecutor) driver; 
			jse.executeScript("window.scrollBy(0,1000)");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static void upload() throws InterruptedException {
		try {
			StringSelection ss = new StringSelection("D:\\Selenium_code\\Test1\\src\\SSdf.png");
//			C:\Users\smohd\Downloads\\
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			Thread.sleep(1000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public static int generateRandomInt()
	{
		rand = new Random();
		int value = rand.nextInt(1000000);
		
		return value;
	}
}
