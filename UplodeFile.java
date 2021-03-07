package seleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplodeFile {
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/upload/");
WebElement element=driver.findElement(By.id("uploadfile_0"));
element.sendKeys("C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\bin");
Thread.sleep(3000);
driver.findElement(By.id("terms"));
driver.findElement(By.id("submitbutton")).click();

	}

}
