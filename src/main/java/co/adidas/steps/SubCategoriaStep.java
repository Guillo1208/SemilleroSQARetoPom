package co.adidas.steps;

import co.adidas.pageObjects.SubCategoriaPageObject;
import co.adidas.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class SubCategoriaStep {
    SubCategoriaPageObject subCategoriaPageObject = new SubCategoriaPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void clicSubCategoria(){
        subCategoriaPageObject.getDriver().findElement(subCategoriaPageObject.getBtnProducto()).click();
        esperaImplicita.esperaImplicita(10);
    }
}
