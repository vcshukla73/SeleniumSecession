package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrmProHeader {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		List<WebElement> crmheader=driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a"));
		
		System.out.println(crmheader.size());
		
		for(int i=0;i<crmheader.size();i++) {
			String text=crmheader.get(i).getText();
			System.out.println(text);
			crmheader.get(i).click();
			Thread.sleep(3000);
			crmheader=driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a"));
		}
		Thread.sleep(3000);
		driver.quit();
	}		
}
