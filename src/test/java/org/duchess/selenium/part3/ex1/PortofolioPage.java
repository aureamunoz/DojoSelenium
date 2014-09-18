package org.duchess.selenium.part3.ex1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PortofolioPage {
    private final WebDriver driver;

    public PortofolioPage(WebDriver driver) {
        this.driver = driver;
    }

    public PortofolioPage goToWebTab(){
        driver.findElement(By.ByLinkText.linkText("WEB")).click();
        return this;
    }

    public PortofolioPage waitForElements(){
        (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#containment-portfolio li:not(.hidden)")));
        return this;
    }

    public List<WebElement> getImages(){
        return driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)"));
    }
}