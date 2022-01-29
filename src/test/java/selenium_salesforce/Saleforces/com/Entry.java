package selenium_salesforce.Saleforces.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Entry extends TestBase {
	
public static void main(String[] args) throws Exception {
	IseleniumDriverManager sel= new DriverManager();
	
	sel.launchbroswer();
	sel.logintoapplication();
	//sel.forgotpassword();
//	ExperimentuserMenuDropdwon(sel);
	ExperimentMySettings(sel);
//    ExperimentDeveloperConsole(sel);
//	ExperimentFileupload(sel);
//   ExperimentLogOut(sel);
	sel.quitapplication();
	
}


private static void ExperimentFileupload(IseleniumDriverManager sel) throws Exception {
	 WebElement elemenudrop = d.findElement(By.id("userNav-arrow"));
	   sel.waitForElementvisibleExplicit(10, elemenudrop);
	   elemenudrop.click();
	   Thread.sleep(2000);
	   
	   
	   WebElement elemyprofile = d.findElement(By.xpath("(//a[@class='menuButtonMenuLink firstMenuItem'])[1]"));
	   sel.waitForElementvisibleExplicit(10, elemyprofile);
	   elemyprofile.click();
	   Thread.sleep(3000);
	   
	   
	   
	   WebElement elemodarate = d.findElement(By.id("displayBadge"));
	   sel.waitForElementvisibleExplicit(10, elemodarate);
	   elemodarate.click();
	   Thread.sleep(5000);
			   
	
        d.switchTo().frame(d.findElement(By.id("//div[@id='uploadPhoto']")));
	   
	   WebElement elechoosefile = d.findElement(By.id("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
	  sel.waitForElementvisibleExplicit(10, elechoosefile);
	   elechoosefile.click();
	   Thread.sleep(5000);
	
	   
	   
	   
	   
}


private static void ExperimentLogOut(IseleniumDriverManager sel) throws Exception {
	 WebElement elemenudrop = d.findElement(By.id("userNav-arrow"));
	   sel.waitForElementvisibleExplicit(10, elemenudrop);
	   elemenudrop.click();
	   Thread.sleep(2000);
	   
	   WebElement eleLogout = d.findElement(By.xpath("//a[@title='Logout']"));
	   sel.waitForElementvisibleExplicit(10, eleLogout);
	   eleLogout.click();
	   Thread.sleep(3000);
			   
	
}


private static void ExperimentDeveloperConsole(IseleniumDriverManager sel) throws Exception {
	  WebElement elemenudrop = d.findElement(By.id("userNav-arrow"));
	   sel.waitForElementvisibleExplicit(10, elemenudrop);
	   elemenudrop.click();
	   Thread.sleep(3000);
	   
	   
   WebElement eledevelopConsole = d.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
   sel.waitForElementvisibleExplicit(10, eledevelopConsole);
   eledevelopConsole.click();
   Thread.sleep(3000);
		   
	
}


private static void ExperimentMySettings(IseleniumDriverManager sel) throws Exception {
	  WebElement elemenudrop = d.findElement(By.id("userNav-arrow"));
	   sel.waitForElementvisibleExplicit(10, elemenudrop);
	   elemenudrop.click();
	   Thread.sleep(3000);
	   
	  WebElement elemysetting = d.findElement(By.xpath("//a[@title='My Settings']"));
	   sel.waitForElementvisibleExplicit(10, elemysetting);
	   elemysetting.click();
	   Thread.sleep(3000);
	   
	   
	   WebElement elepersonal = d.findElement(By.id("PersonalInfo_font"));
	   sel.waitForElementvisibleExplicit(10, elepersonal);
	   elepersonal.click();
	   Thread.sleep(3000);
	 
	   WebElement eleloginhistory = d.findElement(By.id("LoginHistory_font"));
	   sel.waitForElementvisibleExplicit(10, eleloginhistory);
	   eleloginhistory.click();
	   Thread.sleep(3000);
	 
	   
	   WebElement eledisplaylayout = d.findElement(By.id("DisplayAndLayout_font"));
	   sel.waitForElementvisibleExplicit(10, eledisplaylayout );
	   eledisplaylayout .click();
	   Thread.sleep(3000);
	   
	   
	   WebElement elecosmytab = d.findElement(By.id("CustomizeTabs_font"));
	   sel.waitForElementvisibleExplicit(10,  elecosmytab);
	   elecosmytab.click();  
	   Thread.sleep(3000);
	   
	   Select table = new Select (d.findElement(By.id("p4")));
	   table.selectByIndex(8);
	   Thread.sleep(3000);
	   
	   Select Report = new Select (d.findElement(By.xpath("//option[@value='report']")));
	   Report.selectByValue("report");
	   Thread.sleep(3000);
	   
	   WebElement add = d.findElement(By.xpath("//img[@class='rightArrowIcon']"));
	   sel.waitForElementvisibleExplicit(10, add);
	   add.click();
	   Thread.sleep(3000);
	   
	   
	   WebElement save = d.findElement(By.xpath("//input[@title='Save']"));
	   sel.waitForElementvisibleExplicit(10, save);
	   save.click();
	   Thread.sleep(5000);
	   
	   
	   
	   WebElement eleEMAIL = d.findElement(By.id("EmailSetup_font"));
	   sel.waitForElementvisibleExplicit(10,  eleEMAIL );
	   eleEMAIL.click();
	   Thread.sleep(3000);
	   
	   WebElement elemyEMAILSet= d.findElement(By.id("EmailSettings_font"));
	   sel.waitForElementvisibleExplicit(10,  elemyEMAILSet );
	   elemyEMAILSet.click();
	   Thread.sleep(3000);
	    
	   
	   WebElement elemyEMAILsave= d.findElement(By.xpath("//input[@title='Save']"));
	   sel.waitForElementvisibleExplicit(10,  elemyEMAILsave );
	   elemyEMAILsave.click();
	   Thread.sleep(3000);
	    
	   
	   
	   WebElement elemyclander= d.findElement(By.id("CalendarAndReminders_font"));
	   sel.waitForElementvisibleExplicit(10,  elemyclander );
	   elemyclander.click();
	   Thread.sleep(3000);
	    
	   
	   
	   
	   
}

private static void ExperimentuserMenuDropdwon(IseleniumDriverManager sel) throws Exception {
	   WebElement elemenudrop = d.findElement(By.id("userNav-arrow"));
	   sel.waitForElementvisibleExplicit(10, elemenudrop);
	   elemenudrop.click();
	   Thread.sleep(3000);
	   
	   WebElement elemyprofile = d.findElement(By.xpath("(//a[@class='menuButtonMenuLink firstMenuItem'])[1]"));
	   sel.waitForElementvisibleExplicit(10, elemyprofile);
	   elemyprofile.click();
	   Thread.sleep(3000);
	   
	   
	   WebElement eleEdit = d.findElement(By.xpath("(//img[@title='Edit Profile'])[1]"));
	   sel.waitForElementvisibleExplicit(10, eleEdit);
	   eleEdit.click();
	   Thread.sleep(3000);
	   
	   d.switchTo().frame(d.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
	   WebElement UD=d.findElement(By.xpath("//a[contains(text(),'About')]"));
	   UD.click();
	   Thread.sleep(3000);
	   d.findElement(By.id("lastName")).click();
	   d.findElement(By.id("lastName")).clear();
	   d.findElement(By.id("lastName")).sendKeys("yadav");
	   Thread.sleep(3000);
	   
	   d.findElement(By.xpath("//input[@value='Save All']")).click();
	   Thread.sleep(3000);
	   
	   
} 


		
	}


