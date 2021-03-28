package com.bot.frontend.steps;

import com.bot.frontend.pageobject.HomeFacebookPageObject;
import com.bot.frontend.pageobject.HomePageObject;
import com.bot.frontend.pageobject.LoginPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;

public class LoginStepsFacebook extends HomeFacebookPageObject {


    @Then("^Valida el acceso al home del Facebook$")
    public void validaElAccesoAlHomeDelFacebook() {
    }

    @Given("^Usuario se encuentra en la pantalla de logeo$")
    public void usuarioSeEncuentraEnLaPantallaDeLogeo() throws Throwable {
        home();
    }

    @When("^Usuario ingresa clave y contraseña \"([^\"]*)\"$")
    public void usuarioIngresaClaveYContraseña(String credenciales) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ingressarCredencialesFacebook(credenciales);
        ValidarAcceso();
    }
}
