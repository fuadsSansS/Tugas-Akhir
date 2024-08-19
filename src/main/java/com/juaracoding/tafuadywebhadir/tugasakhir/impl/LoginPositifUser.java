package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.HomePageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.LoginPageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 13/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 13/08/2024 17:00
@Last Modified 13/08/2024 17:00
Version 1.0
*/
public class LoginPositifUser {

    private WebDriver driver;
    private LoginPageHadirUser loginPageHadirUser;
    private HomePageHadirUser homePageHadirUser;
    private static ExtentTest extentTest;


    public LoginPositifUser() {
        this.driver = Test1Hooks.driver;
        loginPageHadirUser = new LoginPageHadirUser(driver);
        homePageHadirUser = new HomePageHadirUser(driver);
        extentTest = Test1Hooks.extentTest;

    }

    @When("TLPU011 Mengakses Halaman Webs")
    public void tlpu011_mengakses_halaman_webs(){
        this.driver.get(Constants.URL_LOGIN2);
        extentTest.log(LogStatus.PASS, "TLPU011 Mengakses Halaman Webs");
    }
    @And("TLPU011 Kosongkan Fied Email Dan Password")
    public void tlpu011_kosongkan_fied_email_dan_password(){
        loginPageHadirUser.getInputEmail().clear();
        loginPageHadirUser.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLPU011 Kosongkan Fied Email Dan Password");
    }
    @And("TLPU011 Input Email Valid")
    public void tlpu011_input_email_valid(){
        loginPageHadirUser.getInputEmail().sendKeys("fuadywayudi55@gmail.com");
        extentTest.log(LogStatus.PASS, "TLPU011 Input Email Valid");
    }
    @And("TLPU011 Input Password Valid")
        public void tlpu011_input_password_valid(){
        loginPageHadirUser.getInputPassword().sendKeys("fuady12345");
        extentTest.log(LogStatus.PASS, "TLPU011 Input Password Valid");
    }
    @And("TLPU011 Tekan Tombol Masuk")
    public void tlpu011_tekan_tombol_masuk(){
        loginPageHadirUser.getBtnMasuk().click();
        extentTest.log(LogStatus.PASS, "TLPU011 Tekan Tombol Masuk");
    }
    @Then("TLPU011 Validasi Halaman Home User")
    public void tlpu011_validasi_halaman_home_user(){
        WebElement validasi = homePageHadirUser.getValidasiHomePage();
//        boolean valid = validasi.isDisplayed();
//        System.out.println(valid);
        Assert.assertTrue(validasi.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TLPU011 Validasi Halaman Home User");
    }

    @When("TLPU011 Tekan Tombol Span User")
    public void tlpu011_tekan_tombol_span_user(){
        homePageHadirUser.getSpanHomeUser().click();
        extentTest.log(LogStatus.PASS, "TLPU011 Tekan Tombol Span User");
    }
    @And("TLPU011 Tekan Tombol Logout")
    public void tlpu011_tekan_tombol_logout(){
        homePageHadirUser.getBtnLogOutUser().click();
        extentTest.log(LogStatus.PASS, "TLPU011 Tekan Tombol Logout");
    }

    @Then("TLPU011 Validasi Halaman Login")
    public void tlpu011_validasi_halaman_login(){
        WebElement validasiLogin = loginPageHadirUser.getFormLogin();
        boolean boolValidasi = validasiLogin.isDisplayed();
        Assert.assertTrue(boolValidasi);
        extentTest.log(LogStatus.PASS, "TLPU011 Validasi Halaman Login");
    }

}





