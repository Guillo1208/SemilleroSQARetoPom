package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioPageObject extends PageObject {

    By btnIniciarSesion = By.xpath("//button[@class='gl-cta gl-cta--tertiary profile_button_link___Z9706 outlined-icon-color___j8D2R undefined']");
    By btnFacebook = By.xpath("(//button[@class='gl-cta gl-cta--full-width gl-cta--icon   '])[1]");


    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public By getBtnFacebook() {
        return btnFacebook;
    }

}
