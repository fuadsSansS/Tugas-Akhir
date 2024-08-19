package com.juaracoding.tafuadywebhadir.tugasakhir.page.imageOnline;

import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 18/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 18/08/2024 21:12
@Last Modified 18/08/2024 21:12
Version 1.0
*/
public class ImageOnlinePage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='uploadfile']")
    private WebElement uploadGambar1;

    @FindBy(xpath = "//input[@name='uploadfile2']")
    private WebElement uploadGambar2;

    //    @FindBy(xpath = "//strong[contains(text(),'Congratulations student. You successfully logged i')]")
    @FindBy(xpath = "//input[@value='OK']")
    private WebElement btnOk;

    @FindBy(xpath = "/html/body/div/div[4]/span")
    private WebElement labelResult;

    public ImageOnlinePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement getUploadGambar1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadGambar1));
    }

    public WebElement getUploadGambar2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(uploadGambar2));
    }

    public WebElement getBtnOk() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnOk));
    }

    public WebElement getLabelResult() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(labelResult));
    }
}






