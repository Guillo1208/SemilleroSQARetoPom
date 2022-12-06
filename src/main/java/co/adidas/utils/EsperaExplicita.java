package co.adidas.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EsperaExplicita {

    public static void esperaExplicitaClik( WebDriver driver, By elemento){
        WebDriverWait myWaitVar = new WebDriverWait(driver,30);
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void esperaExplicitaTexto(WebDriver driver, By elemento){
        WebDriverWait myWaitVar = new WebDriverWait(driver,30);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public void esperaCargaPagina(WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
