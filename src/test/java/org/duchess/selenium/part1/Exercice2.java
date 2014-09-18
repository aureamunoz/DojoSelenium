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

        assertThat(driver.findElement(By.id("fname")).isDisplayed()).isTrue();
        //ADD CODE HERE
        driver.findElement(By.id("fname")).sendKeys("Auri");
        driver.findElement(By.id("lname")).sendKeys("Munoz");
        driver.findElement(By.id("email")).sendKeys("auri@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("0675234323");
        driver.findElement(By.id("message")).sendKeys("blabla");
        driver.findElement(By.id("form")).submit();


        assertThat(driver.findElement(By.cssSelector(".mess")).getText()).contains("Thanks");
    }

    @Test
    /**
     * Remplir les champs du formulaire sauf le champs email puis valider le formulaire.
     * Ajouter une assertion pour vérifier que le champs email a maintenant une bordure bleue.
     */
    public void when_fill_contact_form_with_no_email_then_field_is_getting_a_blue_border() {

        driver.findElement(By.id("fname")).sendKeys("Auri");
        driver.findElement(By.id("lname")).sendKeys("Munoz");
        driver.findElement(By.id("phone")).sendKeys("0675234323");
        driver.findElement(By.id("submit")).click();

        assertThat(driver.findElement(By.className("error-input"))).isNotNull();


    }



    @After
    public void afterTest() {
        driver.quit();
    }

}
