package co.adidas.steps;

import co.adidas.pageObjects.CategoriaPageObject;
import net.thucydides.core.annotations.Step;

public class CategoriaStep {
    CategoriaPageObject categoriaPageObject = new CategoriaPageObject();

    @Step
    public void clicCategoria(){
        categoriaPageObject.getDriver().findElement(categoriaPageObject.getBtnCategoria()).click();
    }

}
