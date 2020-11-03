package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class BooksPage {
    // portlet-title Div
    @FindBy(tagName = "h3")
    public WebElement headingBookPage;
    @FindBy(xpath = "//a[contains(.,'Add Book')]")
    public WebElement addBookBtn;

    // Book Categories Div
    @FindBy(xpath = "//label[contains(.,'Book Categories')]")
    public WebElement titleBookCategories;
    @FindBy(css = "#book_categories")
    public WebElement categoriesDropdown;

    // DataTables Length Div
    @FindBy(xpath = "//label[contains(.,'Show 5101550100200500 records')]")
    public WebElement recordsLabel;
    @FindBy(css = "select[name='tbl_books_length']")
    public WebElement recordsDropdown;

    // Book Filter Div
    @FindBy(xpath = "//label[contains(.,'Search:')]")
    public WebElement booksFilterTitle;
    @FindBy(tagName = "//input")
    public WebElement searchBox;

    // Table
    @FindBy(tagName = "//table")
    public WebElement booksTable;
    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> tableColumns;
    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> tableRows;
    /*
         Columns      //tbody/tr/td[int]
     */
    @FindBy(xpath = "(//tbody/tr/td[1])")
    public List<WebElement> editBookBtns;

    public void getColumn(String name){
        String xpath = "//th[contains(.,'" + name + "')]";
        Driver.get().findElement(By.xpath(xpath));
    }

    public int getNumberOfRows(){
        return tableRows.size();
    }

    public void clickEditButton(int numberOfRow){
        String xpath = "(//tbody/tr/td[1])[" + numberOfRow + "]";
        Driver.get().findElement(By.xpath(xpath)).click();
    }

    public void clickColumns(String columnName){
        String xpath = "//th[contains(.,'" + columnName +"')]";
        Driver.get().findElement(By.xpath(xpath));
    }

    // Table Footer
    @FindBy(xpath = "//div[@id='tbl_books_info']")
    public WebElement tableInfo;
    @FindBy(xpath = "//a[@title='First']")
    public WebElement firstBtn;
    @FindBy(xpath = "//a[@title='Prev']")
    public WebElement prevBtn;
    @FindBy(xpath = "//a[@title='Next']")
    public WebElement nextBtn;
    @FindBy(xpath = "//a[@title='Last']")
    public WebElement lastBtn;
    @FindBy(xpath = "//a[@class='page-link']")
    public List<WebElement> tablePageLinks;




}
