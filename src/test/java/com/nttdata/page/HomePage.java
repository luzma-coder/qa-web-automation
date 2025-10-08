package com.nttdata.page;

import org.openqa.selenium.By;

public class HomePage {

    public static By sessionInitButton = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span");
    public static By userSessionFullName = By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span");
//    public static By categoryLink = By.linkText("#category-3 > a");
    public static By categoryLink = By.xpath("//*[@id=\"category-3\"]/a");
    public static By subCategoryLink = By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");
    public static By product = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    public static By addCart = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");

}
