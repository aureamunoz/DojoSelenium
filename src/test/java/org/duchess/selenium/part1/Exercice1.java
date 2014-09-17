package org.duchess.selenium.part1;


import org.duchess.selenium.Util;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Dojo - Selenium
 */
public class Exercice1

{
    @Test

    public void when_clicking_to_link_about_then_page_is_about() throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get(Util.getHome());

        // ADD CODE HERE

        assertThat(driver.getTitle()).isEqualTo("About");
        driver.quit();
    }

}
