package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilter;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFilterColumn;
import org.testng.annotations.Test;




public class ExcelUtils {

	
	public List<Cell> getStateDataFromExcel() throws IOException {
		
		
		  //test file is located in your project path         
	    FileInputStream fileIn = new FileInputStream("C:\\Users\\deshmuma\\eclipse-workspace\\8\\excel\\seleniumInput.xlsx");
	    //read file 
	   // POIFSFileSystem fs = new POIFSFileSystem(fileIn); 
	    XSSFWorkbook filename = new XSSFWorkbook(fileIn);
	    //open sheet 0 which is first sheet of your worksheet
	    XSSFSheet sheet = filename.getSheetAt(0);
	    //XSSFSheet sheet = filename.getSheet("sheet1");
	    //we will search for column index containing string "Your Column Name" in the row 0 (which is first row of a worksheet
	    //String columnWanted = "Mainly used for";
	    String columnWanted = "state";
	    Integer columnNo = null;
	    //output all not null values to the list
	    List<Cell> cells = new ArrayList<Cell>();
	 
	    Row firstRow = sheet.getRow(0);
	   // System.out.println(firstRow);
	    
	    for(Cell cell:firstRow){
	    		    	
	    	DataFormatter formatter = new DataFormatter();
	    	String val = formatter.formatCellValue(cell);
	    	//System.out.println(val);
	    	
	        if (val.equals(columnWanted)){
	            columnNo = cell.getColumnIndex();
	        }
	    }
	 
	 
	    if (columnNo != null){
	    for (Row row : sheet) {
	       Cell c = row.getCell(columnNo);
	       if (c == null || c.getCellType() ==CellType.BLANK) {
	          // Nothing in the cell in this row, skip it
	       } else {
	          cells.add(c);
	         
	       }
	    }
	    }else{
	        System.out.println("could not find column " + columnWanted + " in first row of " + fileIn.toString());
	    }
		return cells;
	    

		
		
	}

	@Test
	public void autoFilterDataFromExcel() throws IOException {
		
		  //test file is located in your project path         
	    FileInputStream fileIn = new FileInputStream("C:\\Users\\deshmuma\\eclipse-workspace\\8\\excel\\seleniumInput.xlsx");
	    System.out.println("File is located");
	    //read file 
	   // POIFSFileSystem fs = new POIFSFileSystem(fileIn); 
	    XSSFWorkbook filename = new XSSFWorkbook(fileIn);
	    System.out.println("Fileame"+filename);
	    //open sheet 0 which is first sheet of your worksheet
	    XSSFSheet sheet = filename.getSheetAt(0);
	    System.out.println("sheet"+sheet);
		/* Step-1: Get the CTAutoFilter Object */
		CTAutoFilter sheetFilter=sheet.getCTWorksheet().getAutoFilter();   
		 System.out.println("sheetFilter"+sheetFilter);
		/* Step -2: Add new Filter Column */
		CTFilterColumn  myFilterColumn=sheetFilter.insertNewFilterColumn(0);
		 System.out.println("myFilterColumn"+myFilterColumn);
		
		/* Step-3: Set Filter Column ID */
		myFilterColumn.setColId(1L);
		/* Step-4: Add new Filter */
		CTFilter myFilter=myFilterColumn.addNewFilters().insertNewFilter(0);
		/* Step -5: Define Auto Filter Condition - We filter Brand with Value of "A" */
		myFilter.setVal("Germany");                           
		XSSFRow r1;
		/* Step-6: Loop through Rows and Apply Filter */
		for(Row r : sheet) {
		        for (Cell c : r) {
		                if (c.getColumnIndex()==1 && !c.getStringCellValue().equals("Germany")) {
		                        r1=(XSSFRow) c.getRow();
		                        if (r1.getRowNum()!=0) { /* Ignore top row */
		                                /* Hide Row that does not meet Filter Criteria */
		                                r1.getCTRow().setHidden(true); }
		                                }                               
		        }
		}
		
	}
	

}
