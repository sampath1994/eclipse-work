package excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

public class excelTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook workbook = WorkbookUtil.create(new File(filePath));
		
		
	}

}
