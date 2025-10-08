package com.nttdata.page;

import org.openqa.selenium.By;

public class SessionPage {
    //Localizadores de elementos
    public static By emailInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By sessionButton = By.id("submit-login");
    public static By errorMessage = By.cssSelector(".alert.alert-danger");
//    public static By errorMessage = By.xpath("//*[@id=\"content\"]/section/div/ul/li");
}
