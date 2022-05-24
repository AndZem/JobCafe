package Pages.UserPages;

import Consts.Consts;
import Pages.BasePage;


public class LoginPage extends BasePage {

    public static final String LOGIN_PAGE_TITLE = "//input[@name = 'username']";


    public boolean isLoginPageTitleVisible() {
        return elementExists(LOGIN_PAGE_TITLE);
    }

    //   Extra links
    public CreateAccountPage createAccountOption() {
        clickElementByXpath(Consts.LOGIN_CREATE_NEW_ACCOUNT_LINK);
        return new CreateAccountPage();
    }

    //Login input
    public void loginUsernameInput(String username) {
        sendTextToElementByXpath(Consts.LOGIN_USERNAME_INPUT, username);
    }

    public void loginPasswordInput(String password) {
        sendTextToElementByXpath(Consts.LOGIN_PASSWORD_INPUT, password);
    }

    public void loginInButton() {
        clickElementByXpath(Consts.LOGIN_LOGIN_IN_BUTTON);
    }
}
