package api.utilities;

import org.testng.annotations.DataProvider;

public class dataProviders {
	
	@DataProvider(name="AllData")
	public String [][] AllDataProvider()
	{
		String fName = System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		
		int ttlRowCnt = readExcel.getRowCount(fName, "Sheet1");
		int ttlColCnt=readExcel.getColCount(fName, "Sheet1");
		
		String userData[][] = new String[ttlRowCnt-1][ttlColCnt];
		
		for(int rowNo = 1; rowNo<ttlRowCnt; rowNo++)
		{
			for(int colNo=0; colNo<ttlColCnt; colNo++)
			{
				userData[rowNo-1][colNo] =readExcel.getCellValue(fName, "Sheet1", rowNo, colNo);
			}
			
		}
		return userData;
	}
	
	@DataProvider(name = "usernameData")
	public String [] usernameProvider()
	{
		String fname = System.getProperty("user.dir")+"//TestData//testData.xlsx";
		int total_rows = readExcel.getRowCount(fname, "sheet1");
		
		String userData[]= new String[total_rows-1];
		
		for(int rowNum=1;rowNum<total_rows;rowNum++)
		{
				userData[rowNum-1]=readExcel.getCellValue(fname, "Sheet1", rowNum,1);
		}
		return userData;
	}
	
}
