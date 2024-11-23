package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_3_to_12_Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// we use implicitlyWait to load all web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		WebElement searchBox = driver.findElement(By.cssSelector("input[type=\"text\"]"));
		searchBox.click();
		searchBox.sendKeys("samsung s23");
		searchBox.submit();
		
		// Continue...
	}
}
