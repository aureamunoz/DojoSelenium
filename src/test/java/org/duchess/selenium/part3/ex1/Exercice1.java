package org.duchess.selenium.part3.ex1;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Objectif : Reprendre le code de l'exercice précédent.
 * Utiliser le page object pattern.
 * <p/>
 *
 */
public class Exercice1 {

    private WebDriver driver;
    private PortofolioPage portofolioPage;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getPortfolio());
        portofolioPage = new PortofolioPage(driver);
    }

    @Test
    public void when_click_to_next_then_new_datas_with_implicit_wait() {
        portofolioPage.goToWebTab();
        portofolioPage.waitForElements();
        assertThat(portofolioPage.getImages().size()).isEqualTo(4);
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
