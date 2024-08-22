package com.juaracoding.tafuadywebhadir.tugasakhir.page.admin;

import com.github.dockerjava.api.model.ExposedPort;
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
import java.util.Random;

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
    private Random random;
    private static int hasilRand;


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

    @FindBy(xpath = "/html/body/div[13]/div[3]/div/form/div[1]/div/div/p")
    private WebElement alertInput;

    @FindBy(xpath = "//body/div[3]/div[3]/ul[1]/li[2]")
    private WebElement getEdit;


    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    private WebElement getBtnInputEdit;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch1;




    public KalenderPageUser(WebDriver driver){
        this.driver=driver;
        random = new Random();
        hasilRand = random.nextInt(1,10);
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
                until(ExpectedConditions.visibilityOf(btnInputKalender));
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

    public WebElement getAlertInput() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(alertInput));
    }

    public WebElement getGetEdit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(getEdit));
    }

    public WebElement getGetBtnInputEdit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY)).
                until(ExpectedConditions.visibilityOf(getBtnInputEdit));
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

    public List<String> getRandomNamaKalender(){
        List<String>listAllKalender = new ArrayList<>();
        List<WebElement> rows = getTableKalender().findElements(By.tagName("tr"));
        List<WebElement> cells = rows.get(hasilRand).findElements(By.tagName("td"));
        String namaKalender = "";
        namaKalender = cells.get(0).getText();
        listAllKalender.add(namaKalender);
        return listAllKalender;
    }

    public List<WebElement> getBtnViewDataTable(){
        List<WebElement> btnViewList = new ArrayList<>();
        List<WebElement> rows = getTableKalender().findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            // Memastikan bahwa ada cukup sel di baris
            if (cells.size() > 1) {
                List<WebElement> btnActions = cells.get(1).findElements(By.tagName("button"));
                if (!btnActions.isEmpty()) {
                    btnViewList.add(btnActions.get(0));
                }
            }
        }
        return btnViewList;
    }

}





