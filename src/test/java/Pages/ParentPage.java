package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void mySendKeys(WebElement element, String yazi){

        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void myClick(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void scrollToElement(WebElement element){

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value){

        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
    }

    public void verifyMessageContainsText(String value){

        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"), 0));
        // //hot-toast-container/div/div/div/*
        //
        // yukarıdaki locator //hot-toast-container/div/div/div
        // içindeki çocuklar demektir.
        //
        // //hot-toast-container/div/div/div//*
        //
        // yukarıdaki locator //hot-toast-container/div/div/div
        // içindeki çocuklar+torunlar yani Tüm çocuklar demektir.


        WebElement MesajKutusuParent2=GWD.getDriver().findElement(By.tagName("mat-panel-description"));

        Assert.assertTrue(MesajKutusuParent2.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));
    }
}
