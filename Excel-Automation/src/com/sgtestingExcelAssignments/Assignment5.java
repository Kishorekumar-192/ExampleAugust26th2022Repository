package com.sgtestingExcelAssignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Programmatically write 20 State names diagonal of an Excel life:

public class Assignment5 {

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
			cl=rw.createCell(0);
			cl.setCellValue("State 1");
			rw=sh.createRow(1);
			cl=rw.createCell(1);
			cl.setCellValue("State 2");
			rw=sh.createRow(2);
			cl=rw.createCell(2);
			cl.setCellValue("State 3");
			rw=sh.createRow(3);
			cl=rw.createCell(3);
			cl.setCellValue("State 4");
			rw=sh.createRow(4);
			cl=rw.createCell(4);
			cl.setCellValue("State 5");
			rw=sh.createRow(5);
			cl=rw.createCell(5);
			cl.setCellValue("State 6");
			rw=sh.createRow(6);
			cl=rw.createCell(6);
			cl.setCellValue("State 7");
			rw=sh.createRow(7);
			cl=rw.createCell(7);
			cl.setCellValue("State 8");
			rw=sh.createRow(8);
			cl=rw.createCell(8);
			cl.setCellValue("State 9");
			rw=sh.createRow(9);
			cl=rw.createCell(9);
			cl.setCellValue("State 10");
			rw=sh.createRow(10);
			cl=rw.createCell(10);
			cl.setCellValue("State 11");
			rw=sh.createRow(11);
			cl=rw.createCell(11);
			cl.setCellValue("State 12");
			rw=sh.createRow(12);
			cl=rw.createCell(12);
			cl.setCellValue("State 13");
			rw=sh.createRow(13);
			cl=rw.createCell(13);
			cl.setCellValue("State 14");
			rw=sh.createRow(14);
			cl=rw.createCell(14);
			cl.setCellValue("State 15");
			rw=sh.createRow(15);
			cl=rw.createCell(15);
			cl.setCellValue("State 16");
			rw=sh.createRow(16);
			cl=rw.createCell(16);
			cl.setCellValue("State 17");
			rw=sh.createRow(17);
			cl=rw.createCell(17);
			cl.setCellValue("State 18");
			rw=sh.createRow(18);
			cl=rw.createCell(18);
			cl.setCellValue("State 19");
			rw=sh.createRow(19);
			cl=rw.createCell(19);
			cl.setCellValue("State 20");

			fout=new FileOutputStream("D:\\Excel-Automation\\Assignment5.xlsx");
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
