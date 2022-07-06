package StepDefinitions1.TreeSteps;

import static utils.configPropertiesFile.getURL;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Treepage;

public class treeSteps {

	public WebDriver driver;
	public Treepage tPageObj;
	
	@Before
	public void browser_setup() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium Downloads\\version100\\chromedriver.exe");
	driver=new ChromeDriver();
	tPageObj=new Treepage(driver);
	driver.get(getURL());
	tPageObj.signInButton();
	tPageObj.userName();
	tPageObj.password();
	tPageObj.loginButton();
	driver.manage().window().maximize();
	}
	@After
	
	public void tear_down()
	{
		driver.close();
		
	}

@Given("User is on home page")
public void user_is_on_home_page() throws IOException {
System.out.println(driver.getTitle());
}
@When("user clicks on the {string} button below the tree category")
public void user_clicks_on_the_GetStarted_button_below_the_tree_category(String string) {
	tPageObj.treeGetStrted();  
}
@And("User clicks on the {string} link")
public void user_clicks_on_the_link(String string) throws InterruptedException {
	Thread.sleep(5000);
	tPageObj.overViewTrees();
}

@When("User clicks on the {string} button")
public void user_clicks_on_the_button(String string) {
	tPageObj.tryHere1();
}

@Then("User keys in the code to be executed")
public void user_keys_in_the_code_to_be_executed() throws IOException {
	tPageObj.editor1();
}
//User clicks on the Run button 
@Then("User clicks on the Run button")
public void User_clicks_on_the_Run_button() {
	tPageObj.runbtn1();
}

@Then("User views the result")
public void user_views_the_result() {
	tPageObj.output();
}
@Then("user navigates back to previous Tree page")
public void user_navigates_back_to_previous_tree_page() {
	driver.navigate().back();
}

@Given("User is on Tree page")
public void user_is_on_tree_page() {
    System.out.println(driver.getTitle());
    
}

@When("User is navigates to terminologies page")
public void user_is_navigates_to_terminologies_page() throws InterruptedException {
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(5000);
	tPageObj.terminologies();
}

@When("User clicks on the \"Types of Trees\"link")
public void user_clicks_on_the_types_of_trees_link() {
	tPageObj.TypesofTrees();
}

@When("User is navigates to Types of Trees page")
public void user_is_navigates_to_types_of_trees_page() {
	System.out.println("User is on the Types of trees page");
}

@When("User is navigates to Tree Traversals page")
public void user_is_navigates_to_tree_traversals_page() {
	tPageObj.TreeTraversals();
}

@When("User is navigates to Traversals-Illustration page")
public void user_is_navigates_to_traversals_illustration_page() {
	tPageObj.traversalsIllustration();
}

@When("User is navigates to Binary Trees page")
public void user_is_navigates_to_binary_trees_page() {
	tPageObj.binaryTrees();
}

@When("User is navigates to Types of Binary Trees page")
public void user_is_navigates_to_types_of_binary_trees_page() {
	tPageObj.BinaryTreesTypes();
	
}

@When("User is navigates to Implementation in python page")
public void user_is_navigates_to_implementation_in_python_page() {
	tPageObj.ImplementationinPython();
}

@When("User is navigates to Binary Tree Traversals  page")
public void user_is_navigates_to_binary_tree_traversals_page() {
	tPageObj.BinaryTreeTraversals();
}

@When("User is navigates to Implementation Binary Trees  page")
public void user_is_navigates_to_implementation_binary_trees_page() {
	tPageObj.implementationBinaryTrees();
}

@When("User is navigates to Applications of  Binary Trees  page")
public void user_is_navigates_to_applications_of_binary_trees_page() {
	tPageObj.applicationsofBinarytrees();
}

@When("User is navigates to Binary Search Trees   page")
public void user_is_navigates_to_binary_search_trees_page() {
	tPageObj.BinarySearchTrees();
}

@When("User is navigates to Implementation Of BST    page")
public void user_is_navigates_to_implementation_of_bst_page() {
	tPageObj.ImplementationOfBST();
}

@When("User is navigates to Practice Questions  page")
public void user_is_navigates_to_practice_questions_page() {
	tPageObj.PracticeQuestions();
}

@Then("User navigates to practise page")
public void user_navigates_to_practise_page() {
	System.out.println("USer navigates to practise page");
}
}
