package hw17Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_sendKeys_by_javascriptExecutor {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		js =(JavascriptExecutor) driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bestbuy.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
@Test
public void backToSchoolTest() {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='v-p-right-xxs utility-nav-drawer-btn-label'])[1]"))).click();
	
}

@AfterTest
public void tearUp() {
	driver.quit();
}

}
