package org.emp;



import java.awt.List;
import java.util.ListIterator;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class KedgePomLoginPage extends Utils{
    
    public KedgePomLoginPage() {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy (xpath="//input[@formcontrolname='username']")
    public static WebElement userId;
    
    @FindBy(xpath="//input[@formcontrolname='password']")
    public static WebElement userPass;
    
    @FindBy(xpath="//button[@aria-label='LOGIN']")
    public static WebElement clickKedgeLogin;
    



   
    
    
    //************************method********************************
    
    
    
    public void enterUserName(String username) {
        System.out.println("Enters user name");
      init();
        userId.sendKeys(username);
        
    }
    public void enterPassword(String pass) {
    System.out.println("Enter user password");
    waits(userPass);
    init();
    userPass.sendKeys(pass);
      
    }
    public  void clickLoginforKedge1() throws InterruptedException {
        waits(clickKedgeLogin);
        
        System.out.println("click login");
        clickKedgeLogin.click();
    }


}


