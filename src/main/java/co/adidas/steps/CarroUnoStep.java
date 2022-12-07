package co.adidas.steps;

import co.adidas.pageObjects.CarroUnoPageObject;
import co.adidas.utils.DatosExcel;
import co.adidas.utils.EsperaExplicita;
import co.adidas.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import java.io.IOException;

public class CarroUnoStep {

    CarroUnoPageObject carroUnoPageObject = new CarroUnoPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void clicTalla(){
        carroUnoPageObject.getDriver().findElement(carroUnoPageObject.getBtnTalla()).click();
    }
    @Step
    public void clicAgregar(){
        carroUnoPageObject.getDriver().findElement(carroUnoPageObject.getBtnAgregarCarro()).click();
        esperaImplicita.esperaImplicita(10);
    }
    @Step
    public void clicCerrar(){
        carroUnoPageObject.getDriver().findElement(carroUnoPageObject.getBtnCerrar()).click();
    }
    @Step
    public void ingresarBusqueda() throws IOException {
        carroUnoPageObject.getDriver().findElement(carroUnoPageObject.getTxtBusqueda())
                .sendKeys((datosExcel.leerDatosExcel("DatosRetoPom.xlsx","producto a buscar",1,0)),Keys.ENTER);
    }

}
