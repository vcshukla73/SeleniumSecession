package seleniumPractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		System.out.println("Before Click.......");
		System.out.println("Nos of window opened by sele. "+driver.getWindowHandles().size());
		
		for(String window:driver.getWindowHandles()) {
			System.out.println(window);
		}
		
		System.out.println("After Click.......");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Opens in a new window")).click();
		Thread.sleep(2000);
		System.out.println("Nos of window opened by sele. "+driver.getWindowHandles().size());
		
		for(String window:driver.getWindowHandles()) {
			System.out.println(window);
		}
		
		ArrayList<String> newtab= new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(newtab.get(1));
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("draggable")).getText());
		System.out.println("current window handle "+driver.getWindowHandle());
		
		//  i want to close the newly opened window
		driver.close();
		
		System.out.println("After Close the current window");
		System.out.println("Nos of window opened by sele. "+driver.getWindowHandles().size());
		
		for(String window:driver.getWindowHandles()) {
			System.out.println(window);
		}
		
		Thread.sleep(2000);
		driver.switchTo().window(newtab.get(0));
		System.out.println("Current window "+driver.getWindowHandle());
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
	}

}
