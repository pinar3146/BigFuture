package com.libraryCT.stepdef;

import com.libraryCT.pages.AddUserPage;
import com.libraryCT.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class CloseButtonStepDefs {

    @Then("Click close button to cancel")
    public void click_close_button_to_cancel() {
        BrowserUtils.waitFor(1);
        new AddUserPage().cancelButton.click();
    }
}
