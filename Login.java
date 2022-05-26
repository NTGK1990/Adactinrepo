package adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login;
	
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public Login(WebDriver driver2) {
		driver =driver2;
		PageFactory.initElements(driver, this);
		
	}
	
}
