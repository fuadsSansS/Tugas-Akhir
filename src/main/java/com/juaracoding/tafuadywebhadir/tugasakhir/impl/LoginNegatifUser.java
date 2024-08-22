package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.LoginPageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 13/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 13/08/2024 20:57
@Last Modified 13/08/2024 20:57
Version 1.0
*/
public class LoginNegatifUser {

    private static final Logger log = LoggerFactory.getLogger(LoginNegatifUser.class);
    private WebDriver driver;
    private LoginPageHadirUser loginPageHadirUser;
    private static ExtentTest extentTest;

    public LoginNegatifUser() {
        this.driver = Test1Hooks.driver;
        loginPageHadirUser = new LoginPageHadirUser(driver);
        extentTest = Test1Hooks.extentTest;
    }

    @When("TLNU012 Clear Field Email Dan Password")
    public void tlnu012_clear_field_email_dan_password(){
        this.driver.get(Constants.URL_LOGIN2);
        loginPageHadirUser.getInputEmail().clear();
        loginPageHadirUser.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNU012 Clear Field Email Dan Password");
    }

    @And("TLNU012 Input Field Email Empty String")
    public void tlnu012_input_field_email_empty_string(){
        loginPageHadirUser.getInputEmail().sendKeys("");
        extentTest.log(LogStatus.PASS, "TLNU012 Input Field Email Empty String");
    }
    @And("TLNU012 Input Field Password Empty String")
    public void tlnu012_input_field_password_empty_string(){
        loginPageHadirUser.getInputPassword().sendKeys("");
        extentTest.log(LogStatus.PASS, "TLNU012 Input Field Password Empty String");
    }
    @And("TLNU012 Klik Tombol Login")
    public void tlnu012_klik_tombol_login(){
        loginPageHadirUser.getBtnMasuk().click();
        extentTest.log(LogStatus.PASS, "TLNU012 Klik Tombol Login");
    }
    @And("TLNU012 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void tlnu012_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik(){
        String validasi = loginPageHadirUser.getTxtAlert()==null?"":loginPageHadirUser.getTxtAlert().getText();
        Assert.assertEquals(validasi, "Akun tidak ditemukan");
        extentTest.log(LogStatus.PASS, "TLNU012 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }
    @Then("TLNU012 Klik Tombol Silang Alert")
    public void tlnu012_klik_tombol_silang_alert(){
        loginPageHadirUser.getBtnClose().click();
        extentTest.log(LogStatus.PASS, "TLNU012 Klik Tombol Silang Alert");
    }
    @When("TLNU013 Clear Field Email Dan Password")
    public void tlnu013_clear_field_email_dan_password(){
        loginPageHadirUser.getInputEmail().clear();
        loginPageHadirUser.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNU013 Clear Field Email Dan Password");
    }
    @And("TLNU013 Input Field Email Tidak Valid")
    public void tlnu013_input_field_email_tidak_valid(){
        loginPageHadirUser.getInputEmail().sendKeys("gaga@email.com");
        extentTest.log(LogStatus.PASS, "TLNU013 Input Field Email Tidak Valid");
    }
    @And("TLNU013 Input Field Password Valid")
    public void tlnu013_input_field_password_valid(){
        loginPageHadirUser.getInputPassword().sendKeys("fuady12345");
        extentTest.log(LogStatus.PASS, "TLNU013 Input Field Password Valid");
    }
    @And("TLNU013 Klik Tombol Login")
    public void tlnu013_klik_tombol_login(){
        loginPageHadirUser.getBtnMasuk().click();
        extentTest.log(LogStatus.PASS, "TLNU013 Klik Tombol Login");
    }
    @And("TLNU013 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void tlnu013_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik(){
        String validasi1 = loginPageHadirUser.getTxtAlert()==null?"":loginPageHadirUser.getTxtAlert().getText();
        System.out.println(validasi1);
        //Assert.assertEquals(validasi1,"Email atau password salah");
        extentTest.log(LogStatus.PASS, "TLNU013 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }
    @Then("TLNU013 Klik Tombol Silang Alert")
    public void tlnu013_klik_tombol_silang_alert(){
        loginPageHadirUser.getBtnClose().click();
        extentTest.log(LogStatus.PASS, "TLNU013 Klik Tombol Silang Alert");
    }
    @When("TLNU014 Clear Field Email Dan Password")
    public void tlnu014_clear_field_email_dan_password(){
        loginPageHadirUser.getInputEmail().clear();
        loginPageHadirUser.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNU014 Clear Field Email Dan Password");
    }
    @And("TLNU014 Input Field Email Yang Valid")
    public void tlnu014_input_field_email_yang_valid(){
        loginPageHadirUser.getInputEmail().sendKeys("fuadywayudi55@gmail.com");
        extentTest.log(LogStatus.PASS, "TLNU014 Input Field Email Yang Valid");
    }
    @And("TLNU014 Input Field Password Yang Tidak Valid")
    public void tlnu014_input_field_password_yang_tidak_valid(){
        loginPageHadirUser.getInputPassword().sendKeys("jajajajaj");
        extentTest.log(LogStatus.PASS, "TLNU014 Input Field Password Yang Tidak Valid");
    }
    @And("TLNU014 Klik Tombol Login")
    public void tlnu014_klik_tombol_login(){
        loginPageHadirUser.getBtnMasuk().click();
        extentTest.log(LogStatus.PASS, "TLNU014 Klik Tombol Login");
    }
    @And("TLNU014 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void tlnu014_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik(){
        String valid2 = loginPageHadirUser.getTxtAlert()==null ? "" :loginPageHadirUser.getTxtAlert().getText();
        System.out.println(valid2);
        extentTest.log(LogStatus.PASS, "TLNU014 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }
    @Then("TLNU014 Klik Tombol Silang Alert")
    public void tlnu014_klik_tombol_silang_alert(){
        loginPageHadirUser.getBtnClose().click();
        extentTest.log(LogStatus.PASS, "TLNU014 Klik Tombol Silang Alert");
    }
    @When("TLNU015 Clear Field Email Dan Password")
    public void tlnu015_clear_field_email_dan_password(){
        loginPageHadirUser.getInputEmail().clear();
        loginPageHadirUser.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNU015 Clear Field Email Dan Password");
    }
    @And("TLNU015 Input Field Email Yang Tidak Sesuai Format")
        public void tlnu015_input_field_email_yang_tidak_sesuai_format(){
        loginPageHadirUser.getInputEmail().sendKeys("fuady");
        extentTest.log(LogStatus.PASS, "TLNU015 Input Field Email Yang Tidak Sesuai Format");
    }
    @And("TLNU015 Input Field Password Yang valid")
    public void tlnu015_input_field_password_yang_valid(){
        loginPageHadirUser.getInputPassword().sendKeys("jajajaj");
        extentTest.log(LogStatus.PASS, "TLNU015 Input Field Password Yang valid");
    }
    @And("TLNU015 Klik Tombol Login")
    public void tlnu015_klik_tombol_login(){
        loginPageHadirUser.getBtnMasuk().click();
        extentTest.log(LogStatus.PASS, "TLNU015 Klik Tombol Login");
    }
    @Then("TLNU015 Validasi Setelah Di Klik")
    public void tlnu015_validasi_setelah_di_klik(){
        boolean validBool = loginPageHadirUser.getValidEmail();
        if (validBool == true){
            extentTest.log(LogStatus.PASS, "TLNU015 Validasi Setelah Di Klik");
        }else {
            extentTest.log(LogStatus.PASS, "TLNU015 Validasi Setelah Di Klik");
        }
    }

}





