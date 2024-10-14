package org.emp;

import java.io.*;
import java.io.File;
import java.io.FilterInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.*;
import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestOne {

public static void main(String[] args) throws IOException  {
    // TODO Auto-generated method stub


FileInputStream F = new FileInputStream("C:\\Users\\arun.kumar\\OneDrive - SrinSoft Technologies Pvt Ltd\\Documents\\Excel\\Tech.xlsx");

    XSSFWorkbook wb = new XSSFWorkbook(F);

    XSSFSheet sheet = wb.getSheetAt(0);

    FormulaEvaluator formulaEva = wb.getCreationHelper().createFormulaEvaluator();

    for(Row row : sheet){
        for(Cell cell : row){

            System.out.print(cell.getStringCellValue());


            }

        }
        System.out.println();

    }

}