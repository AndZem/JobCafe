import Pages.MainPage;
import Pages.UserPages.CreateAccountPage;
import Pages.UserPages.LoginPage;
import Pages.UserPages.MyAccountPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserPageTest extends UseCaseBase {

    private static MainPage mainPage;
    private static LoginPage loginPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openLoginPage();
    }

    @Test
    public void openCreateAccountPageTest() {
        logger.info("Create account page load test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        boolean isCreateAccountPageTitleVisible = createAccountPage.isCreateAccountTitleVisible();
        assertTrue(isCreateAccountPageTitleVisible);
    }


    //    Create account positive test
    @Test
    public void createAccountFullTest() {
        logger.info("Create account full test");
        CreateAccountPage createAccountPage = loginPage.createAccountOption();
        createAccountPage.enterUsername("Zem");
        createAccountPage.enterPassword("12345678");
        createAccountPage.enterConfirm("12345678");
        createAccountPage.pushSubmitButton();
        boolean isHomePageLoaded = mainPage.isLogoHomeVisible();
        assertTrue(isHomePageLoaded);
    }

    //    Login tests
    @Test
    public void loginInAccountTest() {
        logger.info("Login in account test");
        loginPage.loginUsernameInput("Zem");
        loginPage.loginPasswordInput("12345678");
        loginPage.loginInButton();
//      Not a robot pictures can't automate
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
    }
}