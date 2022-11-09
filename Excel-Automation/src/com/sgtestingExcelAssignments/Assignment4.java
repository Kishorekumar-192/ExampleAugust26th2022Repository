package com.sgtestingExcelAssignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Programmatically write 20 Flower names and 20 Color names of sheet1 and 2nd column:

public class Assignment4 {

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
			cl=rw.createCell(1);
			cl.setCellValue("Flower 1");
			rw=sh.createRow(1);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 2");
			rw=sh.createRow(2);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 3");
			rw=sh.createRow(3);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 4");
			rw=sh.createRow(4);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 5");
			rw=sh.createRow(5);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 6");
			rw=sh.createRow(6);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 7");
			rw=sh.createRow(7);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 8");
			rw=sh.createRow(8);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 9");
			rw=sh.createRow(9);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 10");
			rw=sh.createRow(10);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 11");
			rw=sh.createRow(11);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 12");
			rw=sh.createRow(12);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 13");
			rw=sh.createRow(13);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 14");
			rw=sh.createRow(14);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 15");
			rw=sh.createRow(15);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 16");
			rw=sh.createRow(16);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 17");
			rw=sh.createRow(17);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 18");
			rw=sh.createRow(18);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 19");
			rw=sh.createRow(19);
			cl=rw.createCell(1);
			cl.setCellValue("Flower 20");
			rw=sh.createRow(20);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 1");
			rw=sh.createRow(21);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 2");
			rw=sh.createRow(22);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 3");
			rw=sh.createRow(23);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 4");
			rw=sh.createRow(24);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 5");
			rw=sh.createRow(25);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 6");
			rw=sh.createRow(26);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 7");
			rw=sh.createRow(27);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 8");
			rw=sh.createRow(28);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 9");
			rw=sh.createRow(29);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 10");
			rw=sh.createRow(30);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 11");
			rw=sh.createRow(31);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 12");
			rw=sh.createRow(32);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 13");
			rw=sh.createRow(33);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 14");
			rw=sh.createRow(34);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 15");
			rw=sh.createRow(35);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 16");
			rw=sh.createRow(36);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 17");
			rw=sh.createRow(37);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 18");
			rw=sh.createRow(38);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 19");
			rw=sh.createRow(39);
			cl=rw.createCell(1);
			cl.setCellValue("Colour 20");
			
			fout=new FileOutputStream("D:\\Excel-Automation\\Assignment4.xlsx");
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
