import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {
	public static void main(String[] args) throws AWTException, IOException {
		
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
		TakesScreenshot tk = (TakesScreenshot) driver;
		File ss = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(ss);
		File d = new File("C:\\Users\\user\\ScreenShot\\Question9.png");
		FileUtils.copyFile(ss, d);
	}

}
