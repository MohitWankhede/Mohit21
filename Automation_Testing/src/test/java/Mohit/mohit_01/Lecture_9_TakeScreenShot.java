package Mohit.mohit_01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Lecture_9_TakeScreenShot extends DynamicCode {

	// in Lecture 9 after 28 min audio and video mismatch so this video is pending
	public static void main(String[] args) throws Throwable {
		
		browser_Launch("chrome");
		
		// tell driver to take the screenshot
		// use TakeScreenshot interface and use casting
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);		
	// create object of file class
		File target = new File("./Evidences/Browser_launch.png");
		FileHandler.copy(source, target);
		
		hit_Url("https://www.snapdeal.com/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./Evidences/Hit_url.png");
		FileHandler.copy(source1, target1);
		
		// 2nd way of screenshot
		// By declaring project path
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File(projectPath + "\\Evidences\\take_screeShot.png");
		FileHandler.copy(source2, target2);
	}
}
