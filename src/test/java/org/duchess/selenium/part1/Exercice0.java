package org.duchess.selenium.part1;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

/**
 * Dojo - Selenium
 */
public class Exercice0{

    /**
     * Ouvrir le navigateur
     * Aller sur une page
     * Regarder le titre
     */

    @Test
    public void go_to_google_page() throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        System.out.println("Titre:"+ driver.getTitle());

   }



}
