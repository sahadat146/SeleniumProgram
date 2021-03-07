package seleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenDevition_PopUp {
	static
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpkA_1dBPDZ']")).sendKeys(args);
	}

}
