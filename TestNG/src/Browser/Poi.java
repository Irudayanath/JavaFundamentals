package Browser;
import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;
public class Poi {
public static void main(String args[]) throws BiffException, IOException
{
	File f=new File("");
Workbook w;
w=Workbook.getWorkbook(f);
Sheet sh=w.getSheet("Sheet1");
sh.getCell(0,1);

Workbook w1=Workbook.getWorkbook(f);

Sheet s=w1.getSheet("sheet1");
s.getCell(0, 1).getContents();
Workbook.close();


}


}
