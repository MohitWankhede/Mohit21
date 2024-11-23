package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDynamicCode {
	
        public static WebDriver driver;
		public static void launchBrowser(String browser) {
					
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				System.out.println("Title Of Browser :- "+ browser);  
			}
			
			
	}
}
