package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FacebookPageObject extends PageObject {
    By txtCorreo  = By.xpath("//input[@id='email']");
    By txtCredencial = By.xpath("//input[@id='pass']");
    By btnIngresar = By.xpath("//button[@id='loginbutton']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtCredencial() {
        return txtCredencial;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
