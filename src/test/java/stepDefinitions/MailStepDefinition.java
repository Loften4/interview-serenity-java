package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MailStep;

public class MailStepDefinition {
    @Steps
    MailStep mailStep;

    @When("^I input email \"([^\"]*)\"$")
    public void iInputEmail(String arg0) {
        mailStep.inputEmail(arg0);
    }

    @When("^I click on Send Phone Notification button$")
    public void clickSentNotificationButton() {
        mailStep.clickSendNotificationBtn();
    }

    @Given("^I navigate to Yahoo Mail Website$")
    public void iNavigateToYahooMailWebsite() {
        mailStep.openTheWebsite();
    }

    @Then("^I click on the Navigate Forward Button$")
    public void iClickOnThe() {
        mailStep.clickOnGoForwardButton();
    }

    @Then("^I click on the Activation Mail from Transfer Mate$")
    public void clickOnTheActivationMailFromTransferMate() {
        mailStep.clickOnActivationMail();
    }

    @And("^I click on Activate My Account button$")
    public void clickOnActivateMyAccountButton() {
        mailStep.clickOnActivateMyAccountButton();
    }
}
