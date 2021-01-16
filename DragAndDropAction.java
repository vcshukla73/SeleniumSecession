package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		
		WebElement sourceelement=driver.findElement(By.id("draggable"));
		WebElement targetelement=driver.findElement(By.id("droppable"));
		
		Actions ac=new Actions(driver);
		
//		ac.
//		clickAndHold(sourceelement).
//		moveToElement(targetelement).
//		release()
//		.build()
//		.perform();
		
	ac.dragAndDrop(sourceelement, targetelement).build().perform();
	//ac.dragAndDrop(sourceelement, targetelement).perform();	
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
