package Browser;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jxl.*;
import jxl.read.biff.BiffException;

public class Poi {
	public static void main(String args[]) throws BiffException, IOException {
		Connection cn;
		Statement st;
		ResultSet rs;
		try
		{
			Class.forName(sun.jdbc.odbc.JdbcOdbcDriver);
			cn=DriverManager.getConnection("JDBC.ODBC:data");
			cn.createStatement();
            rs=st.executeQuery("Select*from tan");
            while(rs.next())
            {
            
            }
			
		}
		File f = new File("");

		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh2 = wb.getSheet("Sheet1");
		sh2.getCell(1, 1);
       
	}

}
