package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
	BrowserUtil brUtil = new BrowserUtil();
	WebDriver driver= brUtil.initDriver("chrome");
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	By fName= By.id("input-firstname");
	By lName= By.id("input-lastname");
    By email= By.id("input-email");
    By tPhone= By.id("input-telephone");
    By pwd= By.id("input-password");
    By cPwd=By.id("input-confirm");
    By newsLetterRadio= By.name("newsletter");
 //   By checkbox=By.name("agree");
   // By confirm=By.className("btn btn-primary");
    ElementUtil eleUtil = new ElementUtil(driver);
    eleUtil.doSendKeys(fName, "Divya");
    Thread.sleep(5000);
    eleUtil.doSendKeys(lName,"Mishra" );
    eleUtil.doSendKeys(email, "divyamishra@34");
    eleUtil.doSendKeys(tPhone, "84893479093");
    Thread.sleep(5000);
    eleUtil.doSendKeys(pwd, "div@123");
    eleUtil.doSendKeys(cPwd,"div@123");
    eleUtil.doClick(newsLetterRadio);
  //  eleUtil.doClick(checkbox);
 //   eleUtil.doClear(confirm);
    /*Thread.sleep(5000);
    By msgTag = By.tagName("h1");
    String message = eleUtil.doGetElementText(msgTag);
    if
    (message.equals("Your Account Has Been Created!")) 
    {
    System.out.println("PASS-- USer account created successfully"); }
    else {
     System.out.println("FAIL--User account creation FAILED");*/ 
	}

}

