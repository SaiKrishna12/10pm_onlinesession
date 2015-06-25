package day25;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementPresence {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void elementTest()
	{
		String str=driver.getPageSource();
		if(str.contains("Rajnikanth"))
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}
	}

}
