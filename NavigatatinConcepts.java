package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigatatinConcepts {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		
		//back and forward situation
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//refresh the browser
		
		driver.navigate().refresh();
		
		driver.navigate().forward();

		driver.close();
		
		
		
		
		
	}

}
