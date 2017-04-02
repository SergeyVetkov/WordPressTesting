package wordPress.pages.uiPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wordPress.Page;


/**
 * Created by Sergey on 02.07.2016.
 */
public class LoginPage extends Page {

    @FindBy(css = "#user_login")
    private WebElement emailField;

    @FindBy(css = "#user_pass")
    private WebElement psswdField;

    @FindBy(css = "#wp-submit")
    private WebElement submittButton;

    @FindBy(css = "#login_error")
    private WebElement passwdErrorMsg;

    @FindBy(css = "#loginform")
    private WebElement loginForm;
    @FindBy(css = "#nav>a+a")
    private WebElement lostPasswdLink;


    public WebElement getLostPassswdLink() {
        return lostPasswdLink;
    }


    public LoginPage() {
    }

    public WebElement getLoginForm() {
        return loginForm;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPsswdField() {
        return psswdField;
    }

    public WebElement getSubmittButton() {
        return submittButton;
    }

    public WebElement getPasswdErrorMsg() {
        return passwdErrorMsg;
    }


    public String checkBorderColor() {
        String bdColor = null;
        return bdColor = emailField.getCssValue("border");
    }

    public void clickSubmittButton() {
        submittButton.click();
    }

    public  void typeLogin(String login) {
        emailField.clear();
        emailField.sendKeys(login);
    }
    public  void typePasswd(String passwd) {
        psswdField.clear();
        psswdField.sendKeys(passwd);
    }

    public WebElement getErrorMsg() {
        return passwdErrorMsg;
    }

}
