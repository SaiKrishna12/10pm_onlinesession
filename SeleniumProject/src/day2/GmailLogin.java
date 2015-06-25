package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.name("Email")).sendKeys("saikrishna@gmail.com");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("krishna@123");
		driver.findElement(By.cssSelector("#signIn")).click();
		
		

	}

}
