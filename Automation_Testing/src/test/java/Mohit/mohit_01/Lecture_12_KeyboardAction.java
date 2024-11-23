package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Lecture_12_KeyboardAction extends DynamicCode{

	public static void main(String[] args) throws Throwable {
		
		browser_Launch("chrome");
		
		hit_Url("https://www.jeevansathi.com/");
		
		Actions action = new Actions(driver);
		
		  WebElement email = driver.findElement(By.cssSelector("input#email"));
		  action.moveToElement(email).click().sendKeys("mohit21@gmail.com").build().perform();
		  // copy email address
		  action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		  action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		  // option 1 
		  action.keyDown(Keys.TAB).build().perform();
		  action.keyDown(Keys.TAB).build().perform();
		  action.keyDown(Keys.TAB).build().perform();
		  
		  action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		  
		  WebElement eyeButton = driver.findElement(By.cssSelector("div#eye"));
		  action.moveToElement(eyeButton).click().build().perform();
		  
		  
		// option 2
//		  WebElement password = driver.findElement(By.cssSelector("input#password"));
//		  
//		  action.moveToElement(password).click().keyDown(Keys.CONTROL)
//		  .sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//		  
//		  WebElement eyeButton = driver.findElement(By.cssSelector("div#eye"));
//		  action.moveToElement(eyeButton).click().build().perform();

		  
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  Thread.sleep(Duration.ofSeconds(2));
		  
		  jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		  
		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_DOWN).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_UP).build().perform();
//		  
//		  Thread.sleep(Duration.ofSeconds(2));
//		  action.keyDown(Keys.PAGE_UP).build().perform();
		  
		  
		  
	}
}
