package adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Selecthotel {
	public WebDriver driver;
	
	
	@FindBy(id ="radiobutton_0")
	private WebElement Select;
	@FindBy(id="continue")
	private WebElement Continue;
	
	public WebElement getSelect() {
		return Select;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public Selecthotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
	}
	
	
	
	
	
	
	
	

}
