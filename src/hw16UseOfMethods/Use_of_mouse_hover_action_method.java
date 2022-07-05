package hw16UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_mouse_hover_action_method { 
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
@Test
	public void mouseHoverActionTest() throws InterruptedException {
		Actions actons= new Actions(driver);
		WebElement eBayRef= driver.findElement(By.xpath("(//a[text()='eBay Refurbished'])[3]"));
		Thread.sleep(3000);
		actons.moveToElement(eBayRef).build().perform();
		Thread.sleep(3000);
		System.out.println("The text of the web element is :" + eBayRef.getText());
		//The text of the web element is :eBay Refurbished
		//PASSED: mouseHoverActionTest

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
