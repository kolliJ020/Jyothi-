package com.ExcelOperations;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData
{
	public static void main(String[] args) throws IOException
	{
		//Identify the file in the system
		 FileInputStream testDataFile=new FileInputStream("./ExcelDataFiles/exceldata.xlsx");
		
		 //Identify the Workbook in the File
		 XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		 
		 //Identify theSheet in the Workbook
		 XSSFSheet Testdata=workBook.getSheet("Sheet1");
		 
		 //Identify a particular Row in the Sheet
		 
		 XSSFRow testdataRow= Testdata.getRow(1);
		 
		 //Identify a particular Row of a cell in the Row
		 XSSFCell testDataRowofCell=testdataRow.getCell(1);
		 
		 //get the Testdata from the Row of cell
		 String testData=testDataRowofCell.getStringCellValue();
		 
		 System.out.println(testData);
		 
		 workBook.close();
		 
	}

}
