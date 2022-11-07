package com.sgtestingExcelAssignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment6 {

	public static void main(String[] args) {
		//readcontent();
		createcontent();

	}

	private static void readcontent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		try
		{
			fin=new FileInputStream("D:\\Excel-Automation\\Assignment6.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			for(int i=0;i<20;i++)
			{
				rw=sh.getRow(i);
				int cc=rw.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cl=rw.getCell(c);
					String data=cl.getStringCellValue();
					System.out.printf(data);
				}
				System.out.println();
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	//Write 20 Country names in Sheet2:

	private static void createcontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		try
		{

			wb=new XSSFWorkbook();
			sh=wb.createSheet("sheet2");

			rw=sh.createRow(0);
			cl=rw.createCell(0);
			cl.setCellValue("Country 1");
			rw=sh.createRow(1);
			cl=rw.createCell(0);
			cl.setCellValue("Country 2");
			rw=sh.createRow(2);
			cl=rw.createCell(0);
			cl.setCellValue("Country 3");
			rw=sh.createRow(3);
			cl=rw.createCell(0);
			cl.setCellValue("Country 4");
			rw=sh.createRow(4);
			cl=rw.createCell(0);
			cl.setCellValue("Country 5");
			rw=sh.createRow(5);
			cl=rw.createCell(0);
			cl.setCellValue("Country 6");
			rw=sh.createRow(6);
			cl=rw.createCell(0);
			cl.setCellValue("Country 7");
			rw=sh.createRow(7);
			cl=rw.createCell(0);
			cl.setCellValue("Country 8");
			rw=sh.createRow(8);
			cl=rw.createCell(0);
			cl.setCellValue("Country 9");
			rw=sh.createRow(9);
			cl=rw.createCell(0);
			cl.setCellValue("Country 10");
			rw=sh.createRow(10);
			cl=rw.createCell(0);
			cl.setCellValue("Country 11");
			rw=sh.createRow(11);
			cl=rw.createCell(0);
			cl.setCellValue("Country 12");
			rw=sh.createRow(12);
			cl=rw.createCell(0);
			cl.setCellValue("Country 13");
			rw=sh.createRow(13);
			cl=rw.createCell(0);
			cl.setCellValue("Country 14");
			rw=sh.createRow(14);
			cl=rw.createCell(0);
			cl.setCellValue("Country 15");
			rw=sh.createRow(15);
			cl=rw.createCell(0);
			cl.setCellValue("Country 16");
			rw=sh.createRow(16);
			cl=rw.createCell(0);
			cl.setCellValue("Country 17");
			rw=sh.createRow(17);
			cl=rw.createCell(0);
			cl.setCellValue("Country 18");
			rw=sh.createRow(18);
			cl=rw.createCell(0);
			cl.setCellValue("Country 19");
			rw=sh.createRow(19);
			cl=rw.createCell(0);
			cl.setCellValue("Country 20");

			fout=new FileOutputStream("D:\\Excel-Automation\\Assignment6.xlsx");
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

