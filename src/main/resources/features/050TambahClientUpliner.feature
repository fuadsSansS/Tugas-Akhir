Feature: Tambah Client Upliner
  Scenario: TCUP050 Menambahkan Client Upliner Baru
    Given TCUP050 Berada Di Halaman Login
    And TCUP050 Validasi Halaman Login Admin
    And TCUP050 Membersihkan Input Email Dan Password
    And TCUP050 Mengisi Input Email Admin
    And TCUP050 Mengisi Input Password Admin
    And TCUP050 Mengklik Tombol Login
    And TCUP050 Berhasil Masuk Ke Halaman Home
    And TCUP050 Mengklik Menu Sidebar Management
    And TCUP050 Mengklik Submenu Client Upliner
    And TCUP050 Berhasil Masuk Ke Halaman Client Upliner
    And TCUP050 Mengklik Tombol Tambah Client Upliner
    And TCUP050 Halaman Tambah Client Upliner Ditampilkan
    And TCUP050 Mengisi Input Nama
    And TCUP050 Mengisi Input Email
    And TCUP050 Mengisi Input Password
    And TCUP050 Mengisi Input Unit
    And TCUP050 Mengisi Input Client Upliner
    And TCUP050 Mengklik Tombol Submit
    And TCUP050 Clear Input Search Upliner
    And TCUP050 Input Field Search Upliner
    And TCUP050 Klik Button Submit Search
    Then TCUP050 Validasi Hasil Yang Di Tambahkan


