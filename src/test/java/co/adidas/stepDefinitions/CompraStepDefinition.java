package co.adidas.stepDefinitions;

import co.adidas.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CompraStepDefinition {
    @Steps
    CategoriaStep categoriaStep;
    @Steps
    SubCategoriaStep subCategoriaStep;
    @Steps
    LicrasStep licrasStep;
    @Steps
    LicraStep licraStep;
    @Steps
    LicraCarroStep licraCarroStep;

    @Cuando("^el usuario selecciona producto por categoria$")
    public void elUsuarioSeleccionaProductoPorCategoria() {
        categoriaStep.clicCategoria();
        subCategoriaStep.clicSubCategoria();
        licrasStep.clicLicras();
        licraStep.clicLicra();
        licraCarroStep.clicTalla();
        licraCarroStep.clicAgregar();
        licraCarroStep.clicCerrar();

    }


    @Cuando("^el usuario ingresa producto a buscar$")
    public void elUsuarioIngresaProductoABuscar() {

    }

    @Entonces("^el usuario observara los productos en carro de compra$")
    public void elUsuarioObservaraLosProductosEnCarroDeCompra() {

    }


}
