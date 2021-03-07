package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Step;
import utility.BaseClass;

public class OrderView_Sel extends BaseClass{

	public  OrderView_Sel() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Women']")
	WebElement Womenmenulink;
	
	@FindBy(xpath="(//li/a[@title='Summer Dresses'])[1]")
	WebElement Summerdresslink;
	
	@FindBy(xpath="//li[@id='list']/a/i")
	WebElement listview;
	
	@FindBy(xpath="//a[@class='product_img_link']/img")
	List<WebElement> dress;
		
	@FindBy(css="#quantity_wanted")
	WebElement quantity;
	
	@FindBy(css="#group_1")
	WebElement sizesel;
	
	@FindBy(xpath="//a[@title='Yellow']")
	WebElement colorsel;
	
	@FindBy(xpath="//p[@id='add_to_cart']/button")
	WebElement addtocart;
	
	@FindBy(xpath="//span[@title='Continue shopping']")
	WebElement continueshopping;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement checkout;
	
	@FindBy(css=".fancybox-iframe")
	WebElement frame;
	
	@Step
	public void select_order()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Womenmenulink).perform();
		action.moveToElement(Summerdresslink).perform();
		Summerdresslink.click();
		listview.click();
		for(WebElement dress:dress)
		{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", dress);
		dress.click();
		driver.switchTo().frame(frame);
		quantity.clear();
		quantity.sendKeys(prop.getProperty("quantity"));
		Select size = new Select(sizesel);
		size.selectByVisibleText(prop.getProperty("Size"));
		colorsel.click();
		addtocart.click();
		driver.switchTo().defaultContent();
		continueshopping.click();
		}	
		checkout.click();
}
}
