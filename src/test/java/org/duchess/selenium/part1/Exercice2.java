package org.duchess.selenium.part1;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Dojo - Selenium
 */
public class Exercice2

{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getContact());

    }

    @Test
    /**
     * Remplir les champs du formulaire puis valider le formulaire pour faire passer le test.
     */
    public void when_fill_contact_form_then_form_submit() throws IOException {
        //ADD CODE HERE


        assertThat(driver.findElement(By.cssSelector(".mess")).getText()).contains("Thanks");
    }


    @After
    public void afterTest() {
        driver.quit();
    }

}
