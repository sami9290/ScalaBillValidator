package com.cognotekt.validator

import org.scalatest.{ FlatSpec, Matchers }

class ValidatorSpec extends FlatSpec with Matchers {
  "Bill1" should "be invalid" in {
    Validator.validateBill("src/main/resources/bills/bill1.csv") shouldEqual "invalid"
  }

  "Bill2" should "be valid" in {
    Validator.validateBill("src/main/resources/bills/bill2.csv") shouldEqual "valid"
  }

  "Bill3" should "be invalid" in {
    Validator.validateBill("src/main/resources/bills/bill3.csv") shouldEqual "invalid"
  }

  "Bill4" should "be valid" in {
    Validator.validateBill("src/main/resources/bills/bill4.csv") shouldEqual "valid"
  }

  "Bill5" should "be error" in {
    Validator.validateBill("src/main/resources/bills/bill5.csv") shouldEqual "error"
  }

  "Bill6" should "be error" in {
    Validator.validateBill("src/main/resources/bills/bill6.csv") shouldEqual "error"
  }

  "Bill7" should "be valid" in {
    Validator.validateBill("src/main/resources/bills/bill7.csv") shouldEqual "valid"
  }

  "Bill8" should "be error" in {
    Validator.validateBill("src/main/resources/bills/bill8.csv") shouldEqual "error"
  }

  "Bill9" should "be filenotfound" in {
    Validator.validateBill("srffdfgls/bill9.csv") shouldEqual "filenotfound"
  }
}
