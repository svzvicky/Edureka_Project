package vignesh.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class Exceldata {
	static Sheet mySheet;
	static Logger log = Logger.getLogger("ScriptLogger");
	
	public static String getCellData (int j ,int i) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		log.info(" Get Cell data Block" + (i + j));	
		FileInputStream src= new FileInputStream("C:\\Users\\M1034338\\git\\Edureka_Project\\Excel\\FileProject.xlsx");
		Workbook myBook = WorkbookFactory.create(src);
		mySheet = myBook.getSheet("data");
		//int rowCount = mySheet.getPhysicalNumberOfRows(); 
		//log.info("The physical number of rows: "+rowCount);
		Row myRow = mySheet.getRow(i);
			if (myRow == null) {
				return "No data found";
			}
			Cell myCell = myRow.getCell(j);
			if (myCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				log.info("Cell Value:"+ String.valueOf((long) myCell.getNumericCellValue()));
				return String.valueOf((long) myCell.getNumericCellValue());
			} else {
				log.info("String cell value: "+ myCell.getStringCellValue());
				return myCell.getStringCellValue();
			}
	}
	}



