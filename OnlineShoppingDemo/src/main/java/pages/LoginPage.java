package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;
import utility.BaseClass;

public class LoginPage extends BaseClass{
	
	public  LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement login;
	
	@FindBy(css  ="#email")
	WebElement userid;
	
	@FindBy(css ="#passwd")
	WebElement password;
	
	@FindBy(css ="#SubmitLogin")
	WebElement signin;
	
	@Step
	public void Login()
	{
		login.click();
		userid.sendKeys(prop.getProperty("Email"));
		password.sendKeys(prop.getProperty("passcode"));
		signin.click();
	}
}
