package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cust_Xpath1 {

	public static void main(String[] args) throws InterruptedException {

		//absoulute xpath  full hirekey grand parent to child
		//relative xpath
		
		//tag[@attr='value']
		//input[@id='username']
		//button[@id='loginBtn']
		//tag[@attr1='value' and @attr2='value']
		//input[@id='username' and @type='email']
		//input[@type='email' and @id]
		//input[@type and @id] 
		//input[@class='form-control private-form__control login-email']   valdi
		//input[@class='login-email']   not valid you can't write single class   in valid
		//form[@id='hs-login']//input[@id='username']  valid xpath grand parent and child if it's not direct child use //
		//select[@id='Form_submitForm_Industry']//option
		//contains
		//tag[contains(@attb,'valuel')]
		//input[contains(@id,'user')]
		
		//when you have dynamic values 
		//user123
		//user12345
		//user_1235
		//input[contains(@id,'usern') and @type='email']
		//*[@id='username' and contains(@type,'email')]
		//span[text()='Platform']
		//span[text()='Platform' and @class='nav-label']
		//input[starts-with(@id,'username')]
		
		//(//div[@class='private-form__input-wrapper']//input)[1]
		//(//ul[@class='nav navbar-nav navbar-right']/li/a)[4]
		//(//ul[@class='nav navbar-nav navbar-right']/li/a)[position()=4]
		//(//ul[@class='nav navbar-nav navbar-right']/li/a)[last()]
		//(//input[@type='text'])[last()]
		////input[@id='username']/../../../../../..   child to parent
		////input[@id='username']//parent::div jump child to parent using parent tag
		//(//div[@class='private-form__input-wrapper']//child::input)[1] using child tag
		////div[@class='input-group']//ancestor::div
		////a[text()='a b']//parent::td//preceding-sibling::td/input[@type='checkbox'] mostly use in webtable
		
		// css
		//when ever you have id #
		//#username
		//when ever you have class .
		//.form-control.private-form__control.login-email
		//#username.login-email
		//htmltag[attr='value']
		//input[type='email']
		//input[type='email'][id='username']
		//input[type][id]
		//div.input-group input   direct child and indirect child
		//div.input-group>input   direct child only
		//ul.footer-nav>li>a direct child
		//coma seprater
		//#username,#password,.private-checkbox__text,#loginBtn
		//ul.nav.navbar-nav.navbar-right li:nth-of-type(n)  select all
		//ul.nav.navbar-nav.navbar-right li:nth-of-type(4)  specifuce element
		//not operator in css
		//input.form-control.private-form__control:not(#username)
		//input.form-control.private-form__control:not(.login-password)
		
		
		
				
		
		
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//String footer=driver.findElement(By.xpath("html/body/div/div/footer/p")).getText();
		
		String footer=driver.findElement(By.xpath("//footer/p")).getText();
		
		System.out.println(footer);
		
		
		
		
		
		driver.quit();
		
		
	}

}
