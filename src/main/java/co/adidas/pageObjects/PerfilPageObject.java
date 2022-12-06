package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PerfilPageObject extends PageObject {

    By txtBienvenida = By.xpath("//div[text()='Hola Juan']");

    public By getTxtBienvenida() {
        return txtBienvenida;
    }
}
