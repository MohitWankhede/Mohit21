package Mohit.mohit_01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class DynamicCode {

	public static WebDriver driver;

	public static void browser_Launch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		System.out.println("Launched Browser is = " + browser);
	}

	public static void hit_Url(String url) {
		driver.get(url);
		System.out.println("URL is = " + driver.getCurrentUrl());
		System.out.println("Url Title :=" + driver.getTitle());
	}

	
	// lecture 9 First way  
	public static void firstWayTakeScreenShot(String firstWayScreenShotName) throws Throwable {
		
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File("./jeevanSathiScreenShots/" + firstWayScreenShotName + ".png");
	FileHandler.copy(source, target);
	}
	
	// lecture 9 Second Way 
    public static void SecondWayTakeScreenShot(String secondWayScreenShotName) throws Throwable {
    	
    	String projectPath = System.getProperty("user.dir");
    	System.out.println(projectPath);
    	
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File target = new File(projectPath + "\\jeevanSathiScreenShots\\" + secondWayScreenShotName + ".png");
    	FileHandler.copy(source, target);
    }
    
  // Lecture 10 use JavascriptExecutor and scrollBy features
 // casting 
//    public static 
     
    public static void scrollBy(Integer x ,Integer y ) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy("+ x + "," + y +")");  	
    }
 // Working on it Tomorrow 26-10-2024 
//    public static void scrollToBottom() {
//    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//    }
    
	
}
