package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q9 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Kiruba\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Kiruba123");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Greens123");
		driver.findElement(By.id("login")).click();
		WebElement loca = driver.findElement(By.id("location"));
		Select s = new Select(loca);
		s.selectByValue("Melbourne");
		WebElement h = driver.findElement(By.id("hotels"));
		Select s1 = new Select(h);
		s1.selectByVisibleText("Hotel Creek");
		WebElement r = driver.findElement(By.id("room_type"));
		Select s2 = new Select(r);
		s2.selectByIndex(3);
		WebElement rr = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rr);
		s3.selectByValue("3");
		
		List<WebElement> op = s3.getOptions();
		int size = op.size();
		System.out.println(size);
		
		for(int i=0; i<op.size();i++) {
			
			WebElement w = op.get(i);
			String t = w.getText();
			System.out.println(t);
		}
	}

}
