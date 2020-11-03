package com.libraryCT.stepdef;

import com.libraryCT.pages.AddUserPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserStepDefs {

    @Given("logged as a librarian")
    public void logged_as_a_librarian() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);

        String username = ConfigurationReader.get("username_librarian");
        String password = ConfigurationReader.get("password_librarian");

        new LoginPage().login(username,password);
    }

    @When("click user button and go to user management page")
    public void click_user_button_and_go_to_user_management_page() {
        BrowserUtils.waitFor(3);
        new AddUserPage().userButton.click();

    }
    @When("in user management page click \"Add user \"button")
    public void in_user_management_page_click_Add_user_button() {
      BrowserUtils.waitForClickablility(new AddUserPage().addUserButton,20);
      new AddUserPage().addUserButton.click();
    }

    @Then("Click save change button")
    public void click_save_change_button() {
        BrowserUtils.waitFor(2);
        new AddUserPage().submitButton.click();
    }


    @Given("write a {string} in full name box")
    public void writeAInFullNameBox(String name) {
        BrowserUtils.waitFor(2);
        new AddUserPage().fullNameBox.sendKeys(name);
    }

    @Given("write a {string} in password box")
    public void writeAInPasswordBox(String password) {
        new AddUserPage().passwordBox.sendKeys(password);
    }

    @Given("write an email in email box")
    public void writeAnEmailInEmailBox() {
        new AddUserPage().emailBox.sendKeys("email@email.com");
    }

    @And("write an {string} in address box")
    public void writeAnInAddressBox(String address) {
        new AddUserPage().addressBox.sendKeys(address);
    }

    @And("Select {string} in user Group dropdown box")
    public void selectInUserGroupDropdownBox(String type) {

    }

    @And("Select {string} in  user Status dropdown box")
    public void selectInUserStatusDropdownBox(String status) {

    }
}
