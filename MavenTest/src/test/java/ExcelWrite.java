import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Kiruba\\MavenTest\\TestData\\Sample1.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Kiruba");
		Row r = s.createRow(3);
		Cell c = r.createCell(2);
		
		c.setCellValue(1);
		FileOutputStream ff = new FileOutputStream(f);
		w.write(ff);
		
	}

}