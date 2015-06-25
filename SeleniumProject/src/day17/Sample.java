package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	
	@Test(priority=1)
	public void registration()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
		List<WebElement> myframes=driver.findElements(By.tagName("frame"));
		System.out.println(myframes.size());
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
	}
	
	@Test(priority=2)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}

}
