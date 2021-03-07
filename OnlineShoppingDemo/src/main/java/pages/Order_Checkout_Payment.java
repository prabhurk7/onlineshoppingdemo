package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class Order_Checkout_Payment extends BaseClass {

	public  Order_Checkout_Payment() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	WebElement checkout;
	
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement Address_confirm;
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement agree_terms;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement procced_payment;
	
	@FindBy(css=".bankwire")
	WebElement payment_type;
	
	@FindBy(xpath="//button/span[contains(text(),'I confirm my order')]")
	WebElement confirm_order;
	
	
	public void checkout()
	{
		checkout.click();
		Address_confirm.click();
		
	}
	
	public void payment()
	{
		agree_terms.click();
		procced_payment.click();
		payment_type.click();
		confirm_order.click();
		
	}
}
