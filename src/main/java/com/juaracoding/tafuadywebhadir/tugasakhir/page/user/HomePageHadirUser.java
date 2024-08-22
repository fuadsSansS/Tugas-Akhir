package com.juaracoding.tafuadywebhadir.tugasakhir.page.user;

import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.GlobalFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants.TIMEOUT_DELAY;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 13/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 13/08/2024 17:34
@Last Modified 13/08/2024 17:34
Version 1.0
*/
public class HomePageHadirUser {

    private WebDriver driver;


    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div[1]")
    private WebElement validasiHomePage;

    @FindBy(xpath = "//img[@alt='menu']")
    private WebElement spanHomeUser;

    @FindBy(xpath = "//button[normalize-space()='Absen Masuk']")
    private WebElement btnAbsenMasuk;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']//div[1]//div[1]//p[2]")
    private WebElement jumlahAbsen;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/form/button")
    private WebElement btnSubmitAbsenMasuk;

    /** Field Jam Absen di Page Home Mobile Mirroring*/
    @FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/form/div[3]/div[2]/div/input")
    private WebElement fieldNotes;


    /** Button Camera*/
    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div/button")
    private WebElement btnCamera;


    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[4]/div[2]/div[1]/div[2]/button")
    private WebElement btnAbsenKeluar;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/form/div/div[2]/div/div/textarea[1]")
    private WebElement txtAreaNotes;


    @FindBy(xpath = "/html/body/div[2]/div[3]/div/form/div/div[3]/button")
    private WebElement btnSubmitAbsenKeluar;


    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[4]/div[2]/div/div[1]/div[1]/span/img")
    private WebElement imageGambar;


    @FindBy(xpath = "//img[@alt='Absensi']")
    private WebElement btnAbsensi;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/button")
    private WebElement btnLogOutUser;

    public HomePageHadirUser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getValidasiHomePage() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(validasiHomePage));
    }

    public WebElement getSpanHomeUser() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(spanHomeUser));
    }
    public WebElement getFieldNotes() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(fieldNotes));
    }


    public WebElement getBtnCamera() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(btnCamera));
    }

    public WebElement getBtnAbsenMasuk() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(btnAbsenMasuk));
    }

    public WebElement getBtnSubmitAbsenMasuk() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(btnSubmitAbsenMasuk));
    }

    public WebElement getBtnLogOutUser() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogOutUser));
    }

    public WebElement getBtnAbsenKeluar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnAbsenKeluar));
    }

    public WebElement getTxtAreaNotes() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtAreaNotes));
    }

    public WebElement getBtnSubmitAbsenKeluar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSubmitAbsenKeluar));
    }

    public WebElement getImageGambar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(imageGambar));
    }

    public WebElement getBtnAbsensi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnAbsensi));
    }



}





