package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static utils.configPropertiesFile.*;

import java.io.IOException;

public class linkedListPage {

	WebDriver driver=null;
	
	public linkedListPage(WebDriver driver)  // create constructor to access these methods
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  // to initalise web elements
	}
	
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signInButton;
	
	@FindBy(xpath="//input[@id='id_username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='id_password']")
	WebElement password;

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@href='linked-list']")
	WebElement getStartedButton;
	
	@FindBy(linkText="Introduction")
	WebElement introduction;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHerebutton;
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement textarea;
	
	@FindBy(xpath="//button[text()='Run']")
	WebElement runButton;

	public void signInButton()
	{
		signInButton.click();
	}
	public void userName() throws IOException
	{
	username.sendKeys(getUserName());
	}
	public void password() throws IOException
	{
		password.sendKeys(getPassword());
	}
	public void loginButton()
	{
		loginButton.click();
	}
	public void linkedListGetStarted()
	{
		getStartedButton.click();
	}
	public void Introduction()
	{
		introduction.click();
	}

	public void tryHereButton()
	{
		tryHerebutton.click();
	}
	public void textarea()
	{
		textarea.sendKeys("print('HI')");
	}
	
	public void runButton()
	{
		runButton.click();
	}
}
