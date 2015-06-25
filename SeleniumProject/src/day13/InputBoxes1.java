package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class InputBoxes1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		String[] str={"one","two","three","four","five","six","seven","eight"};
		List<WebElement> myinput=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(myinput.size());
		for(int i=0;i<myinput.size();i++)
		{
			myinput.get(i).sendKeys(str[i]);
		}
		
		
		
		
		
		
		
		
		

	}

}
