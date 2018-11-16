/**
 * 
 */
package com.ActionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author training_d5.01.02
 *
 */
public class ExcelUtility {

	public static XSSFWorkbook Excelwbook;
	public static XSSFSheet Excelwsheet;
	public static XSSFRow Row;
	public static XSSFCell Cell;
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream(new File("C:\\selenium_workspace\\SeleniumLatest\\src\\test\\resources\\testRecords.xlsx"));
		Excelwbook=new XSSFWorkbook(fin);
		Excelwsheet=Excelwbook.getSheet("Sheet1");
		Cell=Excelwsheet.getRow(2).getCell(1);
		System.out.println("Data:" +Cell.getStringCellValue());
	// use for loops concept to print the entire excel sheet
		/*
		 for(int i=vvvV)
		 {
		 
		  
		 */
	
		//Writing data in excelsheet
		//Excelwbook.create("sheet2");
		
		Excelwsheet.createRow(7);
		
		Row=Excelwsheet.getRow(7);
		Cell=Row.createCell(1);
		Cell.setCellValue("New Value Added");
		FileOutputStream fileout = new FileOutputStream(new File("C:\\selenium_workspace\\SeleniumLatest\\src\\test\\resources\\testRecords.xlsx"));
		Excelwbook.write(fileout);
		fileout.flush();
	
		
		/*
		 	Excelwsheet.createRow(2);
		  Row= Excelwsheet.getRow(2);
		  Cell=Row.createCell(1);
		  Cell.setCellValue("New Value");
		  FileOutputStream fileout = new FileOutputStream(new File("C:\\\\Selenium Advance\\\\Myexcel.xlsx"));
		  Excelwbook.write(fileout);
		  fileout.flush(); 
		 */
	
	}

}
