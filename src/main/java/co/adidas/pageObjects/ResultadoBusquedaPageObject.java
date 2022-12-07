package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ResultadoBusquedaPageObject extends PageObject {
    By picResultado = By.xpath("(//img[@class='img_with_fallback___2aHBu glass-product-card__image performance-item'])[3]");

    public By getPicResultado() {
        return picResultado;
    }
}
