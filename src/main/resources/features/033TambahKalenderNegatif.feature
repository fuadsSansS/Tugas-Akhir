Feature: Tambah Kalender Negaitf
  Scenario: TTNK033 Tambah Kalender Dengan Inputan Kosong
    Given TTNK033 Akses Halaman Login Admin
    And TTNK033 Validasi Halaman Admin Login
    And TTNK033 Clear Field Email Dan Password
    And TTNK033 Input Email Valid
    And TTNK033 Input Password Valid
    And TTNK033 Klik Button Login
    And TTNK033 Validasi Halaman Home Admin
    And TTNK033 Klik Side Bar Managemant
    And TTNK033 Klik Sub Side Bar Kalender
    And TTNK033 Validasi Halaman Kalender
    And TTNK033 Klik Button Tambah Kalender
    And TTNK033 Input Empty Nama Kalender
    And TTNK033 Tekan Tambah Kalender
    Then TTNK033 Validasi Pesan Error

    



    