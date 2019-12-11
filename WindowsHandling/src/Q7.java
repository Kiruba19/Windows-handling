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
import org.openqa.selenium.interactions.Actions;

public class Q7 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Kiruba\\Day6RobotClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement con = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions acc = new Actions(driver);
		acc.contextClick(con).perform();
		Robot r = new Robot();
		for(int i=0; i<2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		WebElement co = driver.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		acc.doubleClick(co).perform();
		driver.findElement(By.xpath("(//a[text()='Course Content'])[20]")).click();
		Thread.sleep(5000);
		TakesScreenshot tk=(TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\user\\ScreenShot\\windowshandling1.png");
		FileUtils.copyFile(s, f);
	}
}
