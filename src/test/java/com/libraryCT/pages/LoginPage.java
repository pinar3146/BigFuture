package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement inputEmailBox;

    @FindBy(id = "inputPassword")
    public WebElement inputPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;




}
