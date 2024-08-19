package com.juaracoding.tafuadywebhadir.tugasakhir.page.user;

import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.GlobalFunction;
import org.openqa.selenium.JavascriptExecutor;
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
public class LoginPageHadirUser {

    private WebDriver driver;
    private boolean validEmail;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnMasuk;

    @FindBy(xpath = "//button[normalize-space()='disini']")
    private WebElement btnToRegist;

    @FindBy(xpath = "/html/body/div/div/div/div/form")
    private WebElement formLogin;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement txtAlert;

    @FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
    private WebElement btnClose;

    public LoginPageHadirUser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public WebElement getBtnMasuk() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnMasuk));
    }

    public WebElement getBtnToRegist() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnToRegist));
    }

    public WebElement getFormLogin() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(formLogin));
    }

    public WebElement getTxtAlert() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtAlert));
    }

    public WebElement getBtnClose() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnClose));
    }

    public Boolean getValidEmail(){
        validEmail =(Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;",inputEmail);
        return validEmail;
    }

}





