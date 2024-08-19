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
Created on 16/08/2024 19:19
@Last Modified 16/08/2024 19:19
Version 1.0
*/
public class UserPageHadir {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[1]/div")
    private WebElement containerSerchUser;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearchUser;

    @FindBy(xpath = "//div[normalize-space()='Nama']")
    private WebElement searchByNik;

    @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]")
    private WebElement ulListSerchByNik;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearchUser;


    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]/div/h6[1]")
    private WebElement tableDataNik;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]/div/h6[2]")
    private WebElement tableDataEmail;

    public UserPageHadir(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getContainerSerchUser() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(containerSerchUser));
    }


    public WebElement getInputSearchUser() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputSearchUser));
    }

    public WebElement getSearchByNik() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(searchByNik));
    }

    public WebElement getBtnSearchUser() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSearchUser));
    }

    public List<WebElement> getSerchByListWebElementNik() {
        // Inisialisasi List untuk menyimpan WebElement yang ditemukan
        List<WebElement> serchBy = new ArrayList<>();

        // Membuat WebDriverWait dengan timeout yang ditentukan dalam TIMEOUT_DELAY
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY));

        try {
            // Temukan semua elemen <li> di dalam elemen <ul> yang diidentifikasi oleh 'ulListSerchBy'
            List<WebElement> optionElements = ulListSerchByNik.findElements(By.tagName("li"));

            // Iterasi melalui setiap elemen <li> yang ditemukan
            for (WebElement option : optionElements) {
                // Tambahkan elemen <li> ke dalam List 'serchBy'
                serchBy.add(option);
            }

        } catch (Exception e) {
            // Tangkap dan cetak stack trace jika terjadi kesalahan selama eksekusi
            e.printStackTrace();
        }

        // Kembalikan List berisi WebElement yang ditemukan
        return serchBy;
    }

    public String getTableDataNik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return  new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
                        "//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/div/h6[1]")))).getText();
    }





}





