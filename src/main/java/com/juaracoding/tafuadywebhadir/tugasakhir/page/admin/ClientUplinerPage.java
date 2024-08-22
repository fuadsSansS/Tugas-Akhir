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
Created on 22/08/2024 2:30
@Last Modified 22/08/2024 2:30
Version 1.0
*/
public class ClientUplinerPage {


    /**
     *
     * //button[normalize-space()='Tambahkan']
     * //input[@id='fullname']
     * //input[@id='email']
     * //input[@id='password']
     * ////input[@id='free-solo-with-text-demo']
     * //div[@id='role_id']
     * /html/body/div[3]/div[3]
     * //button[@type='submit']
     */

    private WebDriver driver;


    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement btnTambahUplinear;


    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div/div[2]/div/table")
    private WebElement tableUplinear;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearch;

    public ClientUplinerPage(WebDriver drier){
        this.driver = drier;
        PageFactory.initElements(drier, this);
    }

    public WebElement getBtnTambahUplinear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnTambahUplinear));
    }



    public WebElement getTableUplinear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(tableUplinear));
    }

    public WebElement getInputSearch() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputSearch));
    }

    public WebElement getBtnSearch() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSearch));
    }

    public List<String> getNamaDataTable(){
        List<String>tableData = new ArrayList<>();
        List<WebElement> rows = getTableUplinear().findElements(By.tagName("tr"));
        List<WebElement> cells = rows.get(1).findElements(By.tagName("td"));
        String namaLengkap = "";
        namaLengkap =  cells.get(1).getText();
        tableData.add(namaLengkap);
        return tableData;
    }

}





