package hw17Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
 
public class use_headless_browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.costco.com/");
		Thread.sleep(3000);
		System.out.println("The current Url is: " + driver.getCurrentUrl());
		System.out.println("Test execution completed");
		driver.quit();
		
	}

}
