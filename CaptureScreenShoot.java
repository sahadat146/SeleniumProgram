package seleniumInterviewQuestion;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

class CaptureScreenShoot {
	static WebDriver driver;
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
driver=new ChromeDriver();
driver.get(" https://www.facebook.com/");
takeScreenShot("login_page");
	}
public static void takeScreenShot(String fileName) throws IOException {

File file=(File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(file,new File("C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\src\\seleniumInterviewQuestion "));
}
}
