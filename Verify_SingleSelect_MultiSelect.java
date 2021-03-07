package seleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_SingleSelect_MultiSelect {
	 static
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	    WebElement elt=driver.findElement(By.name("country"));
		Select act=new Select(elt);
		System.out.println(act.isMultiple());
		//isMultipule is use to verify drop-down list is single select or multi select
		//act.deselectByIndex(3);
		//act.selectByIndex(4);
		//System.out.println(act.getOptions());
	}

}
