package com.juaracoding.tafuadywebhadir.tugasakhir.page.admin;

import com.github.dockerjava.api.model.ExposedPort;
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
Created on 18/08/2024 2:35
@Last Modified 18/08/2024 2:35
Version 1.0
*/
public class KalenderPageUser {
    private WebDriver driver;


    @FindBy(xpath = "//button[normalize-space()='Tambahkan Kalender']")
    private WebElement btnTambahKalender;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement inputKalnder;

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[2]/button[1]")
    private WebElement btnInputKalender;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/table")
    private WebElement tableKalender;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearchKalender;




    public KalenderPageUser(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getBtnTambahKalender() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(btnTambahKalender));
    }

    public WebElement getInputKalnder() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(inputKalnder));
    }

    public WebElement getBtnInputKalender() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(inputKalnder));
    }

    public WebElement getTableKalender() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(tableKalender));
    }

    public WebElement getInputSearch() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(inputSearch));
    }

    public WebElement getBtnSearchKalender() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(btnSearchKalender));
    }


}





