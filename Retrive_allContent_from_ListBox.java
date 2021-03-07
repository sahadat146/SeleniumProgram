package seleniumInterviewQuestion;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Retrive_allContent_from_ListBox {
	 static
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	    WebElement elt=driver.findElement(By.name("country"));
		Select act=new Select(elt);
		System.out.println(act.isMultiple());
		List<WebElement> allContent=act.getOptions();
		int count=allContent.size();
			System.out.println(count);
			for(WebElement content:  allContent)
			{
				String str= content.getText();
				System.out.println(str);
			}
			
	}

}
