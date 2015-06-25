package day14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class MultipleWindow1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://citibank.com");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//*[@id='tab1']/div[2]/ul/li/a")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
		   driver.switchTo().window(it.next());
		   Thread.sleep(40000);
		   try
		   {
			   driver.findElement(By.xpath("html/body/section[1]/article/ul[2]/li[1]/a")).click();
			   break;
		   }
		   catch(Exception e)
		   {
			   
		   }
		}
	}

}
