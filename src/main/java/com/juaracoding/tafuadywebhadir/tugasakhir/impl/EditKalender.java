package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.HomePageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.KalenderEditPage;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.KalenderPageUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.LoginPageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.DataGenerator;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 21/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 21/08/2024 17:02
@Last Modified 21/08/2024 17:02
Version 1.0
*/
public class EditKalender {

    private WebDriver driver;
    private LoginPageHadirAdmin loginPageHadirAdmin;
    private HomePageHadirAdmin homePageHadirAdmin;
    private KalenderPageUser kalenderPageUser;
    private KalenderEditPage kalenderEditPage;
    private static DataGenerator dataGenerator;
    private static ExtentTest extentTest;
    private static String zipKode = "";
    private static String namaKalenderRandom;
    private static String namaBaruKalender;

    public EditKalender(){
        this.driver = Test1Hooks.driver;
        loginPageHadirAdmin= new LoginPageHadirAdmin(driver);
        homePageHadirAdmin = new HomePageHadirAdmin(driver);
        kalenderPageUser = new KalenderPageUser(driver);
        kalenderEditPage = new KalenderEditPage(driver);
        extentTest = Test1Hooks.extentTest;
        dataGenerator = new DataGenerator();
        zipKode = dataGenerator.dataKota();
    }

    @Given("TEPK035 Akses Halaman Login Admin")
    public void tepk035_akses_halaman_login_admin(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TEPK035 Akses Halaman Login Admin");
    }
    @And("TEPK035 Validasi Halaman Admin Login")
    public void tepk035_validasi_halaman_admin_login(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TEPK035 Validasi Halaman Admin Login");
    }
    @And("TEPK035 Clear Field Email Dan Password")
    public void tepk035_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TEPK035 Clear Field Email Dan Password");
    }
    @And("TEPK035 Input Email Valid")
    public void tepk035_input_email_valid(){
        loginPageHadirAdmin.getInputEmail().sendKeys("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "TEPK035 Input Email Valid");
    }
    @And("TEPK035 Input Password Valid")
    public void tepk035_input_password_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TEPK035 Input Password Valid");
    }
    @And("TEPK035 Klik Button Login")
    public void tepk035_klik_button_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TEPK035 Klik Button Login");
    }
    @And("TEPK035 Validasi Halaman Home Admin")
    public void tepk035_validasi_halaman_home_admin(){
        WebElement validasi2 = homePageHadirAdmin.getContainer1();
        Assert.assertTrue(validasi2.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TEPK035 Validasi Halaman Home Admin");
    }
    @And("TEPK035 Klik Side Bar Managemant")
    public void tepk035_klik_side_bar_managemant(){
        homePageHadirAdmin.getSideManagemant().click();
        extentTest.log(LogStatus.PASS, "TEPK035 Klik Side Bar Managemant");
    }
    @And("TEPK035 Klik Sub Side Bar Kalender")
    public void tepk035_klik_sub_side_bar_kalender(){
        homePageHadirAdmin.getSideKalender().click();
        extentTest.log(LogStatus.PASS, "TEPK035 Klik Sub Side Bar Kalender");
    }
    @And("TEPK035 Validasi Halaman Kalender")
    public void tepk035_validasi_halaman_kalender(){
        WebElement kalernderTable = kalenderPageUser.getTableKalender();
        boolean validKalenderPage = kalernderTable.isDisplayed();
        Assert.assertTrue(validKalenderPage);
        extentTest.log(LogStatus.PASS, "TEPK035 Validasi Halaman Kalender");
    }
    @And("TEPK035 Clear Input Field Search")
    public void tepk035_clear_input_field_search(){
        kalenderPageUser.getInputSearch().clear();
        extentTest.log(LogStatus.PASS, "TEPK035 Clear Input Field Search");
    }
    @And("TEPK035 Input Field Search")
    public void tepk035_input_field_search(){
        List<String> namaKalender = kalenderPageUser.getRandomNamaKalender();
        namaKalenderRandom = namaKalender.get(0);
        kalenderPageUser.getInputSearch().sendKeys(namaKalenderRandom);
        extentTest.log(LogStatus.PASS, "TEPK035 Input Field Search");
    }
    @And("TEPK035 Tekan Button Search")
    public void tepk035_tekan_button_search(){
        kalenderPageUser.getBtnSearchKalender().click();
        extentTest.log(LogStatus.PASS, "TEPK035 Tekan Button Search");
    }
    @And("TEPK035 Validasi Hasil Search")
    public void tepk035_validasi_hasil_search(){
        System.out.println(namaKalenderRandom);
        List<String>namaKalender2 = kalenderPageUser.getNamaKalender();
        System.out.println(namaKalender2.get(0));
        extentTest.log(LogStatus.PASS, "TEPK035 Validasi Hasil Search");
    }


    @And("TEPK035 Klik Button Opsi")
    public void tepk035_klik_button_opsi(){
        List<WebElement> btnOpsi = kalenderPageUser.getBtnViewDataTable();
        btnOpsi.get(0).click();
        extentTest.log(LogStatus.PASS, "TEPK035 Klik Button Opsi");
    }
    @And("TEPK035 Klik Button Edit Kalender")
    public void tepk035_klik_button_edit_kalender(){
        kalenderPageUser.getGetEdit().click();
        extentTest.log(LogStatus.PASS, "TEPK035 Klik Button Edit Kalender");
    }
    @And("TEPK035 Clear Field Edit")
    public void tepk035_clear_field_edit(){
        WebElement page = kalenderPageUser.getInputKalnder();
        page.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        extentTest.log(LogStatus.PASS, "TEPK035 Clear Field Edit");
    }
    @And("TEPK035 Input Nama Kalender Baru")
    public void tepk035_input_nama_kalender_baru(){
        WebElement page = kalenderPageUser.getInputKalnder();
        namaBaruKalender = zipKode;
        page.sendKeys(namaBaruKalender);
        extentTest.log(LogStatus.PASS, "TEPK035 Input Nama Kalender Baru");
    }
    @Then("TEPK035 Tekan Simpan Perubahan Kalender")
    public void tepk035_tekan_simpan_perubahan_kalender(){
        kalenderPageUser.getGetBtnInputEdit().click();
        extentTest.log(LogStatus.PASS, "TEPK035 Tekan Simpan Perubahan Kalender");
    }

    @When("TEPK035 Clear Search Nama Kalender")
    public void tepk035_clear_search_nama_kalender(){
        driver.navigate().refresh();
        kalenderPageUser.getInputSearch().clear();
        extentTest.log(LogStatus.PASS, "TEPK035 Clear Search Nama Kalender");
    }

    @And("TEPK035 Input Nama Kalender Yang Sudah Di Edit")
    public void tepk035_input_nama_kalender_yang_sudah_di_edit(){
        kalenderPageUser.getInputSearch().sendKeys(namaBaruKalender);
        extentTest.log(LogStatus.PASS, "TEPK035 Input Nama Kalender Yang Sudah Di Edit");
    }

    @And("TEPK035 Klik Button Search")
    public void tepk035_klik_button_search(){
        kalenderPageUser.getBtnSearchKalender().click();
        extentTest.log(LogStatus.PASS, "TEPK035 Tekan Button Search");
    }

    @Then("TEPK035 Validasi Edit Kalender")
    public void tepk035_validasi_edit_kalender(){
        List<String> kalenderEdit = kalenderEditPage.getNamaKalender();
        String validNamaKalender =  kalenderEdit.get(0);
        if (validNamaKalender.equalsIgnoreCase(zipKode)){
            extentTest.log(LogStatus.PASS, "TEPK035 Validasi Edit Kalender");
        }else {
            extentTest.log(LogStatus.FAIL, "TEPK035 Validasi Edit Kalender");
        }
    }

}





