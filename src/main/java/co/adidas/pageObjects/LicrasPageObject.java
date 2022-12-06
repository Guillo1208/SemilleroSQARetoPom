package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LicrasPageObject extends PageObject {
    By btnLicras = By.xpath("(//li[@class='plp-internal-linking-list-item___2MT4M'])[18]");


    public By getBtnLicras() {
        return btnLicras;
    }


}
