
package Test;


import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;
public class jxlplugin {

	

  public void testmethod() throws BiffException, IOException {
	  
	  Workbook wb=Workbook.getWorkbook(new File("C:/Users/admin/Desktop/input.xls"));
	  Sheet sheet=wb.getSheet("sheet1");
	  String getSheetdata=sheet.getCell(1,2).getContents();
	  System.out.println(getSheetdata);
	  
	  Workbook wb1=Workbook.getWorkbook(new File("C:/Users/input.xls"));
	  Sheet sh1=wb1.getSheet("Sheet1");
	  String getSheetdata1=sh1.getCell(1,2).getContents();
	  System.out.println(getSheetdata1);
	  
	  Wrokbook wb2=Workbook.getWorkbook(new File(""));
	  Sheet sh3=wb2.getSheet("sheet3");
	  String getsheet3=sh3.getCell(1,1);
	  
	  
  }
}
