package org.base.resources;

import java.io.IOException;

import org.openqa.selenium.By;

public class ExcelInt extends Base {
	public static void main(String[] args) throws IOException {

		launch();
		getUrl("https://www.facebook.com/");
		getCurrentUrl();
		type(driver.findElement(By.id("email")), getData(4, 0));
		type(driver.findElement(By.id("pass")), getData(4, 1));
		click(driver.findElement(By.xpath("//input[@value='Log In']")));
	}
}
