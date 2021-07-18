package stepdefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage login=new LoginPage(DriverFactory.getDriver());
    public static String title;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title=login.GetStringTitle();
        System.out.println("login page title is"+title);


    }

    @Then("title should be {string}")
    public void title_should_be(String expected_title)
    {
        Assert.assertTrue(title.contains(expected_title));

    }

    @Then("forgot password link should be displayed")
    public void forgot_password_link_should_be_displayed()
    {
    Assert.assertTrue(login.isForgotPasswordLinkExist());

    }

    @When("user enters username {string}")
    public void user_enters_username(String username)
    {
    login.enterUserName(username);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        login.enterPassword(password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        login.submit_login();
    }





    @And("page title in Account page should be {string}")
    public void pageTitleInAccountPageShouldBe(String account_title) {
        Assert.assertTrue(title.contains(account_title));
    }
}