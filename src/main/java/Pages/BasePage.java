package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasePage {

    protected static WebDriver webDriver;
    public static WebDriverWait wait;
    public static final Logger logger = LogManager.getLogger(BasePage.class);

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    protected void clickElementByXpath(String xpath) {
        logger.info("Clicking element with xpath" + xpath);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
//        webDriver.findElement(By.xpath(xpath)).click();
    }


    protected void sendTextToElementByXpath(String xpath, String text) {
        logger.info("Sending text to xpath" + xpath);
        findElementByXpath(xpath).sendKeys(text);
    }

    protected boolean elementExists(String xpath) {
        try {
            logger.info("Check element with xpath exists" + xpath);
            webDriver.findElement(By.xpath(xpath));
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    protected String getCurrentPageURL() {
        return webDriver.getCurrentUrl();
    }

    public void takeScreenshot(String name) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshots/" + name + ".jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void selectElementByXpath(String xpath, String dropListOptions) {
        WebElement selectDropList = webDriver.findElement(By.xpath(xpath));
        Select select = new Select(selectDropList);
        select.selectByValue(dropListOptions);
    }

    protected boolean dropDownVisible(String xpath) {
        try {
            logger.info("Check drop down menu is visible " + xpath);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    protected WebElement findElementByXpath(String xpath) {
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
    }
}