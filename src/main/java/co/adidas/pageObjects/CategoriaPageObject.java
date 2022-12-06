package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoriaPageObject extends PageObject {

    By btnCategoria = By.xpath("//a[@href='/hombre']");

    public By getBtnCategoria() {
        return btnCategoria;
    }

}
