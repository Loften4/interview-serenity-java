package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.MailPage;

public class MailStep {
    MailPage mailPage;

    @Step
    public void openTheWebsite(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=720,1080");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        mailPage.setDriver(chromeDriver);
        mailPage.getDriver().manage().deleteAllCookies();
        mailPage.open();
    }

    @Step
    public void inputEmail(String arg0) {
        mailPage.inputEmail(arg0);
    }

    @Step
    public void clickSendNotificationBtn() {mailPage.clickSendNotificationBtn();}

    @Step
    public void clickOnGoForwardButton(){mailPage.clickForwardButton();}

    @Step
    public void clickOnActivationMail(){mailPage.clickOnActivationMail();}

    @Step
    public void clickOnActivateMyAccountButton(){mailPage.clickOnActivateMyAccountButton();}
}
