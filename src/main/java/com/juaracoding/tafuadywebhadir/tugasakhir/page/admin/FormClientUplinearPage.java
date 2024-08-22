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

import static com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants.TIMEOUT_DELAY;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 22/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 22/08/2024 15:47
@Last Modified 22/08/2024 15:47
Version 1.0
*/
public class FormClientUplinearPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement inputNamaUplinear;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmailUplinear;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPasswordUplinear;

    @FindBy(xpath = "//input[@id='free-solo-with-text-demo']")
    private WebElement inputUnit;

    @FindBy(xpath = "//div[@id='role_id']")
    private WebElement inputRole;

    @FindBy(xpath = "/html/body/div[3]/div[3]")
    private WebElement divRole;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnDaftar;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div/div[2]/form")
    private WebElement formClientUplinear;


    public FormClientUplinearPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getInputNamaUplinear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputNamaUplinear));
    }

    public WebElement getInputEmailUplinear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputEmailUplinear));
    }

    public WebElement getInputPasswordUplinear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputPasswordUplinear));
    }

    public WebElement getInputUnit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputUnit));
    }

    public WebElement getInputRole() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputRole));
    }

    public WebElement getDivRole() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(divRole));
    }

    public WebElement getBtnDaftar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnDaftar));
    }

    public WebElement getFormClientUplinear() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(formClientUplinear));
    }

    public List<WebElement> getTxtFieldRole() {
        List<WebElement> selfieList = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY));
        try {
            // Tunggu hingga elemen <select> dengan XPath terlihat
            WebElement selectElement = wait.until(ExpectedConditions.visibilityOf(inputRole));

            // Temukan semua elemen <option> di dalam elemen <select>
            List<WebElement> optionElements = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(divRole)).findElement(By.tagName("ul")).findElements(By.tagName("li"));

            // Iterasi dan ambil teks dari setiap elemen <option>
            for (WebElement option : optionElements) {
                selfieList.add(option);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return selfieList;
    }

}





