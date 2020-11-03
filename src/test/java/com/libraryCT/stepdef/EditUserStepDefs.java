package com.libraryCT.stepdef;

import com.libraryCT.pages.AddUserPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class EditUserStepDefs {

    @When("in user management click edit user button from any user line")
    public void in_user_management_click_edit_user_button_from_any_user_line() {
        BrowserUtils.waitFor(2);
        new AddUserPage().editUserButton.click();
    }

}
