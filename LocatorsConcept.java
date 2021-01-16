package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
    static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//driver.get("https://crmpro.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//1 .id   id is most of the time is unique 
//		driver.findElement(By.id("username")).sendKeys("a@a.gmail.com");
//		driver.findElement(By.id("password")).sendKeys("shukla");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2.
//		WebElement email=driver.findElement(By.id("username"));
//		WebElement password=driver.findElement(By.id("password"));
//		WebElement loginbtn=driver.findElement(By.id("loginBtn"));
//		email.sendKeys("a@a.gmail.com");
//		password.sendKeys("shukla");
//		loginbtn.click();
		
		
		
		By email=By.id("username");
		By password=By.id("password");
		By loginbtn=By.id("loginBtn");
		
		
//		driver.findElement(email).sendKeys("a&a.com");
//		driver.findElement(password).sendKeys("shukla");
//		driver.findElement(loginbtn).click();
//		
		Thread.sleep(3000);
		
//		getElement(email).sendKeys("a@a.com");
//		getElement(password).sendKeys("shukla");
//		getElement(loginbtn).click();
		
//		dosendKeys(email, "a@a.com");
//		dosendKeys(password, "shukla");
//		doClick(loginbtn);
		
		
		//2. name II
		//driver.findElement(By.name("username")).sendKeys("a@a.com");
		//
			
		//3. class name III(only if class is unique
		//form-control private-form__control login-email   //user name
		//form-control private-form__control login-password m-bottom-3   //password
		
//		driver.findElement(By.className("login-email")).sendKeys("a@a.com");
//		driver.findElement(By.className("login-password")).sendKeys("shukla");
		
		//4. xpath : is not an attribute
		
//		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("a@a.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("shukla");
//		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		
		//5/ cssSelector 
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("a@a.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("shukla");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//6 LinkText : only for links
		
		driver.findElement(By.linkText("Sign up")).click();
		
		//7. partial link text
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8 . tag name
		
		
	}
/*
 * this method is returning webelement passing by locator
 */
	public static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	public static void dosendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	
	
	
}
