package com.jd.tests

import com.jd.models.Artist
import org.specs2.mutable.Specification

import java.time.Year

class ArtistSpec2GivenWhenThenTest extends Specification { override def is = s2"""
 Given  age                   $age
 When awards                  $awards
 Then Check for LifeTime Eligibility $result
"""
  var ageData = 0
  var artist = new Artist("AR","Rahman",100,1954)
  def age = step {
    // do something to provide a number
    ageData = Year.now.getValue-artist.birthYear
  }
 var awardsData=0
  def awards = step {
    // do an action
    awardsData= artist.noOfAwards
  }
  // check the result
  def result = ((ageData>60) && (awardsData>20)) must_== true
}