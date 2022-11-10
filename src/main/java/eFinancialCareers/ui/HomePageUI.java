package eFinancialCareers.ui;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

    public static final Target USER_AVATAR = Target.the("User Avatar")
            .locatedBy("//div[@aria-controls=\"dropdown-avatar\"]");


    public static final Target USER_DROPDOWN_MENU = Target.the("User Dropdown Menu")
            .locatedBy("//ul[@id='logged-in-dropdown'][contains(@class, 'show')]");

    public static final Target PAGE_LOADER_ICON = Target.the("Page Loader Icon")
            .locatedBy("//efc-page-loader//efc-icon[contains(@icon, 'page-spinner')]//span");

    public static final Target PAGE_LOADER_SCREEN = Target.the("Page Loader Screen")
            .locatedBy("//efc-page-loader[@class='active']");

    public static final Target LOGGED_IN_EMAIL = Target.the("Logged In Email")
            .locatedBy("//ul[@id='logged-in-dropdown']//div[contains(@class, 'user-details')]//span[text()='{0}']");

//    public static String loggedInEmail() {
//        return LOGGED_IN_EMAIL.resolveFor(OnStage.theActorInTheSpotlight()).getTextContent();
//    }
}
