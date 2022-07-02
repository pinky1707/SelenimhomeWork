package hw15UseOfMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isSelected_method { 
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
	public void signInButtonTest() throws InterruptedException {
		boolean checkSignInButton = driver.findElement(By.cssSelector("button#SignIn-submitButton")).isSelected(); //
		System.out.println("Is the Sign In Button Selected? Ans: " + checkSignInButton);
		Thread.sleep(5000);
	}  //Is the Sign In Button Selected? Ans: false
	   //PASSED: signInButtonTest


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
