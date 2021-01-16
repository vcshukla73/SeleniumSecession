package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptsForTitle {

	// webdriver wait is a class
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		driver.get("https://classic.freecrm.com/");
		System.out.println(doGetPageTitleContain("CRMPRO",10));
		System.out.println(doGetPageUrlContains("classic",10));
		System.out.println(doGetPageTitleIs("CRMPRO - CRM software for customer relationship management, sales, and support.",10));
		// wait.until(ExpectedConditions.titleContains("Amazon"));
//		wait.until(ExpectedConditions
//				.titleIs("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
//		wait.until(ExpectedConditions.urlContains("amazon"));
//
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());

		
		
		
		driver.quit();

	}
	

	public static String doGetPageTitleContain(String title,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout );
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	public static String doGetPageTitleIs(String title,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout );
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	public static String doGetPageUrlContains(String urlValue,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout );
		wait.until(ExpectedConditions.urlContains(urlValue));
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
}
