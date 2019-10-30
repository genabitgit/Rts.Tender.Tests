package Rts.Tender.Pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

public class AdvancedSearchPage {

    public void openAdvancedSearchPage() {
        open("https://corp.rts-tender.ru/?fl=True");
    }

    public void enterPrice(String from, String to) {
        $("#MinPriceTooltip > span:nth-child(1) > span:nth-child(1)").click();
        $("#MinPrice").setValue(from);
        $("#MaxPriceTooltip > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)").click();
        $("#MaxPrice").setValue(to);
    }

    public void entersProvisionSize(String from, String to) {
        $("#MinApplicationGuaranteeTooltip > span:nth-child(1) > span:nth-child(1)").click();
        $("#MinApplicationGuarantee").setValue(from);
        $("#MaxApplicationGuaranteeTooltip > span:nth-child(1) > span:nth-child(1)").click();
        $("#MaxApplicationGuarantee").setValue(to);
    }

    public void entersTheStartDateOfPublication(String from, String to) {
        Selenide.executeJavaScript("jQuery('#DatePublishedFrom').data('kendoDatePicker').value('" + from + "')");
        Selenide.executeJavaScript("jQuery('#DatePublishedTo').data('kendoDatePicker').value('" + to + "')");
    }

    public void entersTheEndDateOfPublication(String from, String to) {
        Selenide.executeJavaScript("jQuery('#ApplicationEndDateFrom').data('kendoDatePicker').value('" + from + "')");
        Selenide.executeJavaScript("jQuery('#ApplicationEndDateTo').data('kendoDatePicker').value('" + to + "')");
    }

    public void pressShowButton() {
        $("span.btn:nth-child(11)").click();
    }

    public void searchResult() {
        $$(By.className("purchase-card")).shouldBe(sizeGreaterThan(0));
    }
}

