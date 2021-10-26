package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Main {
	
	WebDriver driver;
	
	static @FindBy(xpath=".//*[@id='mb_ShipCargo']/a") WebElement menuShipCargo;
	static @FindBy(partialLinkText="Ship Clearance") WebElement subMenuShipClearance;
	static @FindBy(partialLinkText="Ship Arrival Declarations") WebElement nestedSubMenuShipArrivalDeclarations;		

	static @FindBy(xpath="//*[@id=\"mb_TradeFacilitation\"]/a") WebElement menuTradeFacilitation;
	static @FindBy(xpath="//*[@id=\"_submenuitem_nGPass\"]") WebElement subMenuGatePass;
	static @FindBy(xpath="//*[@id=\"_submenuitem_GPass\"]") WebElement nestedSubMenuGatePassApplication;
	
	public  Main(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);

	}
	
}
