package org.stepdefenition;
import java.util.List;
import io.cucumber.datatable.CucumberDataTableException;
import org.bas.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbRegister extends BaseClass {

	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
		launchBrowser();
		WindowMaximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
		driver.get("https://www.facebook.com/");

	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		WebElement c = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		c.click();
	}

	@When("To pass firstname in firstname feild")
	public void to_pass_firstname_in_firstname_feild(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		WebElement f = driver.findElement(By.name("firstname"));
		f.sendKeys("mohamed");
	}

	@When("To pass secondname in secondname feild")
	public void to_pass_secondname_in_secondname_feild() throws InterruptedException {
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.name("lastname"));
		s.sendKeys("abusayath");
	}

	@When("To pass mobileno or emailid in text box")
	public void to_pass_mobileno_or_emailid_in_text_box(DataTable d) {
		List<List<String>> a = d.asLists();
		WebElement m = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		m.sendKeys(a.get(1).get(0));
	}

	@When("To create a newpassword in password text box")
	public void to_create_a_newpassword_in_password_text_box() {
		WebElement p = driver.findElement(By.xpath("(//input[@autocomplete='new-password'])"));
		p.sendKeys("pdmnd45");
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		//closeEntireBrowser();
	}

}
