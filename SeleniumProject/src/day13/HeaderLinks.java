package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
		List<WebElement> headerlinks=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for(int i=0;i<headerlinks.size();i++)
		{
			System.out.println(headerlinks.get(i).getText());
		}
		System.out.println("abc");
		

	}

}
