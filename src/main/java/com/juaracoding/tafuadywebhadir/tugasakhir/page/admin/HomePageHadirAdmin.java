package com.juaracoding.tafuadywebhadir.tugasakhir.page.admin;

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
Created on 12/08/2024 14:48
@Last Modified 12/08/2024 14:48
Version 1.0
*/
public class HomePageHadirAdmin {

    private WebDriver driver;


    @FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-5shv7u']")
    private WebElement spanUser;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]")
    private WebElement container1;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza'][normalize-space()='Management']")
    private WebElement sideManagemant;

    @FindBy(xpath = "//p[normalize-space()='Pendaftaran Sendiri']")
    private WebElement sidePendaftaranSendiri;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Kalender']")
    private WebElement sideKalender;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Divisi']")
    private WebElement sideDivisi;


    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement sideLaporan;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Semua']")
    private WebElement sideKehadiran;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Client Upliner']")
    private WebElement sideClientUpliner;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/button[2]")
    private WebElement btnLogOut;

    public HomePageHadirAdmin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getSpanUser() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(spanUser));
    }


    public WebElement getContainer1() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(container1));
    }

    public WebElement getSideManagemant() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(sideManagemant));
    }

    public WebElement getSidePendaftaranSendiri() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(sidePendaftaranSendiri));
    }

    public WebElement getSideKalender() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(sideKalender));
    }

    public WebElement getSideDivisi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(sideDivisi));
    }

    public WebElement getSideLaporan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(sideLaporan));
    }

    public WebElement getSideKehadiran() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(sideKehadiran));
    }

    public WebElement getSideClientUpliner() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(sideClientUpliner));
    }

    public WebElement getBtnLogOut() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(btnLogOut));
    }


}





