package it.jac.corsojava.export;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import it.jac.corsojava.bean.Dispositivo;

public class ExcelExporter extends BaseExporter {
	
	private static final String FILE_NAME = "C:\\Users\\rebecca marianna\\Desktop\\MyFirstExcel.xlsx";

	@Override
	public void export(List<Dispositivo> list) {
		
		 super.export(list);
		
		 XSSFWorkbook workbook = new XSSFWorkbook();
	     XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
	     
	     int i = 0;
	     
	     for(Dispositivo d : list) {
	    	 XSSFRow riga = sheet.createRow(i);
		     XSSFCell cella = riga.createCell(0);
		     cella.setCellValue(d.toString());
		     i++;
	     }

	     try {
	            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
	            workbook.write(outputStream);
	            workbook.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done Excel");
	     
	}
	
}
