package seleniumPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {
	private WebDriver driver;

	public WebDriverUtil(WebDriver driver) {
		this.driver = driver;
	}

	
	
///// **************** This is my Wait Class Methods **************	
	
	public WebElement waitForElementtoPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public WebElement waitForElementtoClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement getElement(By locator) {
		WebElement element;
		element = driver.findElement(locator);
		return element;
	}

	public WebElement waitForElementtoVisiable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));

	}

	public String doGetPageTitleContain(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	public String doGetPageTitleIs(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}

	public String doGetPageUrlContains(String urlValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.urlContains(urlValue));
		return driver.getCurrentUrl();
	}

	public List<WebElement> waitForVisiableOfAllElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

public Alert waitForAlertPresent(int timeout) {
	WebDriverWait wait=new WebDriverWait(driver,timeout);
	return wait.until(ExpectedConditions.alertIsPresent());
	
}


//**************  This is my Action Class Methods *************

public  void actionsendkeys(By locator,String value) {
	Actions ac = new Actions(driver);
	ac.sendKeys(getElement(locator),value).perform();
}
public  void actionclick(By locator) {
	Actions ac = new Actions(driver);
	ac.click(getElement(locator)).perform();
}
// **************** This is my Drop Down Methods *************
public List<String> getDropdownOptions(By locator) {
	   List<String> optionsList=new ArrayList();
	   
	    Select select=new Select(getElement(locator));
		List<WebElement> elements=select.getOptions(); 
		//System.out.println(elements.size());
		for (WebElement webElement : elements) {
			String text=webElement.getText();
			optionsList.add(text);
		}
	return optionsList;
	
}

public  void doSelectValuesByVisibleText(By locator, String value){
	Select select = new Select(getElement(locator));
	select.selectByVisibleText(value);
}

public  void doSelectValuesByIndex(By locator, int index){
	Select select = new Select(getElement(locator));
	select.selectByIndex(index);
}

public  void doSelectValuesByValue(By locator, String value){
	Select select = new Select(getElement(locator));
	select.selectByValue(value);
}

public  void selectchoice(By locator, String... value) {
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
