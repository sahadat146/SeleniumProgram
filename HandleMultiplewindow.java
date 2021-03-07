package seleniumInterviewQuestion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiplewindow {
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.guru99.com/popup.php");
String parent=driver.getWindowHandle();
System.out.println("parent_Window"+parent);
WebElement ClickElement=driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
for(int i=0;i<3;i++)
{
	ClickElement.click();
	Thread.sleep(3000);
}

Set<String> AllWindow = driver.getWindowHandles();

	for(String handle :AllWindow)
	{
		System.out.println("Child_Window"+AllWindow);
	}
}
	}


/*for(int i=0;i<3;i++)
{
	ClickElement.click();
	Thread.sleep(3000);
	done
}
*/