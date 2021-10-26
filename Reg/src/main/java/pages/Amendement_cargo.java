package pages;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.PageFactory;
		import org.openqa.selenium.support.ui.Select;

		import config.OR;



		public class Amendement_cargo {
			WebDriver driver;
			
			static @FindBy(xpath="//*[@id=\"mb_ShipCargo\"]/a") WebElement mb_ShipCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_cargo\"]") WebElement subMenuCargo;
			static @FindBy(xpath="//*[@id=\"_submenuitem_ImportJourney\"]") WebElement nestedSubMenu;
			static @FindBy(xpath="//*[@id=\"List_JourneyLs_0_ID0EBABAAA\"]/a/i") WebElement PINbutton;
			static @FindBy(xpath="//*[@id=\"btnAmendJourney\"]") WebElement btnAmendJourney;
			
			
			
			
			
			
			
			 public Amendement_cargo(WebDriver driver){

			        this.driver = driver;

			        //This initElements method will create all WebElements

			        PageFactory.initElements(driver, this);
//			        
			    }
			 
			public static void clickMenu() {
				try {
					Thread.sleep(500);
					mb_ShipCargo.click();
				} catch (Exception e) {
					e.getMessage();
				}
			}

			public static void clickSubMenu() {
				try {
					Thread.sleep(500);
					subMenuCargo.click();
				} catch (Exception e) {
					e.getMessage();
				}
			}

			public static void clickNestedSubMenu() {
				try {
					Thread.sleep(2000);
					nestedSubMenu.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}

			public static void switchFrame() {
				try {
					Thread.sleep(500);
					OR.driver.switchTo().defaultContent();
					OR.driver.switchTo().frame("contentframe");
				} catch (Exception e) {
					e.getMessage();
				}
			}
			
			
			public static void PINbutton1() {
				try {
					Thread.sleep(1000);
					PINbutton.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			public static void btnAmendJourney1() {
				try {
					Thread.sleep(2000);
					btnAmendJourney.click();
				} catch (Exception e) {
					e.getMessage();
				}

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
