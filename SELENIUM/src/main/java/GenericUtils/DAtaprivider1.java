package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DAtaprivider1 {
	@DataProvider
	public String[][] dataProviderMethod() {
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Automation\\testdata\\data.xlsx");
		Workbook workbook =null;
		try {
		FileInputStream fis = new FileInputStream(f);
		 workbook = WorkbookFactory.create(fis);
		}
		catch(Exception e) {
			
		}
		
		Sheet sheet = workbook.getSheet("data");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] result = new String[rowCount-1][cellCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data =sheet.getRow(i).getCell(j).toString();
						result[i-1][j]= data;
			}
		}
		
			return result;
		}
		
	}
