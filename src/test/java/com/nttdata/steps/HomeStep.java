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
     * Hacer click en el botón iniciar sesion de home page
     */
    public void clickInitSession(){
        this.driver.findElement(HomePage.sessionInitButton).click();
    }

    /**
     * Obtener nombre del usuario que inicia sesion en home page
     * @return el valor del nombre del usuario
     */
    public String getFullNameUser(){
        return this.driver.findElement(HomePage.userSessionFullName).getText();
    }

    public void clickLinkCategory(){
        this.driver.findElement(HomePage.categoryLink).click();
    }

    public void clickLinkSubCategory(){
        this.driver.findElement(HomePage.subCategoryLink).click();
    }

    public void clickProduct(){
        this.driver.findElement(HomePage.product).click();
    }
    public void clickCart(){
        this.driver.findElement(HomePage.addCart).click();
    }
}
