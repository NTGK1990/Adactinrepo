package adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirmation {

	public WebDriver driver;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}

	public Bookingconfirmation(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	
	
	
	
}
