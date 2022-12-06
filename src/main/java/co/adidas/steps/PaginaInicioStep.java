package co.adidas.steps;

import co.adidas.pageObjects.PaginaInicioPageObject;
import co.adidas.utils.DatosExcel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaInicioStep {
    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();

    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void abrirNavegador() throws IOException {
        paginaInicioPageObject.openUrl(datosExcel.leerDatosExcel("DatosRetoPom.xlsx","url",1,0));
    }
    @Step
    public void clicIniciarSesion(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnIniciarSesion()).click();
    }
    @Step
    public void clicFacebook(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnFacebook()).click();
    }



}
