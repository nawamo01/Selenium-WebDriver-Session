package TestNGConcept_DataProvider;

import java.util.ArrayList;

import java.util.jar.*;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getdatafromexcel(){
		
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		try {
		reader = new XlsReader("D:\\Core Java Training\\SeleniumSession\\Selenium2020\\src\\TestData.xlsx");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		for(int rownum=2; rownum <= reader.getRowCount("testdata"); rownum++){
			
			String name = reader.getCellData("testdata","Name",rownum);
			String mobile = reader.getCellData("testdata","Mobile",rownum);
			String email = reader.getCellData("testdata","Email",rownum);
			String password = reader.getCellData("testdata","Password",rownum);
			
			Object ob[] = {name,mobile,email,password};
			mydata.add(ob);
			
		} return mydata;
		
	}
	
	
	

}
