package hw16UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_fireFoxDriver_dropDown { 
	FirefoxDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = true, priority = 1)
	public void selectByVisibleText01() throws InterruptedException {
		WebElement dropElement=driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select select = new Select(dropElement);
		select .selectByVisibleText("Cameras & Photo");
		Thread.sleep(3000);
		}
	@Test(enabled = true, priority = 2)
	public void selectByIndexText02() throws InterruptedException {
		WebElement dropElement=driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select select = new Select(dropElement);
		select .selectByIndex(10);
		Thread.sleep(3000);
	}
	@Test(enabled = true, priority = 3)
	public void selectByValueText03() throws InterruptedException {
		WebElement dropElement=driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select select = new Select(dropElement);
		select .selectByValue("267");
		Thread.sleep(3000);
		//PASSED: selectByIndexText02
		//PASSED: selectByVisibleText01
		//PASSED: selectByValueText03

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
