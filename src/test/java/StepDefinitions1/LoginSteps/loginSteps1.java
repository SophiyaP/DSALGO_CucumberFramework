package StepDefinitions1.LoginSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps1 {


@Given("LMS Login page, < Login Name>, <Password>")
public void lms_login_page_login_name_password() {
	System.out.println("Inside Step-User is on login page"); 
}


@Given("<Class Topic>, <Class Date>, <Staff Name>, <Description> and <Comments>")
public void class_topic_class_date_staff_name_description_and_comments() {
System.out.println("Inside Step-User is on login page");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	 System.out.println("Inside Step-user enters valid credentials");
}

@And("clicks on login button")
public void clicks_on_login_button() {
	 System.out.println("Inside Step- clicks on login world");
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	 System.out.println("Inside Step-user navigated successfully");
}

}
