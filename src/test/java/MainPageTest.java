import Pages.*;
import Pages.UserPages.CreateAccountPage;
import Pages.UserPages.LoginPage;
import Pages.UserPages.MyAccountPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;


public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    //    Navigate to Home Page Tests
    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        mainPage.takeScreenshot("MainPageTest");
        boolean success = mainPage.isLogoVisible();
        assertTrue(success);

//        The page is loaded
//        Logo is visible
//        Coming soon image is on the screen

    }

    //    From Home Page click on the About Us menu option
    @Test
    public void openAboutPageTest() {
        logger.info("About page load test");
        AboutPage aboutPage = mainPage.openAboutPage();
        mainPage.takeScreenshot("AboutPageTest");
        boolean isAboutLoaded = aboutPage.isPageTitleVisible();
        assertTrue(isAboutLoaded);

//        About page is opened
//        Logo is visible
    }

    //    From Home Page click on the Jobs menu option
    @Test
    public void openJobsPageTest() {
        logger.info("Jobs page load test");
        JobsPage jobsPage = mainPage.openJobsPage();
        mainPage.takeScreenshot("JobsPageTest");
        boolean isJobsLoaded = jobsPage.isJobsPageTitleVisible();
        assertTrue(isJobsLoaded);

//        The jobs page is displayed
    }

    //    From Home Page click on the Registration menu option
    @Test
    public void CreateAccountPageTest() {
        logger.info("CreateAccount page load test");
        CreateAccountPage createAccountPage = mainPage.openCreateAccountPage();
        mainPage.takeScreenshot("CreateAccountPageTest");
        boolean isCreateAccountLoaded = createAccountPage.isCreateAccountTitleVisible();
        assertTrue(isCreateAccountLoaded);

//        Registration page is opened
//        Logo is visible
    }


    //          From Home Page click on the Contact Us menu option
    @Test
    public void openContactUsPageTest() {
        logger.info("Contact Us page load test");
        ContactUsPage contactUsPage = mainPage.openContactUsPage();
        mainPage.takeScreenshot("ContactUsPageTest");
        boolean isContactUsLoaded = contactUsPage.isContactUsPageTitleVisible();
        assertTrue(isContactUsLoaded);

//        Contact Us page is opened
//        Logo is visible
    }

    //          From Home Page click on the Login menu option
    @Test
    public void loginPageTest() {
        logger.info("Login page load test");
        LoginPage loginPage = mainPage.openLoginPage();
        mainPage.takeScreenshot("LoginPageTest");
        boolean isLoginLoaded = loginPage.isLoginPageTitleVisible();
        assertTrue(isLoginLoaded);

//        Login page is opened
//        Logo is visible
    }
}