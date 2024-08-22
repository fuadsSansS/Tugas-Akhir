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
//   generateLoginPositif();

        generateVerifikasiPositif();
    }

    public static void  generateLoginPositif(){
        String [] strFunction = {
                "And TTPK031 Input Nama Kalender Field Search",
                "And TTPK031 Tekan Button Search",


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
                "@And",
                "@And",
                "@And",
                "@Then",
        };

        String [] strFunction = {
                "TCUP050 Clear Input Search Upliner",
                "TCUP050 Input Field Search Upliner",
                "TCUP050 Klik Button Submit Search",
                "TCUP050 Validasi Hasil Yang Di Tambahkan",
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






