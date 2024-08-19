Feature: Login Positif User
  Scenario: TLPU011 Valid login user
    When TLPU011 Mengakses Halaman Webs
    And TLPU011 Kosongkan Fied Email Dan Password
    And TLPU011 Input Email Valid
    And TLPU011 Input Password Valid
    And TLPU011 Tekan Tombol Masuk
    Then TLPU011 Validasi Halaman Home User
    When TLPU011 Tekan Tombol Span User
    And TLPU011 Tekan Tombol Logout
    Then TLPU011 Validasi Halaman Login

