package org.duchess.selenium.part3.ex2;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Objectif : Reprendre le code de l'exercice précédent.
 * Utiliser le page object pattern avec PageFactory.
 * <p/>
 *
 */
public class Exercice2 {

    private WebDriver driver;
    private PortofolioPage portofolioPage;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getPortfolio());
        portofolioPage = PageFactory.initElements(driver, PortofolioPage.class);
    }

    @Test
    public void when_click_to_next_then_new_datas_with_implicit_wait() {
        portofolioPage.goToWebPage();
        portofolioPage.waitForElements(driver);
        assertThat(portofolioPage.getImages().size()).isEqualTo(4);
    }




    @After
    public void afterTest() {
        driver.quit();
    }

}
