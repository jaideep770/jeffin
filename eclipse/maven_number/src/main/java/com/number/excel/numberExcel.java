package com.number.excel;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class numberExcel {
	private static List<printExcel> printexcel= new ArrayList<printExcel>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int digit;
		
			
			Workbook workbook= new XSSFWorkbook();
			Sheet sheet=workbook.createSheet("printexcel");
		
				
			
			System.out.println("enter any number");
			Scanner scan=new Scanner(System.in);
			digit=scan.nextInt();
			printExcel number=new printExcel(digit);
			for(int i=0;i<10;i++) {
				Row headerRow =sheet.createRow(i);
				Cell cell =headerRow.createCell(0);
		
				cell.setCellValue(digit);
			
				
			}
				
					
		
			

			File yourFile = new File("E://printexcel1.xlsx");
			yourFile.createNewFile();
			FileOutputStream fileOut= new FileOutputStream(yourFile, false);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
			
			
	}
		

	}


