
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
  }
}
