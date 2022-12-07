package co.adidas.steps;

import co.adidas.pageObjects.ResultadoBusquedaPageObject;
import co.adidas.utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;

public class ResultadoBusquedaStep {
    ResultadoBusquedaPageObject resultadoBusquedaPageObject = new ResultadoBusquedaPageObject();
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Step
    public void clicResultadoBusqueda(){
        esperaExplicita.esperaExplicitaTexto(resultadoBusquedaPageObject.getDriver(), resultadoBusquedaPageObject.getPicResultado());
        resultadoBusquedaPageObject.getDriver().findElement(resultadoBusquedaPageObject.getPicResultado()).click();
    }

}
