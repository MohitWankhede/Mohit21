package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lecture_4_Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// we use implicitlyWait to load all web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.snapchat.com/");
		
		// we use explicit wait when implicitlyWait do not work or they do not find
		// web elements at given time		
		// there are two types of explicit wait 
		// 1. WebDriver wait 2. fluent wait (this two is class)
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		
		// if we want to repeat the process after particular time 		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		
		//	Alternate option of explicit wait
		Thread.sleep(5000);
		// just for example		
		driver.findElement(null);
			
	}
}
