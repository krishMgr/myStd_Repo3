package ExcelPrograms;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//GET THE DATA FROM EXISTING EXCEL FILE
public class Excel2 {
	
	public static void main(String[] args) throws Exception {
		
		//Connect to excel file
		File f= new File("E:\\MyPractice2023\\org.hcl.seleniumproject\\src\\test\\resources\\E2.xlsx");
		
		//Take read permission
		FileInputStream fis = new FileInputStream(f);
		//store it in RAM
		Workbook wb=WorkbookFactory.create(fis);
		
		//collect all sheets
		int nos=wb.getNumberOfSheets();
		System.out.println("Total sheets in excel: "+nos);
		
		//go to each sheet
		for(int i=0;i<nos;i++) {
			Sheet sh=wb.getSheetAt(i);
			String s1=sh.getSheetName();
			
			try {
				
				int nor=sh.getPhysicalNumberOfRows();//returns pnr defined
				int noc=sh.getRow(0).getLastCellNum();
				System.out.println(s1+" has "+nor+" rows and  "+noc+" columns");
		}
			catch(Exception e) {
				System.out.println(s1+"is empty");
			}
		}
		fis.close();
		wb.close();
	}

}
