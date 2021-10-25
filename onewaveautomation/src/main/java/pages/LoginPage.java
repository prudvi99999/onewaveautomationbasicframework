package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By signinoutlook = By.xpath("//span[text()='Sign in with outlook']");
	private By emailaddress = By.xpath("//input[@type='email' and @name ='loginfmt']");
	private By password = By.xpath("//input[@name='passwd' and @type='password']");
	private By submitButton = By.id("SubmitLogin");
	private By next=By.xpath("//input[@type='submit']");
	private By forgotPwdLink = By.linkText("Forgot your password?111");
	private By verifyidentity = By.xpath("//div[text()='Verify your identity']");
	private By homepagebt = By.xpath("//span[text()='HomePage']");
    private By options = By.xpath("//i[@class='fa fa-bars']");
    private By timesheetsoption = By.xpath("//span[normalize-space()='time']");
    private By Projectdropdown =By.xpath("//div/label[text()='Project/WO']/following-sibling::select[1]");
    private By searchButton = By.xpath("//button[text()='Search']");
    private By Entertime = By.xpath("//button[text()='Enter Time']");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void projectselection() throws InterruptedException
	
	{
		WebElement dropdownele= driver.findElement(By.xpath("//div/label[text()='Project/WO']/following-sibling::select"));
		//driver.findElement(Projectdropdown).click();
		Select drpproject = new Select(dropdownele);
		drpproject.selectByVisibleText("OneWave / Onewave");
		Thread.sleep(2000);
		driver.findElement(searchButton).click();
		Thread.sleep(2000);
		driver.findElement(Entertime).click();
		Thread.sleep(2000);
	}

	public void selectsigninoutlook()
	{
		driver.findElement(signinoutlook).click();
	}


	public void selecttimesheetsoption()
	{
		driver.findElement(timesheetsoption).click();
	}
	public void selectoptiondasbborad()
	{
		driver.findElement(options).click();
	}
	public void selectNext()
	{
		driver.findElement(next).click();
	}
	public void selectHomepagebt()
	{
		driver.findElement(homepagebt).click();
	}
	
	public void enterEamiladdress(String email)
	{
		driver.findElement(emailaddress).sendKeys(email);;
	}
	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public boolean isverifyidentitypresent()
	{
		return driver.findElement(verifyidentity).isDisplayed();
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
