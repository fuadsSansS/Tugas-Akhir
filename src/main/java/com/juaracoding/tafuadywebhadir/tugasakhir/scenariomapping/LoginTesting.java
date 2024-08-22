package com.juaracoding.tafuadywebhadir.tugasakhir.scenariomapping;

public enum LoginTesting {

    T1("TLPA001 Valid Login"),
    T2("TLNA002 Login Dengan Email Dan Password Kosong"),
    T3("TLNA003 Login Dengan Email Tidak Valid"),
    T4("TLNA004 Login Dengan Password Tidak Valid"),
    T5("TLNA005 Login Dengan Format Email Yang Salah"),
    T6("TLPU011 Valid login user"),
    T7("TLNU012 Login dengan email dan password kosong"),
    T8("TLNU013 Login Dengan Email Tidak Valid"),
    T9("TLNU014 Login Dengan Password Tidak Valid"),
    T10("TLNU015 Login Dengan Format Email Yang Salah"),
    T11("TRUMP021 Proses Registrasi Positif dengan Semua Kolom Diisi dengan Benar"),
    T12("TRUMP022 Proses Kelengkapan Registrasi User"),
    T13("TRUMP023 Proses Aproval Data User"),
    T14("TRUMP024 Proses Login Dari User Yang Telah Di Regis Dan Absensi"),
    T15("TRUMP025 Validasi Absen"),
    T16("TRUMN023 User Input Dengan Semua Data Kosong"),
    T17("TRUMN024 User Input Email Tidak Sesuai Format"),
    T18("TTPK031 Tambah Kalender"),
    T19("TEPK035 Edit Kalender Kalender"),
    T20("TTNK033 Tambah Kalender Dengan Inputan Kosong"),
    T21("TCUP050 Menambahkan Client Upliner Baru");

    private String testName;

    private LoginTesting(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}