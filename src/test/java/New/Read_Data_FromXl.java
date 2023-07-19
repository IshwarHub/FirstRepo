package New;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_FromXl {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		  FileInputStream MyFile=new FileInputStream("C:\\Users\\Divyansh\\Documents\\File.xlsx");
		  
		  String value= WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		  
		System.out.println(value);
	}


}
