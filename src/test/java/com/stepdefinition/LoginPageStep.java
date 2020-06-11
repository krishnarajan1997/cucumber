package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {
	public static WebDriver driver;

	@Given("user in the login page")
	public void user_in_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/index.php");
	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
WebElement user = driver.findElement(By.id("username"));
user.sendKeys("krishnarajan");
WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("krishnarajan");
	}

	@When("click the login button")
	public void click_the_login_button() throws InterruptedException {

WebElement log = driver.findElement(By.id("login"));
log.click();
Thread.sleep(5000);
	}

	@When("user pass username and password data")
	public void user_pass_username_and_password_data() {

WebElement user = driver.findElement(By.id("username"));
user.sendKeys("krishnaraj");
WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("krishnaraj");
	}

	@When("clicked login button")
	public void clicked_login_button() {

WebElement log = driver.findElement(By.id("login"));
log.click();
	}
}
