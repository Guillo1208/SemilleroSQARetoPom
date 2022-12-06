package co.adidas.steps;

import co.adidas.pageObjects.LicraCarroPageObject;
import co.adidas.utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;

public class LicraCarroStep {

    LicraCarroPageObject licraCarroPageObject = new LicraCarroPageObject();
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Step
    public void clicTalla(){
        licraCarroPageObject.getDriver().findElement(licraCarroPageObject.getBtnTalla()).click();
    }
    @Step
    public void clicAgregar(){
        licraCarroPageObject.getDriver().findElement(licraCarroPageObject.getBtnAgregarCarro()).click();
    }
    @Step
    public void clicCerrar(){
        esperaExplicita.esperaCargaPagina(licraCarroPageObject.getDriver());
        licraCarroPageObject.getDriver().findElement(licraCarroPageObject.getBtnCerrar()).click();
    }

}
