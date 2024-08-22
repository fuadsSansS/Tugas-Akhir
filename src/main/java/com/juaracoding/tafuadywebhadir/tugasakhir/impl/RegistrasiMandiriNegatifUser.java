package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.LoginPageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.RegistrasiPageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 20/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 20/08/2024 16:24
@Last Modified 20/08/2024 16:24
Version 1.0
*/
public class RegistrasiMandiriNegatifUser {

    private WebDriver driver;
    private LoginPageHadirUser loginPageHadirUser;
    private RegistrasiPageHadirUser registrasiPageHadirUser;
    private static ExtentTest extentTest;
    private static String dir;

    public RegistrasiMandiriNegatifUser(){
        this.driver = Test1Hooks.driver;
        loginPageHadirUser = new LoginPageHadirUser(driver);
        registrasiPageHadirUser = new RegistrasiPageHadirUser(driver);
        dir = System.getProperty("user.dir");
        extentTest = Test1Hooks.extentTest;

    }

    @Given("TRUMN023 Mengakses Halaman Login User")
    public void trumn023_mengakses_halaman_login_user(){
        this.driver.get(Constants.URL_LOGIN2);
        extentTest.log(LogStatus.PASS, "TRUMN023 Mengakses Halaman Login User");
    }
    @And("TRUMN023 Validasi Halaman Login User")
    public void trumn023_validasi_halaman_login_user(){
        boolean boolValidLoginUser = loginPageHadirUser.getFormLogin().isDisplayed();
        if (boolValidLoginUser == true) {
            extentTest.log(LogStatus.PASS, "TRUMN023 Validasi Halaman Login User");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMN023 Validasi Halaman Login User");
        }
    }
    @And("TRUMN023 Klik Link Menuju Halaman Registrasi")
    public void trumn023_klik_link_menuju_halaman_registrasi(){
        loginPageHadirUser.getBtnToRegist().click();
        extentTest.log(LogStatus.PASS, "TRUMN023 Klik Link Menuju Halaman Registrasi");
    }
    @And("TRUMN023 Validasi Halaman Registrasi")
    public void trumn023_validasi_halaman_registrasi(){
        WebElement contForm = registrasiPageHadirUser.getFormRegis();
        boolean boolValid = contForm.isDisplayed();
        if (boolValid == true){
            extentTest.log(LogStatus.PASS, "TRUMN023 Validasi Halaman Registrasi");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMN023 Validasi Halaman Registrasi");
        }

    }
    @And("TRUMN023 Clear seluruh Inputan Registrasi")
    public void trumn023_clear_seluruh_inputan_registrasi(){
        registrasiPageHadirUser.getInputNik().clear();
        registrasiPageHadirUser.getInputFullNama().clear();
        registrasiPageHadirUser.getInputEmail().clear();
        registrasiPageHadirUser.getInputPassword().clear();
        registrasiPageHadirUser.getInputFile().clear();
        extentTest.log(LogStatus.PASS, "TRUMN023 Clear seluruh Inputan Registrasi");
    }
    @And("TRUMN023 Input Field Nik Empty")
    public void trumn023_input_field_nik_empty(){
        registrasiPageHadirUser.getInputNik().sendKeys("");
        extentTest.log(LogStatus.PASS, "TRUMN023 Input Field Nik empty");
    }
    @And("TRUMN023 Input Field Nama Lengkap Empty")
    public void trumn023_input_field_nama_lengkap_empty(){
        registrasiPageHadirUser.getInputFullNama().sendKeys("");
        extentTest.log(LogStatus.PASS, "TRUMN023 Input Field Nama Lengkap Empty");
    }
    @And("TRUMN023 Input Field Email Empty")
    public void trumn023_input_field_email_empty(){
        registrasiPageHadirUser.getInputEmail().sendKeys("");
        extentTest.log(LogStatus.PASS, "TRUMN023 Input Field Email Empty");
    }
    @And("TRUMN023 Input Field Password Empty")
    public void trumn023_input_field_password_empty(){
        registrasiPageHadirUser.getInputPassword().sendKeys("");
        extentTest.log(LogStatus.PASS, "TRUMN023 Input Field Password Empty");
    }

    @And("TRUMN023 Klik Button Daftar")
    public void trumn023_klik_button_daftar(){
        registrasiPageHadirUser.getBtnDaftar().click();
        extentTest.log(LogStatus.PASS, "TRUMN023 Klik Button Daftar");
    }
    @Then("TRUMN023 Validasi Setelah Di Klik")
    public void trumn023_validasi_setelah_di_klik(){
        boolean bolNik = registrasiPageHadirUser.getIsValidNik();
        Assert.assertFalse(bolNik);
        extentTest.log(LogStatus.PASS, "TRUMN023 Validasi Setelah Di Klik");
    }

    @When("TRUMN024 Clear seluruh Inputan Registrasi")
    public void trumn024_clear_seluruh_inputan_registrasi(){
        registrasiPageHadirUser.getInputNik().clear();
        registrasiPageHadirUser.getInputFullNama().clear();
        registrasiPageHadirUser.getInputEmail().clear();
        registrasiPageHadirUser.getInputPassword().clear();
        registrasiPageHadirUser.getInputFile().clear();
        extentTest.log(LogStatus.PASS, "TRUMN024 Clear seluruh Inputan Registrasi");
    }
    @And("TRUMN024 Input Field Nik")
    public void trumn024_input_field_nik(){
        registrasiPageHadirUser.getInputNik().sendKeys("12345678");
        extentTest.log(LogStatus.PASS, "TRUMN024 Input Field Nik");
    }
    @And("TRUMN024 Input Field Nama Lengkap")
    public void trumn024_input_field_nama_lengkap(){
        registrasiPageHadirUser.getInputFullNama().sendKeys("Bastian");
        extentTest.log(LogStatus.PASS, "TRUMN024 Input Field Nama Lengkap");
    }
    @And("TRUMN024 Input Field Email Tidak Sesuai Format")
    public void trumn024_input_field_email_tidak_sesuai_format(){
        registrasiPageHadirUser.getInputEmail().sendKeys("fuadywahyudi.com");
        extentTest.log(LogStatus.PASS, "TRUMN024 Input Field Email Tidak Sesuai Format");
    }
    @And("TRUMN024 Input Field Password")
    public void trumn024_input_field_password(){
        registrasiPageHadirUser.getInputPassword().sendKeys("ududsudusds");
        extentTest.log(LogStatus.PASS, "TRUMN024 Input Field Password");
    }
    @And("TRUMN024 Input Field Image")
    public void trumn024_input_field_image(){
        registrasiPageHadirUser.getInputFile().sendKeys(dir + "\\src\\main\\resources\\DataImage\\1nf.PNG");
        extentTest.log(LogStatus.PASS, "TRUMN024 Input Field Image");
    }
    @And("TRUMN024 Klik Button Daftar")
    public void trumn024_klik_button_daftar(){
        registrasiPageHadirUser.getBtnDaftar().click();
        extentTest.log(LogStatus.PASS, "TRUMN024 Klik Button Daftar");
    }
    @Then("TRUMN024 Validasi Setelah Di Klik")
    public void trumn024_validasi_setelah_di_klik(){
        boolean bolValidEmail = registrasiPageHadirUser.getIsValidEmail();
        Assert.assertFalse(bolValidEmail);
        extentTest.log(LogStatus.PASS, "TRUMN024 Validasi Setelah Di Klik");
    }
}





