package Mohit.mohit_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture_5_6_Find_Element {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	System.out.println(driver.getTitle());  
	
	// Lecture 4th :- Locators
	// 1) id 2) class 3) tagname 4) Link Text 5) Partial Link Text 
	// 6) css 7) xpath 8) name
	
	driver.findElement(By.id("nav-logo-sprites"));	
	driver.findElement(By.className("skip-link"));
	driver.findElement(By.name("abc"));
	driver.findElement(By.linkText("Customer Service"));
	driver.findElement(By.linkText("Fashion"));
	driver.findElement(By.partialLinkText("Fash"));
	driver.findElement(By.tagName("option"));
	
	// Important Locators
	// id, class, css, xpath
	
	driver.findElement(By.id("nav-logo-sprites"));	
	driver.findElement(By.className("skip-link"));
	
	// css
	// 1st option is combination of css tagname and id then use #
	driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	
	// 2nd option is combination of css tagname and class then use .
	driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute"));
	
	// 3rd option is combination of css single attribute tagname[attribute="attribute value"]
	driver.findElement(By.cssSelector("input[autocomplete=\"off\"]"));
	
	// 4th option is combination of css multiple attribute  tagname[attribute1="attribute1 value"][attribute2="attribute2 value"]
	driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.in\"][spellcheck=\"false\"]"));
	
	// contains :- use * sign
	// 5th option is contains of css tagname[attribute*="partialAttributeValue or WholeValue"]
	driver.findElement(By.cssSelector("input[placeholder*=\"Search Amaz\"]"));
	
	// Start With :- use ^ sign 
	// 6th option tagname[attribute^="starting character of attribute value or WholeValue"]
	driver.findElement(By.cssSelector("input[placeholder^=\"Search Amaz\"]"));
	
	// End With :- use $ sign 
	// 7th option tagname[attribute$="ending character of attribute value or WholeValue"]
	driver.findElement(By.cssSelector("input[placeholder$=\"zon.in\"]"));
	
	// Pseudo-class :- frist-child, last-child, nth-child(n), nth-last-child(n)	
	// if we want to find dropdown web element then we use Pseudo-classes
	
	// frist-child :- use for find out first option in the list
	driver.findElement(By.cssSelector("option[value=\"search-alias=aps\"]:first-child"));
	
	// nth-child(n) :- use for find out 2nd option 3rd option like this
	driver.findElement(By.cssSelector("option[value=\"search-alias=alexa-skills\"]:nth-child(2)\r\n"));
			
	// last-child :- use for find out last option in the list
	driver.findElement(By.cssSelector("option[value=\"search-alias=watches\"]:last-child"));
	
	// nth-last-child(n) :- use for find out last one, last second option like this
	driver.findElement(By.cssSelector("option[value=\"search-alias=videogames\"]:nth-last-child(2)"
			));
	
	
	// Xpath :- start with // 
	// there are two types of xpath 
	// 1. Absolute Xpath 2. Relative Xpath	
	// we prefer Relative Xpath
	
	
	// use single attribute
	driver.findElement(By.cssSelector("//input[@autocomplete=\"off\"]"));
	
	// use double attribute
	driver.findElement(By.cssSelector("//input[@autocomplete=\"off\"][@id=\"twotabsearchtextbox\"]"));
	
	// contains
	// syntax :- tagname[contains(@attribute,"partialAttributeValue or WholeValue"]
	driver.findElement(By.cssSelector("//input[contains(@autocomplete,\"off\")]"));
	
	// use starts-with 
	// syntax :- tagname[starts-with(@attribute,"starting character of attribute value or WholeValue"]
	driver.findElement(By.cssSelector("//input[starts-with(@id,\"twotabsea\")]"));
	
	// use text() :- It Contains no attribute just you need to pass text(like link text)
	
	// <option value="search-alias=alexa-skills">Alexa Skills</option>
	driver.findElement(By.cssSelector("//option[text()=\"Alexa Skills\"]"));
	
	//a[text()="Best Sellers"])[1]
	driver.findElement(By.cssSelector("(//a[text()=\"Best Sellers\"])[1]"));
	
	// find element by using indexing 
	//a[@class="nav-a  "][12] (New Releases)
	driver.findElement(By.cssSelector("(//a[@class=\"nav-a  \"])[12]"));
	
	
	
	
	
		
		

	}
}
