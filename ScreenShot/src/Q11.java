import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Kiruba\\ScreenShot\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement c = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		c.click();
		WebElement s = driver.findElement(By.xpath("//input[@name='q']"));
		s.click();
		s.sendKeys("iphone");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement ee = driver.findElement(By.xpath("//div[text()='Apple iPhone 11 (Black, 128 GB)']"));
		ee.click();
	}

}
