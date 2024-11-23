package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_7_WebElement_Method_Practice {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
				
//		driver.findElement(By.cssSelector("select#searchDropdownBox")).click();
//		
//		//option 1 (ask to pratiksha mam which option is best for practice)
//		driver.findElement(By.cssSelector("option[value=\"search-alias=freshmeat\"]")).click();
//		// option 2
//		driver.findElement(By.cssSelector("option[value=\"search-alias=freshmeat\"]:nth-child(6)")).click();
				
			
		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		searchBox.click();
		
		searchBox.sendKeys("samsung s23");
		
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		Thread.sleep(Duration.ofSeconds(4));
	
		driver.findElement(By.xpath("// span [text() = \"256 GB\"]")).click();
		
		driver.findElement(By.xpath("(//i[@aria-hidden=\"true\"])[1]")).click();
		
		
		
		
	}
}
