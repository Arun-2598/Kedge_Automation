
package org.emp;



import java.io.IOException;




import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import org.emp.KedgePomLms;



public class TestCase extends Utils {
    
   
    
    KedgePomLoginPage kedgepomloginpage = new KedgePomLoginPage();
    
    KedgePomLms kedgepomlms ;
    
    @Test(priority=1)
    public void launchBrowser(){
        Utils.lunchBrowser();
        kedgepomlms = new KedgePomLms(driver);
    }
    
    @Test(priority=2)
    
    public void checkLoginPage() throws IOException, InterruptedException {
        
     
        String username = reader("empId");
        kedgepomloginpage.enterUserName(username);
        
        
        String password = reader("password");
        kedgepomloginpage.enterPassword(password);
        
        kedgepomloginpage.clickLoginforKedge1();    
        
    }
    
    @Test(priority=3)
    public void checkLms() throws InterruptedException, IOException {



       //Thread.sleep(5000);
        kedgepomlms.clickLmsbutton();
        windowHandle();
        kedgepomlms.clickpunch();
        
        
        excelWorkBook();
        kedgepomlms.tableHead();
        fileOutPut();
        



   }
    




}

