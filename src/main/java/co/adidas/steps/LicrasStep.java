package co.adidas.steps;

import co.adidas.pageObjects.LicrasPageObject;
import co.adidas.utils.EsperaExplicita;
import co.adidas.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class LicrasStep {
    LicrasPageObject licrasPageObject = new LicrasPageObject();
    Scroll scroll = new Scroll();
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Step
    public void clicLicras(){
        esperaExplicita.esperaCargaPagina(licrasPageObject.getDriver());
       scroll.scrollElemento(licrasPageObject.getDriver(),licrasPageObject.getBtnLicras());
        licrasPageObject.getDriver().findElement(licrasPageObject.getBtnLicras()).click();
    }


}
