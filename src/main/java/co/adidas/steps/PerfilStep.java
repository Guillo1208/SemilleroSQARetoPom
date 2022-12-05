package co.adidas.steps;

import co.adidas.pageObjects.PerfilPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PerfilStep {
    PerfilPageObject perfilPageObject = new PerfilPageObject();

@Step
    public void validarMensajeBienvenida(){
    Assert.assertThat(perfilPageObject.getDriver().findElement
            (perfilPageObject.getTxtBienvenida()).isDisplayed(), Matchers.is(true));
}

}
