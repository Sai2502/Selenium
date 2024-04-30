package Naukri.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://paytm.com/");
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[.='Paytm for Consumer']"))).perform();
		
		
		
		
		
		
		  
		 
		
		
	}
	
	

	//using click action method

	
}
