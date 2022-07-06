package StepDefinitions1;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.linkedListPage;
import static utils.configPropertiesFile.getURL;
public class linkedTestSteps {

	public WebDriver driver;

	public linkedListPage linkedListobj;

	@Before
	public void browserStep() {
		System.out.println("----Browser Setup----");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Selenium Downloads\\version100\\chromedriver.exe");
		
	//	"C:\Program Files\Selenium Downloads\New folder\chromedriver.exe"
		driver = new ChromeDriver();
		linkedListobj = new linkedListPage(driver);
	}

	@After

	public void tearDown() {

		System.out.println("After Test-----");
		driver.close();
	}

	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws IOException, InterruptedException {
	
		driver.get(getURL());

		linkedListobj.signInButton();

		linkedListobj.userName();
		linkedListobj.password();
		linkedListobj.loginButton();

	}

	@When("user clicks on the {string} button")
	public void user_clicks_on_the_button(String startButton) {
		linkedListobj.linkedListGetStarted();
	}

	@And("user clicks on the {string} topic")
	public void user_clicks_on_the_topic(String intro) {
		linkedListobj.Introduction();
	}

	@Then("user clicks on the tryhere button")
	public void user_clicks_on_the_tryherebutton() {
		linkedListobj.tryHereButton();
	}

	@And("user navigates to tryEditor Page")
	public void user_navigates_to_try_editor_page() throws InterruptedException {
		String pageTitle = driver.getTitle();
		Assert.assertEquals("Assessment", pageTitle);
	}

	@And("user keys in the python code")
	public void user_keys_in_the_python_code() {
		linkedListobj.textarea();
	}

	@And("user clicks on the Run button")
	public void user_clicks_on_the_run_button() {
		linkedListobj.runButton();
	}

	@And("user can view the result")
	public void user_can_view_the_result() {
		System.out.println(driver.getTitle());
		driver.navigate().back();

	}

}
