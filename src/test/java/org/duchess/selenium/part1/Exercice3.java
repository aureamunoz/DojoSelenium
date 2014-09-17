package org.duchess.selenium.part1;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Dojo - Selenium
 */
public class Exercice3

{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getFeatures());

    }

    @Test
    /**
     * Pour que le test passe, vous devrez valider que la page features.html place bien un cookie "luke" qui a pour valeur "skywalker"
     */
    public void when_page_feature_then_cookie_luke_is_equal_to_skywalker() {
        //ADD CODE HERE

    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
