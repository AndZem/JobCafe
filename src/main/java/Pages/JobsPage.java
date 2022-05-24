package Pages;

import Consts.Consts;
import Pages.UserPages.CreateAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Consts.Consts.*;

public class JobsPage extends BasePage {
    public static final String JOBS_HEADER = "//form[@class = 'search-form']";

    public boolean isJobsPageTitleVisible() {
        return elementExists(JOBS_HEADER);
    }


    //Location input
    public void locationInput(String location) {
        sendTextToElementByXpath(Consts.FILTERS_LOCATION_INPUT, location);
    }

    public void positionInput(String position) {
        sendTextToElementByXpath(Consts.FILTERS_POSITION_INPUT, position);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JOBS_HEADER)));

    }

    public void companyInput(String company) {
        sendTextToElementByXpath(Consts.FILTERS_COMPANY_INPUT, company);
    }

    public void descriptionInput(String description) {
        sendTextToElementByXpath(Consts.FILTERS_DESCRIPTION_INPUT, description);
    }

    public void juniorInput() {
        clickElementByXpath(Consts.FILTERS_JUNIOR_INPUT);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JOBS_HEADER)));

    }

    public void midInput() {
        clickElementByXpath(Consts.FILTERS_MID_INPUT);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JOBS_HEADER)));
    }

    public void seniorInput() {
        clickElementByXpath(Consts.FILTERS_SENIOR_INPUT);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JOBS_HEADER)));
    }

    public void managerInput() {
        clickElementByXpath(Consts.FILTERS_MANAGER_INPUT);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(JOBS_HEADER)));
    }

    public void pushSearchButton() {
        clickElementByXpath(Consts.FILTERS_SEARCH_BUTTON_INPUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(JOBS_HEADER)));
//        WebElement element = findElementByXpath(Consts.FILTERS_SEARCH_BUTTON_INPUT);
//        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
//        executor.executeScript("arguments[0].click();", element);
    }

    public void pushResetButton() {

        clickElementByXpath(Consts.FILTERS_RESET_BUTTON_INPUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(JOBS_HEADER)));
//        WebElement element = findElementByXpath(Consts.FILTERS_RESET_BUTTON_INPUT);
//        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
//        executor.executeScript("arguments[0].click();", element);
    }

    public boolean isJobsPageTorontoVisible() {
        return elementExists(JOBS_TORONTO);
    }
    public boolean isJobsPageNoResults() {
        return elementExists(JOBS_NO_RESULTS);
    }
    public boolean isJobsPageTelAvivVisible(){
        return elementExists(JOBS_TEL_AVIV);
    }
    public boolean isJobsPageNewYorkVisible(){
        return elementExists(JOBS_NEW_YORK);
    }
    public boolean isJobsPageChicagoVisible(){
        return elementExists(JOBS_CHICAGO);
    }
    public boolean isJobsPageQaVisible(){
        return elementExists(JOBS_QA);
    }
    public boolean isJobsPageDeveloperVisible(){
        return elementExists(JOBS_DEVELOPER);
    }
    public boolean isJobsPageProjectManagerVisible(){
        return elementExists(JOBS_PROJECT_MANAGER);
    }
    public boolean isJobsPageAppleVisible(){
        return elementExists(JOBS_APPLE);
    }
    public boolean isJobsPageFacebookVisible(){
        return elementExists(JOBS_FACEBOOK);
    }
    public boolean isJobsPageGoogleVisible(){
        return elementExists(JOBS_GOOGLE);
    }
    public boolean isJobsPageCombinedVisible(){
        return elementExists(JOBS_COMBINED);
    }



}