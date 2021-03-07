package seleniumInterviewQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Js_Alart_popup {
	 static
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 
        // Alert Message handling
                    		
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");			
                            		
     	      	
        driver.findElement(By.name("proceed")).click();				
       
        		
        // Switching to Alert        
       Alert alert = driver.switchTo().alert();
     
 		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
       // alert.dismiss();
	}

}
