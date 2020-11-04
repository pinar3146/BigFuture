package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }

    // @FindBy(xpath = "//*[@id="menu_item"]/li[1]/a/span[1]") li[1] Dashboard, [2] users, [3] Books
    //  public WebElement pageName;

    //get page name
    public WebElement getPageName(String pageName){
      //  String xpath = "//a[contains(text(),'"+ pageName+"')]";
        String xpath = "//*[@id=\"menu_item\"]/li['"+pageName+"']/a/span[1]";

        return Driver.get().findElement(By.xpath(xpath));
    }
    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     *
    public void navigateToModule(String tab, String module) {
    String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
    String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
    try {
    BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
    WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
    new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
    } catch (Exception e) {
    BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
    }
    try {
    BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
    BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
    BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
    Driver.get().findElement(By.xpath(moduleLocator)).click();
    } catch (Exception e) {
    BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);

    } */
    public void navigateToTab(String tab) {    //span[text()='Books']
        String tabLocator = "//span[text()='"+tab+"']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);



        }


}
}