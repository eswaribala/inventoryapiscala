package com.jd.models

import java.time.Year

case class Artist (var firstName:String,var lastName:String,var noOfAwards:Int,var birthYear:Int){

  def validateData(): Boolean ={

    return noOfAwards>20 && (Year.now.getValue-birthYear>60)
  }

}

object ArtistDemo extends App{
  //var artist=new Artist("AR","Rahman")
}
