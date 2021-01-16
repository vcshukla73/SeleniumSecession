package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagConcepts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links "+linklist.size());
		
		for(int i=0;i<linklist.size();i++) {
			
			String link=linklist.get(i).getText();
			
			if(!link.isEmpty()) {
			   System.out.println(link);
			}
			
			
			
			
					
		}
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
