package com.juaracoding.tafuadywebhadir.tugasakhir.page.admin;

import com.juaracoding.tafuadywebhadir.tugasakhir.impl.Test1Hooks;
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
Build #IC-223.8214.52, built on 16/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 16/08/2024 17:49
@Last Modified 16/08/2024 17:49
Version 1.0
*/
public class PendaftaranSendiriEditPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='nik']")
    private WebElement inputNik;

    @FindBy(xpath = "//input[@id='divisi']")
    private WebElement inputDivisi;

    @FindBy(xpath = "//input[@id='unit']")
    private WebElement inputUnit;

    @FindBy(xpath = "//input[@id='posisi-kerja']")
    private WebElement inputPosisiKerja;

    @FindBy(xpath = "//input[@id='jabatan']")
    private WebElement inputJabatan;

    @FindBy(xpath = "//input[@id='atasan']")
    private WebElement inputAtasan;

    @FindBy(xpath = "//input[@id='atasan-v2']")
    private WebElement inputAtasanV2;

    @FindBy(xpath = "//input[@id='atasan-v3']")
    private WebElement inputAtasanV3;

    @FindBy(xpath = "//input[@id='tipe-kontrak']")
    private WebElement inputTipeKontrak;

    @FindBy(xpath = "//input[@id='lokasi-kerja']")
    private WebElement inputLokasiKerja;

    @FindBy(xpath = "//input[@id='jadwal-kerja']")
    private WebElement inputJadwalKerja;

    @FindBy(xpath = "//input[@id='jumlah-cuti']")
    private WebElement inputJumlahCuti;

    @FindBy(xpath = "//div[@id='required_selfie']")
    private WebElement txtFieldRequiredSelfie;

    @FindBy(xpath = "//*[@id=\"menu-required_selfie\"]/div[3]")
    private WebElement txtFieldRequiredSelfieList;


    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit;


    public PendaftaranSendiriEditPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputNik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputNik));
    }

    public WebElement getInputDivisi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputDivisi));
    }

    public WebElement getInputUnit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputUnit));
    }

    public WebElement getInputPosisiKerja() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputPosisiKerja));
    }

    public WebElement getInputJabatan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputJabatan));
    }

    public WebElement getInputAtasan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputAtasan));
    }

    public WebElement getInputAtasanV2() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputAtasanV2));
    }

    public WebElement getInputAtasanV3() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputAtasanV3));
    }

    public WebElement getInputTipeKontrak() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputTipeKontrak));
    }

    public WebElement getInputLokasiKerja() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputLokasiKerja));
    }

    public WebElement getInputJadwalKerja() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputJadwalKerja));
    }

    public WebElement getInputJumlahCuti() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputJumlahCuti));
    }


    public WebElement getTxtFieldRequiredSelfie() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtFieldRequiredSelfie));
    }

    public List<WebElement> getTxtFieldSelfieList() {
        List<WebElement> selfieList = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY));
        try {
            // Tunggu hingga elemen <select> dengan XPath terlihat
            WebElement selectElement = wait.until(ExpectedConditions.visibilityOf(txtFieldRequiredSelfie));

            // Temukan semua elemen <option> di dalam elemen <select>
            List<WebElement> optionElements = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldRequiredSelfieList)).findElement(By.tagName("ul")).findElements(By.tagName("li"));

            // Iterasi dan ambil teks dari setiap elemen <option>
            for (WebElement option : optionElements) {
                selfieList.add(option);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return selfieList;
    }

    public WebElement getBtnSubmit() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSubmit));
    }

}





