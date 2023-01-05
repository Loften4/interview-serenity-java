package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.RegisterPage;

public class RegisterStep {
    RegisterPage registerPage;

    @Step
    public void openTheWebsite() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=720,1080");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        registerPage.setDriver(chromeDriver);
        registerPage.getDriver().manage().deleteAllCookies();
        registerPage.open();
    }

    @Step
    public void cookiesBoxDisplayed() {
        registerPage.cookiesIsDisplayed();
    }

    @Step
    public void cookiesContainText(String text) {
        registerPage.cookiesContainText(text);
    }

    @Step
    public void cookiesHyperTextIsDispalyed(String text) {
        registerPage.cookiesHyperTextContainsText(text);
    }

    @Step
    public void checkCookiesHyperLink(String text) {
        Assert.assertEquals(text, registerPage.checkCookiesHyperLink());
    }

    @Step
    public void checkCookiesAcceptButtonText(String text) {
        registerPage.checkAcceptCookiesButtonText(text);
    }

    @Step
    public void clickOnCookiesAcceptButton() {
        registerPage.clickOnAcceptCookiesButton();
    }

    @Step
    public void cookiesBoxNotDisplayed() {
        registerPage.cookiesBoxIsNotDisplayed();
    }

    @Step
    public void checkTransferMateHyperLink(String text) {
        Assert.assertEquals(registerPage.checkTransferMateHyperLink(), text);
    }

    @Step
    public void checkHomeButtonContainsText(String text) {
        registerPage.checkHomeButtonDisplayed(text);
    }

    @Step
    public void checkHomePageHyperLink(String text) {
        Assert.assertEquals(registerPage.checkHomeButtonHyperText(), text);
    }

    @Step
    public void checkSolutionsDropdown(String text) {
        registerPage.checkSolutionsDropdownDisplayText(text);
    }

    @Step
    public void clickOnSolutionsDropDown() {
        registerPage.clickOnSolutionsDropdown();
    }

    @Step
    public void checkIfBusinessAndEducationFieldsAreDisplayed(String text1, String text2) {
        Assert.assertEquals(text1, registerPage.businessFieldIsDisplayed());
    }

    @Step
    public void checkIndividualRadioBox() {
        registerPage.checkIndividualRadioBox();
    }

    @Step
    public void clickOnCountryDropdown() {
        registerPage.clickOnCountryDropdown();
    }

    @Step
    public void clickOnRomaniaCountryOption() {
        registerPage.clickOnRomaniaCountryOption();
    }

    @Step
    public void fillFirstNameInput(String text) {
        registerPage.inputFirstName(text);
    }

    @Step
    public void fillLastNameInput(String text) {
        registerPage.inputLastName(text);
    }

    @Step
    public void fillEmailNameInput(String text) {
        registerPage.fillEmailInput(text);
    }

    @Step
    public void selectRomaniaCountryCodePhoneNumber() {
        registerPage.clickOnPhoneNumberCountryDropdown();
    }

    @Step
    public void fillPhoneNumberInput(String text) {
        registerPage.fillPhoneInput(text);
    }

    @Step
    public void checkTermsOfUseCheckBox() {
        registerPage.checkTermsOfUseBox();
    }

    @Step
    public void checkNewsLetterCheckBox() {
        registerPage.checkNewsLetterCheckbox();
    }

    @Step
    public void clickSubscribeButton() {
        registerPage.clickSubscribeButton();
    }
}
