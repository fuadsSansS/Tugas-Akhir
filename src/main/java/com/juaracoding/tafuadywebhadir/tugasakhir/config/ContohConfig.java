package com.juaracoding.tafuadywebhadir.tugasakhir.config;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on 09/08/2024
@Author Acer a.k.a. Fuady Wahyudi
Java Developer
Created on 09/08/2024 19:11
@Last Modified 09/08/2024 19:11
Version 1.0
*/
public class ContohConfig {


    private static String baseUrl;
    private static String path;

    public ContohConfig(String baseUrl, String path) {
        this.baseUrl = baseUrl;
        this.path= path;
    }


    public static String getBaseUrl() {
        return baseUrl;
    }

    public static String getPath() {
        return path;
    }


}





