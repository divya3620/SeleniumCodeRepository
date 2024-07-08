package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {

		// testing is happening behind the scene
		// faster
		// can be helpful in linux machine
		// can be used with CI CD Pipeline - Jenkins, GithubActions, AWS

		// might not work for complex app - html, menu items
		// might not work for internal navigations, mouse hover, mouse movement

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		co.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");

		WebDriver driver1 = new FirefoxDriver(fo);
		driver1.get("https://www.google.com");
		System.out.println(driver1.getTitle());
		// driver.quit();

	}

}