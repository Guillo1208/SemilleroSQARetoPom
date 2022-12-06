package co.adidas.steps;

import co.adidas.pageObjects.CategoriaPageObject;
import co.adidas.pageObjects.FacebookPageObject;
import co.adidas.pageObjects.PerfilPageObject;
import co.adidas.utils.DatosExcel;
import co.adidas.utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class FacebookStep {
    FacebookPageObject facebookPageObject = new FacebookPageObject();
    DatosExcel datosExcel = new DatosExcel();

    @Step
    public void ingresarCorreo() throws IOException {
        facebookPageObject.getDriver().findElement(facebookPageObject.getTxtCorreo())
                .sendKeys(datosExcel.leerDatosExcel("DatosRetoPom.xlsx","datoslogin",1,0));

    }
    @Step
    public void ingresarCredenciales() throws IOException {

        facebookPageObject.getDriver().findElement(facebookPageObject.getTxtCredencial())
                .sendKeys(datosExcel.leerDatosExcel("DatosRetoPom.xlsx","datoslogin",1,1));
    }
    @Step
    public void clicIngresar(){
        facebookPageObject.getDriver().findElement(facebookPageObject.getBtnIngresar()).click();


    }



}
