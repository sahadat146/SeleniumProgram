package seleniumInterviewQuestion;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildeWindow_CloseChildWindow {
	static
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String pw=driver.getWindowHandle();
		Set<String>whs=driver.getWindowHandles();
		int count=whs.size();
		System.out.println(count);
		for(String w:whs)
		{
			driver.switchTo().window(w);
			driver.close();
		}
	}

}
