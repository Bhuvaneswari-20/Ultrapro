package Steps;

import org.openqa.selenium.WebElement;

import Helper.BaseClass;
import Page.SalesOrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SalesOrderStep extends BaseClass {

	@Given("user is navigated to the sales order page")
	public void user_is_navigated_to_the_sales_order_page() throws InterruptedException {

		SalesOrderPage so = new SalesOrderPage();
		Thread.sleep(3000);
		inputText(so.getSearch(), "Sales Order");
		Thread.sleep(2000);
		btnClick(so.getSalesOrder());
		Thread.sleep(3000);

	}

	@When("user click on Add Sales Order")
	public void user_click_on_add_sales_order() throws InterruptedException {

		SalesOrderPage so = new SalesOrderPage();
		Thread.sleep(4000);
		btnClick(so.getAddSalesOrder());
		Thread.sleep(3000);
		inputText(so.getCustomer(), "Daniel Vettori");
		Thread.sleep(2000);
//		btnClick(so.getDaniel());
//		Thread.sleep(3000);
		btnClick(so.getShipToDate());
		Thread.sleep(2000);
		String d = getFutureDate(14, "MM-dd-yyyy"); // Assuming getFutureDate returns a formatted date
		so.getShipToDate().sendKeys(d); // Assuming sendKeys method expects a String argument
		Thread.sleep(4000);
		inputText(so.getSalesChannel(), "UPE");
		Thread.sleep(3000);
//		btnClick(so.getBtnclkSalesChannel());
		btnClick(so.getBtnSalesChannel());
		//Enter();
		Thread.sleep(4000);
		inputText(so.getWarehouse(), "California - Commerce (USA) - UPIL");
		Thread.sleep(4000);
		btnClick(so.getBtnclkWarehouse());
	   //Enter();
		Thread.sleep(3000);
		btnClick(so.getEditbtn());
		Thread.sleep(5000);
		inputText(so.getItemCode(), "81320");
		//Enter();
		Thread.sleep(4000);
		btnClick(so.getBtnclkItemCode());
		Thread.sleep(2000);

	}
//	@Then("user click on Save Submit")
//	public void user_click_on_save_submit() throws InterruptedException {
//	    
//		SalesOrderPage so=new SalesOrderPage();
//		btnClick(so.getSaveso());
//		Thread.sleep(3000);
//		btnClick(so.getSubmitso());
//		Thread.sleep(2000);
//		btnClick(so.getYes());
//		Thread.sleep(2000);
//		
//	}

}
