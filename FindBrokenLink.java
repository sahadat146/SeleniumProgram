package seleniumInterviewQuestion;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink {
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\blr-frontdesk-ptt\\New folder\\string\\IntPro\\driver1\\chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(" s");
driver.findElement(By.name("username")).sendKeys("shanu");
driver.findElement(By.name("password")).sendKeys("575627");
driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.switchTo().frame(" f");
	//get the list of link and image
	List<WebElement>linklist=driver.findElements(By.tagName("a"));
	linklist.addAll(driver.findElements(By.id("img")));
	List<WebElement>activeList=new ArrayList<WebElement>();
	for(int i=0;i<linklist.size();i++)
	{
		if(linklist.get(i).getAttribute("href")!=null);
		{
			activeList.add(linklist.get(i));
			
		}
	}
	System.out.println(activeList.size());
	
	}
	
	

}
