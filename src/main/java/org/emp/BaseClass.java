package org.emp;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



import org.testng.annotations.AfterClass;



public class BaseClass {
    
    static FileInputStream file;
    static  Properties p = new Properties();
    
    public String reader(String key) throws IOException {
        file = new FileInputStream("C:\\Users\\arun.kumar\\workspace\\emp\\Folder\\ak.properties");
        p.load(file);
        return p.getProperty(key);
        
        
    }
    



}