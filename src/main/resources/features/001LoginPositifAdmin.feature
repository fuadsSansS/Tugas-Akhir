Feature: Login Positif
  Scenario Outline: TLPA001 Valid Login
    When TLPA001 Mengakses Halaman Website
    And TLPA001 Mengkosongkan Field Untuk Login
    And TLPA001 Input "<email>" Email Valid
    And TLPA001 Input "<password>" Password Valid
    Then TLPA001 Menekan Tombol Login
    Then TLPA001 Validasi Halaman Home
    When TLPA001 Klik Span Admin
    And TLPA001 Klik Tombol Logout
    Then TLPA001 Validasi Halaman Login

    Examples:
    |email|password|
    |admin@hadir.com|admin@hadir|