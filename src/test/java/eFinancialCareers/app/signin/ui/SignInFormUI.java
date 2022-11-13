package eFinancialCareers.app.signin.ui;

import org.openqa.selenium.By;

public class SignInFormUI {

    public static final By SIGN_IN_FORM = By.xpath("//div[contains(@class, 'Overlay')]");

    public static final By EMAIL_INPUT_FIELD = By.xpath("//div[contains(@class, 'Overlay')]//p[text()='Email']//preceding-sibling::input");

    public static final By CONTINUE_BUTTON = By.xpath("//div[contains(@class, 'Overlay')]//button[text()=\"Continue\"]");

    public static final By PASSWORD_INPUT_FIELD = By.xpath("//div[contains(@class, 'Overlay')]//p[text()='Password']//preceding-sibling::input");

    public static final By SUBMIT_BUTTON = By.xpath("//div[contains(@class, 'Overlay')]//button[text()=\"Submit\"]");

    public static final By LOADING_ICON = By.xpath("//div[contains(@class, 'Overlay')]//div[@class='Loading']");
}
