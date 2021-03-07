package seleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement from=driver.findElement(By.id("credit2"));
	WebElement to=driver.findElement(By.id("bank"));
	Actions act=new Actions(driver);
	act.dragAndDrop(from, to).build().perform();
	}

}
