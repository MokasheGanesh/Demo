package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		//	driver.get("https://chromedriver.chromium.org/downloads");
		//	
		//	Thread.sleep(3000);

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		Thread.sleep(5000);

		/*WebElement UserName = driver.findElement(By.name("username"));

		UserName.sendKeys("Velocity@1234");


		WebElement Password = driver.findElement(By.name("password"));

		Password.sendKeys("9999999");


		*/
		WebElement Button = driver.findElement(By.className("button"));	

		Button.click();

	}
}
