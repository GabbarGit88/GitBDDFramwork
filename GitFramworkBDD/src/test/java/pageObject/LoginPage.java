package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver driver;

	By txt_username = By.className("form_input");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");
	
	public LoginPage(WebDriver driver) { 
		
		this.driver = driver;
	}

		public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void userLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login);

	}

	public void appLogoDisplay() {
		driver.findElement(lbl_logo).isDisplayed();

	}
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orangebits\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/"); 
	}



}
