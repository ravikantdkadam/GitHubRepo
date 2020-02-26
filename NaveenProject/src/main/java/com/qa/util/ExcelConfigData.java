package com.qa.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfigData {
	

	XSSFWorkbook workbook;
	XSSFSheet sheet1;
	
	
	
	
	public ExcelConfigData(String excelpath)
	{
	try {
		File src= new File(excelpath);
			
		FileInputStream fis = new FileInputStream(src);
			
			 workbook = new XSSFWorkbook(fis);
			
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
	}
	
	public String getdata(int SheetNumber,int row, int coloumn) 
	{
		sheet1 = workbook.getSheetAt(SheetNumber);
		String data =sheet1.getRow(row).getCell(coloumn).getStringCellValue();
		
		return data;
		
	}



}
