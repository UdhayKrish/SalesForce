package selenium_salesforce.Saleforces.com;

import org.openqa.selenium.WebElement;

public interface IseleniumDriverManager {
	
	void launchbroswer();
    void logintoapplication() throws Exception;
	void quitapplication();
	void forgotpassword() throws Exception;
	void waitForElementvisibleExplicit(int i,WebElement elemenudrop );
  
}
