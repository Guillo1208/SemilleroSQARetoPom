package co.adidas.pageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LicraPageObject extends PageObject {

    By btnLicra = By.xpath("//a[@href='https://www.adidas.co/licras-largas-de-entrenamiento-techfit-3-rayas/HD3530.html']");

    public By getBtnLicra() {
        return btnLicra;
    }
}
