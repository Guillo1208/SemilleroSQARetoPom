package co.adidas.stepDefinitions;


import co.adidas.steps.FacebookStep;
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
    FacebookStep facebookStep;
    @Steps
    PerfilStep perfilStep;

    @Dado("^el usuario se encuentre en la pagina de adidas$")
    public void elUsuarioSeEncuentreEnLaPaginaDeAdidas() throws IOException {
    paginaInicioStep.abrirNavegador();

    }


    @Cuando("^el usuario ingresa su correo con la clave$")
    public void elUsuarioIngresaSuCorreoConLaClave() throws IOException {
        paginaInicioStep.clicIniciarSesion();
        paginaInicioStep.clicFacebook();
        facebookStep.ingresarCorreo();
        facebookStep.ingresarCredenciales();
        facebookStep.clicIngresar();

    }

    @Entonces("^el usuario observara su pagina de perfil$")
    public void elUsuarioObservaraSuPaginaDePerfil() {
    perfilStep.validarMensajeBienvenida();
    }

}
