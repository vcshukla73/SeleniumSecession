package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MuliSelectionDropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();
		By Choice = By.cssSelector("span.comboTreeItemTitle");
		 selectchoice(Choice,"choice 2","choice 3","choice 6 2 3");
		// selectchoice(Choice, "choice 2");
		//selectchoice(Choice, "ALL");

		Thread.sleep(3000);
		driver.quit();

	}

	public static void selectchoice(By locator, String... value) {
		List<WebElement> choicelist = driver.findElements(locator);
		if (!value[0].equals("ALL")) {
			for (int i = 0; i < choicelist.size(); i++) {
				String text = choicelist.get(i).getText();

				for (int k = 0; k < value.length; k++) {
					if (text.equals(value[k])) {
						choicelist.get(i).click();
						break;
					}
				}

			}

		} else {

			try {
				for (int all = 0; all < choicelist.size(); all++) {
					choicelist.get(all).click();

				}

			} catch (Exception e) {

			}

		}

	}

}
