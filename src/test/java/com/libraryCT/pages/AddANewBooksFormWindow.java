package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddANewBooksFormWindow {
    public AddANewBooksFormWindow (){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[contains(@class,'btn btn-lg')]") //*[@id="books"]/div[1]/div[1]/span/a
    public WebElement addBook;

    @FindBy(xpath = "//*[@id=\"ajax\"]/div/div")  // css= .modal-content    xpath= //*[@id="ajax"]/div/div
    public WebElement formWindow;

    @FindBy(xpath = "(//input[@class='form-control'])[1]") // xp= //input[contains(@name,'name')]
    public WebElement bookName;  // (//input[@class='form-control'])[3]


    @FindBy(xpath = "(//input[@class='form-control'])[2]") //  xp //input[contains(@name,'isbn')]
    public WebElement ISBN;  //

    @FindBy(xpath = "(//input[@class='form-control'])[3]") // xp=//input[contains(@name,'year')]
    public WebElement year;  //

    @FindBy(xpath = "(//input[@class='form-control'])[4]") // xp=//input[contains(@name,'author')]
    public WebElement author;  //

    @FindBy(css = "select#book_group_id") // xp= //*[@id="book_group_id"] //select[contains(@name,'book_category_id')]
    public WebElement BookCategoryDd;  //


    ////*[@id="description"]
    @FindBy(xpath = "//*[@id=\"description\"]") // xp= //textarea[contains(@class,'form-control')] css textarea#description
    public WebElement enterDescription;  //

    ////*[@id="description"]
    @FindBy(xpath = "//*[@id=\"add_book_form\"]/div[2]/button[2]") //   css button.btn:nth-child(2)
    public WebElement saveChanges;  //


    ////*[@id="description"]
    @FindBy(xpath = "//*[@id=\"add_book_form\"]/div[2]/button[1]") //  css button.btn:nth-child(1)
    public WebElement close;  //

}
