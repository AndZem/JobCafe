import Pages.JobsPage;
import Pages.MainPage;
import Pages.UserPages.LoginPage;
import Pages.JobsPage;
import Pages.UserPages.MyAccountPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Consts.Consts.JOBS_FOUND;
import static Consts.Consts.JOBS_NO_RESULTS;
import static Pages.BasePage.wait;
import static Pages.JobsPage.JOBS_HEADER;
import static org.junit.jupiter.api.Assertions.*;

public class JobsPageTest extends UseCaseBase {

    private static MainPage mainPage;
    private static LoginPage loginPage;
    private static JobsPage jobsPage;
    public static final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
        jobsPage = new JobsPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
        mainPage.openLoginPage();
        mainPage.openJobsPage();

    }
    //    Navigate to the jobs page
//    Search for a location: Toronto, Tel-Aviv, Chicago, New-York

    @Test
    public void searchForLocationTest() {
        logger.info("Login in account test");
        loginPage.loginUsernameInput("Zem");
        loginPage.loginPasswordInput("12345678");
        loginPage.loginInButton();
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
//      check location Toronto
        logger.info("Jobs page load test");
        jobsPage.locationInput("Toronto");
        jobsPage.pushSearchButton();
        boolean isJobsPageCityTorontoLoaded = jobsPage.isJobsPageTorontoVisible();
        assertTrue(isJobsPageCityTorontoLoaded);
        jobsPage.takeScreenshot("JobsPageCityTorontoTest");
        jobsPage.pushResetButton();
//      check location Tel-Aviv
        logger.info("Jobs page load test");
        jobsPage.locationInput("Tel Aviv");
        jobsPage.pushSearchButton();
        boolean isJobsPageCityTelAvivLoaded = jobsPage.isJobsPageTelAvivVisible();
        assertTrue(isJobsPageCityTelAvivLoaded);
        jobsPage.takeScreenshot("JobsPageCityTelAvivTest");
        jobsPage.pushResetButton();
        //      check location Chicago
        logger.info("Jobs page load test");
        jobsPage.locationInput("Chicago");
        jobsPage.pushSearchButton();
        boolean isJobsPageCityChicagoLoaded = jobsPage.isJobsPageChicagoVisible();
        assertTrue(isJobsPageCityChicagoLoaded);
        jobsPage.takeScreenshot("JobsPageCityChicagoTest");
        jobsPage.pushResetButton();
        //      check location New-York
        logger.info("Jobs page load test");
        jobsPage.locationInput("New York");
        jobsPage.pushSearchButton();
        boolean isJobsPageCityNewYorkLoaded = jobsPage.isJobsPageNewYorkVisible();
        assertTrue(isJobsPageCityNewYorkLoaded);
        jobsPage.takeScreenshot("JobsPageCityNew-YorkTest");
//        The results list is displayed for each city
    }

    //    Navigate to the jobs page
//    Search for a position: QA, Developer, Project Manager
    @Test
    public void searchForPositionTest() throws InterruptedException {
        logger.info("Login in account test");
        loginPage.loginUsernameInput("Zem");
        loginPage.loginPasswordInput("12345678");
        loginPage.loginInButton();
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
        //      check position QA
        logger.info("Jobs page load test");
        jobsPage.positionInput("QA");
        jobsPage.pushSearchButton();
        boolean isJobsPagepositionQaLoaded = jobsPage.isJobsPageQaVisible();
        assertTrue(isJobsPagepositionQaLoaded);
        jobsPage.takeScreenshot("JobsPagePositionQaTest");
        jobsPage.pushResetButton();
        //      check position Developer
        logger.info("Jobs page load test");
        jobsPage.positionInput("Developer");
        jobsPage.pushSearchButton();
        boolean isJobsPagepositionDeveloperLoaded = jobsPage.isJobsPageDeveloperVisible();
        assertTrue(isJobsPagepositionDeveloperLoaded);
        jobsPage.takeScreenshot("JobsPagePositionDeveloperTest");
        jobsPage.pushResetButton();
        //      check position Project Manager
        logger.info("Jobs page load test");
        jobsPage.positionInput("Project Manager");
        jobsPage.pushSearchButton();
        boolean isJobsPagepositionProjectManagerLoaded = jobsPage.isJobsPageProjectManagerVisible();
        assertTrue(isJobsPagepositionProjectManagerLoaded);
        jobsPage.takeScreenshot("JobsPagePositionProjectManagerTest");
//        The results list is displayed for each position
    }

    //    Navigate to the jobs page
//    Search for a company: Apple, Facebook, Google
    @Test
    public void searchForCompanyTest() {
        logger.info("Login in account test");
        loginPage.loginUsernameInput("Zem");
        loginPage.loginPasswordInput("12345678");
        loginPage.loginInButton();
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
        //      check company Apple
        logger.info("Jobs page load test");
        jobsPage.companyInput("Apple");
        jobsPage.pushSearchButton();
        boolean isJobsCompanyAppleLoaded = jobsPage.isJobsPageAppleVisible();
        assertTrue(isJobsCompanyAppleLoaded);
        jobsPage.takeScreenshot("JobsPageCompanyAppleTest");
        jobsPage.pushResetButton();
        //      check company Facebook
        logger.info("Jobs page load test");
        jobsPage.companyInput("facebook");
        jobsPage.pushSearchButton();
        boolean isJobsCompanyFacebookLoaded = jobsPage.isJobsPageFacebookVisible();
        assertTrue(isJobsCompanyFacebookLoaded);
        jobsPage.takeScreenshot("JobsPageCompanyFacebookTest");
        jobsPage.pushResetButton();
        //      check company Google
        logger.info("Jobs page load test");
        jobsPage.companyInput("Google");
        jobsPage.pushSearchButton();
        boolean isJobsCompanyGoogleLoaded = jobsPage.isJobsPageGoogleVisible();
        assertTrue(isJobsCompanyGoogleLoaded);
        jobsPage.takeScreenshot("JobsPageCompanyGoogleTest");
//        The results list is displayed for each company
    }

    //    Make a combined search - look for manager positions in Google in USA
    @Test
    public void combinedSearchTest() {
//        Login in account
        logger.info("Login in account test");
        loginPage.loginUsernameInput("Zem");
        loginPage.loginPasswordInput("12345678");
        loginPage.loginInButton();
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
        //      look for manager positions in Google in USA
        logger.info("Jobs page load test");
        jobsPage.positionInput("Manager");
        jobsPage.locationInput("USA");
        jobsPage.companyInput("Google");
        jobsPage.pushSearchButton();
        boolean isJobsCombinedSearchLoaded = jobsPage.isJobsPageCombinedVisible();
        assertTrue(isJobsCombinedSearchLoaded);
        jobsPage.takeScreenshot("JobsPageCombinedSearchTest");
//        The results are visible
    }

    //    No results - enter abracadabra to position filter and press search button
    @Test
    public void abracadabraSearchTest() {
//        Login in account
        logger.info("Login in account test");
        loginPage.loginUsernameInput("Zem");
        loginPage.loginPasswordInput("12345678");
        loginPage.loginInButton();
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
        //      enter abracadabra to position
        logger.info("Jobs page load test");
        jobsPage.positionInput("abracadabra");
        jobsPage.pushSearchButton();
        boolean isJobsAbracadabraSearchLoaded = jobsPage.isJobsPageNoResults();
        assertTrue(isJobsAbracadabraSearchLoaded);
        jobsPage.takeScreenshot("JobsPageAbracadabraSearchTest");
//        "No results found!
    }

//    Populate all the edit boxes
//    Press reset button
    @Test
    public void populateAllSearchTest() {
//        Login in account
        logger.info("Login in account test");
        loginPage.loginUsernameInput("Zem");
        loginPage.loginPasswordInput("12345678");
        loginPage.loginInButton();
        MyAccountPage myAccountPage = new MyAccountPage();
        boolean isMyAccountPageLoaded = myAccountPage.isMyAccountPageTitleVisible();
        assertTrue(isMyAccountPageLoaded);
        //      look for manager positions in Google in USA
        logger.info("Jobs page load test");
        jobsPage.positionInput("Manager");
        jobsPage.locationInput("USA");
        jobsPage.companyInput("Google");
        jobsPage.descriptionInput("Full time");
        jobsPage.juniorInput();
        jobsPage.midInput();
        jobsPage.seniorInput();
        jobsPage.managerInput();
        jobsPage.pushResetButton();
        boolean isJobsResetLoaded = jobsPage.isJobsPageTitleVisible();
        assertTrue(isJobsResetLoaded);
        jobsPage.takeScreenshot("JobsPageResetTest");
//      Verify all the input text has disappeared

    }
}


