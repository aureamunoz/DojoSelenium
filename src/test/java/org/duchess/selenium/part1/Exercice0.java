package org.duchess.selenium.part1;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

/**
 * Dojo - Selenium
 */
public class Exercice0

{
    @Test
    public void when_go_to_home_then_home_page_is_on_screen() throws IOException {



   }


    /**
     * Ouvrir le navigateur
     Aller sur google.com
     Mettre “Cheese” dans la recherche
     Valider
     Regarder le titre
     */


    @Test
    public void searchOnGoogleTest(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("cheese");
        search.submit();

        System.out.println("Page title: "+driver.getTitle());

    }

}
