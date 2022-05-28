package testngProgarmPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchCourses {
	
	ChromeDriver driver;
	
	@Test
	public void checkCourses()
	{
		driver.get("https://www.itlearn360.com/");
		driver.findElement(By.name("search_course")).sendKeys("Java for Automation Testing");
		driver.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
	}
	
	@Test(dependsOnMethods="checkCourses")
	public void clickIcon()
	{
		driver.findElement(By.xpath("//*[@id=\"post-\"]/a/h3")).click();
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
