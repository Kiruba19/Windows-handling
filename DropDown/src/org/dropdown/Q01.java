package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q01 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Kiruba\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement s = driver.findElement(By.id("selenium_commands"));
		Select ss = new Select(s);
		ss.selectByVisibleText("Navigation Commands");
		ss.selectByVisibleText("Wait Commands");
		List<WebElement> op = ss.getOptions();
		int size = op.size();
		System.out.println(size);
		for (int i = 0; i < op.size(); i++) {
			WebElement x = op.get(i);
			if(i%2==0) {
			String sss = x.getText();
			System.out.println(sss);
		}
		
		}
	

}}
