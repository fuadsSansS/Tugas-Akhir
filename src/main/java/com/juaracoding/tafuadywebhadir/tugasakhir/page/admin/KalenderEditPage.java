package com.juaracoding.tafuadywebhadir.tugasakhir.page.admin;

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

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 22/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 22/08/2024 2:12
@Last Modified 22/08/2024 2:12
Version 1.0
*/
public class KalenderEditPage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/table")
    private WebElement tableKalender;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[1]/form/div/div/div/input")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearchKalender;

    public KalenderEditPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public List<String> getNamaKalender() {
        List<String> lisNamaKalender = new ArrayList<>();
        List<WebElement> rows = getTableKalender().findElements(By.tagName("tr"));
        List<WebElement> cells = rows.get(1).findElements(By.tagName("td"));
        String namaKalender = "";
        namaKalender = cells.get(0).getText();
        lisNamaKalender.add(namaKalender);
        return lisNamaKalender;
    }

}





