package Helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		driver.get(url);
		
		driver.manage().window().maximize();
		}
	
	public static void browserLaunchF(String url) {
		FirefoxOptions options = new FirefoxOptions();
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver(options);
		driver.get(url);
		
		driver.manage().window().maximize();
		}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void dropDownText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public void Enter() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
    }

	public static void takeScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

	}

	public static void printValue(WebElement element) {
		element.getAttribute("Value");
	}

	/*public static void getText(LocalDate localDate) {
		System.out.println(localDate.getText());
	}*/
	
	public static void getText(WebElement element) {
        System.out.println(element.getText());
    }
	
	public static void enter(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }
	
    public static String getFutureDate(int daysToAdd, String format) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, daysToAdd);
         Date futureDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(futureDate);
    }
    
    public void cleartext(WebElement element) {
        element.clear();
    }
    
    public void JavaScriptExecutor(WebElement element, String text) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value = arguments[1];", element, text);
    }
    
     public void scrollDown() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
        }

     
}
