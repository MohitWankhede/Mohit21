package Mohit.mohit_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Lecture_11_MouseActions extends DynamicCode {

	public static void main(String[] args) {
		// Actions Class provides user action like mouse action and keyboard action
		
		// Steps 
		// Create object of action class, it accepts the argument as a reference variable of webdriver Interface 
		// with the help of reference variable of action class object you can perform diffrent oprations
		
		// ** Mouse Action ** methods
		// click() = it click on current location
		// move to element() = move cursor to specific webelement
		// contextclick() = use for right click
		// double click() = double click
		// drag and drop (source, target)
		// click and hold()
		// release()
		// drag and drop (source, x offset, y offset) = use for slidder
		
		// Imp 
		// when we use Actions class methods then at the end of method compulsory add .build().perform()
		
		browser_Launch("chrome");
		
		hit_Url("https://jqueryui.com/");
			
		// create object of Actions Class
		Actions action = new Actions(driver);
		
		
		WebElement draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
		action.moveToElement(draggable).click().build().perform();
		System.out.println("After click on Draggable : " + driver.getTitle());
		
		WebElement themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
		// Generally we don't use contextClick(), this method use for right click operation
		// action.moveToElement(themes).contextClick().build().perform();
		
		action.moveToElement(themes).doubleClick().build().perform();
		System.out.println("After click on Themes : " + driver.getTitle());
		
		WebElement demos = driver.findElement(By.xpath("//a[text()=\"Demos\"]"));
		action.moveToElement(demos).click().build().perform();
		System.out.println("After click on Demos : " + driver.getTitle());
		
		WebElement slider = driver.findElement(By.xpath("//a[text()=\"Slider\"]"));
		action.moveToElement(slider).click().build().perform();
		System.out.println("After click on Slider : " + driver.getTitle());

		WebElement frame = driver.findElement(By.cssSelector("iframe[class=\"demo-frame\"]"));
		// switchTo() use for divert window to frame
		driver.switchTo().frame(frame);
		
		WebElement innerSlider = driver.findElement(By.cssSelector("span[tabindex=\"0\"]"));
		action.moveToElement(innerSlider).dragAndDropBy(innerSlider, 400, 0).build().perform();
		
	// outside of frame defaultContent() means jaha aap pahile the vahi pe vapas aa jayenge
		
		driver.switchTo().defaultContent();
			
		WebElement droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));		
		action.moveToElement(droppable).click().build().perform();
		
		WebElement frame1 = driver.findElement(By.cssSelector("iframe[class=\"demo-frame\"]"));
		driver.switchTo().frame(frame1);
			
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));				
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		// there are some options to perform drag and drop operation 
		// option 1
		//action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		// option 2
		//action.clickAndHold(drag).release(drop).build().perform();
		// option 3
		action.dragAndDrop(drag, drop).build().perform();			
	
	}
}
