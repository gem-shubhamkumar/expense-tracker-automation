package com.gemini.generic.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    // signup
    public static By label_signUpHead = AppiumBy.id("io.perfecto.expense.tracker:id/tv_login_head");
    public static By input_signupName = AppiumBy.id("io.perfecto.expense.tracker:id/signup_name");
    public static By input_signupEmail = AppiumBy.id("io.perfecto.expense.tracker:id/signup_email");
    public static By input_signupPassword = AppiumBy.id("io.perfecto.expense.tracker:id/signup_password");
    public static By input_signupConfirmPassword = AppiumBy.id("io.perfecto.expense.tracker:id/signup_confirm_password");
    public static By select_signupCurrency = AppiumBy.id("io.perfecto.expense.tracker:id/signup_currency");
    public static By scrollArea_signupCurrency = AppiumBy.className("android.widget.ListView");
    public static By options_signupCurrency = AppiumBy.className("android.widget.TextView");
    public static By button_register = AppiumBy.id("io.perfecto.expense.tracker:id/signup_save_btn");

    // login
    public static By label_appHead = AppiumBy.id("io.perfecto.expense.tracker:id/tv_login_head");
    public static By button_signup = AppiumBy.id("io.perfecto.expense.tracker:id/login_signup_btn");
    public static By input_loginEmail = AppiumBy.id("io.perfecto.expense.tracker:id/login_email");
    public static By input_loginPassword = AppiumBy.id("io.perfecto.expense.tracker:id/login_password");
    public static By button_login = AppiumBy.id("io.perfecto.expense.tracker:id/login_login_btn");

    // home
    public static By label_expenseTitle = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='io" +
            ".perfecto.expense.tracker:id/toolbar']/android.widget.TextView");
    public static By button_addExpence = AppiumBy.id("io.perfecto.expense.tracker:id/list_add_btn");
    public static By label_addExpenseTitle = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='io" +
            ".perfecto.expense.tracker:id/toolbar']/android.widget.TextView");
    public static By options_expenseTitle = AppiumBy.className("android.widget.TextView");
    public static By select_addHead = AppiumBy.id("io.perfecto.expense.tracker:id/input_layout_head");
    public static By input_addAmount = AppiumBy.id("io.perfecto.expense.tracker:id/add_amount");
    public static By select_addCurrency = AppiumBy.id("io.perfecto.expense.tracker:id/currency_layout");
    public static By options_addCurrency = AppiumBy.className("android.widget.TextView");

    public static By input_addDate = AppiumBy.id("io.perfecto.expense.tracker:id/add_date");
    public static By select_addCategory = AppiumBy.id("io.perfecto.expense.tracker:id/til_category");
    public static By options_addCategory = AppiumBy.className("android.widget.TextView");

    public static By toggle_addRecurring = AppiumBy.id("io.perfecto.expense.tracker:id/add_recurring_toggle");
    public static By attach_addFile = AppiumBy.id("io.perfecto.expense.tracker:id/add_attach_btn");
    public static By attach_openDocuments = AppiumBy.id("io.perfecto.expense.tracker:id/btn_attach_document");

    public static By input_addDetails = AppiumBy.id("io.perfecto.expense.tracker:id/add_details");
    public static By button_attachAlert = AppiumBy.id("android:id/button1");
    public static By select_permissionAllow = AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button");
    public static By directory_menu  = AppiumBy.id("Show roots");
    public static By download_option  = AppiumBy.xpath("//android.widget.TextView[@text='Downloads']");
    public static By file_title  = AppiumBy.id("android:id/title");



    //
}
