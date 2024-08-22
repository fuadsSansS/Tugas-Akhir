package com.juaracoding.tafuadywebhadir.tugasakhir.impl;


import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.LoginPageHadirAdmin;
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
Created on 13/08/2024 0:49
@Last Modified 13/08/2024 0:49
Version 1.0
*/
public class LoginNegatifAdmin {


    private WebDriver driver;
    private LoginPageHadirAdmin loginPageHadirAdmin;
    private static ExtentTest extentTest;
    private String validasi;

    public LoginNegatifAdmin() {
        this.driver = Test1Hooks.driver;
        loginPageHadirAdmin = new LoginPageHadirAdmin(driver);
        extentTest = Test1Hooks.extentTest;
    }

    @When("TLNA002 Clear Field Email Dan Password")
    public void tlna002_clear_field_email_dan_password(){
        //this.driver.get(Constants.URL_LOGIN);
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNA002 Clear Field Email Dan Password");
    }
    @And("TLNA002 Input Field Email Empty String")
    public void tlna002_input_field_email_empty_string(){
        loginPageHadirAdmin.getInputEmail().sendKeys("");
        extentTest.log(LogStatus.PASS, "TLNA002 Input Field Email Empty String");
    }
    @And("TLNA002 Input Field Password Empty String")
    public void tlna002_input_field_password_empty_string(){
        loginPageHadirAdmin.getInputPassword().sendKeys("");
        extentTest.log(LogStatus.PASS, "TLNA002 Input Field Password Empty String");
    }
    @And("TLNA002 Klik Tombol Login")
    public void tlna002_klik_tombol_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TLNA002 Klik Tombol Login");
    }
    @And("TLNA002 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void tlna002_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik(){
        validasi = loginPageHadirAdmin.getTxtAllert() == null ? "":loginPageHadirAdmin.getTxtAllert().getText();
        Assert.assertEquals(validasi, "Akun tidak ditemukan");
        extentTest.log(LogStatus.PASS, "TLNA002 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @Then("TLNA002 Klik Tombol Silang Alert")
    public void tlna002_klik_tombol_silang_alert(){
        loginPageHadirAdmin.getBtnAllert().click();
        extentTest.log(LogStatus.PASS, "TLNA002 Klik Tombol Silang Alert");
    }
    @When("TLNA003 Clear Field Email Dan Password")
    public void tlna003_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNA003 Clear Field Email Dan Password");
    }
    @And("TLNA003 Input Field Email Tidak Valid")
        public void tlna003_input_field_email_tidak_valid(){
        loginPageHadirAdmin.getInputEmail().sendKeys("apaAja@gmail.com");
        extentTest.log(LogStatus.PASS, "TLNA003 Input Field Email Tidak Valid");
    }
    @And("TLNA003 Input Field Password Valid")
        public void tlna003_input_field_password_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TLNA003 Input Field Password Valid");
    }
    @And("TLNA003 Klik Tombol Login")
    public void tlna003_klik_tombol_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TLNA003 Klik Tombol Login");
    }
    @And("TLNA003 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void tlna003_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik(){
        validasi = loginPageHadirAdmin.getTxtAllert() == null ? "":loginPageHadirAdmin.getTxtAllert().getText();
        Assert.assertEquals(validasi, "Akun tidak ditemukan");
        extentTest.log(LogStatus.PASS, "TLNA003 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }
    @Then("TLNA003 Klik Tombol Silang Alert")
    public void tlna003_klik_tombol_silang_alert(){
        loginPageHadirAdmin.getBtnAllert().click();
        extentTest.log(LogStatus.PASS, "TLNA003 Klik Tombol Silang Alert");
    }
    @When("TLNA004 Clear Field Email Dan Password")
        public void tlna004_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNA004 Clear Field Email Dan Password");
    }
    @And("TLNA004 Input Field Email Yang Valid")
        public void tlna004_input_field_email_yang_valid(){
        loginPageHadirAdmin.getInputEmail().sendKeys("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "TLNA004 Input Field Email Yang Valid");
    }
    @And("TLNA004 Input Field Password Yang Tidak Valid")
    public void tlna004_input_field_password_yang_tidak_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("apaajaaaa");
        extentTest.log(LogStatus.PASS, "TLNA004 Input Field Password Yang Tidak Valid");
    }
    @And("TLNA004 Klik Tombol Login")
    public void tlna004_klik_tombol_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TLNA004 Klik Tombol Login");
    }
    @And("TLNA004 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void tlna004_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik(){
        validasi = loginPageHadirAdmin.getTxtAllert() == null ? "":loginPageHadirAdmin.getTxtAllert().getText();
        Assert.assertEquals(validasi, "Email atau password salah");
        extentTest.log(LogStatus.PASS, "TLNA004 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }
    @Then("TLNA004 Klik Tombol Silang Alert")
    public void tlna004_klik_tombol_silang_alert(){
        loginPageHadirAdmin.getBtnAllert().click();
        extentTest.log(LogStatus.PASS, "TLNA004 Klik Tombol Silang Alert");
    }

    @When("TLNA005 Clear Field Email Dan Password")
    public void tlna005_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLNA005 Clear Field Email Dan Password");
    }
    @And("TLNA005 Input Field Email Yang Tidak Sesuai Format")
    public void tlna005_input_field_email_yang_tidak_sesuai_format(){
        loginPageHadirAdmin.getInputEmail().sendKeys("fuady");
        extentTest.log(LogStatus.PASS, "TLNA005 Input Field Email Yang Tidak Sesuai Format");
    }
    @And("TLNA005 Input Field Password Yang valid")
    public void tlna005_input_field_password_yang_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TLNA005 Input Field Password Yang valid");
    }
    @And("TLNA005 Klik Tombol Login")
    public void tlna005_klik_tombol_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TLNA005 Klik Tombol Login");
    }
    @Then("TLNA005 Validasi Setelah Di Klik")
    public void tlna005_validasi_setelah_di_klik(){
        boolean strBol = loginPageHadirAdmin.getValidEmail();
        if (strBol == true){
            extentTest.log(LogStatus.PASS, "TLNA005 Validasi Setelah Di Klik");
        }else {
            extentTest.log(LogStatus.PASS, "TLNA005 Validasi Setelah Di Klik");
        }
    }

}





