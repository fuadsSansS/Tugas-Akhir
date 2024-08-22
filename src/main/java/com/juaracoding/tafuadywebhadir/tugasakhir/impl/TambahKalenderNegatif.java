package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.HomePageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.KalenderPageUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.LoginPageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 20/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 20/08/2024 19:52
@Last Modified 20/08/2024 19:52
Version 1.0
*/
public class TambahKalenderNegatif {
    private WebDriver driver;
    private LoginPageHadirAdmin loginPageHadirAdmin;
    private HomePageHadirAdmin homePageHadirAdmin;
    private KalenderPageUser kalenderPageUser;
    private static ExtentTest extentTest;

    public TambahKalenderNegatif(){
        this.driver = Test1Hooks.driver;
        loginPageHadirAdmin= new LoginPageHadirAdmin(driver);
        homePageHadirAdmin = new HomePageHadirAdmin(driver);
        kalenderPageUser = new KalenderPageUser(driver);
        extentTest = Test1Hooks.extentTest;

    }
    @Given("TTNK033 Akses Halaman Login Admin")
    public void ttnk033_akses_halaman_login_admin(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TTNK033 Akses Halaman Login Admin");
    }
    @And("TTNK033 Validasi Halaman Admin Login")
    public void ttnk033_validasi_halaman_admin_login(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TTNK033 Validasi Halaman Admin Login");
    }
    @And("TTNK033 Clear Field Email Dan Password")
    public void ttnk033_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TTNK033 Clear Field Email Dan Password");
    }
    @And("TTNK033 Input Email Valid")
    public void ttnk033_input_email_valid(){
        loginPageHadirAdmin.getInputEmail().sendKeys("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "TTNK033 Input Email Valid");
    }
    @And("TTNK033 Input Password Valid")
    public void ttnk033_input_password_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TTNK033 Input Password Valid");
    }
    @And("TTNK033 Klik Button Login")
    public void ttnk033_klik_button_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TTNK033 Klik Button Login");
    }
    @And("TTNK033 Validasi Halaman Home Admin")
    public void ttnk033_validasi_halaman_home_admin(){
        WebElement validasi2 = homePageHadirAdmin.getContainer1();
        Assert.assertTrue(validasi2.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TTNK033 Validasi Halaman Home Admin");
    }
    @And("TTNK033 Klik Side Bar Managemant")
    public void ttnk033_klik_side_bar_managemant(){
        homePageHadirAdmin.getSideManagemant().click();
        extentTest.log(LogStatus.PASS, "TTNK033 Klik Side Bar Managemant");
    }
    @And("TTNK033 Klik Sub Side Bar Kalender")
    public void ttnk033_klik_sub_side_bar_kalender(){
        homePageHadirAdmin.getSideKalender().click();
        extentTest.log(LogStatus.PASS, "TTNK033 Klik Sub Side Bar Kalender");
    }
    @And("TTNK033 Validasi Halaman Kalender")
    public void ttnk033_validasi_halaman_kalender(){
        WebElement kalernderTable = kalenderPageUser.getTableKalender();
        boolean validKalenderPage = kalernderTable.isDisplayed();
        Assert.assertTrue(validKalenderPage);
        extentTest.log(LogStatus.PASS, "TTNK033 Validasi Halaman Kalender");
    }
    @And("TTNK033 Klik Button Tambah Kalender")
    public void ttnk033_klik_button_tambah_kalender(){
        kalenderPageUser.getBtnTambahKalender().click();
        extentTest.log(LogStatus.PASS, "TTNK033 Klik Button Tambah Kalender");
    }
    @And("TTNK033 Input Empty Nama Kalender")
    public void ttnk033_input_empty_nama_kalender(){
        kalenderPageUser.getInputKalnder().sendKeys("");
        extentTest.log(LogStatus.PASS, "TTNK033 Input Empty Nama Kalender");
    }
    @And("TTNK033 Tekan Tambah Kalender")
    public void ttnk033_tekan_tambah_kalender(){
        kalenderPageUser.getBtnInputKalender().click();
        extentTest.log(LogStatus.PASS, "TTNK033 Tekan Tambah Kalender");
    }
    @Then("TTNK033 Validasi Pesan Error")
    public void ttnk033_validasi_tambah_kalender(){
        String a = kalenderPageUser.getAlertInput().getText();
        Assert.assertEquals(a,"Nama kalender unit harus diini");
        extentTest.log(LogStatus.PASS, "TTNK033 Validasi Pesan Error");
    }

}





