package org.base.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;

	public static void launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\Kiruba\\MavenTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	public static void getUrl(String url) {
	driver.get(url);
}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
public static void title() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void type(WebElement ele, String value) {
		ele.sendKeys(value);
		

	}
	public static void type(List<WebElement> ele) {
		ele.size();

	}

	
	public static void click(WebElement ele) {
		ele.click();

	}
	public static String getData(int row, int cell ) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Kiruba\\MavenTest\\TestData\\Sample.xlsx");
		FileInputStream ff = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(ff);
		Sheet s = w.getSheet("Sample");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value =null;
		int cellType = c.getCellType();
		if(cellType==1)
		{
			value = c.getStringCellValue();
			System.out.println(value);
		}
		else if(cellType==0) {
			if(DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sd= new SimpleDateFormat("MM/dd/yyyy");
				value = sd.format(d);
				System.out.println(value);
			}
			else {
				double dd = c.getNumericCellValue();
				long l =(long) dd;
				value = String.valueOf(l);
				System.out.println(value);
			}
		
		}
		return value;
		

	}
}
