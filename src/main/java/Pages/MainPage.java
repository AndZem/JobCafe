package Pages;

import Consts.Consts;
import Pages.UserPages.CreateAccountPage;
import Pages.UserPages.LoginPage;

public class MainPage extends BasePage {

    public static final String LOGO_IMG = "//img[@src='/img/JC_comingSoon.jpg']";
    private static final String ABOUT_OPTION = "//a[@id='2']";
    private static final String JOBS_OPTION = "//a[@id='3']";
    private static final String CREATE_ACCOUNT_OPTION = "//a[text()='Registration']";
    private static final String CONTACT_US_OPTION = "//a[text()='Contact Us']";
    private static final String LOGIN_OPTION = "//a[text()='Log In']";
    private static final String LOG_HOME_IMG_OPTION = "//div[@class='d-flex justify-content-between align-items-center']";


// Main Page
    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public boolean isLogoHomeVisible() {
        Boolean isVisible = elementExists(LOG_HOME_IMG_OPTION);
        return isVisible;
    }
//  Header Links
    public AboutPage openAboutPage() {
        clickElementByXpath(ABOUT_OPTION);
        return new AboutPage();
    }

    public JobsPage openJobsPage() {
        clickElementByXpath(JOBS_OPTION);
        return new JobsPage();
    }

    public CreateAccountPage openCreateAccountPage() {
        clickElementByXpath(CREATE_ACCOUNT_OPTION);
        return new CreateAccountPage();
    }

    public ContactUsPage openContactUsPage() {
        clickElementByXpath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }

    public LoginPage openLoginPage() {
        clickElementByXpath(LOGIN_OPTION);
        return new LoginPage();
    }

}
