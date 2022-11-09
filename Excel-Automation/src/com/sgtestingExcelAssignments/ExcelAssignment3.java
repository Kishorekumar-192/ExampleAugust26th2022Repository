package com.sgtestingExcelAssignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Programmatically erect 20 city names in 5th column of an Excel file:

public class ExcelAssignment3 {

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
			sh=wb.createSheet();

			rw=sh.createRow(0);
			cl=rw.createCell(4);
			cl.setCellValue("City 1");
			rw=sh.createRow(1);
			cl=rw.createCell(4);
			cl.setCellValue("City 2");
			rw=sh.createRow(2);
			cl=rw.createCell(4);
			cl.setCellValue("City 3");
			rw=sh.createRow(3);
			cl=rw.createCell(4);
			cl.setCellValue("City 4");
			rw=sh.createRow(4);
			cl=rw.createCell(4);
			cl.setCellValue("City 5");
			rw=sh.createRow(5);
			cl=rw.createCell(4);
			cl.setCellValue("City 6");
			rw=sh.createRow(6);
			cl=rw.createCell(4);
			cl.setCellValue("City 7");
			rw=sh.createRow(7);
			cl=rw.createCell(4);
			cl.setCellValue("City 8");
			rw=sh.createRow(8);
			cl=rw.createCell(4);
			cl.setCellValue("City 9");
			rw=sh.createRow(9);
			cl=rw.createCell(4);
			cl.setCellValue("City 10");
			rw=sh.createRow(10);
			cl=rw.createCell(4);
			cl.setCellValue("City 11");
			rw=sh.createRow(11);
			cl=rw.createCell(4);
			cl.setCellValue("City 12");
			rw=sh.createRow(12);
			cl=rw.createCell(4);
			cl.setCellValue("City 13");
			rw=sh.createRow(13);
			cl=rw.createCell(4);
			cl.setCellValue("City 14");
			rw=sh.createRow(14);
			cl=rw.createCell(4);
			cl.setCellValue("City 15");
			rw=sh.createRow(15);
			cl=rw.createCell(4);
			cl.setCellValue("City 16");
			rw=sh.createRow(16);
			cl=rw.createCell(4);
			cl.setCellValue("City 17");
			rw=sh.createRow(17);
			cl=rw.createCell(4);
			cl.setCellValue("City 18");
			rw=sh.createRow(18);
			cl=rw.createCell(4);
			cl.setCellValue("City 19");
			rw=sh.createRow(19);
			cl=rw.createCell(4);
			cl.setCellValue("City 20");

			fout=new FileOutputStream("D:\\Excel-Automation\\Assignment3.xlsx");
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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
