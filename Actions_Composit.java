package seleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Composit {
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement linktext=driver.findElement(By.linkText("acti.inc"));
		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL).click(linktext).perform();
	}

}
