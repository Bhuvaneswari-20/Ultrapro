package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.BaseClass;

public class SalesOrderPage extends BaseClass {

	public SalesOrderPage() {
	    PageFactory.initElements(driver, this);
	    }
	
	@FindBy(xpath = "//*[@id=\"navbar-search\"]")
	private WebElement Search;
	
	//@FindBy(xpath = "//ul[@id=\"awesomplete_list_1\"]//li[1]")
	//private WebElement SalesOrder;
	
	@FindBy(xpath = "(//*[@id=\"awesomplete_list_1\"]//li//a//span)[1]")
	private WebElement SalesOrder;
	
	//@FindBy(xpath = "//button[@class='btn btn-primary btn-sm primary-action']")
	//private WebElement AddSalesOrder;
	
	@FindBy(xpath = "(//*[@id=\"page-List/Sales Order/List\"]//button)[7]")
	private WebElement AddSalesOrder;
	
//	@FindBy(xpath = "(//*[text()=\"Sales Order List\"])")
//	private WebElement AddSalesOrder;
	
	
	@FindBy(xpath = "(//*[@id=\"sales-order-__details\"]//input)[4]")
	private WebElement Customer;
	
	@FindBy(xpath = "(//*[@id=\"awesomplete_list_7\"]//li//a//p)[1]")
	private WebElement Daniel;
	

	@FindBy(xpath = "(//input[@class='input-with-feedback form-control bold'])[3]")
	private WebElement ShipToDate;
	
	@FindBy(xpath = "(//*[@id=\"sales-order-__details\"]//input)[33]")
	private WebElement SalesChannel;
	
//	@FindBy(xpath = "(//*[text()=\"UPE\"])")
//	private WebElement btnclkSalesChannel;
	
	@FindBy(xpath = "//*[@id=\"awesomplete_list_9\"]/li[1]/a/p")
	private WebElement btnSalesChannel;

	@FindBy(xpath = "(//*[@id=\"sales-order-__details\"]/div[5]//input)[1]")
	private WebElement Warehouse;
	
	@FindBy(xpath = "(//*[@id=\"awesomplete_list_15\"]//li//a//p)[1]")
	private WebElement btnclkWarehouse;
	

	

//	@FindBy(xpath = "//*[@href=\"#icon-edit\"]")
//	private WebElement Editbtn;
	
	@FindBy(xpath = "(//*[@id=\"sales-order-__details\"]//div[9]/div)[3]")
	private WebElement Editbtn;
	
	
//	@FindBy(xpath = "(//*[@id=\"sales-order-__details\"]//div//input)[60]")
//	private WebElement Itemcodetable;

	@FindBy(xpath = "(//div[@id=\"sales-order-__details\"]//input)[58]")
	private WebElement ItemCode;
	
	@FindBy(xpath = "(//*[@id=\"awesomplete_list_65\"]//li//a//p)[1]")
	private WebElement btnclkItemCode;
	
	
	
//	@FindBy(xpath = "(//*[@id=\"sales-order-__details\"]//input)[76]")
//	private WebElement Qty;
//	
//	@FindBy(xpath = "(//*[@id=\"sales-order-__details\"]//button)[1]")
//	private WebElement Minimize;
//	
//	@FindBy(xpath = "(//*[@id=\"page-Sales Order\"]//button)[7]")
//	private WebElement Saveso;
//	
//	@FindBy(xpath = "(//*[@id=\"page-Sales Order\"]//button)[9]")
//	private WebElement Submitso;
//	
//	@FindBy(xpath = "//button[@class=\"btn btn-primary btn-sm btn-modal-primary\"]")
//    private WebElement Yes;
	
		


	


	public WebElement getSearch() {
		return Search;
	}

	public WebElement getSalesOrder() {
		return SalesOrder;
	}
	
	public WebElement getAddSalesOrder() {
		return AddSalesOrder;
	}
	
	public WebElement getCustomer() {
		return Customer;
	}

	public WebElement getDaniel() {
		return Daniel;
	}
	
	
	public WebElement getShipToDate() {
		return ShipToDate;
	}

	public String getShipToDate(String futureda) {
		return futureda;
	}
	
	public WebElement getSalesChannel() {
		return SalesChannel;
	}
	
	public WebElement getBtnSalesChannel() {
		return btnSalesChannel;
	}
	
//	public WebElement getBtnclkSalesChannel() {
//		return btnclkSalesChannel;
//	}
	
	public WebElement getWarehouse() {
		return Warehouse;
	}
	
	public WebElement getBtnclkWarehouse() {
		return btnclkWarehouse;
	}

	public WebElement getEditbtn() {
		return Editbtn;
	}
	
	public WebElement getItemCode() {
		return ItemCode;
	}
	
	public WebElement getBtnclkItemCode() {
		return btnclkItemCode;
	}
	
//	public WebElement getQty() {
//		return Qty;
//	}
//
//	public WebElement getMinimize() {
//		return Minimize;
//	}
//	
//	public WebElement getSaveso() {
//		return Saveso;
//	}
//	
//	public WebElement getSubmitso() {
//		return Submitso;
//	}
//
//	public WebElement getYes() {
//		return Yes;
//	}
//
//	
}
