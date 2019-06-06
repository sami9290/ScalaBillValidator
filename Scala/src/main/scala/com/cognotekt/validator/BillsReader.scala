package com.cognotekt.validator

/* Trait definition of the bill which help to return the bill ob as vector */
trait BillsReader {
  /* the method of returning the bill as vector*/
  def readBills(): Vector[Bill]
}
/* Bill Class with defined description and price types*/
case class Bill(description : String, price: Int)

