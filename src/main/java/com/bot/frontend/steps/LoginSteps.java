package com.bot.frontend.steps;

import com.bot.frontend.pageobject.HomeFacebookPageObject;
import com.bot.frontend.pageobject.HomePageObject;
import com.bot.frontend.pageobject.LoginPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import sun.security.ssl.HandshakeOutStream;

public class LoginSteps extends HomeFacebookPageObject {

HomePageObject homePageObject= new HomePageObject();
    @Given("^Usuario ingresa a la App Mi Movistar$")
    public void usuarioIngresaALaAppMiMovistar() throws Exception {
       //bienvenidaMovistarEmpresas();
    }

    @Cuando("^que un cliente ingresa al portal de Demo Blaze$")
    public void queUnClienteIngresaAlPortalDeDemoBlaze() throws Exception {
        //bienvenidaMovistarEmpresas();
    }



    @When("^Usuario Ingresa credenciales de usuario \"([^\"]*)\"$")
    public void usuarioIngresaCredencialesDeUsuario(String casoPrueba) throws Throwable {
        //ingresoCredencialesUsurioDocumento(casoPrueba);
    }

    @Then("^se da clic en el botón ingresar y se verifica acceso$")
    public void seDaClicEnElBotónIngresarYSeVerificaAcceso() throws Throwable {
        //seleccionarUnaEmpresa();
        //getNombreClienteyRol();

        homePageObject.seleccionarMenuProductos();
        homePageObject.seleccionarMenuSolitudes();
        homePageObject.seleccionarMenuFacturacion();
        homePageObject.seleccionarMenuCasitaHome();
        homePageObject.seleccionarMenuCompras();

        //cerrarSesion();

    }




}
