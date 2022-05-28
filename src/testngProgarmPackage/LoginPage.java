package testngProgarmPackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	ChromeDriver driver;
	@Test
	public void loginClick()
	{
		driver.get("https://www.itlearn360.com/");
		driver.findElement(By.id("loginlabel")).click();
	}
	
	@Test(dependsOnMethods="loginClick")
	public void passCredentials()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.id("user_login")).sendKeys("raviranjancs");
		driver.findElement(By.id("user_pass")).sendKeys("raviranjancs1234@");
		driver.findElement(By.id("wp-submit")).submit();
	}
	
	@Test(dependsOnMethods="passCredentials")
	public void checkMainPage()
	{
		String expectedText="ITlearn360";
		String actualtext= driver.findElement(By.xpath("//*[@id=\"logo\"]/a/span")).getText();
		Assert.assertEquals(actualtext,expectedText);
	}
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
