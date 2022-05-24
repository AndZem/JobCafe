package Pages;

public class AboutPage extends BasePage {
    public static final String ABOUT_HEADER = "//img[@src='/img/about.jpg']";

    public boolean isPageTitleVisible() {
        return elementExists(ABOUT_HEADER);
    }
}