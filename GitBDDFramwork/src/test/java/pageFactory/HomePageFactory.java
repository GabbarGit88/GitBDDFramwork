package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

	WebDriver driver;
	
	@FindBy(className = "app_logo") WebElement sauce_logo;
	 public void logoIsDisplay()
	 {
		 sauce_logo.isDisplayed();
		 
	 }
	 
	 public HomePageFactory(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
}