Feature: Login Negatif
  Scenario: TLNU012 Login dengan email dan password kosong
    When TLNU012 Clear Field Email Dan Password
    And TLNU012 Input Field Email Empty String
    And TLNU012 Input Field Password Empty String
    And TLNU012 Klik Tombol Login
    And TLNU012 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Then TLNU012 Klik Tombol Silang Alert

  Scenario: TLNU013 Login Dengan Email Tidak Valid
    When TLNU013 Clear Field Email Dan Password
    And TLNU013 Input Field Email Tidak Valid
    And TLNU013 Input Field Password Valid
    And TLNU013 Klik Tombol Login
    And TLNU013 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Then TLNU013 Klik Tombol Silang Alert

  Scenario: TLNU014 Login Dengan Password Tidak Valid
    When TLNU014 Clear Field Email Dan Password
    And TLNU014 Input Field Email Yang Valid
    And TLNU014 Input Field Password Yang Tidak Valid
    And TLNU014 Klik Tombol Login
    And TLNU014 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Then TLNU014 Klik Tombol Silang Alert

  Scenario: TLNU015 Login Dengan Format Email Yang Salah
      When TLNU015 Clear Field Email Dan Password
      And TLNU015 Input Field Email Yang Tidak Sesuai Format
      And TLNU015 Input Field Password Yang valid
      And TLNU015 Klik Tombol Login
      Then TLNU015 Validasi Setelah Di Klik