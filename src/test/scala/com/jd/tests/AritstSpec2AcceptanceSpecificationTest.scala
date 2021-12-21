package com.jd.tests

import com.jd.models.Artist
import org.specs2.Specification

import java.time.Year

class ArtistSpec2AcceptanceSpecificationTest extends Specification {def is = s2"""

 this is lifetime achievement award specification
   where age must be greater than 60           $age
   where awards must be greater than 20        $awards
                                          """
  var artist = new Artist("AR","Rahman",100,1954)
  def age = (Year.now.getValue-artist.birthYear) should be_>(60)
  def awards = artist.noOfAwards should be_>(20)



}
