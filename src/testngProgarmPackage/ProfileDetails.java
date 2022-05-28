package testngProgarmPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProfileDetails {
WebDriver driver;

@Test(priority=1)
public void loginClick()
{
	driver.get("https://www.itlearn360.com/");
	driver.findElement(By.id("loginlabel")).click();
}

@Test(priority=2)
public void passCredentials()
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.findElement(By.id("user_login")).sendKeys("raviranjancs");
	driver.findElement(By.id("user_pass")).sendKeys("raviranjancs1234@");
	driver.findElement(By.id("wp-submit")).submit();
}


	@Test(priority=3)
	public void subscriptions()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[1]/a")).click();
		driver.navigate().back();
	}
	
	@Test(priority=4)
	public void profile()
	{
		
		driver.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[2]/a")).click();
	}
	
	

	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.itlearn360.com/");
        driver.manage().window().maximize();
        
	}
	
	@AfterTest
	public void tearDown()
	{
//		driver.close();
	}
}
