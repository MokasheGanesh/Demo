package demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	
	
	public static void main(String[] args) {
		
		//Implicit wait  
		//Explicit wait
		//Fluent Wait
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		// driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		
		//Implicit wait  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //Waiting time
//		
//		//NoSuchElement
//		
//		WebElement Button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//	 refresh
		Button.click()	;
//		
//		WebElement Button1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));  //500 ms  // Waiting time + Condition
		WebElement Button =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create New Account']")));
		Button.click()	;
		
		
		//Fluent Wait (// Waiting time + Condition + time interval)
		
		Wait <WebDriver> wait1 = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(2))
								.ignoring(NoSuchElementException.class);
		
		button.sendkeys()
		
	}	

}
