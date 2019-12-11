package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q08 {
	public static void main(String[] args) throws InterruptedException {

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
		WebElement a = driver.findElement(By.id("adult_room"));
		Select s6 = new Select(a);
		s6.selectByValue("3");
		WebElement c = driver.findElement(By.id("child_room"));
		Select ss = new Select(c);
		ss.selectByVisibleText("2 - Two");
		WebElement cc = driver.findElement(By.id("Submit"));
		cc.click();
		WebElement rrr = driver.findElement(By.id("radiobutton_0"));
		rrr.click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("kiruba");
		driver.findElement(By.id("last_name")).sendKeys("k");
		driver.findElement(By.id("address")).sendKeys("seevaram");
		driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
		WebElement ccc = driver.findElement(By.id("cc_type"));
		Select s9 = new Select(ccc);
		s9.selectByVisibleText("VISA");
		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		Select s0 = new Select(exp);
		s0.selectByIndex(2);
		WebElement y = driver.findElement(By.id("cc_exp_year"));
		Select aa = new Select(y);
		aa.selectByValue("2020");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");

		driver.findElement(By.id("book_now")).click();
		Thread.sleep(10000);
		WebElement oo = driver.findElement(By.id("order_no"));
		String aaaa = oo.getAttribute("value");
		System.out.println(aaaa);

	}

}
