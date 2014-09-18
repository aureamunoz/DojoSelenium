package org.duchess.selenium.part3.ex2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Utiliser des WebElement
 */
public class PortofolioPage {

    private final WebDriver driver;

    @FindBy(linkText = "WEB")
    private WebElement weblink;

    @FindBys(@FindBy(css="#containment-portfolio li:not(.hidden)"))
    private List<WebElement> images;

    public PortofolioPage(WebDriver driver) {
        this.driver = driver;
    }

    public PortofolioPage goToWebPage(){
        weblink.click();
        return this;
    }

    public PortofolioPage waitForElements(WebDriver driver){
        (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
            @Override
            public Boolean apply(WebDriver driver){
                return images.size()==4;
            }
        });
        return this;

    }

    public List<WebElement> getImages() {
        return images;
    }


}
