package Mohit.mohit_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Lecture_8_Use_Dynamic_Code extends DynamicCode {

	public static void main(String[] args) {
		
		browser_Launch("chrome");
		hit_Url("https://www.flipkart.com/");
		
		 WebElement searchBox = driver.findElement(By.cssSelector("input.Pke_EE"));
		 searchBox.click();
		 
		 searchBox.sendKeys("Analog Watch");
		 
		 driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}
}
