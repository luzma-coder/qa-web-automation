package com.nttdata.steps;

import com.nttdata.page.HomePage;
import com.nttdata.page.SessionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class SessionStep {
    private WebDriver driver;

    //constructor
    public SessionStep(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Hacer click en el botón iniciar sesion
     */
    public void clickInitSession(){
        this.driver.findElement(HomePage.sessionInitButton).click();
    }
    /**
     * Escribir el email
     * @param email el correo del usuario
     */
    public void typeEmail(String email){
        WebElement emailInputElement = driver.findElement(SessionPage.emailInput);
        emailInputElement.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SessionPage.sessionButton));
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){

        this.driver.findElement(SessionPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón iniciar sesion
     */
    public void login(){
        this.driver.findElement(SessionPage.sessionButton).click();
    }


    }
