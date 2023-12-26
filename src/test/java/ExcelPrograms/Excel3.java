package ExcelPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// CREATE/WRITE OWN DATA IN EXCEL
public class Excel3 {

	public static void main(String[] args) throws Exception {
		
		//connect to file
		File f= new File("E:\\MyPractice2023\\org.hcl.seleniumproject\\src\\test\\resources\\E2.xlsx");
		//take read permission
		FileInputStream fis=new FileInputStream(f);
		//store it in RAM
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.createSheet("Test");
		Row r1=sh.createRow(0);
		r1.createCell(0).setCellValue("Rama");
		r1.createCell(1).setCellValue("india");
		
		Row r2=sh.createRow(1);
		r2.createCell(0).setCellValue("Thomas");
		r2.createCell(1).setCellValue("USA");
		
		Row r3=sh.createRow(2);
		r3.createCell(0).setCellValue("Kohli");
		r3.createCell(1).setCellValue("India");
		
		Cell c=r3.getCell(0);
		String s2=c.getStringCellValue();
		System.out.println(s2);
		
				
		//Auto fit
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		//save changes
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		wb.close();
		System.out.println("File Updated");

	}

}
