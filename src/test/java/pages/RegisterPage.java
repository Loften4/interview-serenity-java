package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://transfermate.io/en/register.asp?")
public class RegisterPage extends PageObject {
    @FindBy(id = "cookies-box")
    private WebElementFacade cookiesBox;

    @FindBy(id = "cookies-txt")
    private WebElementFacade cookiesText;

    @FindBy(css = ".cookies-info")
    private WebElementFacade cookiesHyperText;

    @FindBy(id = "cookies-read-more-link")
    private WebElementFacade cookiesAcceptButton;

    @FindBy(css = "div.logo")
    private WebElementFacade transferMateLogo;

    @FindBy(css = "div.logo > a")
    private WebElementFacade transferMateHyperLink;

    @FindBy(id = "menu_482_28_28611")
    private WebElementFacade homeButton;

    @FindBy(css = "div.fixed-header #top_menu_main > li:nth-child(2) > a")
    private WebElementFacade solutionsDropdown;

    @FindBy(css = "#menu_512_114_28710 > span")
    private WebElementFacade businessField;

    @FindBy(xpath = "//span[contains(text(),'Education') and not span[class='sr-only']]")
    private WebElementFacade educationField;

    @FindBy(id = "register_account_type_partnership_form_input")
    private WebElementFacade individualRadioBox;

    @FindBy(id = "country")
    private WebElementFacade countryDropDown;


    @FindBy(css = ".navbar-toggle.go-left")
    private WebElementFacade btnBurger;

    @FindBy(css = "#li_myaccount")
    private WebElementFacade menuMyAccount;

    @FindBy(css = "#sidebar_left #li_myaccount .dropdown-menu .go-text-right[href*='login']")
    private WebElementFacade menuLogin;

    @FindBy(xpath = "//div[contains(@class, 'country_row')]//option[contains(text(),'Romania')]")
    private WebElementFacade romaniaDropDownOption;

    @FindBy(id = "first_name")
    private WebElementFacade firstNameInput;

    @FindBy(id = "last_name")
    private WebElementFacade lastNameInput;

    @FindBy(id = "email")
    private WebElementFacade emailInput;

    @FindBy(xpath = "//div[contains(@class, 'custom_class_mobilephone')]//option[contains(text(),'Romania')]")
    private WebElementFacade phoneNumberCountry;

    @FindBy(id = "__pin_mobile_number_mobile_phone > label")
    private WebElementFacade phoneNumberInput;

    @FindBy(css = "div.terms_of_use_agree_form_input > label")
    private WebElementFacade termsOfUseCheckBox;

    @FindBy(css = "div.newsletter_and_privacy_policy_agree_form_input")
    private WebElementFacade newsLetterCheckbox;

    @FindBy(id = "button_subscribe")
    private WebElementFacade subscribeButton;


    public void cookiesIsDisplayed() {
        cookiesBox.shouldBeVisible();
    }

    public void cookiesContainText(String text) {
        cookiesText.shouldContainText(text);
    }

    public void cookiesHyperTextContainsText(String text) {
        cookiesHyperText.shouldContainText(text);
    }

    public Object checkCookiesHyperLink() {
        return cookiesHyperText.getAttribute("href");
    }

    public void checkAcceptCookiesButtonText(String text) {
        cookiesAcceptButton.shouldContainText(text);
    }

    public void clickOnAcceptCookiesButton() {
        cookiesAcceptButton.click();
    }

    public void cookiesBoxIsNotDisplayed() {
        cookiesBox.shouldNotBeVisible();
    }

    public String checkTransferMateHyperLink() {
        return transferMateHyperLink.getAttribute("href");
    }

    public void checkHomeButtonDisplayed(String text) {
        homeButton.shouldContainText(text);
    }

    public String checkHomeButtonHyperText() {
        return homeButton.getAttribute("href");
    }

    public void checkSolutionsDropdownDisplayText(String text) {
        solutionsDropdown.shouldContainText(text);
    }

    public void clickOnSolutionsDropdown() {
        solutionsDropdown.click();
    }

    public String businessFieldIsDisplayed() {
        return businessField.getText();
    }

    public String educationFieldIsDisplayed() {
        return educationField.getText();
    }

    public void checkIndividualRadioBox() {
        individualRadioBox.click();
    }

    public void clickOnCountryDropdown() {
        countryDropDown.click();
    }

    public void clickOnRomaniaCountryOption() {
        romaniaDropDownOption.click();
    }

    public void inputFirstName(String text) {
        firstNameInput.sendKeys(text);
    }

    public void inputLastName(String text) {
        lastNameInput.sendKeys(text);
    }

    public void fillEmailInput(String text) {
        emailInput.sendKeys(text);
    }

    public void clickOnPhoneNumberCountryDropdown() {
        phoneNumberCountry.click();
    }

    public void fillPhoneInput(String text) {
        phoneNumberInput.sendKeys(text);
    }

    public void checkTermsOfUseBox() {
        termsOfUseCheckBox.click();
    }

    public void checkNewsLetterCheckbox() {
        newsLetterCheckbox.click();

    }

    public void clickSubscribeButton() {
        Awaitility.waitAtMost(30, TimeUnit.SECONDS);
        subscribeButton.click();
    }
}
