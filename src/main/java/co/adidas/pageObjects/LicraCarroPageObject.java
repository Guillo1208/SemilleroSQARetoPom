package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LicraCarroPageObject extends PageObject {

    By btnTalla = By.xpath("(//button[@class='gl-label size___2lbev'])[3]");
    By btnAgregarCarro = By.xpath("//button[@title='Añadir al carrito']");
    By btnCerrar = By.xpath("//button[@class='gl-modal__close']");

    public By getBtnTalla() {
        return btnTalla;
    }

    public By getBtnAgregarCarro() {
        return btnAgregarCarro;
    }

    public By getBtnCerrar() {
        return btnCerrar;
    }
}
