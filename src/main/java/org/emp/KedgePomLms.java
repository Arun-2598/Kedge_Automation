package org.emp;

import java.util.List;

import java.util.ListIterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class KedgePomLms extends Utils {
	
	static Row r;
	static int pres=0;
	static int abs=0;
	static int holi=0;
	static int weekoff=0;
	static int shorts=0;
	public KedgePomLms(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='spinner-three-bounce']")
	public static WebElement  trouble;
	
	@FindBy(xpath="//span[text()='LMS']")
	public static WebElement clickLms;
	
	@FindBy(xpath="(//span[text()='Punch Details'])[1]") 
	public static WebElement clickPunchDetails;
	
	@FindBy(xpath="//table[@class='table']//tr//th")
	public static java.util.List<WebElement> allheaders;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[1]")
	public static java.util.List<WebElement> allcol;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[2]")
	public static java.util.List<WebElement> allcol1;

	@FindBy(xpath="//table[@class='table']//tbody//tr//td[3]")
	public static java.util.List<WebElement> allcol2;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[4]")
	public static java.util.List<WebElement> allcol3;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[5]")
	public static java.util.List<WebElement> allcol4;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[6]")
	public static java.util.List<WebElement> allcol5;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[7]")
	public static java.util.List<WebElement> allcol6;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[8]")
	public static java.util.List<WebElement> allcol7;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[9]")
	public static java.util.List<WebElement> allcol8;
	
	@FindBy(xpath="//table[@class='table']//tbody//tr//td[10]")
	public static java.util.List<WebElement> allcol9;
	
	@FindBy(xpath="//select[@formcontrolname='departmentName']")
	public static WebElement department;
	
   @FindBy(xpath="//select[@formcontrolname='EmployeeName']")
   public static WebElement listname;
	
   @FindBy(xpath="//span[contains(text(),'SS')]")
   public static WebElement txtEmp;
   

	//*****************************methods******************************
	
	
	public void clickLmsbutton() throws InterruptedException {
		Thread.sleep(12000);
		waits(clickLms);
		System.out.println("Click LMS");
		clickLms.click();

	}
	
	public void clickpunch() {
		
		System.out.println("Click PunchDetails");
		clickPunchDetails.click();
	}

	static String text;
	static String text2;
	static String text3;
    static Row r1;

	public static void tablecol() throws InterruptedException {
		
		Thread.sleep(15000);
		waits1(allcol.get(0));		
		ListIterator<WebElement> li1 = allcol.listIterator();
		
		waits1(allcol1.get(0));
		ListIterator<WebElement> li2 = allcol1.listIterator();
		
		waits1(allcol2.get(0));
		ListIterator<WebElement> li3 = allcol2.listIterator();
		
		waits1(allcol3.get(0));
		ListIterator<WebElement> li4 = allcol3.listIterator();
		
		waits1(allcol4.get(0));
		ListIterator<WebElement> li5 = allcol4.listIterator();

		ListIterator<WebElement> li6 = allcol5.listIterator();
		
		ListIterator<WebElement> li7 = allcol6.listIterator();

		ListIterator<WebElement> li8 = allcol7.listIterator();
	
		ListIterator<WebElement> li9 = allcol8.listIterator();
		System.out.println(li9);
//*********************************************************************************************************
		
//**********************************************************************************************************		
		ListIterator<WebElement> li10 = allcol9.listIterator();
		Row row2 = sheet2.createRow(0);
		Cell c = row2.createCell(0);
		c.setCellValue("Emp ID");
		Cell c1 = row2.createCell(1);
		c1.setCellValue("Emp name");
		Cell c2=row2.createCell(2);
		c2.setCellValue("Department Name");
		Cell c3 = row2.createCell(3);	
		c3.setCellValue("Present Day");	
		Cell c4 = row2.createCell(4);
		c4.setCellValue("Absent");
		Cell c5 = row2.createCell(5);
		c5.setCellValue("Holiday");
		Cell c6 = row2.createCell(6);
		c6.setCellValue("Shortage");
		Cell c7= row2.createCell(7);
		c7.setCellValue("Total No Of Days");
								
		CellStyle style6 = w.createCellStyle();
        style6.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        style6.setFillPattern(FillPatternType.FINE_DOTS);
        style6.setWrapText(true);
				
		c.setCellStyle(style6);
		c1.setCellStyle(style6);
		c2.setCellStyle(style6);
		c3.setCellStyle(style6);
		c4.setCellStyle(style6);
		c5.setCellStyle(style6);
		c6.setCellStyle(style6);
		c7.setCellStyle(style6);
		
		Font font= w.createFont();
		style6.setWrapText(true);
        style6.setFont(font);
        font.setBold(true);
        
		int lastRowNum = sheet.getLastRowNum();
		if(lastRowNum==0){
			lastRowNum =1;
		}
		for (int j = 1 ; j < allcol.size(); j++) {
			 r1 = sheet.createRow(lastRowNum+1);
			 
			r1.createCell(0).setCellValue(text2);
			r1.createCell(1).setCellValue(text);
			r1.createCell(2).setCellValue(text3);
			r1.createCell(3).setCellValue(li1.next().getText());
			r1.createCell(4).setCellValue(li2.next().getText());
			r1.createCell(5).setCellValue(li3.next().getText());
			r1.createCell(6).setCellValue(li4.next().getText());
			
			r1.createCell(7).setCellValue(li5.next().getText());
			String induration=li6.next().getText();

			r1.createCell(8).setCellValue(induration);			
			r1.createCell(9).setCellValue(li7.next().getText());
//			String induration=li8.next().getText();
			//r1.createCell(10).setCellValue();
			r1.createCell(10).setCellValue(li8.next().getText());

			String status=li9.next().getText();
			r1.createCell(11).setCellValue(status);
			
			r1.createCell(12).setCellValue(li10.next().getText());
			lastRowNum++;
			

		
			//String induration = li6.next().getText();
		System.out.println(induration);
		String replace = induration.replace(":", ".");
		System.out.println(replace);
		String trim1 = replace.trim();
		
		try{
		float no = Float.parseFloat(trim1);
		if (no<8.45) {
			CellStyle Style2 = w.createCellStyle();
			Style2.setFillBackgroundColor(IndexedColors.RED.getIndex());
			Style2.setFillPattern(FillPatternType.FINE_DOTS);
			r1.getCell(0).setCellStyle(Style2);
			r1.getCell(1).setCellStyle(Style2);
			r1.getCell(2).setCellStyle(Style2);
			r1.getCell(3).setCellStyle(Style2);
			r1.getCell(4).setCellStyle(Style2);
			r1.getCell(5).setCellStyle(Style2);
			r1.getCell(6).setCellStyle(Style2);
			r1.getCell(7).setCellStyle(Style2);
			r1.getCell(8).setCellStyle(Style2);
			r1.getCell(9).setCellStyle(Style2);
			r1.getCell(10).setCellStyle(Style2);
			r1.getCell(11).setCellStyle(Style2);
//			r1.getCell(12).setCellStyle(Style2);
			
		}
		}catch(NumberFormatException num){
		}
		System.out.println("Exception handled :NumberFormatException ");
		
		if(status.contains("WeeklyOff")){
			 CellStyle style3 = w.createCellStyle();
		     style3.setFillBackgroundColor(IndexedColors.LIGHT_BLUE.getIndex());
		     style3.setFillPattern(FillPatternType.FINE_DOTS);
		     
		     r1.getCell(0).setCellStyle(style3);
		     r1.getCell(1).setCellStyle(style3);
		     r1.getCell(2).setCellStyle(style3);
		     r1.getCell(3).setCellStyle(style3);
		     r1.getCell(4).setCellStyle(style3);
		     r1.getCell(5).setCellStyle(style3);
		     r1.getCell(6).setCellStyle(style3);
		     r1.getCell(7).setCellStyle(style3);
		     r1.getCell(8).setCellStyle(style3);
		     r1.getCell(9).setCellStyle(style3);
		     r1.getCell(10).setCellStyle(style3);
		     r1.getCell(11).setCellStyle(style3);
			 }
			if (status.contains("Absent")) {
				CellStyle style4 = w.createCellStyle();
			     style4.setFillBackgroundColor(IndexedColors.LIGHT_GREEN.getIndex());
			     style4.setFillPattern(FillPatternType.FINE_DOTS);
			     
			     r1.getCell(0).setCellStyle(style4);
			     r1.getCell(1).setCellStyle(style4);
			     r1.getCell(2).setCellStyle(style4);
			     r1.getCell(3).setCellStyle(style4);
			     r1.getCell(4).setCellStyle(style4);
			     r1.getCell(5).setCellStyle(style4);
			     r1.getCell(6).setCellStyle(style4);
			     r1.getCell(7).setCellStyle(style4);
			     r1.getCell(8).setCellStyle(style4);
			     r1.getCell(9).setCellStyle(style4);
			     r1.getCell(10).setCellStyle(style4);
			     r1.getCell(11).setCellStyle(style4);
				
			}
			if (status.contains("Holiday")) {
				CellStyle style5 = w.createCellStyle();
				style5.setFillBackgroundColor(IndexedColors.MAROON.getIndex());
				style5.setFillPattern(FillPatternType.FINE_DOTS);
			     
				r1.getCell(0).setCellStyle(style5);
				r1.getCell(1).setCellStyle(style5);
				r1.getCell(2).setCellStyle(style5);
				r1.getCell(3).setCellStyle(style5);
				r1.getCell(4).setCellStyle(style5);
				r1.getCell(5).setCellStyle(style5);
				r1.getCell(6).setCellStyle(style5);
				r1.getCell(7).setCellStyle(style5);
				r1.getCell(8).setCellStyle(style5);
				r1.getCell(9).setCellStyle(style5);
				r1.getCell(10).setCellStyle(style5);
				r1.getCell(11).setCellStyle(style5);
			}}
						
			

			
		    

//		WebElement Dept = driver.findElement(By.xpath("//select[@formcontrolname='departmentName']"));
//		Select s=new Select(Dept);
//		s.selectByIndex(1);
//		WebElement empname=driver.findElement(By.xpath("//select[@formcontrolname='EmployeeName']"));
//		Select select=new Select(empname);
//		
//	    List<WebElement> options = select.getOptions();
//	    int length=options.size();
//	    for(int z=1; z< size-42;z++) {
//	    select.selectByIndex(z);
        
			Row r = sheet2.createRow(1);
			for (WebElement each : allcol8) {
				if(each.getText().contains("Present")){
					pres++;
					r.createCell(3).setCellValue(pres);

				}}
			for (WebElement each : allcol8) {
				if(each.getText().contains("Absent")){
					abs++;
			        r.createCell(4).setCellValue(abs);
					
			
				}}
			for (WebElement each : allcol8) {
				if(each.getText().contains("Holiday")){
					holi++;
			        r.createCell(5).setCellValue(holi);
					
			
				}}
			
			
			 Cell cells = r.createCell(7);
			  cells.setCellFormula("SUM(C:D)");
			  
			for (WebElement each : allcol8) {
				String number = each.getText();
				String replaces = number.replace(":", ".");
				String trim = replaces.trim();
				try {
					float no = Float.parseFloat(trim);
					if (no<8.45) {
						shorts++;
						r.createCell(6).setCellValue(shorts);
						
					}
				} catch (Exception e) {
				}
				
				
			}}
	

	public void tableHead() throws InterruptedException {
		
		r = sheet.createRow(0);
		 Cell cel1 = r.createCell(0);
		  cel1.setCellValue("Emp Id");
		  Cell cel2 = r.createCell(1);
		  cel2.setCellValue("Emp name");
         System.out.println("print");
		 Cell cel3 = r.createCell(2);
		 cel3.setCellValue("Department");
		 
		 
		 CellStyle style=  w.createCellStyle();
			style.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
			style.setFillPattern(FillPatternType.FINE_DOTS);
			sheet.setColumnWidth(0, 5000);
			sheet.setColumnWidth(1, 5000);
			sheet.setColumnWidth(2, 5000);
			cel1.setCellStyle(style);
			cel2.setCellStyle(style);
			cel3.setCellStyle(style);
			Font font= w.createFont();
			style.setWrapText(true);
	        style.setFont(font);
	        font.setBold(true);
	        
		  ListIterator<WebElement> li = allheaders.listIterator();
		     
			 for (int i = 3; i <allheaders.size()+2; i++) {
				 Cell createCell = r.createCell(i);
				 createCell.setCellStyle(style);
				 sheet.setColumnWidth(i, 5000);
				 createCell.setCellValue(li.next().getText());
			 }
			 
			 
	//*************************************************************************************************		 
		
		waits(department);
		Select s = new Select(department);
		  List<WebElement> options2 = s.getOptions();
		  int size2 = options2.size();
		  System.out.println(size2);
		  for (int i = 1; i < size2; i++) {
			  s.selectByIndex(i);

		  }
		  

		  text3 = s.getOptions().get(1).getText();
		  System.out.println(1);
		  
		  
//***********************************************************************************		  
		  Select sel1 = new Select(listname);
			
			List<WebElement> options = sel1.getOptions();
			int size = options.size();
			System.out.println(size);
			for(int z=1;z<=size-40;z++) {
				Thread.sleep(3000);
				sel1.selectByIndex(z);
			
			
			 text = sel1.getOptions().get(z).getText();
			System.out.println(text);
			

			 text2 = txtEmp.getText();
			 System.out.println(text2);
			 tablecol();	
			}
			
	}
	}
	
	
	


