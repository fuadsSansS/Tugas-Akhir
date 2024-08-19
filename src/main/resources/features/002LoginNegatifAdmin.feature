Feature: Login Negatif
  Scenario: TLNA002 Login Dengan Email Dan Password Kosong
    When TLNA002 Clear Field Email Dan Password
    And TLNA002 Input Field Email Empty String
    And TLNA002 Input Field Password Empty String
    And TLNA002 Klik Tombol Login
    Then TLNA002 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Then TLNA002 Klik Tombol Silang Alert

  Scenario: TLNA003 Login Dengan Email Tidak Valid
    When TLNA003 Clear Field Email Dan Password
    And TLNA003 Input Field Email Tidak Valid
    And TLNA003 Input Field Password Valid
    And TLNA003 Klik Tombol Login
    Then TLNA003 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Then TLNA003 Klik Tombol Silang Alert

  Scenario: TLNA004 Login Dengan Password Tidak Valid
    When TLNA004 Clear Field Email Dan Password
    And TLNA004 Input Field Email Yang Valid
    And TLNA004 Input Field Password Yang Tidak Valid
    And TLNA004 Klik Tombol Login
    Then TLNA004 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik
    Then TLNA004 Klik Tombol Silang Alert

  Scenario: TLNA005 Login Dengan Format Email Yang Salah
    When TLNA005 Clear Field Email Dan Password
    And TLNA005 Input Field Email Yang Tidak Sesuai Format
    And TLNA005 Input Field Password Yang valid
    And TLNA005 Klik Tombol Login
    Then TLNA005 Validasi Setelah Di Klik

