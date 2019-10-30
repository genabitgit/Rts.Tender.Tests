package Steps;

import Helpers.Log;
import Rts.Tender.Pages.AdvancedSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdvancedSearchPageSmokeTest {
    AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();

    @Given("open Advanced Search Page")
    public void openAdvancedSearchPage() {
        advancedSearchPage.openAdvancedSearchPage();
        Log.info("open advanced search page");
    }

    @And("user enters price from {string}, to {string}")
    public void userEntersPriceFromTo(String from, String to) {
        advancedSearchPage.enterPrice(from, to);
        Log.info("user enters price");
    }

    @And("user enters provision size requisition from {string}, to {string}")
    public void userEntersProvisionSizeRequisitionFromTo(String from, String to) {
        advancedSearchPage.entersProvisionSize(from, to);
        Log.info("user enters provision size requisition");
    }

    @And("user enters the start date of publication from {string}, to {string}")
    public void userEntersTheStartDateOfPublicationFromTo(String from, String to) {
        advancedSearchPage.entersTheStartDateOfPublication(from, to);
        Log.info("user enters the start date of publication");
    }

    @And("user enters the end date of publication from {string}, to {string}")
    public void userEntersTheEndDateOfPublicationFromTo(String from, String to) {
        advancedSearchPage.entersTheEndDateOfPublication(from, to);
        Log.info("user enters the end date of publication");
    }

    @And("press show button")
    public void pressShowButton() {
        advancedSearchPage.pressShowButton();
        Log.info("press show button");
    }

    @Then("the search result should not be empty")
    public void theSearchResultShouldNotBeEmpty() {
        advancedSearchPage.searchResult();
        Log.info("the search result should not be empty");
    }
}
