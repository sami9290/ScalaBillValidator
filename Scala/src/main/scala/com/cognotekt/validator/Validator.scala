package com.cognotekt.validator
import java.io.FileNotFoundException

/* Validator's main skeleton */
object Validator  {
  /* Load acceptedLineItems csv file into list */
  val MaxPrices = new BillCSVReader("src/main/resources/acceptedLineItems.csv").readBills.groupBy(_.description).toList

  /* Bill validator that accept the file path and return the validation  */
  def validateBill(filename: String): String = {
    try {
      /* Load the chosen bill and exclude the zero price variable */
      val Bill = new BillCSVReader(filename).readBills.sortBy(x => x.description).filterNot(_.price==0).groupBy(_.description)
      /* Merge the bill with the accepted values and prices with the chosen bill into pair matching elements list */
      val Merged = MaxPrices.flatMap{ case (k,as) =>
        Bill.get(k).toList.flatMap(as zip _)
      }
      /* Compare the bill prices in 2 with accepted variables in 1 */
      val valid= !Merged.exists{j=>j._2.price > j._1.price}

      /* If valid variable is true and all elements in the bill (which are not zero) exist in acceptedLineItems list */
      if (valid & Bill.size==Merged.size){
        "valid"
      }
      else {
        "invalid"
      }
    } catch {
      /* If chosen file cant be accessed return filenotfound */
      case e: FileNotFoundException => "filenotfound"
      /* If error in elements in the file (ex. format error or empty) return error */
      case _: Throwable  => "error"
    }
  }
}
