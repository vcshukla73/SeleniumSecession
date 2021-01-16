package seleniumPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverUtil {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://classic.freecrm.com/");
		//driver.get("https://www.freshworks.com/");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebDriverUtil UTL=new WebDriverUtil(driver);
		driver.findElement(By.name("proceed")).click();
		
		Alert alt=UTL.waitForAlertPresent(5);
		System.out.println(alt.getText());
		alt.accept();
		
		
		
		By username=By.name("username");
		By password=By.name("password");
		By loginBtn=By.className("btn-small");
		By footerLink=By.cssSelector("ul.footer-nav");
		
		
		
		
		
		
//		List<WebElement> footerList=UTL.waitForVisiableOfAllElements(footerLink, 10);
//		
//		System.out.println(footerList.size());
//		
//		for (WebElement webElement : footerList) {
//			System.out.println(webElement.getText());
//		}
		
		
		
		
//		UTL.waitForElementtoPresent(username, 10).sendKeys("batchautomation");
//		UTL.waitForElementtoPresent(password, 5).sendKeys("Test@12345");
//		UTL.waitForElementtoClickable(loginBtn, 5).click();
//		String text=UTL.doGetPageTitleContain("CRMPRO", 10);
//		System.out.println(text);
		
	}

}
