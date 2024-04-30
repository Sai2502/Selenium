package Naukri.Login;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args)  throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		

		File sourcFile = driver.getScreenshotAs(OutputType.FILE);
		File Dis = new File("./ScreenShot/Sai.png");
		FileUtils.copyFile(sourcFile, Dis);
	  System.out.println("Saved");
		
	}
	
}
