package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContent extends ParentPage{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveClose;

    ////mat-select[@formcontrolname='id']//span
    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]//span")
    public WebElement countrySelect;

    @FindBy(xpath = "(//mat-option[@role='option'])[3]//span")
    public WebElement countryOption;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[9]")
    public WebElement addCategory;

    @FindBy(xpath = "//input[@id='mat-mdc-chip-list-input-0']")
    public WebElement userType;

    @FindBy(xpath = "//MAT-OPTION[@id='mat-option-11']")
    public WebElement student;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar1;

    @FindBy(xpath = "(//MS-SAVE-BUTTON[@left='']")
    public WebElement saveButton1;





    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        //sayfaya ESC tuşu gönderildi, açık mesaj kalmasın diye
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void deleteItems(String deleteName){

        mySendKeys(searchInput,deleteName);
        myClick(searchButton);

        //sayfa yenilenen kadar bekle, arama sonuçlanana kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
        
        myClick(deleteImageButton);
        myClick(deleteDialogBtn);
    }

    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim()){

            case "addButton" : return this.addButton;
            case "nameInput" : return  this.nameInput;
            case "codeInput" : return  this.codeInput;
            case "saveButton" : return  this.saveButton;
            case "shortName" : return  this.shortName;
            case "integrationCode" : return this.integrationCode;
            case "priorityCode" : return this.priorityCode;
            case "toggleBar" : return this.toggleBar;
            case "saveClose" : return this.saveClose;
            case "countrySelect" : return this.countrySelect;
            case "countryOption" : return this.countryOption;
            case "addCategory" : return this.addCategory;
            case  "userType" : return this.userType;
            case  "student" : return this.student;
            case "toggleBar1" : return this.toggleBar1;
            case "saveButton1" : return  this.saveButton1;
        }

        return null;
    }
}
