package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//1. Implictly wait : global wait and applied for all webelement in page 
		//it will applyy e1,e2,e3 ..... en
		//you element will be appear in 10 seconds it's not going to wait 5 seconds
		driver.manage().window().maximize();
		
		driver.get("http://uitestpractice.com/Students/Contact");
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("This")).click();
		//Thread.sleep(15000);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(50,TimeUnit.MILLISECONDS);
				
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ContactUs")));
		
		String result=driver.findElement(By.className("ContactUs")).getText();
		//System.out.println(result);
		if(result.contains("Python"))
		{
			System.out.println("Test Pass");
		}
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS); //nulify the implictly wait
		
		
		
		driver.quit();
		
		
	}

}
