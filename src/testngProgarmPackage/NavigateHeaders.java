package testngProgarmPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigateHeaders {
WebDriver driver;
	
	@Test(priority =1)
	public void freeCourses()
	{
		driver.findElement(By.linkText("Free Courses")).click();
		driver.navigate().back();
	}
	@Test(priority =2)
	public void onlineClasses()
	{
		driver.findElement(By.linkText("Online Classes")).click();
		driver.navigate().back();
	}
	
	@Test(priority =3)
	public void blog()
	{
		driver.findElement(By.linkText("Blog")).click();
		driver.navigate().back();
	}
	
	@Test(priority =4)
	public void jobs()
	{
		driver.findElement(By.linkText("Jobs")).click();
		driver.navigate().back();
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
		driver.close();
	}
}
