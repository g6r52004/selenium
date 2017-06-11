import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class test_excel {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
	
FileInputStream fis = new FileInputStream("C:\\Users\\I037663\\Desktop\\Copy of X1E_ATC.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
		
		System.out.println(workbook.getSheetIndex("ALL"));
		
		System.out.println(workbook.getSheetIndex("Level01"));
		
		int index = workbook.getSheetIndex("ALL");
		if(index==-1){
		 System.out.println("sheet doesnot exist");
		}else {
			System.out.println("Sheet exist"); 
			
		
			
			XSSFSheet sheet = workbook.getSheet("ALL");
			
			// to get the row count
			System.out.println(sheet.getLastRowNum());
			
			// to get the number of column 
			XSSFRow row = sheet.getRow(0);	
			System.out.println(row.getLastCellNum());
			
			System.out.println(row.getCell(1).getStringCellValue());
			//problem
			System.out.println(row.getCell(0).getCellType());
		
			
			//problem
			//String A =  row.getCell(0).getCellTypeEnum();
			
			//CellType STRING = null;
			/*//if (row.getCell(0).getCellTypeEnum() = STRING ) {
				System.out.println("its a string ");
			}
			else 
			{
				System.out.println("its not a string");
		}
			
			System.out.println(row.getCell(1).getNumericCellValue());
			*/
			fis.close();
			workbook.close();
			
		}
		}
	}


