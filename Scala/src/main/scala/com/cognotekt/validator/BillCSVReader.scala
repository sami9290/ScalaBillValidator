package com.cognotekt.validator

import scala.io.Source

/* bill csv reader that extends and return the bill vector */
class BillCSVReader (val fileName: String) extends BillsReader {
  override def readBills(): Vector[Bill] = {
    for {
      line <- Source.fromFile(fileName).getLines().drop(0).toVector
      values = line.split(",").map(_.trim)
    }
      yield Bill(values(0), values(1).toInt)
  }
}
