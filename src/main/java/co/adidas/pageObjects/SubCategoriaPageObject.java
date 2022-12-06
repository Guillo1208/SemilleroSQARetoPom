package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SubCategoriaPageObject extends PageObject {

    By btnSubCategoria = By.xpath("//button[@title='ROPA']");

    public By getBtnSubCategoria() {
        return btnSubCategoria;
    }
}
