package com.nttdata.stepsdefinitions;

import com.nttdata.steps.HomeStep;
import com.nttdata.steps.LoginStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStepDef {

    private WebDriver driver;

    private HomeStep homeStep(WebDriver driver){
        return new HomeStep(driver);
    }

    @Dado("estoy en la página de la tienda myStore")
    public void estoyEnLaPáginaDeLaTiendaMyStore() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion");
        screenShot();
    }

    @Cuando("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String email, String password) {
        LoginStep loginStep = new LoginStep(driver);
        loginStep.typeEmail(email);
        loginStep.typePassword(password);
        loginStep.login();
        screenShot();
    }

    @Entonces("valido que debería aparecer nombre de usuario {string}")
    public void validoQueDeberíaAparecerNombreDeUsuario(String expectedFullName) {
        String userFullName =  homeStep(driver).getFullNameUser();

        //prueba: validamos que sea el nombre del usuario
        Assertions.assertEquals(expectedFullName, userFullName);
    }
}
