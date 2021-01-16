package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.findElement(By.id("u_0_2")).click();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		By month=By.id("month");
		By day=By.id("day");
		By year=By.id("year");
		By country=By.id("Form_submitForm_Country");
		

		Thread.sleep(3000);
		doselectvalueByVisibleText(country,"China");
		//doselectvalueByVisibleText(month,"May");
		//doselectvalueByVisibleText(day,"25");
		//doselectvalueByVisibleText(year,"1975");
		//doselectValueByIndex(day,4);
		//doselectValueByValue(year,"1973");
//		WebElement element=driver.findElement(month);
//		
//		Select select1=new Select(element);
		
		//select1.selectByVisibleText("May");
		//  select1.selectByIndex(2);
		
		
	}

	public static void doselectvalueByVisibleText(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void doselectValueByIndex(By locator,int index)
	{
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doselectValueByValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	
	
	public static WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	
	
	
	
	
	
	
}
