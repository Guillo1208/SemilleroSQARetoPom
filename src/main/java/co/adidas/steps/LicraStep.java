package co.adidas.steps;

import co.adidas.pageObjects.LicraPageObject;
import net.thucydides.core.annotations.Step;

public class LicraStep {

    LicraPageObject licraPageObject = new LicraPageObject();

    @Step
    public void clicLicra(){
        licraPageObject.getDriver().findElement(licraPageObject.getBtnLicra()).click();
    }
}
