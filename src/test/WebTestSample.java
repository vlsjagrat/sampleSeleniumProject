package test;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WebTestSample {
	public static WebDriver driver;
	@BeforeClass 
	public static void beforeClass(){

	System.setProperty("webdriver.chrome.driver", "/home/jagrat/Downloads/chromedriver");
	
	
	}	

	@Before
	public void beforeTest(){
		driver = new ChromeDriver();

		
		driver.navigate().to("https://volansys.com/");
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grve-main-header")));
		

	}
	
	@Test
	public void test() {
		String pageTitle = driver.getTitle();
		System.out.println("page title = "+pageTitle);
		Assert.assertEquals("Product Engineering, Hardware, Software, Mobility, IoT, Cloud, Quality Engineering Services", pageTitle);
		
	}
	@AfterClass
	public static void afterClass(){
		driver.quit();
	}

}
