package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.HomePageHadirAdmin;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.LoginPageHadirAdmin;
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
Build #IC-223.8214.52, built on 12/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 12/08/2024 15:05
@Last Modified 12/08/2024 15:05
Version 1.0
*/
public class LoginPositifAdmin {

    private WebDriver driver;
    private LoginPageHadirAdmin loginPageHadirAdmin;
    private HomePageHadirAdmin homePageHadirAdmin;
    private static ExtentTest extentTest;

    public LoginPositifAdmin(){
        this.driver = Test1Hooks.driver;
        loginPageHadirAdmin = new LoginPageHadirAdmin(driver);
        homePageHadirAdmin = new HomePageHadirAdmin(driver);
        extentTest = Test1Hooks.extentTest;
    }

    @When("TLPA001 Mengakses Halaman Website")
    public void tlpa001_mengakses_halaman_website(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TLPA001 Mengakses Halaman Website");
    }
    @And("TLPA001 Mengkosongkan Field Untuk Login")
    public void tlpa001_mengkosongkan_field_untuk_login(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TLPA001 Mengkosongkan Field Untuk Login");
    }
    @And("TLPA001 Input {string} Email Valid")
    public void tlpa001_input_Email_valid(String email){
        loginPageHadirAdmin.getInputEmail().sendKeys(email);
        extentTest.log(LogStatus.PASS, "TLPA001 Input Email Valid");
    }
    @And("TLPA001 Input {string} Password Valid")
    public void tlpa001_input_password_valid(String password){
        loginPageHadirAdmin.getInputPassword().sendKeys(password);
        extentTest.log(LogStatus.PASS, "TLPA001 Input Password Valid");
    }
    @Then("TLPA001 Menekan Tombol Login")
    public void tlpa001_menekan_tombol_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TLPA001 Menekan Tombol Login");
    }
    @Then("TLPA001 Validasi Halaman Home")
    public void tlpa001_validasi_halaman_home(){
        WebElement validasi2 = homePageHadirAdmin.getContainer1();
        Assert.assertTrue(validasi2.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TLPA001 Validasi Halaman Home");
    }
    @When("TLPA001 Klik Span Admin")
    public void tlpa001_klik_span_admin(){
        homePageHadirAdmin.getSpanUser().click();
        extentTest.log(LogStatus.PASS, "TLPA001 Klik Span Admin");
    }
    @And("TLPA001 Klik Tombol Logout")
    public void tlpa001_klik_tombol_logout(){
        homePageHadirAdmin.getBtnLogOut().click();
        extentTest.log(LogStatus.PASS, "TLPA001 Klik Tombol Logout");
    }

    @Then("TLPA001 Validasi Halaman Login")
    public void tlpa001_validasi_halaman_login() {
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TLPA001 Validasi Halaman Login");
    }



}





