package com.libraryCT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage {

    @FindBy(css = ".btn.btn-lg.btn-outline.btn-primary.btn-sm")
    public WebElement addUserButton;

    @FindBy(xpath = "//a[@onclick='Users.edit_user(1919)']")
    public WebElement editUserButton;

    @FindBy(name = "full_name")
    public WebElement fullNameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//select[@id='user_group_id']")
    public WebElement userGroupDropdown;

    @FindBy(xpath = "(//select[@id='status'])[1]")
    public WebElement userStatusDropdown;

    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement startDateBox;

    @FindBy(xpath = "//input[@name='end_date']")
    public WebElement endDateBox;

    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement addressBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//h3[contains(.,'User Management')]")
    public WebElement pageTitle;


}
