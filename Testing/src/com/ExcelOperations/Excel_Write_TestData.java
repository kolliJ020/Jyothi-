package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_TestData 
{
	public static void main(String[] args) throws IOException 
	{
		//Identify the file in the System
		FileInputStream testDataFile = new FileInputStream("./ExcelDataFiles/exceldata.xlsx");
		
		//	Identify the WorkBook in the File
		XSSFWorkbook WorkBook=new XSSFWorkbook(testDataFile);
		
		//Identify the sheet in the WorkBook
		XSSFSheet testDataSheet=WorkBook.getSheet("Sheet1");
		
		//Create a Particular Row in the Sheet
		XSSFRow newRow=testDataSheet.createRow(0);
		
		//Create a Particular Row of a cell in the row
		XSSFCell newRowofNewCell=newRow.createCell(2);
		
		//Sending the Test data in to the New of Cell Created
		newRowofNewCell.setCellValue("Selenium");
		
		//The Excel File along with the WorkBook Should be Saved
		FileOutputStream testDataResultFile=new FileOutputStream("./ExcelDataFiles/exceldataresult.xlsx");
		
		WorkBook.write(testDataResultFile);
		
	}

}
