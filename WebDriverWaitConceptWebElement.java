package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptWebElement {
    public static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/");
		//https://www.google.com/
		
		By username=By.name("username");
		By password=By.name("password");
		By loginBtn=By.className("btn-small");
		
		waitForElementPresent(username,10).sendKeys("batchautomation");
		waitForElementPresent(password,10).sendKeys("Test@12345");
		waitForElementToClickable(loginBtn,10).click();
		
		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		driver.findElement(username).sendKeys("batchautomation");
//		wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("Test@12345");
//		wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
		
		
		}

	public static WebElement waitForElementPresent(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static WebElement waitForElementToClickable(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	
}
