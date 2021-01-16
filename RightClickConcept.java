package seleniumPractice;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);

		WebElement rithclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions ac = new Actions(driver);
		ac.contextClick(rithclick).perform();

		Thread.sleep(3000);
		// ul[@class="context-menu-list
		// context-menu-root"]/li[contains(@class,'context-menu-icon')]
		// ul.context-menu-list.context-menu-root li.context-menu-icon
		java.util.List<WebElement> rightclickopt = driver.findElements(By.xpath(
				"//ul[@class=\"context-menu-list context-menu-root\"]" + "/li[contains(@class,'context-menu-icon')]"));
		System.out.println(rightclickopt.size());

		for (int i = 0; i < rightclickopt.size(); i++) {
			String text = rightclickopt.get(i).getText();
			System.out.println(text);
			if (text.equals("Copy")) {
				rightclickopt.get(i).click();
				break;
			}

		}

		Thread.sleep(3000);

		driver.quit();

	}

}
