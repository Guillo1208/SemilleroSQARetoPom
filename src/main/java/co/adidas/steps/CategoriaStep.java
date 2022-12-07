package co.adidas.steps;

import co.adidas.pageObjects.CategoriaPageObject;
import co.adidas.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class CategoriaStep {
    CategoriaPageObject categoriaPageObject = new CategoriaPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void clicCategoria(){
        categoriaPageObject.getDriver().findElement(categoriaPageObject.getBtnCategoria()).click();
        esperaImplicita.esperaImplicita(10);
    }

}
