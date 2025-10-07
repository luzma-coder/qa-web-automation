package com.nttdata.steps;

import com.nttdata.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeStep {

    private WebDriver driver;

    //constructor
    public HomeStep(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener nombre del usuario que inicia sesion en home page
     * @return el valor del nombre del usuario
     */
    public String getFullNameUser(){
        return this.driver.findElement(HomePage.userSessionFullName).getText();
    }

}
