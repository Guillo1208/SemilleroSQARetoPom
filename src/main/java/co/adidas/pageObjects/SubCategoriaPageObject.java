package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SubCategoriaPageObject extends PageObject {

    By btnProducto = By.xpath("(//img[@class='img_with_fallback___2aHBu glass-product-card__image'])[3]");

    public By getBtnProducto() {
        return btnProducto;
    }
}
