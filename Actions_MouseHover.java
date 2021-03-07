package seleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_MouseHover {static
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
	}

public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("http://mrbool.com/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();

	}

}
