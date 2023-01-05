package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.RegisterStep;

public class RegisterStepDefinition {
    @Steps
    RegisterStep registerStep;

    @Given("I open the website")
    public void openTheWebsite() {
        registerStep.openTheWebsite();
    }

    @Then("^The cookies box is displayed$")
    public void theCookiesBoxIsDisplayed() {
        registerStep.cookiesBoxDisplayed();
    }

    @And("^The displayed text in the box is \"([^\"]*)\"$")
    public void theDisplayedTextInTheBoxIs(String text) {
        registerStep.cookiesContainText(text);
    }

    @And("^The \"([^\"]*)\" hyperlink is displayed$")
    public void theHyperlinkIsDisplayed(String text) throws Throwable {
        registerStep.cookiesHyperTextIsDispalyed(text);
    }

    @And("^The hyperlink is the following \"([^\"]*)\"$")
    public void theHyperlinkIsTheFollowing(String text) {
        registerStep.checkCookiesHyperLink(text);
    }

    @And("^The button Cookies Accept Button displays the following text \"([^\"]*)\"$")
    public void theButtonDisplaysTheFollowingText(String text) {
        registerStep.checkCookiesAcceptButtonText(text);
    }

    @When("^I click on the I accept cookies button$")
    public void iClickOnTheIAcceptCookiesButton() {
        registerStep.clickOnCookiesAcceptButton();
    }

    @Then("^The cookies box is not displayed$")
    public void theCookiesBoxIsNotDisplayed() {
        registerStep.cookiesBoxNotDisplayed();
    }


    @And("^The hyperlink for the Transfer Mate logo is the following \"([^\"]*)\"$")
    public void checkHyperlinkForTransferMateLogo(String text) {
        registerStep.checkTransferMateHyperLink(text);
    }

    @And("^The Home button is displayed$")
    public void theHomeButtonIsDisplayed() {
    }

    @And("^The Home button shows text \"([^\"]*)\"$")
    public void theHomeButtonShowsText(String text) {
        registerStep.checkHomeButtonContainsText(text);
    }


    @And("^The Solutions DropDown shows text \"([^\"]*)\"$")
    public void checkSolutionsDropDown(String text) {
        registerStep.checkSolutionsDropdown(text);
    }


    @When("^I click on the Solutions Dropdown$")
    public void clickOnTheSolutions() {
        registerStep.clickOnSolutionsDropDown();
    }

    @Then("^The fields \"([^\"]*)\" and \"([^\"]*)\" are displayed$")
    public void theFieldsAreDisplayed(String text1, String text2) {
        registerStep.checkIfBusinessAndEducationFieldsAreDisplayed(text1, text2);
    }

    @And("^I check the Individual Radio Box$")
    public void checkTheIndividualRadioBox() {
        registerStep.checkIndividualRadioBox();
    }

    @When("^I click on the Country Dropdown$")
    public void clickOnTheCountryDropdown() {
        registerStep.clickOnCountryDropdown();
    }

    @And("^I click on the Romania option$")
    public void clickOnTheRomaniaOption() {
        registerStep.clickOnRomaniaCountryOption();
    }

    @Then("^I fill the First Name input with \"([^\"]*)\"$")
    public void fillTheFirstNameInput(String text) {
        registerStep.fillFirstNameInput(text);
    }

    @Then("^I fill the Last Name input with \"([^\"]*)\"$")
    public void fillTheLastNameInput(String text) {
        registerStep.fillLastNameInput(text);
    }

    @And("^I fill the Email input with \"([^\"]*)\"$")
    public void fillTheEmailInputWith(String text) {
        registerStep.fillEmailNameInput(text);
    }

    @And("^I select Romania Option from the Mobile Phone Dropdown$")
    public void selectRomaniaOptionFromTheMobilePhoneDropdown() {
        registerStep.selectRomaniaCountryCodePhoneNumber();
    }

    @And("^I fill the Phone Number Input with \"([^\"]*)\"$")
    public void fillThePhoneNumberInput(String text) {
        registerStep.fillPhoneNumberInput(text);
    }

    @And("^I check the Terms of Use and Privacy checkbox$")
    public void checkTheTermsOfUseAndPrivacyCheckbox() {
        registerStep.checkTermsOfUseCheckBox();
    }

    @And("^I check the News Letter and Privacy checkbox$")
    public void checkTheNewsLetterAndPrivacyCheckbox() {
        registerStep.checkNewsLetterCheckBox();
    }

    @Then("^I click on the Open my free account button$")
    public void clickOnTheOpenMyFreeAccountButton() {
        registerStep.clickSubscribeButton();
    }
}
