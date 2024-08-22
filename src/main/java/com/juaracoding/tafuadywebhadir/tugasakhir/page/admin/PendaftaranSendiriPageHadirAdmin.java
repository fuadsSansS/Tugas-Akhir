package com.juaracoding.tafuadywebhadir.tugasakhir.page.admin;

import com.juaracoding.tafuadywebhadir.tugasakhir.impl.Test1Hooks;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants;
import com.juaracoding.tafuadywebhadir.tugasakhir.util.GlobalFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.juaracoding.tafuadywebhadir.tugasakhir.util.Constants.TIMEOUT_DELAY;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 14/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 14/08/2024 19:05
@Last Modified 14/08/2024 19:05
Version 1.0
*/
public class PendaftaranSendiriPageHadirAdmin {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[1]/div")
    private WebElement containerSerch;

    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;

    @FindBy(xpath = "//div[normalize-space()='Nama']")
    private WebElement searchBy;

    @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]")
    private WebElement ulListSerchBy;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div[2]/div/div[2]/div/table/tbody")
    WebElement tableDaftarSendiri;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSearch;


    public PendaftaranSendiriPageHadirAdmin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getContainerSerch() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(containerSerch));
    }


    public WebElement getInputSearch() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(inputSearch));
    }

    public WebElement getSearchBy() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(searchBy));
    }

    public WebElement getBtnSearch() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSearch));
    }

    public List<String> getSerchByList() {
        //buat array list
        List<String> serchBy = new ArrayList<>();
        //Waktu Tunggu untuk menemukan element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY));
        try {
            //buat list objek untuk menampung element
            //isi dari list adalah element ul dan untuk mnampung niali li
            List<WebElement> optionElements = ulListSerchBy.findElements(By.tagName("li"));
            // Iterasi dan ambil teks dari setiap elemen <option>
            for (WebElement option : optionElements) {
                //menambahkan ke dalam list searchby, nilai dari data value
                serchBy.add(option.getAttribute("data-value").trim());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return serchBy;
    }

    // Method untuk mendapatkan daftar WebElement dari elemen-elemen <li> dalam sebuah <ul> tertentu
    public List<WebElement> getSerchByListWebElement() {
        // Inisialisasi List untuk menyimpan WebElement yang ditemukan
        List<WebElement> serchBy = new ArrayList<>();

        // Membuat WebDriverWait dengan timeout yang ditentukan dalam TIMEOUT_DELAY
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DELAY));

        try {
            // Temukan semua elemen <li> di dalam elemen <ul> yang diidentifikasi oleh 'ulListSerchBy'
            List<WebElement> optionElements = ulListSerchBy.findElements(By.tagName("li"));

            // Iterasi melalui setiap elemen <li> yang ditemukan
            for (WebElement option : optionElements) {
                // Tambahkan elemen <li> ke dalam List 'serchBy'
                serchBy.add(option);
            }

        } catch (Exception e) {
            // Tangkap dan cetak stack trace jika terjadi kesalahan selama eksekusi
            e.printStackTrace();
        }

        // Kembalikan List berisi WebElement yang ditemukan
        return serchBy;
    }

    public WebElement getTableDaftarSendiri() {
        GlobalFunction.delay(TIMEOUT_DELAY);
        return new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(tableDaftarSendiri));
    }

    public List<String> getNikDataTable(){
        List<String>tableData = new ArrayList<>();
        List<WebElement> rows = getTableDaftarSendiri().findElements(By.tagName("tr"));
        List<WebElement> cells = rows.get(0).findElements(By.tagName("td"));
        String nik = "";
        nik =  cells.get(2).getText();
        tableData.add(nik);
        return tableData;
    }

    public List<String> getNamaDataTable(){
        List<String>tableData = new ArrayList<>();
        List<WebElement> rows = getTableDaftarSendiri().findElements(By.tagName("tr"));
        List<WebElement> cells = rows.get(0).findElements(By.tagName("td"));
        String namaLengkap = "";
        namaLengkap =  cells.get(1).getText();
        tableData.add(namaLengkap);
        return tableData;
    }

    public List<String> getEmailDataTable(){
        List<String>tableData = new ArrayList<>();
        List<WebElement> rows = getTableDaftarSendiri().findElements(By.tagName("tr"));
        List<WebElement> cells = rows.get(0).findElements(By.tagName("td"));
        String email = "";
        email =  cells.get(3).getText();
        tableData.add(email);
        return tableData;
    }

    public List<WebElement> getBtnViewDataTable(){
        List<WebElement> btnViewList = new ArrayList<>();
        List<WebElement> rows = getTableDaftarSendiri().findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            // Memastikan bahwa ada cukup sel di baris
            if (cells.size() > 9) {
                List<WebElement> btnActions = cells.get(9).findElements(By.tagName("button"));
                if (!btnActions.isEmpty()) {
                    btnViewList.add(btnActions.get(0));
                }
            }
        }
        return btnViewList;
    }


}





