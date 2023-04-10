package selenium;

import java.io.IOException;

import testNg.DataProviderIntegratedExcelData;

public class DataUtills {
	@org.testng.annotations.DataProvider(name="array")
	public String[][] provider() throws IOException{
		String[][] integratedxldata = DataProviderIntegratedExcelData.integratedxldata();
		//String[][] data=new String[3][2];
		
		
		/*data[0][0]="Demosalesmanager";
		data[0][1]="crmsfa";
		data[1][0]="Demosalesmanager";
		data[1][1]="crmsfa";
		data[2][0]="Demosalesmanager";
		data[2][1]="crmsfa";*/
		return integratedxldata;
	}

}
