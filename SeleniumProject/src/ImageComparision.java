
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ImageComparision {
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		 driver=new FirefoxDriver();
		driver.get("http://bbc.com");
	}
	@Test
	public void screenshotTest() throws IOException
	{
		WebElement image1=driver.findElement(By.xpath("//*[@id='blq-main']/div/div[2]/div[1]/div[2]/div[1]/a/span[1]/img"));
		WebElement image2=driver.findElement(By.xpath("//*[@id='blq-main']/div/div[2]/div[1]/div[2]/div[2]/a/span[1]/img"));
		File firstimage=screenshot(image1);
		File secondimage=screenshot(image2);
		if(FileUtils.contentEquals(firstimage,secondimage))
		{
			System.out.println("Images are same");
			
		}
		else
		{
			System.out.println("Images are different");
		}
		
		
		
	}
	
	public File screenshot(WebElement image) throws IOException
	{
		

		
		WrapsDriver wrapsDriver = (WrapsDriver) image;
	    File screenshot = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);
	    Rectangle rectangle = new Rectangle(image.getSize().width, image.getSize().height);
	    Point location = image.getLocation();
	    BufferedImage bufferedImage = ImageIO.read(screenshot);
	    BufferedImage destImage = bufferedImage.getSubimage(location.x, location.y, rectangle.width, rectangle.height);
	    ImageIO.write(destImage, "png", screenshot);
	    
	    
	    return screenshot;
		
	}

}


