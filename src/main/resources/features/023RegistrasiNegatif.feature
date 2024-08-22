Feature: Registrasi User Negatif
  Scenario: TRUMN023 User Input Dengan Semua Data Kosong
    Given TRUMN023 Mengakses Halaman Login User
    And TRUMN023 Validasi Halaman Login User
    And TRUMN023 Klik Link Menuju Halaman Registrasi
    And TRUMN023 Validasi Halaman Registrasi
    And TRUMN023 Clear seluruh Inputan Registrasi
    And TRUMN023 Input Field Nik Empty
    And TRUMN023 Input Field Nama Lengkap Empty
    And TRUMN023 Input Field Email Empty
    And TRUMN023 Input Field Password Empty
    And TRUMN023 Klik Button Daftar
    Then TRUMN023 Validasi Setelah Di Klik

  Scenario: TRUMN024 User Input Email Tidak Sesuai Format
    When TRUMN024 Clear seluruh Inputan Registrasi
    And TRUMN024 Input Field Nik
    And TRUMN024 Input Field Nama Lengkap
    And TRUMN024 Input Field Email Tidak Sesuai Format
    And TRUMN024 Input Field Password
    And TRUMN024 Input Field Image
    And TRUMN024 Klik Button Daftar
    Then TRUMN024 Validasi Setelah Di Klik






    
    
