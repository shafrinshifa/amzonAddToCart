package mainSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static RemoteWebDriver driver;
	
	public static void launchBrowser() {
		String browser = loadProperties().getProperty("BROWSER");
		switch (browser) {
		case"CHROME":
			driver=new ChromeDriver();
			break;
		case"FIREFOX":
			driver=new FirefoxDriver();
		default:
			driver=new ChromeDriver();
			break;
		}
	}
	public static RemoteWebDriver getDriver() {
		return driver;
	}
	public static void setDriver(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void clickBtn(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	public static void enterText(WebElement element,String text) {
		element.sendKeys(text);
	}
	public static Properties loadProperties() {
		Properties properties= new Properties();
		try {
			properties.load(new FileInputStream("C:\\Users\\Shifana S\\eclipse-workspace\\Cucum\\Config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
		return properties;
	}
	
	

}
