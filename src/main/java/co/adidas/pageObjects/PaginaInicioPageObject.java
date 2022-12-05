package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioPageObject extends PageObject {

    By btnInicioSesion = By.xpath("(//button[@type='button'])[1]");
    By txtCorreo = By.xpath("//input[@id='login-register-auto-flow-input']");
    By chkDesmarcar  = By.xpath("//div[@class='gl-checkbox gl-checkbox--checked']");
    By btnContinuar = By.xpath("//button[@aria-label='Continuar']");

    By txtCredencial = By.id("login-password");
    By btnIngresar = By.xpath("//button[@type='submit']");

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getChkDesmarcar() {
        return chkDesmarcar;
    }

    public By getBtnContinuar() {
        return btnContinuar;
    }

    public By getTxtCredencial() {
        return txtCredencial;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
