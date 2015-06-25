package day16;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class MultipleWindows2 {

	static FirefoxDriver driver=null;
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("http://citibank.com");
		driver.findElement(By.xpath("//*[@id='tab1']/div[2]/ul/li/a")).click();
		switchWindow("html/body/section[1]/article/ul[2]/li[1]/a");
		switchWindow("//*[@id='cmlink_TermsConditions']");
		
	}
	public static void switchWindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
		   driver.switchTo().window(it.next());
		   
		   try
		   {
			   driver.findElement(By.xpath(x)).click();
			   break;
		   }
		   catch(Exception e)
		   {
			   
		   }
		}
	}

}
