package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Step;
import utility.BaseClass;

public class AddressPage extends BaseClass {

	public  AddressPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Addresses']")
	WebElement addresslink;
	
	@FindBy(xpath="//a[@title='Add an address']")
	WebElement Addnewaddress;
	
	@FindBy(css="#firstname")
	WebElement firstname;
	
	@FindBy(css="#lastname")
	WebElement Lastname;
	
	@FindBy(css="#company")
	WebElement company;
	
	@FindBy(css="#address1")
	WebElement address1;
	
	@FindBy(css="#address2")
	WebElement addressline2;
	
	@FindBy(css="#city")
	WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement state;
	
	@FindBy(css="#postcode")
	WebElement zipcode;
	
	@FindBy(xpath="//select[@id='id_country']")
	WebElement country;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement homephone;
	
	@FindBy(xpath="//input[@name='phone_mobile']")
	WebElement mobile;
	
	@FindBy(xpath="//textarea[@id='other']")
	WebElement additional_info;
	
	@FindBy(css="#alias")
	WebElement Address_Title;
	
	@FindBy(css="#submitAddress")
	WebElement Save;
	
	@Step
	public void Add_New_Address() {
	addresslink.click();
	Addnewaddress.click();
	firstname.clear();
	firstname.sendKeys(prop.getProperty("firstname"));
	Lastname.sendKeys(prop.getProperty("lastname"));
	company.sendKeys(prop.getProperty("company"));
	address1.sendKeys(prop.getProperty("Address1"));
	addressline2.sendKeys(prop.getProperty("Addressline2"));
	city.sendKeys(prop.getProperty("city"));
	Select statesel= new Select(state);
	statesel.selectByVisibleText(prop.getProperty("state"));
	zipcode.sendKeys(prop.getProperty("zipcode"));
	Select countrysel= new Select(country);
	countrysel.selectByVisibleText(prop.getProperty("country"));
	mobile.sendKeys(prop.getProperty("mobilephone"));
	additional_info.sendKeys(prop.getProperty("addtionalinfo"));
	Address_Title.clear();
	Address_Title.sendKeys(prop.getProperty("Addresstitle"));
	Save.click();
	}
	
	
		
	}
	
