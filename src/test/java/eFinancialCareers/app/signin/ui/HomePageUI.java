package eFinancialCareers.app.signin.ui;

import org.openqa.selenium.By;

public class HomePageUI {

    public static final By USER_AVATAR = By.xpath("//div[@aria-controls=\"dropdown-avatar\"]");

    public static final By USER_DROPDOWN_MENU = By.xpath("//ul[@id='logged-in-dropdown'][contains(@class, 'show')]");

    public static final By PAGE_LOADER_ICON = By.xpath("//efc-page-loader//efc-icon[contains(@icon, 'page-spinner')]//span");

    public static final By PAGE_LOADER_SCREEN = By.xpath("//efc-page-loader[@class='active']");

    public static final By LOGGED_IN_EMAIL = By.xpath("//ul[@id='logged-in-dropdown']//div[contains(@class, 'user-details')]//span");

//    public static String loggedInEmail() {
//        return LOGGED_IN_EMAIL.resolveFor(OnStage.theActorInTheSpotlight()).getTextContent();
//    }
}
