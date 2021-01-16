package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(2000);
		//frame or iframe(short for inline frame) both are same
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		WebElement header=driver.findElement(By.tagName("h2"));
		//WebElement header=driver.findElement(By.xpath("/html/body/h2"));
		//  WebElement header=driver.findElement(By.cssSelector("body > h2"));
		
		System.out.println(header.getText());
		
		
	   Thread.sleep(3000);
	   driver.quit();

	}

}
