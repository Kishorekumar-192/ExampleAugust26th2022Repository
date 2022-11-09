package com.sgtestingExcelAssignments;

//Programmatically erect 20 flower names into first sheet, First column of an excel file:

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssignments1 {

	public static void main(String[] args) {
		CreateFlower();

	}
	private static void CreateFlower()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row rw=null;
		Cell cl=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Flower");

			for(int i=0;i<=20;i++)
			{
				rw=sh.createRow(i);

				cl=rw.createCell(0);
				cl.setCellValue("Flower"+i);
			}
			
			fout=new FileOutputStream("D:\\Excel-Automation\\Assignment1.xlsx");
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
