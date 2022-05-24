package Pages;

public class ContactUsPage extends BasePage {
    public static final String CONTACT_US_HEADER = "//h2[text()='Contact Us']";

    public boolean isContactUsPageTitleVisible() {
        return elementExists(CONTACT_US_HEADER);
    }
}