package com.sgtestingExcelAssignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Programmatically erect 20 Color names on first sheet 10th row of Excel file:


public class ExcelSssignment2 {

	public static void main(String[] args) {
		CreateContent();

	}

	private static void CreateContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			rw=sh.createRow(9);
			for(int i=1; i<=20; i++)
			{
				cl=rw.createCell(i);
				cl.setCellValue("Colour"+i);
			}

			fout = new FileOutputStream("D:\\Excel-Automation\\Assignment2.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}

		}

	}
}
