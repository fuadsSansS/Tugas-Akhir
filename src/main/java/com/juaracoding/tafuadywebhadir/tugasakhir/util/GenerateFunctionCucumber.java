package com.juaracoding.tafuadywebhadir.tugasakhir.util;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 09/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 09/08/2024 15:04
@Last Modified 09/08/2024 15:04
Version 1.0
*/



public class GenerateFunctionCucumber {

    public static void main(String[] args) {
   //    generateLoginPositif();

        generateVerifikasiPositif();
    }

    public static void  generateLoginPositif(){
        String [] strFunction = {
                "And TRUMP022 Input Nik Fi Field Nik",


        };

        for (int i = 0; i < strFunction.length; i++) {
            System.out.println("(\""+strFunction[i]+"\")");
            System.out.println("public void "+strFunction[i].replace(" ","_").toLowerCase()+"(){\n");
            System.out.println("extentTest.log(LogStatus.PASS, \""+strFunction[i]+"\");");
            System.out.println("}");
        }
    }


    public static void  generateVerifikasiPositif(){
        String [] strPrefix = {
                "@Given",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@And",
                "@Then",
        };

        String [] strFunction = {
                "TRUMP025 Mengakses Halaman Login Admin",
                "TRUMP025 Validasi Halaman Login Admin",
                "TRUMP025 Clear Field Email Dan Password",
                "TRUMP025 Input Email Valid",
                "TRUMP025 Input Password Valid",
                "TRUMP025 Klik Button login",
                "TRUMP025 Validasi Halaman Home Admin",
                "TRUMP025 Klik Side Bar Laporan",
                "TRUMP025 Klik Sub Side Bar Kehadiran",
                "TRUMP025 Validasi Halaman Kehadiran",
                "TRUMP025 Clear Field Nama Di Field Search",
                "TRUMP025 Clear Field Start Date",
                "TRUMP025 Clear Field End Date",
                "TRUMP025 Input Nama Di Field Search nama",
                "TRUMP025 Input Start Date Di Field Star Date",
                "TRUMP025 Input End Date DI Field End Date",
                "TRUMP025 Klik Button Search",
                "TRUMP025 Validasi Hasil Search",
                "TRUMP025 Download Image Di Page Admin",
                "TRUMP025 Compare Kedua Gambar Ke Website Image Online",
                "TRUMP025 Validasi Hasil Compare",
                "TRUMP025 Tutup Web Image Online",
                "TRUMP025 Kembali Ke Web Admin Hadir",
                "TRUMP025 Klik Button Dropspan Profil",
                "TRUMP025 Klik Button Logout Admin",
                "TRUMP025 Validasi Berhasil logout",
        };

        for (int i = 0; i < strFunction.length; i++) {
            String strFunctionz = strFunction[i].trim();
            System.out.println(strPrefix[i]+"(\""+strFunctionz+"\")");
            System.out.println("public void "+strFunctionz.replace(" ","_").toLowerCase()+"(){\n");
            System.out.println("extentTest.log(LogStatus.PASS, \""+strFunctionz+"\");");
            System.out.println("}");
        }
    }
}






