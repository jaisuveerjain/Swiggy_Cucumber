package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef {
	
	 WebDriver driver;
	   
	   @Before
	   public void setup() {
		   System.setProperty("webdriver.chrome.driver","chromedriver");
	        
	       driver = new ChromeDriver();
		   
	   }
	   
	   @After
	   public void teardown() {
		   
		   //driver.quit();
	   }
	  
	   	
	   	@Given("^User has opened swiggy website on Chrome Browser$")
	    public void user_has_opened_swiggy_website_on_chrome_browser() throws Throwable {
	   		driver.get("https://www.swiggy.com/");
	           driver.manage().window().maximize();
	           driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	       
	    }

	    @When("^User entered the \"([^\"]*)\"$")
	    public void user_entered_the_something(String phonenumber) throws Throwable {
	    	WebElement lnkLogin = driver.findElement(By.xpath("//*[text()='Login']"));
	          lnkLogin.click();
	          
	          WebElement phoneno = driver.findElement(By.xpath("//input[@id='mobile']"));
	          phoneno.sendKeys(phonenumber);
	          
	          
	          WebElement Login_btn = driver.findElement(By.xpath("//*[@class='a-ayg']"));
	          Login_btn.click();
	    }

	    @Then("^User should be able to login$")
	    public void user_should_be_able_to_login() throws Throwable {
	        
	    }
}



