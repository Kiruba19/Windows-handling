import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Kiruba\\DropDown\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("iphone7", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='iPhone 7 Soft Silicon Cases O4U - Pink Plain Back Cover']")).click();
		
		
	//parent window id
		
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		
		//all windows id
		
		Set<String> all = driver.getWindowHandles();
		
		System.out.println(all);
		//iterate set using enhanced for loop
		
		for(String x:all) {
		
			//Chcking arent is not equals to child , if it not equals then switch
			if(!parent.equals(x)) {  //12   12  //12 1213
				driver.switchTo().window(x);
				
			}
		}

		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		
}
}