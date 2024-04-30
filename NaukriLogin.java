package Naukri.Login;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NaukriLogin {
	
	@FindBy(xpath = "")
	private WebElement usrernameFiled;
	
	 public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.naukri.com/");
		 Thread.sleep(1000);
			 driver.findElement(By.id("login_Layer")).click(); 
		 ////input[@placeholder="Enter your active Email ID / Username"]
			
			 Thread.sleep(5000);
			  
			  driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(
			  "saikumarqa25@gmail.com");
			  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(
			  "Sai@2502");
			  driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
			  
			  Thread.sleep(3000);
				/*
				 * driver.findElement(By.xpath("//div[@class='nI-gNb-sb__main']")).click();
				 * 
				 * driver.findElement(By.
				 * xpath("//input[@placeholder='Enter keyword / designation / companies']")).
				 * sendKeys("selenium  java");
				 * 
				 */
			  driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//a[@class='nI-gNb-info__sub-link']")).click();
			  Thread.sleep(3000);
			 
			  Thread.sleep(5000);
			  
			  WebElement uploadElement =	driver.findElement(By.xpath("//input[@value='Update resume']"));
			  
			  Actions action =  new Actions(driver);
			  action.moveToElement(uploadElement).click().perform();
			  
			  Robot rb= new Robot();
			  rb.delay(2000);
			  
			  StringSelection ss= new StringSelection("C:\\Users\\Admin\\Desktop\\Downloads\\Saikumar_K_Automation_CV.docx");
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			  
			  rb.keyPress(KeyEvent.VK_CONTROL);
			  rb.keyPress(KeyEvent.VK_V);
			  
			  rb.keyRelease(KeyEvent.VK_CONTROL);
	          rb.keyRelease(KeyEvent.VK_V);
	          
	          rb.keyPress(KeyEvent.VK_ENTER);
	          rb.keyRelease(KeyEvent.VK_ENTER);
			  
			  
			System.out.println("Upload Sucess");
			  
			  
			  System.in.read();
			  driver.quit();
			  
			  
	 }
}
	 
