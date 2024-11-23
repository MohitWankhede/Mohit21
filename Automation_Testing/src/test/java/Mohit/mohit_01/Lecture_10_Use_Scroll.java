package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Lecture_10_Use_Scroll extends DynamicCode {

	// Lecture 10 use JavascriptExecutor and scrollBy features
	public static void main(String[] args) throws Throwable {
		
		browser_Launch("Chrome");
		firstWayTakeScreenShot("s1BroweseLaunch");
		
		hit_Url("https://www.jeevansathi.com/");
		firstWayTakeScreenShot("s2UrlHit");
		
		// Casting Done Here
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,700)");
		
		scrollBy(0, 700);
		firstWayTakeScreenShot("s3ScrollBy700");
		
		Thread.sleep(Duration.ofSeconds(3));
		
//		js.executeScript("window.scrollBy(0,-700)");
		scrollBy(0, -700);
		firstWayTakeScreenShot("s4ScrollBy-700");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		scrollToBottom();
		firstWayTakeScreenShot("s5ScrollToBottom");

		driver.findElement(By.xpath("//a[text()=\"About Us\"]")).click();
		System.out.println("Title after click :" + driver.getTitle());
		firstWayTakeScreenShot("s6AboutUs");
		
		// navigate backward
		// option 1
		//driver.navigate().back();
		//option 2
		js.executeScript("window.history.back()");
		firstWayTakeScreenShot("s7BackToJeevansathi");

		
		// navigate forward
		// option 1
		//driver.navigate().forward();
		//option 2
		js.executeScript("window.history.forward()");		
		firstWayTakeScreenShot("s8ForwardToAboutUs");
		
		// refresh
		// option 1
		//driver.navigate().refresh();
		// option 2
		js.executeScript("window.history.go(0)");

		// by using this back to eclipse
		driver.close();
				
	}
}
