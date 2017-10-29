package pageobject.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pageobject.pages.HomePage;

public class BaseSteps extends ScenarioSteps {
    public HomePage homePage;

    @Step
    public void openHomePage() {
        homePage.open();
    }

    @Step
    public void verifySeeThatHomePageIsOpened() {
        homePage.waitUntilPageLoaded();
    }

    @Step
    public void verifyThatTitleAndHadingTextIsCorrect() {
        Assert.assertEquals(homePage.getTitle(), "BlazeDemo");
        Assert.assertEquals(homePage.getHeadingText(), "Welcome to the Simple Travel Agency!");
    }
}