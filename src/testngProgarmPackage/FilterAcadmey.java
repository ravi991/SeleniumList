package testngProgarmPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FilterAcadmey {

	ChromeDriver driver;
	@Test(priority =1)
	public void freeCourses()
	{
		driver.findElement(By.linkText("Free Courses")).click();
		driver.findElement(By.xpath("//*[@id=\"lp-archive-courses\"]/div[3]/ul/li[1]/label")).click();
	}
	@Test(priority =2)
	public void checkCourses ()
	{
		driver.findElement(By.xpath("//*[@id=\"lp-archive-courses\"]/div[3]/ul/li[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"lp-archive-courses\"]/div[3]/ul/li[2]/label")).click();
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
