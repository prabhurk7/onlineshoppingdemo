package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.BaseClass;

public class Order_History extends BaseClass{

	public  Order_History() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='View my customer account']")
	WebElement profile;
	
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")
	WebElement Orderhistory;
	
	@FindBy(xpath="//table[@id='order-list']//td[2]")
	WebElement date;
	
	@FindBy(xpath="//table[@id='order-list']//td[5]/span")
	WebElement orderstatus;
	
	public void orderdetails()
	{
		profile.click();
		Orderhistory.click();
		Assert.assertTrue(orderstatus.getText().contains("On backorder"));
		
	}
	
	public void screenshot()
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+ "/src/main/java/utility/screenshot/order.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
}
