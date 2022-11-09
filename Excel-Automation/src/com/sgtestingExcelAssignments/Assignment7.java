package com.sgtestingExcelAssignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment7 {

	public static void main(String[] args) {
		ReadContent();
		CreateContent();

	}

	private static void ReadContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		try
		{
			fin=new FileInputStream("D:\\Excel-Automation\\Assignment7.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			for(int i=0;i<20;i++)
			{
				rw=sh.getRow(i);
				int cc=rw.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cl=rw.getCell(10);
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

	//Write it into a 10th row of the Sheet2:

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
			sh=wb.createSheet("Sheet2");
			rw=sh.createRow(0);
			for(int i=1; i<=20; i++)
			{
				cl=rw.createCell(10);
				cl.setCellValue("Fruit"+i);
			}

			fout = new FileOutputStream("D:\\Excel-Automation\\Assignment7.xlsx");
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
