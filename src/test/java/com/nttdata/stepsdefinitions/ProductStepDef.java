package com.nttdata.stepsdefinitions;

import com.nttdata.steps.HomeStep;
import com.nttdata.steps.SessionStep;
import org.openqa.selenium.NoSuchElementException;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class ProductStepDef {

    private WebDriver driver;

    private HomeStep homeStep(WebDriver driver){
        return new HomeStep(driver);
    }

    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String email, String password) {
        HomeStep homeStep = new HomeStep(driver);
        homeStep.clickInitSession();
        screenShot();
        SessionStep sessionStep = new SessionStep(driver);
        sessionStep.typeEmail(email);
        sessionStep.typePassword(password);
        sessionStep.login();
        screenShot();

        //prueba: validamos que sea el nombre del usuario
//        String userFullName = homeStep.getFullNameUser();

//        try {
//            Assertions.assertEquals("", userFullName);
//        } catch (NoSuchElementException e) {
//            driver.quit();
//        }
    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String expectedCategory, String subcategory) {
        HomeStep homeStep = new HomeStep(driver);
        homeStep.clickLinkCategory();
        screenShot();
        homeStep.clickLinkSubCategory();
        screenShot();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int numItem) {
        HomeStep homeStep = new HomeStep(driver);
        homeStep.clickProduct();
        screenShot();
        homeStep.clickCart();

    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {

    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {

    }

    @Cuando("finalizo la compra")
    public void finalizoLaCompra() {

    }

    @Entonces("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {

    }

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {

    }

}
