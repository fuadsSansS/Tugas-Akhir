package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.HomePageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.KalenderPageUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.LoginPageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 15/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 15/08/2024 13:25
@Last Modified 15/08/2024 13:25
Version 1.0
*/
public class TambahKalender {

    private WebDriver driver;
    private LoginPageHadirAdmin loginPageHadirAdmin;
    private HomePageHadirAdmin homePageHadirAdmin;
    private KalenderPageUser kalenderPageUser;
    private static ExtentTest extentTest;


    public TambahKalender(){
        this.driver = Test1Hooks.driver;
        loginPageHadirAdmin= new LoginPageHadirAdmin(driver);
        homePageHadirAdmin = new HomePageHadirAdmin(driver);
        kalenderPageUser = new KalenderPageUser(driver);
        extentTest = Test1Hooks.extentTest;
    }

    @Given("TTPK031 Akses Halaman Login Admin")
    public void TTPK031_akses_halaman_login_admin(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TTPK031 Akses Halaman Login Admin");
    }
    @And("TTPK031 Validasi Halaman Admin Login")
    public void TTPK031_validasi_halaman_admin_login(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TTPK031 Validasi Halaman Admin Login");
    }
    @And ("TTPK031 Clear Field Email Dan Password")
    public void TTPK031_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TTPK031 Clear Field Email Dan Password");
    }
    @And ("TTPK031 Input Email Valid")
    public void TTPK031_input_email_valid(){
        loginPageHadirAdmin.getInputEmail().sendKeys("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "TTPK031 Input Email Valid");
    }
    @And ("TTPK031 Input Password Valid")
    public void TTPK031_input_password_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TTPK031 Input Password Valid");
    }
    @And("TTPK031 Klik Button Login")
    public void TTPK031_klik_button_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TTPK031 Klik Button Login");
    }
    @And ("TTPK031 Validasi Halaman Home Admin")
    public void TTPK031_validasi_halaman_home_admin(){
        WebElement validasi2 = homePageHadirAdmin.getContainer1();
        Assert.assertTrue(validasi2.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TTPK031 Validasi Halaman Home Admin");
    }
    @And("TTPK031 Klik Side Bar Managemant")
    public void TTPK031_klik_side_bar_managemant(){
        homePageHadirAdmin.getSideManagemant().click();
        extentTest.log(LogStatus.PASS, "TTPK031 Klik Side Bar Managemant");
    }
    @And("TTPK031 Klik Sub Side Bar Kalender")
    public void TTPK031_klik_sub_side_bar_kalender(){
        homePageHadirAdmin.getSideKalender().click();
        extentTest.log(LogStatus.PASS, "TTPK031 Klik Sub Side Bar Kalender");
    }
    @And ("TTPK031 Validasi Halaman Kalender")
    public void TTPK031_validasi_halaman_kalender(){
        WebElement kalernderTable = kalenderPageUser.getTableKalender();
        boolean validKalenderPage = kalernderTable.isDisplayed();
        System.out.println(validKalenderPage);
        extentTest.log(LogStatus.PASS, "TTPK031 Validasi Halaman kalender");
    }
    @And("TTPK031 Klik Button Tambah Kalender")
    public void TTPK031_klik_button_tambah_kalender(){
        kalenderPageUser.getBtnTambahKalender().click();
        extentTest.log(LogStatus.PASS, "TTPK031 Klik Button Tambah Kalender");
    }
    @And ("TTPK031 Input Nama Kalender")
    public void TTPK031_input_nama_position(){
        kalenderPageUser.getInputKalnder().sendKeys("hahaha");
        extentTest.log(LogStatus.PASS, "TTPK031 Input Nama Kalender");
    }


}





