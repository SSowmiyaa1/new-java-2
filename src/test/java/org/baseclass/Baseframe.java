package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseframe {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	
	public static void launchBrowser() {
		driver= new ChromeDriver();
	}  
	public static void passUrl(String url) {
        driver.get(url);
	}
	public static void maxBrowser() {
        driver.manage().window().maximize();
	}
	public static void btn(WebElement ref) {
        ref.click();
	}
	public static void passInput(WebElement element,String input) {
       element.sendKeys(input);
	}
	public static void toPerformRightClick(WebElement element) {
       a= new Actions(driver);
       a.contextClick(element).perform();
	}
	public static void toPerformDoubleClick(WebElement element) {
       a.doubleClick(element).perform();
	}
	public static void goToElement(WebElement element) {
	       a.moveToElement(element);
	}
	public static void goAndUp(WebElement source,WebElement dest) {
	       a.dragAndDrop(source, dest);
	}
	public static void pressAndremove(WebElement up,WebElement down) {
	       a.clickAndHold();
	}
	public static void toPressEnter() throws AWTException {
       Robot r = new Robot();
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
    }
	public static void toPressup() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	public static void toPressdown() {
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void toPaste() {
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyRelease(KeyEvent.VK_V);
	}
	public static void toCopy() {
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyRelease(KeyEvent.VK_C);
	}
	public static void toMovedown() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public static void toSelectvalue(WebElement ref,String value) {
       Select s=new Select (ref);
       s.selectByValue(value);
	}
    public static String excelRead(int row,int cell) throws IOException {
	File file=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Framework\\Excel\\excel1.xlsx");
	FileInputStream fil = new FileInputStream(file);
	Workbook w= new XSSFWorkbook(fil);
	Sheet s = w.getSheet("Sheet1");
	Row r=s.getRow(row);
	
	Cell c = r.getCell(cell);
	
	int cellType=c.getCellType();
	String value;
	value=c.getStringCellValue();
	
	if(cellType==1) {
		
		value=c.getStringCellValue();
		
	}else if(DateUtil.isCellDateFormatted(c)){
		
		Date d=c.getDateCellValue();
		
		SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
		
		value = sim.format(d);
	}
	else {
		double dd=c.getNumericCellValue();
		
		long l=(long)dd;
		
		value=String.valueOf(1);
		System.out.println(value);
	}
	return value;
    }
}
	
	
	
	
	
	

