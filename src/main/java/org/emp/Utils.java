package org.emp;



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import io.github.bonigarcia.wdm.WebDriverManager;



public class Utils extends BaseClass {
    static WebDriver driver;
    
  
    public static  void lunchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://kedge.srinsofttech.com/#/kn-pages/auth/login");
        driver.manage().window().maximize();



   }
    
    
    public static void init() {
        PageFactory.initElements(driver, org.emp.KedgePomLoginPage.class);
    }
    
    public void init1() {
        PageFactory.initElements(driver, org.emp.KedgePomLms.class);



   }
    
    //The Method for wait using wait.....
            public static  void waits(WebElement ele) {
                WebDriverWait wait = new WebDriverWait(driver,100);
                wait.until(ExpectedConditions.visibilityOf(ele));
            }
            
            public static void waits1(WebElement element) {
                WebDriverWait wait = new WebDriverWait(driver,100);
                wait.until(ExpectedConditions.visibilityOf (element));



           }
            
            public void fluentWait(List<WebElement> element) {
                FluentWait wait = new FluentWait(driver);
                wait.until(ExpectedConditions.visibilityOf((WebElement) element));
                wait.withTimeout(30,TimeUnit.SECONDS);
                wait.pollingEvery(5, TimeUnit.SECONDS);
                wait.ignoring(ClassCastException.class);
            }
            
            @AfterClass
            public void close() {
                //driver.quit();
            }
            
            public void windowHandle() {
                //String parent = driver.getWindowHandle();
                
                Set<String> allwindows = driver.getWindowHandles();
                
                for (String each : allwindows) {
                    if(!each.equals(allwindows)){
                        driver.switchTo().window(each);
                    }
                }



           }
            static Sheet sheet;
            static Sheet sheet2;
            static Workbook w;
            public  void excelWorkBook() {
                 w = new XSSFWorkbook();
                  sheet2 = w.createSheet("Summary");
                   sheet = w.createSheet("Table");
           	    sheet.setDisplayGridlines(true);
        	    sheet2.setDisplayGridlines(true);




           }
            private void waiting(WebElement locator) {
            	WebDriverWait waitts=new WebDriverWait(driver,150);
            	waitts.until(ExpectedConditions.invisibilityOf(locator));
			}
            
            public void fileOutPut() throws IOException {
            FileOutputStream f = new FileOutputStream("C:\\Users\\arun.kumar\\OneDrive - SrinSoft Technologies Pvt Ltd\\Documents\\Excel\\kedgedetailspom.xlsx");
            w.write(f);
            f.close();
            }
    
        
}