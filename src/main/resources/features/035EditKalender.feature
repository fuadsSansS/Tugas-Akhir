Feature: Edit Kalender
  Scenario: TEPK035 Edit Kalender Kalender
    Given TEPK035 Akses Halaman Login Admin
    And TEPK035 Validasi Halaman Admin Login
    And TEPK035 Clear Field Email Dan Password
    And TEPK035 Input Email Valid
    And TEPK035 Input Password Valid
    And TEPK035 Klik Button Login
    And TEPK035 Validasi Halaman Home Admin
    And TEPK035 Klik Side Bar Managemant
    And TEPK035 Klik Sub Side Bar Kalender
    And TEPK035 Validasi Halaman Kalender
    And TEPK035 Clear Input Field Search
    And TEPK035 Input Field Search
    And TEPK035 Tekan Button Search
    And TEPK035 Validasi Hasil Search
    And TEPK035 Klik Button Opsi
    And TEPK035 Klik Button Edit Kalender
    And TEPK035 Clear Field Edit
    And TEPK035 Input Nama Kalender Baru
    Then TEPK035 Tekan Simpan Perubahan Kalender
    When TEPK035 Clear Search Nama Kalender
    And TEPK035 Input Nama Kalender Yang Sudah Di Edit
    And TEPK035 Klik Button Search
    Then TEPK035 Validasi Edit Kalender
