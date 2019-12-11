import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Kiruba\\Alerts\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		//accepting popup
		WebElement f = driver.findElement(By.xpath("//a[text()='ACCEPT']"));
		f.click();
		driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
		Alert a = driver.switchTo().alert();
		//String text = a.getText();
		//System.out.println(text);
		a.accept();
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
		confirm.click();
		a.dismiss();
		WebElement prompt = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		prompt.click();
		prompt.sendKeys("yes");
		a.accept();

	}

}
