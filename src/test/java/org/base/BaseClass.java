package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void buttonClick(WebElement ref) {
		ref.click();
	}

	static public  String readExcel(int rowNo, int cellNo) throws IOException {
		File f = new File(
				"C:\\Users\\user\\eclipse-workspace1\\DataDriven\\Excel sheet\\New Microsoft Office Excel Worksheet.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("login");

		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name = "";
		if (type == 1) {
			name = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat form = new SimpleDateFormat("dd-mm-yyyy");
			name = form.format(da);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			name = String.valueOf(l);

		}

		return name;
	}
}
