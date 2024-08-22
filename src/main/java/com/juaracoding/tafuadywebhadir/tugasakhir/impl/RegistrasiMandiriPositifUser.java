package com.juaracoding.tafuadywebhadir.tugasakhir.impl;

import com.juaracoding.tafuadywebhadir.tugasakhir.page.admin.*;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.imageOnline.ImageOnlinePage;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.HomePageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.LoginPageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.page.user.RegistrasiPageHadirUser;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.DataGenerator;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.testng.Assert;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 14/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 14/08/2024 16:22
@Last Modified 14/08/2024 16:22
Version 1.0
*/
public class RegistrasiMandiriPositifUser {

    private WebDriver driver;
    private LoginPageHadirUser loginPageHadirUser;
    private RegistrasiPageHadirUser registrasiPageHadirUser;
    private LoginPageHadirAdmin loginPageHadirAdmin;
    private HomePageHadirAdmin homePageHadirAdmin;
    private PendaftaranSendiriPageHadirAdmin pendaftaranSendiriPageHadirAdmin;
    private PendaftaranSendiriEditPage pendaftaranSendiriEditPage;
    private HomePageHadirUser homePageHadirUser;
    private UserPageHadir userPageHadir;
    private KehadiranPageAdmin kehadiranPageAdmin;
    private static ExtentTest extentTest;
    private DataGenerator dataGenerator;
    private String dir;
    private String nik, namaLengkap, email, password ;
    private static List<String> inputDataList = new ArrayList<>();
    private static String nikInput = "";
    private static Random random = new Random();
    private String pathRootHasilDownloadUser;
    private String pathRootHasilDownloadAdmin;
    private static String fileDownloadImageCamera = "" ;
    private static String fileDownloadImageKehadiran = "";
    private String strLinkAbsenCamera;
    private String strLinkAbsenKehadiran;
    private SimpleDateFormat sdf;
    private static String dateToDay;
    private static String handleAwal;
    private ImageOnlinePage imageOnlinePage;

    public RegistrasiMandiriPositifUser() {
        this.driver = Test1Hooks.driver;
        String projek = System.getProperty("user.dir");
        pathRootHasilDownloadUser = projek + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "hasil-download-PageUser";
        pathRootHasilDownloadAdmin = projek + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "hasil-download-PageAdmin";
        File downloadDirUser = new File(pathRootHasilDownloadUser);
        File downloadDirAdmin = new File(pathRootHasilDownloadAdmin);
        loginPageHadirUser = new LoginPageHadirUser(driver);
        registrasiPageHadirUser = new RegistrasiPageHadirUser(driver);
        loginPageHadirAdmin = new LoginPageHadirAdmin(driver);
        homePageHadirAdmin = new HomePageHadirAdmin(driver);
        pendaftaranSendiriPageHadirAdmin = new PendaftaranSendiriPageHadirAdmin(driver);
        pendaftaranSendiriEditPage = new PendaftaranSendiriEditPage(driver);
        userPageHadir = new UserPageHadir(driver);
        homePageHadirUser = new HomePageHadirUser(driver);
        kehadiranPageAdmin = new KehadiranPageAdmin(driver);
        imageOnlinePage = new ImageOnlinePage(driver);
        extentTest = Test1Hooks.extentTest;
        sdf = new SimpleDateFormat("dd-MM-yyyy");
        dateToDay = sdf.format(new Date());
        dir = System.getProperty("user.dir");
        dataGenerator = new DataGenerator();
        nik = dataGenerator.dataNoKTP();
        namaLengkap = dataGenerator.dataNamaLengkap();
        email = dataGenerator.dataEmail();
        password = dataGenerator.dataPassword();
        inputDataList.add(nik);
        inputDataList.add(namaLengkap);
        inputDataList.add(email);
        inputDataList.add(password);
//
    }


    @When("TRUMP021 Mengakses Halaman User")
    public void trump021_mengakses_halaman_user(){
        this.driver.get(Constants.URL_LOGIN2);
        extentTest.log(LogStatus.PASS, "TRUMP021 Mengakses Halaman User");
    }

    @And("TRUMP021 Validasi Setelah Berada Di Halaman Login")
    public void trump021_validasi_setelah_berada_di_halaman_login(){
        this.driver.get(Constants.URL_LOGIN2);
        boolean boolValidLoginUser = loginPageHadirUser.getFormLogin().isDisplayed();
        if (boolValidLoginUser == true) {
            extentTest.log(LogStatus.PASS, "TRUMP021 Validasi Setelah Berada Di Halaman Login");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP021 Validasi Setelah Berada Di Halaman Login");
        }
    }
    @And ("TRUMP021 Tekan link Untuk Menuju Halaman Registrasi")
    public void trump021_tekan_link_untuk_menuju_halaman_registrasi(){
        loginPageHadirUser.getBtnToRegist().click();
        extentTest.log(LogStatus.PASS, "TRUMP021 Tekan link Untuk Menuju Halaman Registrasi");
    }
    @And("TRUMP021 Validasi Setelah Berada Di Halaman Registrasi")
    public void trump021_validasi_setelah_berada_di_halaman_registrasi(){
        WebElement contForm = registrasiPageHadirUser.getFormRegis();
        boolean boolValid = contForm.isDisplayed();
        if (boolValid == true){
            extentTest.log(LogStatus.PASS, "TRUMP021 Validasi Setelah Berada Di Halaman Registrasi");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP021 Validasi Setelah Berada Di Halaman Registrasi");
        }
    }
    @And ("TRUMP021 Clear Seluruh Field")
    public void trump021_clear_seluruh_field(){
        registrasiPageHadirUser.getInputNik().clear();
        registrasiPageHadirUser.getInputFullNama().clear();
        registrasiPageHadirUser.getInputEmail().clear();
        registrasiPageHadirUser.getInputPassword().clear();
        registrasiPageHadirUser.getInputFile().clear();
        extentTest.log(LogStatus.PASS, "TRUMP021 Clear Seluruh Field");
    }
    @And ("TRUMP021 Input Nik Di Field Nik")
    public void trump021_input_nik_di_field_nik(){
        nikInput = inputDataList.get(0);
        registrasiPageHadirUser.getInputNik().sendKeys(nikInput);
        //inputDataList.add(nik);
        extentTest.log(LogStatus.PASS, "TRUMP021 Input Nik Di Field Nik");
    }
    @And ("TRUMP021 Input Nama Lengkap Di Field Nama Lengkap")
    public void trump021_input_nama_lengkap_di_field_nama_lengkap(){
        registrasiPageHadirUser.getInputFullNama().sendKeys(inputDataList.get(1));
        extentTest.log(LogStatus.PASS, "TRUMP021 Input Nama Lengkap Di Field Nama Lengkap");
    }
    @And ("TRUMP021 Input Email Di Field Email")
    public void trump021_input_email_di_field_email(){
        registrasiPageHadirUser.getInputEmail().sendKeys(inputDataList.get(2));
        System.out.println(inputDataList.get(2));
        extentTest.log(LogStatus.PASS, "TRUMP021 Input Email Di Field Email");
    }
    @And ("TRUMP021 Input Password Di Field Password")
    public void trump021_input_password_di_field_password(){
        registrasiPageHadirUser.getInputPassword().sendKeys(inputDataList.get(3));
        System.out.println(inputDataList.get(3));
        extentTest.log(LogStatus.PASS, "TRUMP021 Input Password Di Field Password");
    }
    @And ("TRUMP021 Scroll Ke Akhir Page")
    public void trump021_scroll_ke_akhir_page(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        extentTest.log(LogStatus.PASS, "TRUMP021 Scroll Ke Akhir Page");
    }

    @And ("TRUMP021 Input Gambar Di Field Gambar")
    public void trump021_input_gambar_di_field_gambar(){
        registrasiPageHadirUser.getInputFile().sendKeys(dir + "\\src\\main\\resources\\DataImage\\1nf.PNG");
        extentTest.log(LogStatus.PASS, "TRUMP021 Input Gambar Di Field Gambar");
    }
    @And("TRUMP021 Tekan Tombol Daftar")
    public void trump021_tekan_tombol_daftar(){
        registrasiPageHadirUser.getBtnDaftar().click();
        extentTest.log(LogStatus.PASS, "TRUMP021 Tekan Tombol Daftar");
    }
    @And("TRUMP021 Validasi Setelah Tombol Daftar Di Tekan")
    public void trump021validasi_setelah_tombol_daftar_di_tekan(){
        String validasiSetelahRegis = registrasiPageHadirUser.getTxtAlertRegis()==null?"":registrasiPageHadirUser.getTxtAlertRegis().getText();
        Assert.assertEquals(validasiSetelahRegis, "berhasil register, silahkan menunggu di approve oleh admin");
        extentTest.log(LogStatus.PASS, "TRUMP021Validasi Setelah Tombol Daftar Di Tekan");
    }

    @And("TRUMP022 Mengakses Halaman Admin")
    public void trump022_mengakses_halaman_admin(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TRUMP022 Mengakses Halaman Admin");
    }
    @And ("TRUMP022 Validasi Halaman Login Admin")
    public void trump022_validasi_halaman_login_admin(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TRUMP022 Validasi Halaman Login Admin");
    }
    @And ("TRUMP022 Clear Field Email Dan Password")
    public void trump022_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TRUMP022 Clear Field Email Dan Password");
    }
    @And ("TRUMP022 Input Email Valid")
    public void trump022_input_email_valid(){
        loginPageHadirAdmin.getInputEmail().sendKeys("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Email Valid");
    }
    @And ("TRUMP022 Input Password Valid")
    public void trump022_input_password_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Password Valid");
    }
    @And("TRUMP022 Menekan Tombol Login")
    public void trump022_menekan_tombol_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TRUMP022 Menekan Tombol Login");
    }
    @And ("TRUMP022 Validasi Halaman Home Admin")
    public void trump022_validasi_halaman_home_admin(){
        WebElement validasi2 = homePageHadirAdmin.getContainer1();
        boolean bolValidAdmin = validasi2.isDisplayed();
        if (bolValidAdmin == true){
            extentTest.log(LogStatus.PASS, "TRUMP022 Validasi Halaman Home Admin");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP022 Validasi Halaman Home Admin");
        }
    }
    @And ("TRUMP022 Tekan Nav Managemant User")
    public void trump022_tekan_nav_managemant_user(){
        homePageHadirAdmin.getSideManagemant().click();
        extentTest.log(LogStatus.PASS, "TRUMP022 Tekan Nav Managemant User");
    }
    @And ("TRUMP022 Tekan Nav Pendaftaran Sendiri")
    public void trump022_tekan_nav_pendaftaran_sendiri(){
        homePageHadirAdmin.getSidePendaftaranSendiri().click();
        extentTest.log(LogStatus.PASS, "TRUMP022 Tekan Nav Pendaftaran Sendiri");
    }
    @And("TRUMP022 Validasi Halaman Pendfatran Sendiri")
    public void trump022_validasi_halaman_pendfatran_sendiri(){
        WebElement validPagedftrsendiri = pendaftaranSendiriPageHadirAdmin.getContainerSerch();
        boolean validContain = validPagedftrsendiri.isDisplayed();
        if (validContain){
            extentTest.log(LogStatus.PASS, "TRUMP022 Validasi Halaman Pendfatran Sendiri");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP022 Validasi Halaman Pendfatran Sendiri");
        }
    }

    @And ("TRUMP022 Pengaturan Search Berdasarkan Nik")
    public void trump022_pengaturan_search_berdasarkan_nik(){
        pendaftaranSendiriPageHadirAdmin.getSearchBy().click();
        int jumlah = 0;
        while (true){
            jumlah = jumlah + 1;
            GlobalFunction.delay(10);
            if (!pendaftaranSendiriPageHadirAdmin.getSerchByListWebElement().isEmpty()){
                pendaftaranSendiriPageHadirAdmin.getSerchByListWebElement().get(1).click();
                extentTest.log(LogStatus.PASS, "TRUMP022 Pengaturan Search Berdasarkan Nik");
                break;
            } else if (jumlah == 10) {
                extentTest.log(LogStatus.FAIL, "TRUMP022 Pengaturan Search Berdasarkan Nik");
                break;

            }
        }

    }
    @And("TRUMP022 Input Nik Di Field Nik")
    public void trump022_input_nik_di_field_nik() {
        String nik = nikInput; // Mengambil NIK yang disimpan
        pendaftaranSendiriPageHadirAdmin.getInputSearch().sendKeys(nik);
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Nik Fi Field Nik");
    }

    @And("TRUMP022 Menekan Tombol Search")
    public void trump022_menekan_tombol_search(){
        pendaftaranSendiriPageHadirAdmin.getBtnSearch().click();
        extentTest.log(LogStatus.PASS, "TRUMP022 Menekan Tombol Search");
    }

    @And("TRUMP022 Validasi Hasil Search")
    public void trump022_validasi_hasil_search(){
       List<String> nikList = pendaftaranSendiriPageHadirAdmin.getNikDataTable();
       List<String> namaLengkapList = pendaftaranSendiriPageHadirAdmin.getNamaDataTable();
       List<String> emailList = pendaftaranSendiriPageHadirAdmin.getEmailDataTable();
       System.out.println(nikList.get(0));
       System.out.println(namaLengkapList.get(0));
       System.out.println(emailList.get(0));
       boolean validasiInputan = nikList.get(0).equalsIgnoreCase(inputDataList.get(0))
                            && namaLengkapList.get(0).equalsIgnoreCase(inputDataList.get(1))
                            && emailList.get(0).equalsIgnoreCase(inputDataList.get(2));
        System.out.println(validasiInputan);

        extentTest.log(LogStatus.PASS, "TRUMP022 Validasi Hasil Search");
    }

    @And("TRUMP022 Klik Button View")
    public void trump022_klik_button_view(){
      List<WebElement> btnView = pendaftaranSendiriPageHadirAdmin.getBtnViewDataTable();
      btnView.get(0).click();
        extentTest.log(LogStatus.PASS, "TRUMP022 Klik Button View");
    }

    @And("TRUMP022 Validasi From Input Pendaftaran Sendiri")
    public void trump022_validasi_from_input_pendaftaran_sendiri(){
        String strNik = nikInput;
        String strNikInput = pendaftaranSendiriEditPage.getInputNik().getAttribute("value");
        System.out.println(registrasiPageHadirUser);

        boolean validasi = strNik.equalsIgnoreCase(strNikInput);
        System.out.println(validasi);
        if (validasi == true){
            extentTest.log(LogStatus.PASS, "TRUMP022 Validasi From Input Pendaftaran Sendiri");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP022 Validasi From Input Pendaftaran Sendiri gagal");
        }

    }

    @And("TRUMP022 Input Divisi")
    public void trump022_input_divisi(){

        pendaftaranSendiriEditPage.getInputDivisi().click();
        pendaftaranSendiriEditPage.getInputDivisi().sendKeys(Keys.DOWN);
        pendaftaranSendiriEditPage.getInputDivisi().sendKeys(Keys.RETURN);


        extentTest.log(LogStatus.PASS, "TRUMP022 Input Divisi");
    }
    @And("TRUMP022 Input Unit")
    public void trump022_input_unit(){
        pendaftaranSendiriEditPage.getInputUnit().click();

                    pendaftaranSendiriEditPage.getInputUnit().sendKeys(Keys.DOWN);
                    pendaftaranSendiriEditPage.getInputUnit().sendKeys(Keys.RETURN);

        extentTest.log(LogStatus.PASS, "TRUMP022 Input Unit");
    }
    @And("TRUMP022 Input Tipe Kontrak")
    public void trump022_input_tipe_kontrak(){
        pendaftaranSendiriEditPage.getInputTipeKontrak().click();
        while(true){
            pendaftaranSendiriEditPage.getInputTipeKontrak().sendKeys(Keys.DOWN);
            pendaftaranSendiriEditPage.getInputTipeKontrak().sendKeys(Keys.RETURN);

            int asci = 0;
            for (int i = 0; i < pendaftaranSendiriEditPage.getInputTipeKontrak().getAttribute("value").trim().length(); i++) {
                asci = asci + (int) pendaftaranSendiriEditPage.getInputTipeKontrak().getAttribute("value").trim().charAt(i);
            }
            if(asci == 326){
                extentTest.log(LogStatus.PASS, "TRUMP022 Input Tipe Kontrak");
                break;
            }else{
                //System.out.println("ASCII : "+asci);
                //System.out.println("Kontrak : " + pendaftaranSendiriPageHadirAdmin.getTxtFieldTipeKontrak().getAttribute("value"));
                pendaftaranSendiriEditPage.getInputTipeKontrak().sendKeys(Keys.DOWN);
            }
            GlobalFunction.delay(3);
        }
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Tipe Kontrak");
    }

    @And("TRUMP022 Input Posisi Kerja")
    public void trump022_input_posisi_kerja(){
        pendaftaranSendiriEditPage.getInputPosisiKerja().click();
                pendaftaranSendiriEditPage.getInputPosisiKerja().sendKeys(Keys.DOWN);
                pendaftaranSendiriEditPage.getInputPosisiKerja().sendKeys(Keys.RETURN);

        extentTest.log(LogStatus.PASS, "TRUMP022 Input Posisi Kerja");
    }

    @And("TRUMP022 Input Jabatan")
    public void trump022_input_jabatan(){
        pendaftaranSendiriEditPage.getInputJabatan().click();

                pendaftaranSendiriEditPage.getInputJabatan().sendKeys(Keys.DOWN);
                pendaftaranSendiriEditPage.getInputJabatan().sendKeys(Keys.RETURN);

        extentTest.log(LogStatus.PASS, "TRUMP022 Input Jabatan");
    }

    @And("TRUMP022 Input Atasan")
    public void trump022_input_atasan(){
        pendaftaranSendiriEditPage.getInputAtasan().click();

        for (int i = 0; i <= 3 ; i++) {
                pendaftaranSendiriEditPage.getInputAtasan().sendKeys(Keys.DOWN);
                if (i == 3){
                    pendaftaranSendiriEditPage.getInputAtasan().sendKeys(Keys.RETURN);
                }
        }

        extentTest.log(LogStatus.PASS, "TRUMP022 Input Atasan");
    }
    @And("TRUMP022 Input Atasan V2")
    public void trump022_input_atasan_v2(){
        pendaftaranSendiriEditPage.getInputAtasanV2().click();
        while (true){
            if (pendaftaranSendiriEditPage.getInputAtasanV2()!=null){
                pendaftaranSendiriEditPage.getInputAtasanV2().sendKeys(Keys.DOWN);
                pendaftaranSendiriEditPage.getInputAtasanV2().sendKeys(Keys.RETURN);
                break;
            }
        }
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Atasan V2");
    }

    @And("TRUMP022 Input Atsan V3")
    public void trump022_input_atsan_v3(){
        pendaftaranSendiriEditPage.getInputAtasanV3().click();
        while (true){
            if (pendaftaranSendiriEditPage.getInputAtasanV3()!=null){
                pendaftaranSendiriEditPage.getInputAtasanV3().sendKeys(Keys.DOWN);
                pendaftaranSendiriEditPage.getInputAtasanV3().sendKeys(Keys.RETURN);
                break;
            }
        }
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Atsan V3");
    }

    @And("TRUMP022 Input Lokasi Kerja")
    public void trump022_input_lokasi_kerja(){
        pendaftaranSendiriEditPage.getInputLokasiKerja().click();
                pendaftaranSendiriEditPage.getInputLokasiKerja().sendKeys(Keys.DOWN);
                pendaftaranSendiriEditPage.getInputLokasiKerja().sendKeys(Keys.RETURN);

        extentTest.log(LogStatus.PASS, "TRUMP022 Input Lokasi Kerja");
    }
    @And("TRUMP022 Input Jadwal Kerja")
    public void trump022_input_jadwal_kerja(){
        pendaftaranSendiriEditPage.getInputJadwalKerja().click();

                pendaftaranSendiriEditPage.getInputJadwalKerja().sendKeys(Keys.DOWN);
                pendaftaranSendiriEditPage.getInputJadwalKerja().sendKeys(Keys.RETURN);

        extentTest.log(LogStatus.PASS, "TRUMP022 Input Jadwal Kerja");
    }
    @And("TRUMP022 Input Selfi")
    public void trump022_input_selfi(){
        pendaftaranSendiriEditPage.getTxtFieldRequiredSelfie().click();
        while (true){

            if(!pendaftaranSendiriEditPage.getTxtFieldSelfieList().isEmpty()){
                pendaftaranSendiriEditPage.getTxtFieldSelfieList().get(0).click();
                extentTest.log(LogStatus.PASS, "TRUMP022 Input Selfi");
                break;
            }else{
                extentTest.log(LogStatus.FAIL, "TRUMP022 Input Selfi");
                break;
            }
        }
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Selfi");
    }
    @And("TRUMP022 Input Jumlah Cuti")
    public void trump022_input_jumlah_cuti(){
        pendaftaranSendiriEditPage.getInputJumlahCuti().clear();
        pendaftaranSendiriEditPage.getInputJumlahCuti().sendKeys("10");
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Jumlah Cuti");
    }


    @Then("TRUMP022 Tekan Button Submit")
    public void trump022_tekan_button_submit(){

            if (pendaftaranSendiriEditPage.getInputDivisi().getAttribute("value") != null
                    && pendaftaranSendiriEditPage.getInputTipeKontrak().getAttribute("value") != null
                    && pendaftaranSendiriEditPage.getInputJadwalKerja().getAttribute("value") != null) {

                extentTest.log(LogStatus.PASS, "TRUMP022 Tekan Button Submit");
                pendaftaranSendiriEditPage.getBtnSubmit().click();

            } else {
                extentTest.log(LogStatus.FAIL, "TRUMP022 Tekan Button Submit");
            }

    }

    @Then("TRUMP022 Validasi Setelah Submit")
    public void trump022_validasi_setelah_submit(){
        WebElement validPageuser = userPageHadir.getContainerSerchUser();
        boolean validContainUser = validPageuser.isDisplayed();
        if (validContainUser == true){
            extentTest.log(LogStatus.PASS,"TRUMP022 Validasi Setelah Submit");
        }
        else {
            extentTest.log(LogStatus.FAIL,"TRUMP022 Validasi Setelah Submit");

        }
    }

    @And("TRUMP023 Pencarian User Berdasarkan Nik")
    public void trump022_pencarian_user_berdasarkan_nik(){
        userPageHadir.getSearchByNik().click();
        int jumlah = 0;
        while (true){
            jumlah = jumlah + 1;
            GlobalFunction.delay(10);
            if (!userPageHadir.getSerchByListWebElementNik().isEmpty()){
                userPageHadir.getSerchByListWebElementNik().get(1).click();
                extentTest.log(LogStatus.PASS, "TRUMP023 Pencarian User Berdasarkan Nik");
                break;
            } else if (jumlah == 10) {
                extentTest.log(LogStatus.FAIL, "TRUMP023 Pencarian User Berdasarkan Nik");
                break;

            }
        }
    }
    @And("TRUMP023 Input Nik Di Pencarian User")
    public void trump022_input_nik_di_pencarian_user(){
        String nikCariUser = inputDataList.get(0);
        userPageHadir.getInputSearchUser().sendKeys(nikCariUser);
        extentTest.log(LogStatus.PASS, "TRUMP022 Input Nik Di Pencarian User");
    }

    @And("TRUMP023 Klik Button Search Di Page User")
    public void trump022_klik_button_search_user(){
        userPageHadir.getBtnSearchUser().click();
        extentTest.log(LogStatus.PASS, "Klik Button Search Di Page User");
    }

    @Then("TRUMP023 Validasi Hasil Pencarian User")
    public void trump022_validasi_hasil_pencarian_user(){
        String strNik = userPageHadir.getTableDataNik();
        boolean valid1 = strNik.equalsIgnoreCase(nikInput);
        if(valid1 == true){
            extentTest.log(LogStatus.PASS, "TRUMP022 Validasi Hasil Pencarian User");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP022 Validasi Hasil Pencarian User");
        }
    }

    @And("TRUMP023 Klik Dropspan Profil")
    public void trump023_klik_dropspan_profil(){
        homePageHadirAdmin.getSpanUser().click();
        extentTest.log(LogStatus.PASS, "TRUMP023 Klik Dropspan Profil");
    }
    @And("TRUMP023 Klik Dropdown Logout")
    public void trump023_klik_dropdown_logout(){
        homePageHadirAdmin.getBtnLogOut().click();
        extentTest.log(LogStatus.PASS, "TRUMP023 Klik Dropdown Logout");
    }
    @Then("TRUMP023 Validasi Berhasil Logout")
    public void trump023_validasi_berhasil_logout(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TRUMP023 Validasi Berhasil Logout");
    }

    @When("TRUMP024 Akses Halaman Url Login User")
    public void trump024_akses_halaman_url_login_user(){
        this.driver.get(Constants.URL_LOGIN2);
        extentTest.log(LogStatus.PASS, "TRUMP024 Akses Halaman Url Login User");
    }
    @And("TRUMP024 Validasi Halaman Login User")
    public void trump024_validasi_halaman_login_user(){
        boolean boolValidLoginUser = loginPageHadirUser.getFormLogin().isDisplayed();
        if (boolValidLoginUser == true) {
            extentTest.log(LogStatus.PASS, "TRUMP024 Validasi Halaman Login User");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP024 Validasi Halaman Login User");

        }
    }
    @And("TRUMP024 Clear Field Inputan Dihalaman Login")
    public void trump024_clear_field_inputan_dihalaman_login(){
        loginPageHadirUser.getInputEmail().clear();
        loginPageHadirUser.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TRUMP024 Clear Field Inputan Dihalaman Login");
    }
    @And("TRUMP024 Input Field Email Yang Sudah Di Daftarkan")
    public void trump024_input_field_email_yang_sudah_di_daftarkan(){
        loginPageHadirUser.getInputEmail().sendKeys(inputDataList.get(2));
        extentTest.log(LogStatus.PASS, "TRUMP024 Input Field Email Yang Sudah Di Daftarkan");
    }
    @And("TRUMP024 Input Field Password Yang Sudah Di Daftarkan")
    public void trump024_input_field_password_yang_sudah_di_daftarkan(){
        loginPageHadirUser.getInputPassword().sendKeys(inputDataList.get(3));
        extentTest.log(LogStatus.PASS, "TRUMP024 Input Field Password Yang Sudah Di Daftarkan");
    }
    @And("TRUMP024 Klik Button Login")
    public void trump024_klik_button_login(){
        loginPageHadirUser.getBtnMasuk().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Klik Button Login");
    }
    @And("TRUMP024 Validasi Halaman Home User")
    public void trump024_validasi_halaman_home_user(){
        WebElement validasi = homePageHadirUser.getValidasiHomePage();
        Assert.assertTrue(validasi.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TRUMP024 Validasi Halaman Home User");
    }

    @And("TRUMP024 Tekan Tombol Absen")
    public void trump024_tekan_tombol_absen(){
        homePageHadirUser.getBtnAbsenMasuk().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Tekan Tombol Absen");
    }
    @And("TRUMP024 Tekan Tombol Camera")
    public void trump024_tekan_tombol_camera(){
        GlobalFunction.delay(10);
        //driver.switchTo().alert().accept();
        homePageHadirUser.getBtnCamera().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Tekan Tombol Camera");
    }


    @And("TRUMP024 Input Notes")
    public void trump024_input_notes(){
        homePageHadirUser.getFieldNotes().sendKeys(String.valueOf(random.nextInt(100000000,999999999)));
        extentTest.log(LogStatus.PASS, "TRUMP024 Input Notes");
    }

    @And("TRUMP024 Tekan Button Submit Absen Masuk")
    public void trump024_tekan_button_submit_absen_masuk(){
        homePageHadirUser.getBtnSubmitAbsenMasuk().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Tekan Button Submit Absen Masuk");
    }

    @And("TRUMP024 Tekan Button Absen Keluar")
    public void trump024_tekan_button_absen_keluar(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", homePageHadirUser.getBtnAbsenKeluar());
        homePageHadirUser.getBtnAbsenKeluar().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Tekan Button Absen Keluar");
    }

    @And("TRUMP024 Input Notes Absen Keluar")
    public void trump024_input_notes_absen_keluar(){
        homePageHadirUser.getTxtAreaNotes().sendKeys(String.valueOf(random.nextInt(100000000,999999999)));
        extentTest.log(LogStatus.PASS, "TRUMP024 Input Notes Absen Keluar");
    }

    @And("TRUMP024 Tekan Button Submit Absen Pulang")
    public void trump024_tekan_button_submit_pulang(){
        homePageHadirUser.getBtnSubmitAbsenKeluar().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Tekan Button Submit Absen Pulang");
    }

    @And("TRUMP024 Download Image Hasil Absen")
    public void trump024_download_image_hasil_absen(){
        String namaFile = inputDataList.get(1).replaceAll("\\s+","");
        GlobalFunction.delay(10);
        fileDownloadImageCamera = pathRootHasilDownloadUser +"\\"+new SimpleDateFormat("ddmmyyyyHHMMssSSS").format(new Date())+namaFile+"_HasilCamera.jpg";
        strLinkAbsenCamera = homePageHadirUser.getImageGambar()==null?"":homePageHadirUser.getImageGambar().getAttribute("src");
        if (strLinkAbsenCamera.equalsIgnoreCase("")){
            Assert.assertEquals("a","b","Link Gambar Tidak Ditemukan");
            return;
        }
        GlobalFunction.downloadImage(strLinkAbsenCamera,fileDownloadImageCamera);
        extentTest.log(LogStatus.PASS, "TRUMP024 Download Image Hasil Absen");
    }



    @And("TRUMP024 Tekan Tombol DropSpan User")
    public void trump024_tekan_tombol_dropspan_user(){
        homePageHadirUser.getSpanHomeUser().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Tekan Tombol DropSpan User");
    }
    @And("TRUMP024 Tekan Button Logout")
    public void trump024_tekan_button_logout(){
        homePageHadirUser.getBtnLogOutUser().click();
        extentTest.log(LogStatus.PASS, "TRUMP024 Tekan Button Logout");
    }
    @Then("TRUMP024 Validasi Berhasil logout")
    public void trump024_validasi_berhasil_logout(){
        WebElement validasiLogin = loginPageHadirUser.getFormLogin();
        boolean boolValidasi = validasiLogin.isDisplayed();
        Assert.assertTrue(boolValidasi);
        extentTest.log(LogStatus.PASS, "TRUMP024 Validasi Berhasil logout");
    }

    @When("TRUMP025 Mengakses Halaman Login Admin")
    public void trump025_mengakses_halaman_login_admin(){
        this.driver.get(Constants.URL_LOGIN1);
        extentTest.log(LogStatus.PASS, "TRUMP025 Mengakses Halaman Login Admin");
    }
    @And("TRUMP025 Validasi Halaman Login Admin")
    public void trump025_validasi_halaman_login_admin(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TRUMP025 Validasi Halaman Login Admin");
    }
    @And("TRUMP025 Clear Field Email Dan Password")
    public void trump025_clear_field_email_dan_password(){
        loginPageHadirAdmin.getInputEmail().clear();
        loginPageHadirAdmin.getInputPassword().clear();
        extentTest.log(LogStatus.PASS, "TRUMP025 Clear Field Email Dan Password");
    }
    @And("TRUMP025 Input Email Valid")
    public void trump025_input_email_valid(){
        loginPageHadirAdmin.getInputEmail().sendKeys("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "TRUMP025 Input Email Valid");
    }
    @And("TRUMP025 Input Password Valid")
    public void trump025_input_password_valid(){
        loginPageHadirAdmin.getInputPassword().sendKeys("admin@hadir");
        extentTest.log(LogStatus.PASS, "TRUMP025 Input Password Valid");
    }
    @And("TRUMP025 Klik Button login")
    public void trump025_klik_button_login(){
        loginPageHadirAdmin.getBtnLogin().click();
        extentTest.log(LogStatus.PASS, "TRUMP025 Klik Button login");
    }
    @And("TRUMP025 Validasi Halaman Home Admin")
    public void trump025_validasi_halaman_home_admin(){
        WebElement validasi2 = homePageHadirAdmin.getContainer1();
        Assert.assertTrue(validasi2.isDisplayed(), "Container tidak tampil di halaman");
        extentTest.log(LogStatus.PASS, "TRUMP025 Validasi Halaman Home Admin");
    }
    @And("TRUMP025 Klik Side Bar Laporan")
    public void trump025_klik_side_bar_laporan(){
        homePageHadirAdmin.getSideLaporan().click();
        extentTest.log(LogStatus.PASS, "TRUMP025 Klik Side Bar Laporan");
    }
    @And("TRUMP025 Klik Sub Side Bar Kehadiran")
    public void trump025_klik_sub_side_bar_kehadiran(){
        homePageHadirAdmin.getSideKehadiran().click();
        extentTest.log(LogStatus.PASS, "TRUMP025 Klik Sub Side Bar Kehadiran");
    }
    @And("TRUMP025 Validasi Halaman Kehadiran")
    public void trump025_validasi_halaman_kehadiran(){
        WebElement tbl_kehadiran = kehadiranPageAdmin.getTableKehadiran();
        boolean bool_pageKehadiran = tbl_kehadiran.isDisplayed();
        System.out.println(bool_pageKehadiran);
        Assert.assertTrue(bool_pageKehadiran);
        extentTest.log(LogStatus.PASS, "TRUMP025 Validasi Halaman Kehadiran");
    }
    @And("TRUMP025 Clear Field Nama Di Field Search")
    public void trump025_clear_field_nama_di_field_search(){
        kehadiranPageAdmin.getInputSeachKehadiran().clear();
        extentTest.log(LogStatus.PASS, "TRUMP025 Clear Field Nama Di Field Search");
    }
    @And("TRUMP025 Clear Field Start Date")
    public void trump025_clear_field_start_date(){
        kehadiranPageAdmin.getInputStartDateKehadiran().clear();
        extentTest.log(LogStatus.PASS, "TRUMP025 Clear Field Start Date");
    }
    @And("TRUMP025 Clear Field End Date")
    public void trump025_clear_field_end_date(){
        kehadiranPageAdmin.getInputEndDateKehadiran().clear();
        extentTest.log(LogStatus.PASS, "TRUMP025 Clear Field End Date");
    }
    @And("TRUMP025 Input Nama Di Field Search nama")
    public void trump025_input_nama_di_field_search_nama(){
        kehadiranPageAdmin.getInputSeachKehadiran().sendKeys(inputDataList.get(1));
        extentTest.log(LogStatus.PASS, "TRUMP025 Input Nama Di Field Search nama");
    }
    @And("TRUMP025 Input Start Date Di Field Star Date")
    public void trump025_input_start_date_di_field_star_date(){
        kehadiranPageAdmin.getInputStartDateKehadiran().sendKeys(dateToDay);
        extentTest.log(LogStatus.PASS, "TRUMP025 Input Start Date Di Field Star Date");
    }
    @And("TRUMP025 Input End Date DI Field End Date")
    public void trump025_input_end_date_di_field_end_date(){
        kehadiranPageAdmin.getInputEndDateKehadiran().sendKeys(dateToDay);
        extentTest.log(LogStatus.PASS, "TRUMP025 Input End Date DI Field End Date");
    }
    @And("TRUMP025 Klik Button Search")
    public void trump025_klik_button_search(){
        kehadiranPageAdmin.getBtnSearchKehadiran().click();
        extentTest.log(LogStatus.PASS, "TRUMP025 Klik Button Search");
    }
    @And("TRUMP025 Validasi Hasil Search")
    public void trump025_validasi_hasil_search(){
        List<String> listNamaLengkap = kehadiranPageAdmin.getDataNamaKehadiran();
        String namaLengkap = listNamaLengkap.get(0);
        boolean validasi = namaLengkap.equalsIgnoreCase(inputDataList.get(1));
        System.out.println(validasi);
        if (validasi == true){
            extentTest.log(LogStatus.PASS, "TRUMP025 Validasi Hasil Search");
        }else {
            extentTest.log(LogStatus.FAIL, "TRUMP025 Validasi Hasil Search");
        }
    }
    @And("TRUMP025 Download Image Di Page Admin")
    public void trump025_download_image_di_page_admin(){
        String namaFile = inputDataList.get(1).replaceAll("\\s+","");
        fileDownloadImageKehadiran = pathRootHasilDownloadAdmin + "\\" + new SimpleDateFormat("ddMMyyyyHHmmssSSS").format(new Date()) +namaFile+ "_HasilKehadiran.jpg";
        strLinkAbsenKehadiran = kehadiranPageAdmin.getImageTableKehadiran()==null?"src tidak di temukan": kehadiranPageAdmin.getImageTableKehadiran().getAttribute("src");
        System.out.println(strLinkAbsenKehadiran);
        GlobalFunction.downloadImage(strLinkAbsenKehadiran, fileDownloadImageKehadiran);

        extentTest.log(LogStatus.PASS, "TRUMP025 Download Image Di Page Admin");
    }
    @And("TRUMP025 Compare Kedua Gambar Ke Website Image Online")
    public void trump025_compare_kedua_gambar_ke_website_image_online(){
        handleAwal = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.imgonline.com.ua/eng/similarity-percent.php");
        imageOnlinePage.getUploadGambar1().sendKeys(fileDownloadImageCamera);
        imageOnlinePage.getUploadGambar2().sendKeys(fileDownloadImageKehadiran);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        imageOnlinePage.getBtnOk().click();
        extentTest.log(LogStatus.PASS, "TRUMP025 Compare Kedua Gambar Ke Website Image Online");
    }
    @And("TRUMP025 Validasi Hasil Compare")
    public void trump025_validasi_hasil_compare(){
        String hasilCompare = imageOnlinePage.getLabelResult()==null?"":imageOnlinePage.getLabelResult().getText();
        double doResult = Double.parseDouble(hasilCompare.replace(" %",""));
        boolean isValid = doResult>50;
        System.out.println(isValid);
        Assert.assertTrue(isValid,"Gambar tidak cocok!! Tingkat Kesamaan "+doResult);
        extentTest.log(LogStatus.PASS, "TRUMP025 Validasi Hasil Compare");
    }
    @And("TRUMP025 Tutup Web Image Online")
    public void trump025_tutup_web_image_online(){
        driver.close();
        extentTest.log(LogStatus.PASS, "TRUMP025 Tutup Web Image Online");
    }
    @And("TRUMP025 Kembali Ke Web Admin Hadir")
    public void trump025_kembali_ke_web_admin_hadir(){
        driver.switchTo().window(handleAwal);
        extentTest.log(LogStatus.PASS, "TRUMP025 Kembali Ke Web Admin Hadir");
    }
    @And("TRUMP025 Klik Button Dropspan Profil")
    public void trump025_klik_button_dropspan_profil(){
        homePageHadirAdmin.getSpanUser().click();
        extentTest.log(LogStatus.PASS, "TRUMP025 Klik Button Dropspan Profil");
    }
    @And("TRUMP025 Klik Button Logout Admin")
    public void trump025_klik_button_logout_admin(){
        homePageHadirAdmin.getBtnLogOut().click();
        extentTest.log(LogStatus.PASS, "TRUMP025 Klik Button Logout Admin");
    }
    @Then("TRUMP025 Validasi Berhasil logout")
    public void trump025_validasi_berhasil_logout(){
        String loginValidasi = loginPageHadirAdmin.getTxtLogin().getText();
        Assert.assertEquals(loginValidasi, "Login");
        extentTest.log(LogStatus.PASS, "TRUMP025 Validasi Berhasil logout");
    }

}





