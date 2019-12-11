package org.dropdown;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Kiruba\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement l = driver.findElement(By.id("dcdrLocation"));
		Select s = new Select(l);
		s.selectByVisibleText("Bengaluru");
		List<WebElement> op = s.getOptions();
		int size = op.size();
		System.out.println(size);
		for(int i=0; i<op.size();i++) {
			WebElement w = op.get(i);
			String text = w.getText();
			System.out.println(text);
		}
		
	WebElement name = driver.findElement(By.id("givenName"));
	name.sendKeys("kiruba");
	WebElement dob = driver.findElement(By.id("dob"));
	dob.sendKeys("01/12/2019");
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("kiruba@gmail.com");
	WebElement login = driver.findElement(By.name("loginId"));
	login.sendKeys("123");
	WebElement pa = driver.findElement(By.id("pwd"));
	pa.sendKeys("123");
	WebElement pwd = driver.findElement(By.id("confirmPwd"));
	pwd.sendKeys("123");
	WebElement h = driver.findElement(By.id("hintQues"));
	Select ss = new Select(h);
	ss.selectByIndex(2);
	WebElement hh = driver.findElement(By.id("hintAns"));
	hh.sendKeys("bumrah");
	WebElement test = driver.findElement(By.name("test123"));
	test.sendKeys("GEM8UNH");
	driver.findElement(By.id("frmSample_register")).click();
	
	
	
	}
	

}
