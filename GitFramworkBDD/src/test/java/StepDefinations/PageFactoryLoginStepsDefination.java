package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.loginPageFactory;

public class PageFactoryLoginStepsDefination {

	WebDriver driver;
	loginPageFactory login;
	HomePageFactory home;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Orangebits\\Downloads\\Compressed\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");

	}

	//@When("User enter valid username and password") 
	//public void user_enter_valid_username_and_password() {

	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String username, String password) throws InterruptedException {

		login = new loginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(3000);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {

		login.clickLogin();
	}

	@Then("User navigated to Home Page")
	public void user_navigated_to_home_page() {

		home = new HomePageFactory(driver);
		home.logoIsDisplay();
	}

	@And("Close the Browser")
	public void close_the_browser() {
		driver.quit();
	}

}
