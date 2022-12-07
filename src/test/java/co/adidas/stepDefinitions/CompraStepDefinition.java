package co.adidas.stepDefinitions;

import co.adidas.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CompraStepDefinition {
    @Steps
    CategoriaStep categoriaStep;
    @Steps
    SubCategoriaStep subCategoriaStep;
    @Steps
    CarroUnoStep carroUnoStep;
    @Steps
    ResultadoBusquedaStep resultadoBusquedaStep;
    @Steps
    CarroDosStep carroDosStep;

    @Cuando("^el usuario selecciona producto por categoria$")
    public void elUsuarioSeleccionaProductoPorCategoria() {
        categoriaStep.clicCategoria();
        subCategoriaStep.clicSubCategoria();
        carroUnoStep.clicTalla();
        carroUnoStep.clicAgregar();
        //carroUnoStep.clicCerrar();
    }


    @Cuando("^el usuario ingresa producto a buscar$")
    public void elUsuarioIngresaProductoABuscar() throws IOException {
        carroUnoStep.ingresarBusqueda();
        resultadoBusquedaStep.clicResultadoBusqueda();
        carroDosStep.clicTalla();
        carroDosStep.clicAgregar();
        //carroDosStep.clicCerrar();
    }

    @Entonces("^el usuario observara los productos en carro de compra$")
    public void elUsuarioObservaraLosProductosEnCarroDeCompra() {
        carroDosStep.validacion();
    }


}
