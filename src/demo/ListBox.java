package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class ListBox 

{
	static WebDriver driver;
	
	
	static int i=0;
	
	
	public static void screenshot() throws IOException
	{	
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\26 feb\\img"+i+".jpg");
				
		FileHandler.copy(source, dest);
		
		i++;
	}
	
	
	public static void main(String[] args) throws InterruptedException, IOException   {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();


		driver.navigate().to("https://www.facebook.com");

		Thread.sleep(3000);
		
		screenshot();

		WebElement Button = driver.findElement(By.xpath("//a[text()='Create New Account']"));

			Button.click();
			
			Thread.sleep(3000);
		
		screenshot();
			
			WebElement Day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			
			
			Select day = new Select(Day);
			day.selectByIndex(0);
					
			
			WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			
			
			Select month = new Select(Month);
			
			month.selectByValue("5");
			
			
			
			
			WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			
			
			Select year = new Select(Year);
			
			year.selectByVisibleText("2005");
			
			
			
		screenshot();
			
			
			
	}
}
