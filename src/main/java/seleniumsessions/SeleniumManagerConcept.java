package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerConcept {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("115");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		//String cPath = SeleniumManager.getInstance().getDriverPath();
		//System.out.println(cPath);

		driver.quit();

	}

}
//error in this