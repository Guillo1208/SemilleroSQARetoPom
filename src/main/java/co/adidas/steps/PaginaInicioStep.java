package co.adidas.steps;

import co.adidas.pageObjects.PaginaInicioPageObject;
import co.adidas.utils.DatosExcel;
import co.adidas.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaInicioStep {
    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void abrirNavegador() throws IOException {
        paginaInicioPageObject.openUrl(datosExcel.leerDatosExcel("DatosRetoPom.xlsx","url",1,0));
    }
    @Step
    public void clicIniciarSesion(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnInicioSesion()).click();
    }
    @Step
    public void ingresarCorreo() throws IOException {
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtCorreo())
                .sendKeys(datosExcel.leerDatosExcel("DatosRetoPom.xlsx","datoslogin",1,0));
    }
    @Step
    public void clicDesmarcar(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getChkDesmarcar()).click();
    }
    @Step
    public void clicContinuar(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnContinuar()).click();
        esperaImplicita.esperaImplicita(60);
    }
    @Step
    public void ingresarCredenciales() throws IOException {

       paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtCredencial())
                .sendKeys(datosExcel.leerDatosExcel("DatosRetoPom.xlsx","datoslogin",1,1));
    }
    @Step
    public void clicIngresar(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnIngresar()).click();
    }




}
