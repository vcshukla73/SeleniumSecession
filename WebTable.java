package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/14222/scorecard/299004/pakistan-vs-south-africa-1st-test-south-africa-tour-of-pakistan-2007-08");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		List<WebElement> bowlerInfo=driver.findElements(By.xpath("(//a[contains(text(),'AB de Villiers')])[1]//parent::td//following-sibling::td"));
		
		System.out.println(bowlerInfo.size());
		
//		for(int i=0;i<bowlerInfo.size();i++) {
//			
//			System.out.println(bowlerInfo.get(i).getText());
//			
//			
//		}
		
		for (WebElement webElement : bowlerInfo) {
			 System.out.print(webElement.getText()+"    ");
			 
		}
		
		String bowlername=driver.findElement(By.xpath("((//a[contains(text(),'AB de Villiers')])[1]//parent::td//following-sibling::td)[1]")).getText();
		System.out.println(bowlername);
		
		
		
		
		
	}

}
