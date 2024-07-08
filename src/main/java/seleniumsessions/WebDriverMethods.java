package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();// launch chrome
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		//String pgSource  = driver.getPageSource();
		// System.out.println(pgSource);
		// System.out.println(pgSource.contains("end customers section"));
		driver.get("https://www.google.com");
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		driver.manage().window();
		driver.manage().window().fullscreen();
	

}}