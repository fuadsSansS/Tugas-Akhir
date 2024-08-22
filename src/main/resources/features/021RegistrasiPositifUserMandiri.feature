Feature: Registrasi positif User Mandiri
  Scenario: TRUMP021 Proses Registrasi Positif dengan Semua Kolom Diisi dengan Benar
    When TRUMP021 Mengakses Halaman User
    And TRUMP021 Validasi Setelah Berada Di Halaman Login
    And TRUMP021 Tekan link Untuk Menuju Halaman Registrasi
    And TRUMP021 Validasi Setelah Berada Di Halaman Registrasi
    And TRUMP021 Clear Seluruh Field
    And TRUMP021 Input Nik Di Field Nik
    And TRUMP021 Input Nama Lengkap Di Field Nama Lengkap
    And TRUMP021 Input Email Di Field Email
    And TRUMP021 Input Password Di Field Password
    And TRUMP021 Scroll Ke Akhir Page
    And TRUMP021 Input Gambar Di Field Gambar
    When TRUMP021 Tekan Tombol Daftar
    Then TRUMP021 Validasi Setelah Tombol Daftar Di Tekan

    Scenario: TRUMP022 Proses Kelengkapan Registrasi User
      When TRUMP022 Mengakses Halaman Admin
      And TRUMP022 Validasi Halaman Login Admin
      And TRUMP022 Clear Field Email Dan Password
      And TRUMP022 Input Email Valid
      And TRUMP022 Input Password Valid
      And TRUMP022 Menekan Tombol Login
      And TRUMP022 Validasi Halaman Home Admin
      And TRUMP022 Tekan Nav Managemant User
      And TRUMP022 Tekan Nav Pendaftaran Sendiri
      And TRUMP022 Validasi Halaman Pendfatran Sendiri
      And TRUMP022 Pengaturan Search Berdasarkan Nik
      And TRUMP022 Input Nik Di Field Nik
      And TRUMP022 Menekan Tombol Search
      And TRUMP022 Validasi Hasil Search
      And TRUMP022 Klik Button View
      And TRUMP022 Validasi From Input Pendaftaran Sendiri
      And TRUMP022 Input Divisi
      And TRUMP022 Input Unit
      And TRUMP022 Input Tipe Kontrak
      And TRUMP022 Input Posisi Kerja
      And TRUMP022 Input Jabatan
      And TRUMP022 Input Atasan
      And TRUMP022 Input Atasan V2
      And TRUMP022 Input Atsan V3
      And TRUMP022 Input Lokasi Kerja
      And TRUMP022 Input Jadwal Kerja
      And TRUMP022 Input Selfi
      And TRUMP022 Input Jumlah Cuti
      Then TRUMP022 Tekan Button Submit
      Then TRUMP022 Validasi Setelah Submit

      Scenario: TRUMP023 Proses Aproval Data User
        And TRUMP023 Pencarian User Berdasarkan Nik
        And TRUMP023 Input Nik Di Pencarian User
        And TRUMP023 Klik Button Search Di Page User
        And TRUMP023 Validasi Hasil Pencarian User
        And TRUMP023 Klik Dropspan Profil
        And TRUMP023 Klik Dropdown Logout
        Then TRUMP023 Validasi Berhasil Logout

      Scenario: TRUMP024 Proses Login Dari User Yang Telah Di Regis dan Absensi
        When TRUMP024 Akses Halaman Url Login User
        And TRUMP024 Validasi Halaman Login User
        And TRUMP024 Clear Field Inputan Dihalaman Login
        And TRUMP024 Input Field Email Yang Sudah Di Daftarkan
        And TRUMP024 Input Field Password Yang Sudah Di Daftarkan
        And TRUMP024 Klik Button Login
        And TRUMP024 Validasi Halaman Home User
        And TRUMP024 Tekan Tombol Absen
        And TRUMP024 Tekan Tombol Camera
        And TRUMP024 Input Notes
        And TRUMP024 Tekan Button Submit Absen Masuk
        And TRUMP024 Tekan Button Absen Keluar
        And TRUMP024 Input Notes Absen Keluar
        And TRUMP024 Tekan Button Submit Absen Pulang
        And TRUMP024 Download Image Hasil Absen
        And TRUMP024 Tekan Tombol DropSpan User
        And TRUMP024 Tekan Button Logout
        Then TRUMP024 Validasi Berhasil logout

      Scenario: TRUMP025 Validasi Absen
        When TRUMP025 Mengakses Halaman Login Admin
        And TRUMP025 Validasi Halaman Login Admin
        And TRUMP025 Clear Field Email Dan Password
        And TRUMP025 Input Email Valid
        And TRUMP025 Input Password Valid
        And TRUMP025 Klik Button login
        And TRUMP025 Validasi Halaman Home Admin
        And TRUMP025 Klik Side Bar Laporan
        And TRUMP025 Klik Sub Side Bar Kehadiran
        And TRUMP025 Validasi Halaman Kehadiran
        And TRUMP025 Clear Field Nama Di Field Search
        And TRUMP025 Clear Field Start Date
        And TRUMP025 Clear Field End Date
        And TRUMP025 Input Nama Di Field Search nama
        And TRUMP025 Input Start Date Di Field Star Date
        And TRUMP025 Input End Date DI Field End Date
        And TRUMP025 Klik Button Search
        And TRUMP025 Validasi Hasil Search
        And TRUMP025 Download Image Di Page Admin
        And TRUMP025 Compare Kedua Gambar Ke Website Image Online
        And TRUMP025 Validasi Hasil Compare
        And TRUMP025 Tutup Web Image Online
        And TRUMP025 Kembali Ke Web Admin Hadir
        And TRUMP025 Klik Button Dropspan Profil
        And TRUMP025 Klik Button Logout Admin
        Then TRUMP025 Validasi Berhasil logout



