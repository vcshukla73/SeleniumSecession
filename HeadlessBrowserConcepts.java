package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserConcepts {
   public static String expectedTitle="Google";
	public static void main(String[] args) {

		//headless no browser
		//testing is happing behind the scene
		//fast ? yes
		//headed mode with browser
		
		WebDriverManager.chromedriver().setup();
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		//co.addArguments("--incognito");
		//WebDriver driver=new ChromeDriver(co);   //launch browser
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo=new FirefoxOptions();
		fo.addArguments("--headless");
		fo.addArguments("--incognito");
		WebDriver driver=new FirefoxDriver(fo);   //launch browser
			
		
		
		
		driver.get("http://www.google.com");
		
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
