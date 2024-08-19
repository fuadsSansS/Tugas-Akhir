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
Build #IC-223.8214.52, built on 18/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 18/08/2024 19:59
@Last Modified 18/08/2024 19:59
Version 1.0
*/
public class KehadiranPageAdmin {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSeachKehadiran;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearchKehadiran;

    @FindBy(xpath = "//input[@placeholder='Start Date']" )
    private WebElement inputStartDateKehadiran;

    @FindBy(xpath = "//input[@placeholder='End Date']")
    private WebElement inputEndDateKehadiran;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div[1]/div/table")
    private WebElement tableKehadiran;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/span/img")
    private WebElement imageTableKehadiran;

//    @FindBy(xpath = )
//    private WebElement
//
//    @FindBy(xpath = )
//    private WebElement
//
//    @FindBy(xpath = )
//    private WebElement
//
//    @FindBy(xpath = )
//    private WebElement
//
//    @FindBy(xpath = )
//    private WebElement


    public KehadiranPageAdmin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputSeachKehadiran() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputSeachKehadiran));
    }

    public WebElement getBtnSearchKehadiran() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSearchKehadiran));
    }

    public WebElement getInputStartDateKehadiran() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputStartDateKehadiran));
    }

    public WebElement getInputEndDateKehadiran() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputEndDateKehadiran));
    }

    public WebElement getTableKehadiran() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(tableKehadiran));
    }

    public WebElement getImageTableKehadiran() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(imageTableKehadiran));
    }

    public List<String> getDataNamaKehadiran (){
        List<String>tableData = new ArrayList<>();
        List<WebElement> rows = getTableKehadiran().findElements(By.tagName("tr"));
        List<WebElement> cells = rows.get(1).findElements(By.tagName("td"));
        String namaLengkap = "";
        namaLengkap =  cells.get(1).getText();
        tableData.add(namaLengkap);
        return tableData;
    }

    public List<WebElement> getImageElementsInTable() {
        WebElement table = getTableKehadiran();
        if (table != null) {
            return table.findElements(By.xpath(".//td//span//img")); // XPath relatif untuk gambar dalam tabel
        }
        return null;
    }



}





