package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.TimeEntriesService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TimeEntriesSteps extends PageSteps {

    @And("Clicks on the plus button")
    public void clicksOnThePlusButton() {
        TimeEntriesService.clickPlusButton();
    }


    @And("Set the hours '(.*)' and minutes '(.*)'")
    public void setTheHoursHoursAndMinutesMinutes(String hours, String minutes) {
        TimeEntriesService.entryHours(hours);
        TimeEntriesService.entryMinutes(minutes);
    }

    @And("Select the Crowdar Academy project on the Project Menu")
    public void setTheCrowdarAcademyProjectOnTheProjectMenu() {
        TimeEntriesService.selectProject();
        TimeEntriesService.selectCrowdarProject();
    }

    @And("Set the description '(.*)'")
    public void setTheDescriptionDescription(String description) {
        TimeEntriesService.setDescription(description);
    }

    @And("Clicks on the save button")
    public void clicksOnTheSaveButton() {
        TimeEntriesService.clickSaveButton();
    }

    @Then("The time entry is saved")
    public void theTimeEntryIsSaved() {
        TimeEntriesService.entryHoursVerification();
    }
}
