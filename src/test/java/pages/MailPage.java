package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://mail.yahoo.com")
public class MailPage extends PageObject {
    @FindBy(id = "login-username")
    private WebElementFacade username;

    @FindBy(id = "login-signin")
    private WebElementFacade nextStepButton;

    @FindBy(xpath = "//button")
    private WebElementFacade sendPhoneNotificationButton;

    @FindBy(xpath = "[title ='no_reply@transfermate.io']")
    private WebElementFacade selectTransferMateActivationLink;

    @FindBy(xpath = "//tr/td/a/span[contains(text(),'Activate My Account')]")
    private WebElementFacade activateMyAccountButton;

    public void inputEmail(String text) {username.sendKeys(text);}

    public void clickForwardButton(){nextStepButton.click();}

    public void clickSendNotificationBtn() {
        sendPhoneNotificationButton.click();
    }

    public void clickOnActivationMail(){selectTransferMateActivationLink.click();}

    public void clickOnActivateMyAccountButton(){activateMyAccountButton.click();}
}
