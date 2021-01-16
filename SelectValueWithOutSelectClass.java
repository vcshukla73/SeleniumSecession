package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValueWithOutSelectClass {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    //driver.get("https://www.facebook.com/");
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    //driver.findElement(By.id("u_0_2")).click();	
//		String dob = "15-May-1973";
		Thread.sleep(2000);
		driver.manage().window().maximize();
		By dayoption=By.xpath("//select[@id='day']/option");
		By monthoption=By.xpath("//select[@id='month']/option");
		By yearoption=By.xpath("//select[@id='year']/option");
		
		By countylist=By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectvaluefromdropdown(driver,countylist,"China");
		
		
		//selectvaluefromdropdown(driver,dayoption,"25");
		//selectvaluefromdropdown(driver,monthoption,"May");
		//selectvaluefromdropdown(driver,yearoption,"1975");

		
	
		
		Thread.sleep(3000);		
		driver.quit();
		
	}
	
	public static void selectvaluefromdropdown(WebDriver driver,By locator,String value) {
		List<WebElement> daylist=driver.findElements(locator);
		System.out.println(daylist.size());
		for(int i=0;i<daylist.size();i++) {
			String day1= daylist.get(i).getText();
			if(day1.equals(value)) {
				daylist.get(i).click();
				break;
			}
					
		}
		
		
	}
	
	
	
	
	
	

}
