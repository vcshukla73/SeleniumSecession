package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {
    static String expectedTitle="Google";  
	public static void main(String[] args) throws InterruptedException {

     //setup driver for windows
		
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\vaibhav\\firefoxdriver\\geckodriver.exe");	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav\\chromedriver2\\chromedriver.exe");	
	//MAC
	//System.setProperty("webdriver.chrome.driver", "/Users/vaibhav/Downloads/chromedriver");
	//WebDriver driver=new ChromeDriver();  //top casting
	 WebDriver driver=new FirefoxDriver();
	 
	//ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	//driver.get("http://yahoo.com");
	
    //  launchUrl("yahoo.com")	
	//  getPagetitle();
	
	
	  String actualTitle=driver.getTitle();
	  System.out.println(actualTitle);
	  
	  //verification point checkpoint expected vs actual : assertion
	
		
		if(actualTitle.equals(expectedTitle)) {
			 System.out.println("correct title");
		}
		else
		{
			 System.out.println("incorrect title");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("google")) {
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
		
		Thread.sleep(3000);
		driver.close();  //driver the browser
		
		
	}

}
