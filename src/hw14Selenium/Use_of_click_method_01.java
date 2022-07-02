/*
 * Use testNG annotation to create method to run an URL or several. Use click() methods for the existing work in previous HW or in a different package. As a locator you can find unique id, class, name, linkText, PartialLinkText, CSS selector for recognizing web element. You can also choose more than one url to see those actions.
 */

package hw14Selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_click_method_01 {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.kroger.com/signin?redirectUrl=/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void signinButtonTest1() throws InterruptedException {
		driver.findElement(By.id("SignIn-submitButton")).click();//by Id locator
		Thread.sleep(5000);
	}

	public void signButtonTest2() {
		driver.findElement(By.className("kds-Button kds-Button--primary w-full my-8")).click();
		;//by Class(Name) locator
	}

	public void signInEmailFieldTest3() {
		driver.findElement(By.name("name")).click();//by Name locator
	}

	public void logotest6() {
		driver.findElement(By.cssSelector("img.Image")).click();//by CssSelector locator
	}

	public void signInButtonTest7() {
		driver.findElement(By.cssSelector("button#SignIn-submitButton")).click();// by CssSeclrctor(By Id) locator
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
