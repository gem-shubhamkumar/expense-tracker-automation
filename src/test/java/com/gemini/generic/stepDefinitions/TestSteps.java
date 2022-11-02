package com.gemini.generic.stepDefinitions;

import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;
import com.gemini.generic.locators.Locators;
import com.gemini.generic.utils.Constnts;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestSteps {
    @Given("launch the app and verify the opened app")
    public void launchTheAppAndVerifyTheOpenedApp() {
        WebDriverWait wait = new WebDriverWait(MobileDriverManager.getAppiumDriver(), Duration.ofSeconds(20));
        String title = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.label_appHead))
                .getText();
        assertEquals(title, Constnts.APP_HEAD);
    }

    @When("click on signup button")
    public void clickOnSignupButton() {
        MobileAction.click(Locators.button_signup, "sign up");
    }

    @Then("wait until signup page load")
    public void waitUntilSignupPageLoad() {
        WebDriverWait wait = new WebDriverWait(MobileDriverManager.getAppiumDriver(), Duration.ofSeconds(10));
        String title = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.label_signUpHead))
                .getText();
        assertEquals(title, Constnts.SIGNUP_HEAD);

    }

    @And("enter signup name {string}")
    public void enterSignupName(String name) {
        MobileAction.typeText(Locators.input_signupName, name, "name");
    }

    @And("enter signup email {string}")
    public void enterSignupEmail(String email) {
        MobileAction.typeText(Locators.input_signupEmail, email, "email");
    }

    @And("enter signup password {string}")
    public void enterSignupPassword(String password) {
        MobileAction.typeText(Locators.input_signupPassword, password, "password");
    }

    @And("enter signup confirm password {string}")
    public void enterSignupConfirmPassword(String password) {
        MobileAction.typeText(Locators.input_signupConfirmPassword, password, "confirm password");
    }

    @And("select signup currency {string}")
    public void selectSignupCurrency(String currency) {
        MobileAction.click(Locators.select_signupCurrency, "select currency");
        MobileAction.swipeUp(Locators.scrollArea_signupCurrency, true);

        List<WebElement> ccy = MobileAction.getElements(Locators.options_signupCurrency);
        for (WebElement element : ccy) {
            if (MobileAction.getElementText(element).contains(currency)) {
                MobileAction.click(element, "select currency " + currency);
                break;
            }
        }
    }

    @And("click register button")
    public void clickRegisterButton() {
        MobileAction.click(Locators.button_register, "register");
    }

    @And("verify navigation to login")
    public void verifyNavigationToLogin() {
        WebDriverWait wait = new WebDriverWait(MobileDriverManager.getAppiumDriver(), Duration.ofSeconds(10));
        String title = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.label_appHead))
                .getText();
        assertEquals(title, Constnts.APP_HEAD);
    }


    @When("enter login email {string}")
    public void enterLoginEmail(String email) {
        MobileAction.typeText(Locators.input_loginEmail, email, "email");
    }

    @And("enter login password {string}")
    public void enterLoginPassword(String password) {
        MobileAction.typeText(Locators.input_loginPassword, password, "password");
    }

    @And("click login button")
    public void clickLoginButton() {
        MobileAction.click(Locators.button_login, "login");
    }

    @And("verify navigation to expense page")
    public void verifyNavigationToExpensePage() {
        WebDriverWait wait = new WebDriverWait(MobileDriverManager.getAppiumDriver(), Duration.ofSeconds(10));
        String title = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.label_expenseTitle))
                .getText();
        assertEquals(title, Constnts.EXPENSE_TITLE);
    }

    @And("click on add expense button")
    public void clickOnAddExpenseButton() {
        MobileAction.click(Locators.button_addExpence, "add expense");
    }

    @And("verify navigation to add expense page")
    public void verifyNavigationToAddExpensePage() {
        WebDriverWait wait = new WebDriverWait(MobileDriverManager.getAppiumDriver(), Duration.ofSeconds(10));
        String title =
                wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.label_addExpenseTitle))
                        .getText();
        assertEquals(title, Constnts.ADD_EXPENSE_TITLE);
    }

    @Then("select Expense Title {string}")
    public void selectExpenseTitle(String title) {
        MobileAction.click(Locators.select_addHead, "select head");
        List<WebElement> heads = MobileAction.getElements(Locators.options_expenseTitle);
        for (WebElement head : heads) {
            if (MobileAction.getElementText(head).equals(title)) {
                MobileAction.click(head, "select head " + title);
                break;
            }
        }
    }

    @And("enter expense amount {string}")
    public void enterExpenseAmount(String amount) {
        MobileAction.typeText(Locators.input_addAmount, amount, "amount");
    }

    @And("select expense currency {string}")
    public void selectExpenseCurrency(String currency) {
        MobileAction.click(Locators.select_addCurrency, "select currency");
        List<WebElement> ccy = MobileAction.getElements(Locators.options_addCurrency);
        for (WebElement element : ccy) {
            if (MobileAction.getElementText(element).equals(currency)) {
                MobileAction.click(element, "select currency " + currency);
                break;
            }
        }
    }

    @And("select expense date {string}")
    public void selectExpenseDate(String date) {
        MobileAction.typeText(Locators.input_addDate, date, "date");
    }

    @And("select expense category {string}")
    public void selectExpenseCategory(String category) {
        MobileAction.click(Locators.select_addCategory, "select category");
        List<WebElement> cat = MobileAction.getElements(Locators.options_addCategory);
        for (WebElement element : cat) {
            if (MobileAction.getElementText(element).equals(category)) {
                MobileAction.click(element, "select category " + category);
                break;
            }
        }
    }

    @And("select recurring if applicable {string}")
    public void selectRecurringIfApplicable(String isRecurring) {
        String recStatus = MobileAction.getElement(Locators.toggle_addRecurring).getAttribute("text");

        if (isRecurring.equalsIgnoreCase("YES") && recStatus.contains("OFF")) {
            MobileAction.click(Locators.toggle_addRecurring, "recurring");
        }
    }

    @And("attach the expense bill")
    public void attachTheExpenseBill() throws IOException {
//        MobileAction
        MobileAction.click(Locators.attach_addFile);
        MobileAction.click(Locators.attach_openDocuments);
        MobileAction.click(Locators.button_attachAlert);
        MobileAction.click(Locators.select_permissionAllow);
        MobileAction.waitSec(5);
        ((AndroidDriver) MobileDriverManager.getAppiumDriver()).pushFile("/sdcard/download/bill.png",
                new File("src/test/resources/files/uber-bill.png"));
//        attachFile();
        MobileAction.click(Locators.directory_menu, "directory-menu");
        MobileAction.click(Locators.download_option, "download option");
        MobileAction.scrollToElement("bill.png", false);
        MobileAction.click(Locators.file_title);

        MobileAction.waitSec(30);
    }

    @And("enter expense extra details {string}")
    public void enterExpenseExtraDetails(String details) {
        MobileAction.typeText(Locators.input_addDetails, details, "details");
    }

    public static void attachFile() {
        MobileAction.getElement(Locators.attach_addFile).sendKeys("src/test/resources/files/uber-bill.png");
    }

    @When("add the file")
    public void addTheFile() throws IOException {
        ((AndroidDriver) MobileDriverManager.getAppiumDriver()).pushFile("/sdcard/download/bill.png",
                new File("C:\\Users\\shubham.kumar\\Downloads\\Shubham\\apks\\uber-bill.png"));
    }
}
