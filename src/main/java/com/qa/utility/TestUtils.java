package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;
import com.qa.excel.utility.Xls_Reader;


public class TestUtils extends TestBase
{
	
	public static final long PAGE_LOAD_TIMEOUT = 20;
//	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static Xls_Reader reader;
	public static int rowcnt=0;

	
	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\testdata\\PracticeData.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;

	
	
//	public static Object[][] getTestData(String sheetName) {
//		System.out.println("***********Fecthdata from excel sheet using array*********************");
//		FileInputStream file = null;
//		try {
//			file = new FileInputStream(TESTDATA_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			book = WorkbookFactory.create(file);
//		} catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sheet = book.getSheet(sheetName);
//		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
////		 System.out.println(sheet.getLastRowNum() + "--------" +
////		 sheet.getRow(0).getLastCellNum());
//		for (int i = 0; i < sheet.getLastRowNum(); i++) {
//			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
//				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
////				System.out.println(data[i][k]);
//			}
//		}
//		return data;
//	}

//
//}
	//******************************************************************************************************//

	public static ArrayList<Object[]> getDataFromExcel()
	{
		System.out.println("***********Fecthdata from excel sheet using arraylist*********************");
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		try
		{
			reader= new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\testdata\\PracticeData.xlsx");
    	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
		for(int rowNum=2; rowNum<=reader.getRowCount("login");rowNum++)
		{ 
			System.out.println(reader.getRowCount("login"));
			String username=reader.getCellData("login", "username",rowNum);
			System.out.println("Username is "+username);
			String password=reader.getCellData("login", "password",rowNum);
			System.out.println("Password is"+password);
			Object obj[]= {username,password};
				mydata.add(obj);
				
				
			}
			return mydata;
		
			}

	public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	
	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
}
	
		
	
}






