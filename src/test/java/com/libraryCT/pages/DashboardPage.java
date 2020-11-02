package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[contains(.,'Library')]")
    public WebElement libraryButton;

    @FindBy(xpath = "//span[contains(.,'Dashboard')]")
    public WebElement dashboardButton;

    @FindBy(xpath = "//span[contains(.,'Users')]")
    public WebElement usersButton;

    @FindBy(xpath = "//span[contains(.,'Books')]")
    public WebElement booksButton;

    @FindBy(xpath = "//a[@id='navbarDropdown']//span")
    public WebElement navBarDropdown;

    public void navigateTo(String tabName){
        Driver.get().findElement(By.xpath("//span[contains(.,'"+tabName+"')]")).click();
    }









}
