package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.ClientUplinerPage;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.FormClientUplinearPage;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.HomePageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.LoginPageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.DataGenerator;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 22/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 22/08/2024 14:29
@Last Modified 22/08/2024 14:29
Version 1.0
*/
public class TambahClientUpliner {
    private WebDriver driver;
    private LoginPageHadirAdmin loginPageHadirAdmin;
    private HomePageHadirAdmin homePageHadirAdmin;
    private ClientUplinerPage clientUplinerPage;
    private FormClientUplinearPage formClientUplinearPage;
    private DataGenerator dataGenerator;
    private static List<String> dataUpliner = new ArrayList<>();
    private static ExtentTest extentTest;

    public TambahClientUpliner(){
        this.driver = Test1Hooks.driver;
        loginPageHadirAdmin= new LoginPageHadirAdmin(driver);
        homePageHadirAdmin = new HomePageHadirAdmin(driver);
        clientUplinerPage = new ClientUplinerPage(driver);
        formClientUplinearPage = new FormClientUplinearPage(driver);
        dataGenerator = new DataGenerator();
        dataUpliner.add(dataGenerator.dataNamaLengkap());
        dataUpliner.add(dataGenerator.dataEmail());
        dataUpliner.add(dataGenerator.dataPassword());
        extentTest = Test1Hooks.extentTest;
    }

    @Given("TCUP050 Berada Di Halaman Login")
    public void tcup050_berada_di_halaman_login(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TCUP050 Berada Di Halaman Login");
    }
    @And("TCUP050 Validasi Halaman Login Admin")
    public void tcup050_validasi_halaman_login_admin(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TCUP050 Validasi Halaman Login Admin");
    }
    @And("TCUP050 Membersihkan Input Email Dan Password")
    public void tcup050_membersihkan_input_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TCUP050 Membersihkan Input Email Dan Password");
    }
    @And("TCUP050 Mengisi Input Email Admin")
    public void tcup050_mengisi_input_email_admin(){
        loginPageHadirAdmin.getInputEmail().sendKeys("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "TCUP050 Mengisi Input Email");
    }
    @And("TCUP050 Mengisi Input Password Admin")
    public void tcup050_mengisi_input_password_admin(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TCUP050 Mengisi Input Password");
    }
    @And("TCUP050 Mengklik Tombol Login")
    public void tcup050_mengklik_tombol_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TCUP050 Mengklik Tombol Login");
    }
    @And("TCUP050 Berhasil Masuk Ke Halaman Home")
    public void tcup050_berhasil_masuk_ke_halaman_home(){
        WebElement validasi2 = homePageHadirAdmin.getContainer1();
        Assert.assertTrue(validasi2.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TCUP050 Berhasil Masuk Ke Halaman Home");
    }
    @And("TCUP050 Mengklik Menu Sidebar Management")
    public void tcup050_mengklik_menu_sidebar_management(){
        homePageHadirAdmin.getSideManagemant().click();
        extentTest.log(LogStatus.PASS, "TCUP050 Mengklik Menu Sidebar Management");
    }
    @And("TCUP050 Mengklik Submenu Client Upliner")
    public void tcup050_mengklik_submenu_client_upliner(){
        homePageHadirAdmin.getSideClientUpliner().click();
        extentTest.log(LogStatus.PASS, "TCUP050 Mengklik Submenu Client Upliner");
    }
    @And("TCUP050 Berhasil Masuk Ke Halaman Client Upliner")
    public void tcup050_berhasil_masuk_ke_halaman_client_upliner(){
        WebElement tableUplinear = clientUplinerPage.getTableUplinear();
        Assert.assertTrue(tableUplinear.isDisplayed());
        extentTest.log(LogStatus.PASS, "TCUP050 Berhasil Masuk Ke Halaman Client Upliner");
    }
    @And("TCUP050 Mengklik Tombol Tambah Client Upliner")
    public void tcup050_mengklik_tombol_tambah_client_upliner(){
        clientUplinerPage.getBtnTambahUplinear().click();
        extentTest.log(LogStatus.PASS, "TCUP050 Mengklik Tombol Tambah Client Upliner");
    }
    @And("TCUP050 Halaman Tambah Client Upliner Ditampilkan")
    public void tcup050_halaman_tambah_client_upliner_ditampilkan(){
        WebElement formUplinear = formClientUplinearPage.getFormClientUplinear();
        Assert.assertTrue(formUplinear.isDisplayed());
        extentTest.log(LogStatus.PASS, "TCUP050 Halaman Tambah Client Upliner Ditampilkan");
    }
    @When("TCUP050 Mengisi Input Nama")
    public void tcup050_mengisi_input_nama(){
        formClientUplinearPage.getInputNamaUplinear().sendKeys(dataUpliner.get(0));
        extentTest.log(LogStatus.PASS, "TCUP050 Mengisi Input Nama");
    }
    @And("TCUP050 Mengisi Input Email")
    public void tcup050_mengisi_input_email(){
        formClientUplinearPage.getInputEmailUplinear().sendKeys(dataUpliner.get(1));
        extentTest.log(LogStatus.PASS, "TCUP050 Mengisi Input Email");
    }
    @And("TCUP050 Mengisi Input Password")
    public void tcup050_mengisi_input_password(){
        formClientUplinearPage.getInputPasswordUplinear().sendKeys(dataUpliner.get(2));
        extentTest.log(LogStatus.PASS, "TCUP050 Mengisi Input Password");
    }
    @And("TCUP050 Mengisi Input Unit")
    public void tcup050_mengisi_input_unit(){
        formClientUplinearPage.getInputUnit().click();

        formClientUplinearPage.getInputUnit().sendKeys(Keys.DOWN);
        formClientUplinearPage.getInputUnit().sendKeys(Keys.RETURN);
        extentTest.log(LogStatus.PASS, "TCUP050 Mengisi Input Unit");
    }
    @And("TCUP050 Mengisi Input Client Upliner")
    public void tcup050_mengisi_input_client_upliner(){
        Random intRand = new Random();
        int roleRand = intRand.nextInt(0,2);
        formClientUplinearPage.getInputRole().click();
        while (true) {
            if (!formClientUplinearPage.getTxtFieldRole().isEmpty()) {
                formClientUplinearPage.getTxtFieldRole().get(roleRand).click();
                extentTest.log(LogStatus.PASS, "TCUP050 Mengisi Input Client Upliner");
                break;
            } else {
                extentTest.log(LogStatus.FAIL, "TCUP050 Mengisi Input Client Upliner");
            }
        }

    }
    @And("TCUP050 Mengklik Tombol Submit")
    public void tcup050_mengklik_tombol_submit(){
        formClientUplinearPage.getBtnDaftar().click();
        extentTest.log(LogStatus.PASS, "TCUP050 Mengklik Tombol Submit");
    }

    @And("TCUP050 Clear Input Search Upliner")
    public void tcup050_clear_input_search_upliner(){
        clientUplinerPage.getInputSearch().clear();
        extentTest.log(LogStatus.PASS, "TCUP050 Clear Input Search Upliner");
    }
    @And("TCUP050 Input Field Search Upliner")
    public void tcup050_input_field_search_upliner(){
        clientUplinerPage.getInputSearch().sendKeys(dataUpliner.get(0));
        extentTest.log(LogStatus.PASS, "TCUP050 Input Field Search Upliner");
    }
    @And("TCUP050 Klik Button Submit Search")
    public void tcup050_klik_button_submit_search(){
        clientUplinerPage.getBtnSearch().click();
        extentTest.log(LogStatus.PASS, "TCUP050 Klik Button Submit Search");
    }
    @Then("TCUP050 Validasi Hasil Yang Di Tambahkan")
    public void tcup050_validasi_hasil_yang_di_tambahkan(){
        List<String> namaUplinearTable = clientUplinerPage.getNamaDataTable();
        boolean validasi = dataUpliner.get(0).equalsIgnoreCase(namaUplinearTable.get(0));
        Assert.assertTrue(validasi);
        extentTest.log(LogStatus.PASS, "TCUP050 Validasi Hasil Yang Di Tambahkan");
    }

}





