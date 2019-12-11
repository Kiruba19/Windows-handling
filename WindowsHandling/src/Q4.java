import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Kiruba\\Day6RobotClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement search = driver.findElement(By.id("headerSearch"));
		search.sendKeys("celling fan with light", Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class='stretchy secondary-image'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
		String parentw = driver.getWindowHandle();
		System.out.println(parentw);
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
	}

}
