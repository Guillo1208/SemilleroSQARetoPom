package co.adidas.steps;

import co.adidas.pageObjects.SubCategoriaPageObject;
import net.thucydides.core.annotations.Step;

public class SubCategoriaStep {
    SubCategoriaPageObject subCategoriaPageObject = new SubCategoriaPageObject();

    @Step
    public void clicSubCategoria(){
        subCategoriaPageObject.getDriver().findElement(subCategoriaPageObject.getBtnSubCategoria()).click();
    }
}
