package com.juaracoding.tafuadywebhadir.tugasakhir.scenariomapping;

public enum LoginTesting {

//    T1("Tc0011 Valid Login");
//    T1("TLPA001 Valid Login"),
//    T2("TLNA002 Login Dengan Email Dan Password Kosong"),
//    T3("TLNA003 Login Dengan Email Tidak Valid"),
//    T4("TLNA004 Login Dengan Password Tidak Valid"),
//    T5("TLNA005 Login Dengan Format Email Yang Salah"),
//    T6("TLPU011 Valid login user"),
//    T7("TLNU012 Login dengan email dan password kosong"),
//    T8("TLNU013 Login Dengan Email Tidak Valid"),
//    T9("TLNU014 Login Dengan Password Tidak Valid"),
//    T10("TLNU015 Login Dengan Format Email Yang Salah");
    T1("TRUMP021 Proses Registrasi Positif dengan Semua Kolom Diisi dengan Benar"),
    T2("TRUMP022 Proses Kelengkapan Registrasi User"),
    T3("TRUMP023 Proses Aproval Data User"),
    T4("TRUMP024 Proses Login Dari User Yang Telah Di Regis Dan Absensi"),
    T5("TRUMP025 Validasi Absen");
//    T1("TTPK031 Tambah Kalender");

    private String testName;

    private LoginTesting(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}