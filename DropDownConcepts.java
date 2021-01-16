package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConcepts {
      static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    //driver.get("https://www.facebook.com/");
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.findElement(By.id("u_0_2")).click();	
//		String dob = "15-May-1973";
		Thread.sleep(5000);
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		By country = By.id("Form_submitForm_Country");
		//WebElement day1=driver.findElement(day);
		//getDropdownOptions(day);
		//getDropdownOptions(month);
		//getDropdownOptions(year);
		
		//List<String> daylist=getDropdownOptions(day);
		//System.out.println(daylist);
		//List<String> monthlist=getDropdownOptions(month);
		//System.out.println(monthlist);
        
		List<String> countrylist= getDropdownOptions(country);
         System.out.println(countrylist);
		
		
		
//		for(int i=0;i<elements.size();i++) {
//			String text=elements.get(i).getText();
//			System.out.println(text);
//		}
	
		
	Thread.sleep(4000);
	driver.quit();
	}

	public static List<String> getDropdownOptions(By locator) {
	   List<String> optionsList=new ArrayList();
	   
	    Select select=new Select(getElement(locator));
		List<WebElement> elements=select.getOptions(); 
		//System.out.println(elements.size());
		for (WebElement webElement : elements) {
			String text=webElement.getText();
			optionsList.add(text);
		}
	return optionsList;
	
}
public static WebElement getElement(By locator) {
	WebElement element = driver.findElement(locator);
	return element;
}






}
