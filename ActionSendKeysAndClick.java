package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendKeysAndClick {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://crmpro.com/");
		Thread.sleep(3000);
		

		By email = By.name("username");
		By password = By.name("password");
		By loginbtn = By.xpath("//input[@class='btn btn-small']");

		//Actions ac = new Actions(driver);

//		ac.sendKeys(getElement(email), "batchautomation").perform();
//		ac.sendKeys(getElement(password), "Test@12345").perform();
//		ac.click(getElement(loginbtn)).perform();

		actionsendkeys(email,"batchautomation");
		actionsendkeys(password,"Test@12345");
		actionclick(loginbtn);

		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
///         this function work for action sendkeys and click
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public static void actionsendkeys(By locator,String value) {
		Actions ac = new Actions(driver);
		ac.sendKeys(getElement(locator),value).perform();
	}
	public static void actionclick(By locator) {
		Actions ac = new Actions(driver);
		ac.click(getElement(locator)).perform();
	}
	
	
	
	
	
	
	
}
