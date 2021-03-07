package seleniumInterviewQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleWithoutUsing_getOption {
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
		//isMultiple( ) : boolean – This tells whether the SELECT element support multiple -
		//-selecting options at the same time or not. This accepts nothing but returns boolean value(true/false).
		WebElement content=act.getWrappedElement();
		System.out.println(content.getText());
	}

}
