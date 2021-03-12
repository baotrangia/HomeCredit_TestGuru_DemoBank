@demoTestGuruPage
Feature: Test Session Login
  @TestGetPage
  Scenario: Test get page from 3 browser
    Given I want to get page "Guru99 Bank Home Page"

  @TestAddnewCustomer
  Scenario: I login success and I add new customer
    Given I want to get page "Guru99 Bank Home Page"
    Then I login with user "mngr313905" and "uzaqUvU"
    Then I wanna add "New Customer" has information name "Tran Gia Bao", dob "24/07/1997", address "Binh Thanh", city "Ho Chi Minh", state "Viet Nam", pin "700000", mobile "0909090909", email "xyz@gmail.com", password "Abc123"
    And I wanna check status add customer success is "Customer Registered Successfully!!!"
    
