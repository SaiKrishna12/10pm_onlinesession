package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicxpath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_143')]/div/ol/li[6]/a")).click();
		
	}

}
