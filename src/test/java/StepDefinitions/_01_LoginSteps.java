package StepDefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        //System.out.println("Site açıldı");
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        //System.out.println("Username ve şifre gönderildi");

//        dc.username.sendKeys("turkeyts");
//        dc.password.sendKeys("TechnoStudy123");
//        dc.loginButton.click();

        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password,"TechnoStudy123");
        dc.myClick(dc.loginButton);
    }

    @Then("User should be login successfully")
    public void user_should_be_login_successfully() {
        //System.out.println("Siteye gidildiği doğrulandı ");

        dc.verifyContainsText(dc.headText,"Internship");
    }

    @Then("User should  be login successfully")
    public void userShouldBeLoginSuccessfully() {

        dc.verifyContainsText(dc.headText,"Internship");
    }
}
