package co.adidas.steps;

import co.adidas.pageObjects.CarroDosPageObject;
import co.adidas.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CarroDosStep {
    CarroDosPageObject carroDosPageObject = new CarroDosPageObject();
    EsperaImplicita esperaImplicita= new EsperaImplicita();

    @Step
    public void clicTalla(){
        carroDosPageObject.getDriver().findElement(carroDosPageObject.getBtnTalla()).click();

    }
    @Step
    public void clicAgregar(){
        carroDosPageObject.getDriver().findElement(carroDosPageObject.getBtnAgregarCarro()).click();
        esperaImplicita.esperaImplicita(10);
    }
    @Step
    public void clicCerrar(){
        carroDosPageObject.getDriver().findElement(carroDosPageObject.getBtnCerrar()).click();
    }

    @Step
    public void validacion(){
        Assert.assertThat(carroDosPageObject.getDriver().findElement
                (carroDosPageObject.getBtnAgregarCarro()).isDisplayed(), Matchers.is(true));
    }
}
