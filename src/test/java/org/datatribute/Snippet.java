package org.datatribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.annotations.*;

public class Snippet {
	@test
	public  void main() {
		
			WebDriver driver = new FirefoxDriver();
			
			driver.get(" http://www.greenstechnologys.com/");
			
			String Url = driver.getCurrentUrl();
			System.out.println(Url);
			
			String title = driver.getTitle();
			System.out.println(title);
			
			driver.get(" https://www.facebook.com/");
			
			String url2 = driver.getCurrentUrl();
			System.out.println(url2);
			
			String title2 = driver.getTitle();
			System.out.println(title2);
			
			driver.get("https://www.amazon.in");
			String url3 = driver.getCurrentUrl();
			System.out.println(url3);
			String title3 = driver.getTitle();
			System.out.println(title3);
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			String url4 = driver.getCurrentUrl();
			System.out.println(url4);
			
	           String Url4 = driver.getCurrentUrl();
			System.out.println(Url4);
			String title4 = driver.getTitle();
			System.out.println(title4);
			
}

