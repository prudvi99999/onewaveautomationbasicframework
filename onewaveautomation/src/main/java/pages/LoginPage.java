package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By signinoutlook = By.xpath("//span[text()='Sign in with outlook']");
	private By emailaddress = By.xpath("//input[@type='email' and @name ='loginfmt']");
	private By password = By.xpath("//input[@name='passwd' and @type='password']");
	private By submitButton = By.id("SubmitLogin");
	private By next=By.xpath("//input[@type='submit']");
	private By forgotPwdLink = By.linkText("Forgot your password?111");


	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectsigninoutlook()
	{
		driver.findElement(signinoutlook).click();
	}
	public void selectNext()
	{
		driver.findElement(next).click();
	}
	
	public void enterEamiladdress()
	{
		driver.findElement(emailaddress).sendKeys("prudvi.penmetsa@techwave.net");;
	}
	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		//driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
	//	driver.findElement(signInButton).click();
	}

	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
	//	driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
	//	driver.findElement(signInButton).click();
		return new AccountsPage(driver);
	}

}
