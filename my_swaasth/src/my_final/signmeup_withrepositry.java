      
// signmeup_infinal_without_use_properties_and_otp_verified_notupdate_ongithub
       package my_final;

		import java.awt.AWTException;
		import java.awt.Robot;
		import java.awt.event.KeyEvent;
		import java.io.FileInputStream;
		import java.io.IOException;
		import java.util.Iterator;
		import java.util.Properties;
		import java.util.Set;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class signmeup_withrepositry {
			public static void main(String[] args) throws InterruptedException, AWTException, IOException {
				System.setProperty("webdriver.chrome.driver", "/home/aj/Music/chromedriver");
				WebDriver driver = new ChromeDriver();
		//==========================================================================================================
//			open the url
		    driver.navigate().to("https://myswaasthfinal.sia.co.in/");
		//==============================================================================================================
		// click the and open the new tab
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			String parentwindowid = it.next();
			String childwindowid = it.next();
		//==================================move to child window=============================================================================
			driver.switchTo().window(childwindowid);
		//======================================open the gamil==========================================================================
			driver.navigate().to("https://accounts.google.com/signin/v2/identifier?hl=en-GB&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			Thread.sleep(5000);
		// ==================================GMAIL login===================================================================================
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("username");
			driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("//*[@type='password']")).sendKeys("password");
			driver.findElement(By.xpath("(//*[@class='RveJvd snByac'])[1]")).click();
			Thread.sleep(5000);
		// =================================================LOGIN====================================
		//============================================END====================================================
			driver.switchTo().window(parentwindowid);
			Thread.sleep(5000);
		//============================== signup_final_ button====================================================
			driver.findElement(By.xpath("(//*[@class='ui-button-text ui-clickable'])[1]")).click();
		//========================== sign in button
			driver.findElement(By.xpath("(//*[@class='ui-button-text ui-clickable'])[4]")).click();
			Thread.sleep(5000);
		//=========================================================================================================================
			driver.switchTo().window(parentwindowid);
		// password
		    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456");
		// Mobile no
		    driver.findElement(By.xpath("//*[@formcontrolname='mobile'][1]")).sendKeys("9971980197");
		// open the dropdown
			driver.findElement(By.xpath("//*[@class='ui-dropdown-label ui-inputtext ui-corner-all'][1]")).click();
			Thread.sleep(5000);
		// select the blood group in dropdown
			driver.findElement(By.xpath("(//*[@class='ui-dropdown-item ui-corner-all'])[1]")).click();
		// select the checkbooks "agree"
			driver.findElement(By.xpath("//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		// sign me up
			driver.findElement(By.xpath("//*[@class='ui-button-text ui-clickable'][1]")).click();
			Thread.sleep(5000);
			driver.switchTo().window(childwindowid);
		//============================ open the data base to get OTP============================================================
		   driver.navigate().to("http://apiv4.sia.co.in/mahaflox");
		// ===============================================================================================================
		// Refresh the current url
			driver.navigate().to(driver.getCurrentUrl());
			driver.findElement(By.id("id_username")).sendKeys("data base url");
			driver.findElement(By.id("id_password")).sendKeys("password");
		// ==============================Click login==========================================================
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		// click on Authentication
		    driver.findElement(By.xpath("//*[@title='Models in the Authentication application']")).click();
//			 click on account
		    driver.findElement(By.xpath("//*[@href='/mahaflox/authentication/account/'][1]")).click();
		// search a user in database	
			driver.findElement(By.xpath("//*[@type='text']")).sendKeys("username");
			driver.findElement(By.xpath("//*[@value='Search']")).click();
			driver.findElement(By.xpath("//*[@id=\"result_list\"]/tbody/tr/th/a")).click();
			Thread.sleep(5000);
		//==================================for scrool the page ============================================================	
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1800)", "");	
		//=================================================================================================================
		// Otp field  copy  =======================================================================================================
		   driver.findElement(By.id("id_random")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
			Thread.sleep(5000);
		   driver.close();
		   driver.switchTo().window(parentwindowid);
		   driver.findElement(By.xpath("//*[@formcontrolname='otp']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		   driver.findElement(By.xpath("//*[@label='Submit']")).click();
		//===========================login in page =======================================================================================
		    driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("username");
		    driver.findElement(By.xpath("(//*[@type='password'])")).sendKeys("password");
		    driver.findElement(By.xpath("(//*[@type='text'])[2]")).click();
		    
		    
		    
		
		
		
		
		
		
		
	}

}
