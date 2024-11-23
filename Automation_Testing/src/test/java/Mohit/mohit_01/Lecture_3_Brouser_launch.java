package Mohit.mohit_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lecture_3_Brouser_launch {

	public static void main(String[] args) {
	
	// lecture 3rd start 
		
	WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
    System.out.println(driver.getTitle());
//    Thread.sl
	driver.close();


	
	}
}
