package com.juaracoding.tafuadywebhadir.tugasakhir.page.user;


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
Build #IC-223.8214.52, built on 12/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 12/08/2024 20:28
@Last Modified 12/08/2024 20:28
Version 1.0
*/
public class RegistrasiPageHadirUser {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='nik']")
    private WebElement inputNik;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement inputFullNama;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@id='selfie']")
    private WebElement inputFile;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnDaftar;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement txtAlertRegis;

    @FindBy(xpath = "//button[normalize-space()='disini']")
    private WebElement btnToLogin;

    @FindBy(xpath = "/html/body/div/div/div/div/form")
    private WebElement formRegis;

    public RegistrasiPageHadirUser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputNik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputNik));
    }

    public WebElement getInputFullNama() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputFullNama));
    }

    public WebElement getInputEmail() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputEmail));
    }

    public WebElement getInputPassword() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputPassword));
    }

    public WebElement getInputFile() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputFile));
    }

    public WebElement getBtnDaftar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDaftar));
    }


    public WebElement getTxtAlertRegis() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtAlertRegis));
    }

    public WebElement getBtnToLogin() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnToLogin));
    }

    public WebElement getFormRegis() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(formRegis));
    }


}





