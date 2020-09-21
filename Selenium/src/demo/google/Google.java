package demo.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class   Google{ 
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
    
    driver.manage().window().maximize();
      
// Launch website  
    driver.navigate().to("http://www.facebook.com/"); 
    
    driver.findElement(By.name("email")).sendKeys("abcd1230@gmail.com");
    
    driver.findElement(By.id("pass")).sendKeys("password");
    
    driver.findElement(By.name("login")).click();
    
      
    }  
  
}