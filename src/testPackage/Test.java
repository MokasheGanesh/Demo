package testPackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class Test {
public static int addition(int i, int j)
{
	int result=0;
	result =i+j;
	return result;
	
	
}


	public static void main(String[] args) throws InterruptedException, IOException {
			
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//	
//	WebDriver driver = new ChromeDriver();
//	
////	driver.get("https://chromedriver.chromium.org/downloads");
////	
////	Thread.sleep(3000);
//	
//	driver.navigate().to("https://www.amazon.in/");
//	
//	Thread.sleep(5000);
//	WebElement UserName = driver.findElement(By.id("nav-link-accountList"));
//
//	Actions a= new Actions(driver);
//	a.moveToElement(UserName).perform();
	
		//UserName.sendKeys("Velocity@1234");
//	
//			
//			
//			Password.sendKeys("9999999");
		
			
//			WebElement Button = driver.findElement(By.xpath("//a[text()='Create New Account']")); // Xpath by text()
//
//			Button.click();
//			
//			Thread.sleep(3000);
//			
//			WebElement Password = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
//
//			
//			Select s = new Select(Password);
//			s.selectByVisibleText("Jul");
//			
//			
//			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File dest = new File ("D:\\5 Feb-B\\img.jpg");
//			FileHandler.copy(source, dest);
	
			
			
	
	
		
		
		Scanner s= new Scanner(System.in);
		int iNo=0, iNO2=0, iNO3=0;
		iNo=s.nextInt();
		
		System.out.println(iNo);
		
		iNO2=s.nextInt();
		System.out.println(iNO2);
		
		iNO3=s.nextInt();
		System.out.println(iNO3);
		
		int a=iNO2+iNO3;
		System.out.println(a);
	}
}
