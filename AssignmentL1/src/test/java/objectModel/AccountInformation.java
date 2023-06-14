package objectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountInformation {
	public WebDriver driver;
	public AccountInformation(WebDriver driver) {
		this.driver=driver;
	}
	By search = By.xpath("//input[@name='account.firstName']");

}
