package New;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_DataFrom_XL_File1 {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile=new FileInputStream("C:\\Users\\Divyansh\\Documents\\ApplicationList.xlsx");
		Sheet mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		int TotalRows = mySheet.getLastRowNum();
		int TotalCell = mySheet.getRow(0).getLastCellNum()-1;
		
		// outer for loop--> rows
		for(int i=0;i<=TotalRows;i++)
		{
			 for(int j=0;j<=TotalCell;j++) 
			 {
				 Cell myCell = mySheet.getRow(i).getCell(j);
				CellType celltype = myCell.getCellType();
				
				if(celltype==CellType.STRING) 
				{
					System.out.print(myCell.getStringCellValue()+" ");
					
				}
				else if(celltype==celltype.BOOLEAN)
				{
					System.out.print(myCell.getBooleanCellValue()+" ");
				}
				else if(celltype==celltype.NUMERIC) {
					System.out.print(myCell.getNumericCellValue()+" ");
				}
				else if (celltype==celltype.BLANK)
				{
					System.out.print(" ");
					
				}
				
			 }
			 System.out.println();
		}
	}

}

