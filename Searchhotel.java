package adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {

public WebDriver driver;	
	
	@FindBy(id="location")
	private WebElement Location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement No_of_rooms;
	@FindBy(id="datepick_in")
	private WebElement Check_in_date;
	@FindBy(id="datepick_out")
	private WebElement Check_out_date;
	@FindBy(id="adult_room")
	private WebElement adults_per_room;
	@FindBy(id="child_room")
	private WebElement children_per_room;
	@FindBy(id="Submit")
	private WebElement Search;
	
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNo_of_rooms() {
		return No_of_rooms;
	}
	public WebElement getCheck_in_date() {
		return Check_in_date;
	}
	public WebElement getCheck_out_date() {
		return Check_out_date;
	}
	public WebElement getAdults_per_room() {
		return adults_per_room;
	}
	public WebElement getChildren_per_room() {
		return children_per_room;
	}
	public WebElement getSearch() {
		return Search;
	}
	
	public Searchhotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}
