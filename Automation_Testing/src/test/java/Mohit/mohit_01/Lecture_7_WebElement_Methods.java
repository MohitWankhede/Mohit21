package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_7_WebElement_Methods {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		// Lecture 7 WebElement Method Compress
		
		// use click() method
		 WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		 
		 searchBox.click();
		 
		 // send keys
		 searchBox.sendKeys("Mobile");
		 
		 Thread.sleep(Duration.ofSeconds(3));
		 // clear() Method
		 searchBox.clear();
		 
		 searchBox.sendKeys("Books");
		 // getAttribute("value") 
		 System.out.println(searchBox.getAttribute("value"));
		
		 // getLocation() Method
		System.out.println("The x cordinate of searchBox = " + searchBox.getLocation().x);
		System.out.println("The y cordinate of searchBox = " + searchBox.getLocation().y);
		
		//getSize()
		System.out.println("The size of searchBox = " + searchBox.getSize());
	}

}
