package testngProgarmPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CoursesPage {

	WebDriver driver;
	
	@Test(priority=1)
	public void allCourses()
	{
		driver.findElement(By.xpath("//*[@id=\"primary_menu\"]/a")).click();
		
	}
	
	@Test(priority=2)
	public void selectCourses()
	{
		WebElement course= driver.findElement(By.xpath("//*[@id=\"nav-menu-item-7397\"]/a/div"));
		
//WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")) ;
        
        // Action class - action object -- passing driver information as parameter
        Actions action = new Actions(driver);
        System.out.println("Mouse is over the - HELLO, SIGN IN - option");
        
        // moveToElement is the method() of class Action
        action.moveToElement(course).build().perform();
        
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-12355\"]/a/div/span")).click();
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
