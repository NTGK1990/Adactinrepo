package adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {

	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id= "last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardnumber;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement expdate;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id="book_now")
	private WebElement booknow;
	
	public WebElement getfirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardnumber() {
		return cardnumber;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpdate() {
		return expdate;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public Bookhotel(WebDriver driver){
		this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
	}
	
		
}
