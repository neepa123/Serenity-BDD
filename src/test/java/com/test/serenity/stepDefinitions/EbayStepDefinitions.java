package com.test.serenity.stepDefinitions;

import com.test.serenity.steps.EbaySteps;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

/**
 * Created by Neepa on 27-06-2018.
 */
public class EbayStepDefinitions {

    @Steps
    EbaySteps ebaySteps;

    @Given("^I want to open ebay page$")
    public void i_want_to_open_ebay_page() throws Throwable {
        ebaySteps.openEbayPage();
    }





}
