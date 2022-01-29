package selenium_salesforce.Saleforces.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager extends TestBase implements IseleniumDriverManager {

	
	@Override
	public void launchbroswer() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();	
	}

	@Override
	public void logintoapplication() throws Exception {
		d.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(3000);
	
		 
        d.findElement(By.id("username")).click();	   
	   d.findElement(By.id("username")).clear();
	   d.findElement(By.id("username")).sendKeys("udhayyadav333@gmail.com");
	   
	   d.findElement(By.id("password")).click();	   
	   d.findElement(By.id("password")).clear();
	   d.findElement(By.id("password")).sendKeys("Janu@143");
	   Thread.sleep(3000);
	   d.findElement(By.id("rememberUn")).click();
	   d.findElement(By.id("Login")).click();
	   Thread.sleep(5000);
	}


	@Override
	public void forgotpassword() throws Exception {
		d.get("https://login.salesforce.com/?locale=in");
		 d.findElement(By.id("username")).click();	   
		   d.findElement(By.id("username")).clear();
		   d.findElement(By.id("username")).sendKeys("udhayyadav333@gmail.com");
		   
		   d.findElement(By.id("forgot_password_link")).click();
		   Thread.sleep(3000);
		   
		   
		   
	}
	

	@Override
	public void quitapplication() {
		d.quit();
		
	}

	@Override
	public void waitForElementvisibleExplicit(int i, WebElement elemenudrop) {
		// TODO Auto-generated method stub
		
	}


}
