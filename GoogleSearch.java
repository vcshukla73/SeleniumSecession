package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> sugesstionlist=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		System.out.println(sugesstionlist.size());
		// 1 .create a genric method to select the single from the list
		// 2. capture all the suggessions in a list and return
		// 3. http://automationpractice.com/index.php
		
		
		
		for(int i=0;i<sugesstionlist.size();i++) {
			System.out.println(sugesstionlist.get(i).getText());
			if(sugesstionlist.get(i).getText().equals("selenium python")) {
				sugesstionlist.get(i).click();
				break;
			}
			
			
		}
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
