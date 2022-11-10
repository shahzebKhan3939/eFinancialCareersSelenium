package eFinancialCareers.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageUI {

    public static final Target HOME_LINK_IMAGE = Target.the("Home Link Image")
            .locatedBy("//div[@class='home-link']//*[name()='svg'][contains(@class, 'icon')]");

    public static final Target SIGN_IN_BUTTON = Target.the("Sign In Button")
            .locatedBy("//button[contains(text(), 'Sign in')]");
}
