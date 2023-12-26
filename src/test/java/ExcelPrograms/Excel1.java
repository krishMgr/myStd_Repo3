package ExcelPrograms;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// CREATING AN EXCEL FILE IN SYSTEM
public class Excel1 {
	
	public static void main(String[] args)  throws Exception{
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sh=wb.createSheet("sheet1");
		XSSFRow r=sh.createRow(0);
		XSSFCell c=r.createCell(0);
		c.setCellValue("HelloRam");
		
		//Save file into a location
		
		File f=new File("E:\\MyPractice2023\\org.hcl.seleniumproject\\src\\test\\resources\\E1.xlsx");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos); //save 
		wb.close();
		fos.close();
		System.out.println("Excel File Created");
	}

}
