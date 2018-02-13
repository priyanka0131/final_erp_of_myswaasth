package my_final;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class data_otp_approve {

        	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			System.setProperty("webdriver.chrome.driver", "/home/aj/Music/chromedriver");
			WebDriver driver = new ChromeDriver();
		    driver.navigate().to("data_base_url");
// =================================Refresh the current url==============================================================================
		
			driver.navigate().to(driver.getCurrentUrl());
			driver.findElement(By.id("id_username")).sendKeys("user_name");
			driver.findElement(By.id("id_password")).sendKeys("password");
// ==============================Click login================================================================
			driver.findElement(By.xpath("//*[@type='submit']")).click();
// =========================click on Authentication=========================================================
		    driver.findElement(By.xpath("//*[@title='Models in the Authentication application']")).click();
// =========================== click on account=============================================================
		    driver.findElement(By.xpath("//*[@href='/mahaflox/authentication/account/'][1]")).click();
// ============================search a user in database=====================================================	
			driver.findElement(By.xpath("//*[@type='text']")).sendKeys("priyankachaudhary978@gmail.com");
			driver.findElement(By.xpath("//*[@value='Search']")).click();
			driver.findElement(By.xpath("//*[@id=\"result_list\"]/tbody/tr/th/a")).click();
			Thread.sleep(5000);
//==================================for scrool the page ============================================================	
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1800)", "");	
//==============================================Otp field  copy===================================================================
		   driver.findElement(By.id("id_random")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		   Thread.sleep(5000);
		   driver.close();
		  // driver.switchTo().window(parentwindowid);
		   driver.findElement(By.xpath("//*[@formcontrolname='otp']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		   driver.findElement(By.xpath("//*[@label='Submit']")).click();
		   driver.findElement(By.xpath("")).click();
		   
		   
	}

}
