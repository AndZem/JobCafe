package Pages.UserPages;

import Consts.Consts;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Consts.Consts.FILTERS_LOCATION_INPUT;
import static Pages.MainPage.LOGO_IMG;

public class CreateAccountPage extends BasePage {

    public static final String CREATE_ACCOUNT_TITLE = "//input[@name = 'confirm']";

    public boolean isCreateAccountTitleVisible() {
        return elementExists(CREATE_ACCOUNT_TITLE);
    }

    //    Create account fill up form
    public void enterUsername(String username) {
        sendTextToElementByXpath(Consts.CREATE_ACCOUNT_USERNAME_INPUT, username);
    }

    public void enterPassword(String password) {
        sendTextToElementByXpath(Consts.CREATE_ACCOUNT_PASSWORD_INPUT, password);
    }

    public void enterConfirm(String confirm) {
        sendTextToElementByXpath(Consts.CREATE_ACCOUNT_CONFIRM_INPUT, confirm);
    }

    public void pushSubmitButton() {
        clickElementByXpath(Consts.CREATE_ACCOUNT_SUBMIT_BUTTON);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(FILTERS_LOCATION_INPUT)));
    }
}