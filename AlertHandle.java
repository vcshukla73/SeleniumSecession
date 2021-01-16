package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct aler message");
			
		}
		else
		{
			System.out.println("Incorrect aler message");
		}
		alert.accept();
		//alert.dismiss();   if you see cancel or discard
		
		driver.switchTo().defaultContent();
			
		
		
		
	}

}
