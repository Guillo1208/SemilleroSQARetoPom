package co.adidas.stepDefinitions;


import co.adidas.steps.PaginaInicioStep;
import co.adidas.steps.PerfilStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    PerfilStep perfilStep;

    @Dado("^el usuario se encuentre en la pagina de adidas$")
    public void elUsuarioSeEncuentreEnLaPaginaDeAdidas() throws IOException {
    paginaInicioStep.abrirNavegador();
    paginaInicioStep.clicIniciarSesion();
    }


    @Cuando("^el usuario ingresa su correo con la clave$")
    public void elUsuarioIngresaSuCorreoConLaClave() throws IOException {
    paginaInicioStep.ingresarCorreo();
    paginaInicioStep.clicDesmarcar();
    paginaInicioStep.clicContinuar();
    paginaInicioStep.ingresarCredenciales();
    paginaInicioStep.clicIngresar();
    }

    @Entonces("^el usuario observara su pagina de perfil$")
    public void elUsuarioObservaraSuPaginaDePerfil() {
    //perfilStep.validarMensajeBienvenida();
    }

}
