package Steps;

import Helpers.Log;
import com.codeborne.selenide.Configuration;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class Hooks {

    @Before
    public void SetUpBrowser() {
        Configuration.browser = "firefox";
        Configuration.startMaximized = true;
        clearBrowserCache();
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            Log.info("TestFailed");
        }
        Log.info("Closing the browser");
    }
}
