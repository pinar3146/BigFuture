package com.libraryCT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BorrowingBooksPage {
    @FindBy(xpath = "(//span[@class=\'title\'][contains(.,\'Borrowing Books\')])")
    public WebElement borrowingBooks;

    @FindBy(xpath = "//div[@class='card-header'][contains(.,'Boorrowed Books')]")
    public WebElement borrowedBooks;
    @FindBy(xpath = "//th[contains(.,'Book Name')]")
    public List<WebElement> rowNames;

    @FindBy(xpath = "//td[@colspan='6'][contains(.,'There is no book borrowed by this user.')]")
    public WebElement shownText;
    @FindBy(xpath = "//select[contains(@class,'form-control select2')]")
    public WebElement userName;
    @FindBy(xpath = "//label[@class='control-label col-md-4'][contains(.,'Users')]")
    public WebElement users;


}
