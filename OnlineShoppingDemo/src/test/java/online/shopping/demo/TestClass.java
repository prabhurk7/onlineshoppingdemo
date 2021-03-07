package online.shopping.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import pages.AddressPage;
import pages.LoginPage;
import pages.OrderView_Sel;
import pages.Order_Checkout_Payment;
import pages.Order_History;
import utility.BaseClass;

public class TestClass extends BaseClass{

public TestClass()
{
	super();
}
	
	@Test(priority =1, description="Login validation for onlineshopping")
	@Feature("Login")
	public void LoginValidation() {
	LoginPage lp = new LoginPage();
	lp.Login();
	}
	
	@Test(priority =2,description = "New Address validation for the user")
	@Feature("Add New Address")
	public void Add_New_address_validation()
	{
		AddressPage ap= new AddressPage();
		ap.Add_New_Address();
	}
	@Test(priority =3,description = " create order in the summer dress ")
	@Feature("Order creation")
	public void Make_order_validation()
	{OrderView_Sel order= new OrderView_Sel();
	order.select_order();
	}
	
	@Test(priority =4,description = "checkout the order and make payment")
	@Feature("Checkout and Payment")
	public void Checkout_Payment_Validation()
	{
		Order_Checkout_Payment cp = new Order_Checkout_Payment();
		cp.checkout();
		cp.payment();
	}
	
	@Test(priority = 5, description = "Order History")
	public void Order_Hisotry_validation()
	{
		Order_History Oh= new Order_History();
		Oh.orderdetails();
		Oh.screenshot();
	}
@AfterSuite
public void close()
{
 Teardown();
}
}
