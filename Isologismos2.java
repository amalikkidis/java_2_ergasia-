import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Isologismos2 {

	static XSSFWorkbook workbook = new XSSFWorkbook();{
	Sheet sheet = workbook.createSheet("Assets");

	Font headerFont = workbook.createFont();
	headerFont.setBold(true);
	headerFont.setFontHeightInPoints((short)14);
	headerFont.setColor(IndexedColors.RED.getIndex());
	int rowNum = 0;

	CellStyle headerCellStyle = workbook.createCellStyle();
	headerCellStyle.setFont(headerFont);

	Row headerRow = sheet.createRow(0);

	public HashMap<String, Double> addDataAsset(HashMap<String, Double> map) {
		System.out.println("Enter the asset data,if you want to stop adding data type stop.");
		Scanner input = new Scanner(System.in);
		String category = "category";
		Double value;
		int i = 0;

		do {
			System.out.print("Enter the category: ");
			category = input.next();
			if (!category.equals("stop")) {
				System.out.print("Enter the value:");
				value = input.nextDouble();
				map.put(category, value);
				Cell cell = headerRow.createCell(i);
				cell.setCellValue(map[i]);
				cell.setCellStyle(headerCellStyle);
				i++;
			}
		} while (!category.equals("stop"));
		return map;
	}

	int l = 0;
	for(Map maps:map)
	{
		Row row = sheet.createRow(rowNum++);
		row.createCell(l).setCellValue(maps);
		l++;
	}
	
	for (int i = 0; i < columns.length; i++) {
	      sheet.autoSizeColumn(i);
	    }
	
	FileOutputStream fileOut = new FileOutputStream("assets.xlsx");
    workbook.write(fileOut);
    fileOut.close();
	}	
	
	public HashMap<String, Double> addDataLiabilities(HashMap<String, Double> map) {
		System.out.println("Enter the liability data,if you want to stop adding data type stop at the category.");
		Scanner input = new Scanner(System.in);
		String category = "category";
		Double value;

		do {
			System.out.print("Enter the category: ");
			category = input.next();
			if (!category.equals("stop")) {
				System.out.print("Enter the value:");
				value = input.nextDouble();
				map.put(category, value);
			}
		} while (!category.equals("stop"));
		return map;
	}

	public boolean CheckIsologismos(HashMap<String, Double> assets, HashMap<String, Double> liabilities) {
		double sumOfAssets = 0;
		double sumOfLiabilities = 0;
		for (String key : assets.keySet()) {
			sumOfAssets += assets.get(key);
		}
		for (String key : liabilities.keySet()) {
			sumOfLiabilities += liabilities.get(key);
		}
		if (sumOfAssets == sumOfLiabilities) {
			return true;
		} else {
			return false;
		}

	}

}