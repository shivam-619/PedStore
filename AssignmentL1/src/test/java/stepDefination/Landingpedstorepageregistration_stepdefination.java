package stepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


public class Landingpedstorepageregistration_stepdefination {
	
	
	//String baseUrl = "https://petstore.octoperf.com/"; 
	public static WebDriver driver;
	String userId = "dep";
	
	@Given("^User is on pedstore Landing page$")
    public void user_is_on_pedstore_landing_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/SH20379802/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/");
    	driver.findElement(By.xpath("//a[normalize-space()='Enter the Store']")).click();
    	
        

		
    }

    @When("^user first register in login page$")
    public void user_first_register_in_login_page() throws Throwable {
		
    	driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Register Now!']")).click();
		
    }

    @Then("^user fill the user information$")
    public void user_fill_the_user_information() throws Throwable {
    	//System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='User Information']")).getText());     
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userId);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("dep");
        driver.findElement(By.xpath("//input[@name=\"repeatedPassword\"]")).sendKeys("dep");
  
        
        
    }

    @And("^user also fill the Account information$")
    public void user_also_fill_the_account_information() throws Throwable {
        driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("shivam");
        driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("verma");
        driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("shivam@gmail.com");
        driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys("9999999999");
        driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys("bhagalpur");
        driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys("shantinagar");
        driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys("mathura");
        driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("Bihar");
        driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("710402");
        driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
        Thread.sleep(5000);
        WebElement staticDropdown = driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByValue("japanese");
        Thread.sleep(3000);
        WebElement StaticDropdown = driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
        Select dropDown = new Select(StaticDropdown);
        dropDown.selectByValue("CATS");
        System.out.println("ok");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='account.listOption']")).click();
        driver.findElement(By.xpath("//input[@name='account.bannerOption']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='newAccount']")).click();
        
        
    }

    @When("user first login the page")
    public void user_first_login_the_page() {
        // Write code here that turns the phrase above into concrete actions
    	//driver.get(baseUrl);
    	//driver.findElement(By.xpath("//a[normalize-space()='Enter the Store']")).click();
    	driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
        
    }

    @Then("user fill the login credentials")
    public void user_fill_the_login_credentials() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userId);
        driver.findElement(By.xpath("//input[@name='password']")).clear();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dep");
        driver.findElement(By.xpath("//input[@name='signon']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='WelcomeContent']")).getText());
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
        
    }


}
